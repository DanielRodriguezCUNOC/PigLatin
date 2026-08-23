package com.paboomi.backend.semantic.symboltable;

import com.paboomi.backend.semantic.symboltable.symbols.Symbol;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Hierarchical symbol table that manages a stack of scopes
 *The global scope is created automatically when this class is instantiated
 */
public class SymbolTable {

    private final Deque<Scope> scopeStack;

    public SymbolTable() {
        this.scopeStack = new ArrayDeque<>();

        //Initial global scope
        pushScope("global");
    }

    /**
     * Create and push new child scope form current scope
     * Upon entering a function or block
     */
    public void pushScope(String name) {

        Scope parent  = scopeStack.isEmpty() ? null : scopeStack.peek();
        Scope newScope = new Scope(name, parent);
        scopeStack.push(newScope);
    }

    /**
     * Delete current scope to the stack
     * Upon exiting a function or block
     */
    public void popScope() {
        if (scopeStack.size() <= 1) {
            throw new IllegalStateException("Can't delete the global scope");
        }
        scopeStack.pop();
    }

    /**
     * Declare one symbol in the current scope
     * register variables, arrays, functions in the current scope
     * @return true if was registered
     * false if was already exists in the current scope
     */
    public boolean declare(String name, Symbol symbol) {
        if (scopeStack.isEmpty()) throw new IllegalStateException("None an active scope");
        return scopeStack.peek().declare(name, symbol);
    }

    /**
     * Serach a symbol by name in the current scope and its ancestors
     * Resolve identifiers
     */
    public Symbol lookup(String name) {
        if (scopeStack.isEmpty()) return null;
        return scopeStack.peek().lookup(name);
    }

    /**
     * Search for a symbol only in the current scope
     */
    public Symbol lookupCurrent(String name) {
        if (scopeStack.isEmpty()) return null;
        return scopeStack.peek().lookupLocal(name);
    }

    /**
     * Search a symbol in the global scope
     * Util for resolve function call's from any level
     */
    public Symbol lookupGlobal(String name){
        if (scopeStack.isEmpty()) return null;

        //* Use lat beacause the global scope is the oldest in the stack
        Scope global = scopeStack.peekLast();
        return global != null ? global.lookupLocal(name) : null;
    }


    public Scope getCurrentScope(){
        return scopeStack.isEmpty() ? null : scopeStack.peek();
    }

    public int getScopeDepth(){
        return  scopeStack.size();
    }

    public boolean isGlobalScope(){
        return scopeStack.size() == 1;
    }

    public void reset(){
        scopeStack.clear();
        pushScope("global");
    }

    /**
     * Return all current scopes in the stack for the GUI .
     */
    public List<Scope> getAllScopes() {
        return new ArrayList<>(scopeStack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Symbol Table ===\n");

        int level = scopeStack.size() - 1;
        for (Scope scope : scopeStack) {
            sb.append(" [").append(level).append("] ").append(scope.toString()).append("\n");

            for (Symbol sym : scope.getSymbols().values()) {
                sb.append("    ").append(sym.toString()).append("\n");
            }
            level--;
        }
        return sb.toString();
    }
}

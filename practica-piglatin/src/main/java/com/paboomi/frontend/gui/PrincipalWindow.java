package com.paboomi.frontend.gui;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.view.mxGraph;
import com.paboomi.backend.antlr.generated.LatinParser;
import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.dtos.ParserStackStateDTO;
import com.paboomi.backend.semantic.symboltable.Scope;
import com.paboomi.backend.semantic.symboltable.symbols.Symbol;
import com.paboomi.backend.semantic.types.StructType;
import com.paboomi.backend.semantic.types.TypeTable;
import com.paboomi.backend.services.ServiceAnalyzer;
import com.paboomi.backend.services.TreeMapperService;
import com.paboomi.frontend.facade.FacadeCompilator;
import com.paboomi.frontend.facade.dto.AnalysisResultDTO;
import com.paboomi.frontend.gui.animation.TreeRouteAnimator;
import com.paboomi.frontend.gui.components.RoundedPanel;
import com.paboomi.frontend.gui.components.TextLineNumber;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.util.List;

/**
 *
 * @author clare
 */
public class PrincipalWindow extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrincipalWindow.class.getName());
    private final Font codeFont = new Font("Consolas", Font.PLAIN, 14);
    private final FacadeCompilator facade;
    private List<ParserStackStateDTO> stackState = new ArrayList<>();
    private int currentStackStep = -1;
    private JPanel stackBlocksPanel;
    private static final Set<String> NON_TERMINALS = new HashSet<>(Arrays.asList(LatinParser.ruleNames));
    private JTable tblSymbols;
    private JTable tblTypes;
    private File currentOpenFile = null;
    private JButton btnTranslatePigLatin;
    private JTextArea txtTranslatedCode;
    private mxGraph astGraph;
    private mxGraphComponent astGraphComponent;

    /**
     * Creates new form PrincipalWindow
     */
    public PrincipalWindow() {

        // Initialize facade
        ServiceAnalyzer analyzer = new ServiceAnalyzer();
        TreeMapperService mapper = new TreeMapperService();
        this.facade = new FacadeCompilator(analyzer, mapper);

        initComponents();
        setupCustomComponents();
        setupTranslatedCodePanel();
        setupTranslateButton();
        setupFileMenu();

        // Listener for stack navigation
        jButton1.addActionListener(e -> showPreviousStackStep());
        jButton2.addActionListener(e -> showNextStackStep());

        // Color Palette
        Color bgEditor = new Color(30, 30, 46);       // Dark blue background
        Color fgEditor = new Color(205, 214, 244);     // Soft white
        Color currentLineBg = new Color(49, 50, 68);   // Active line fund
        Color lineNumbersFg = new Color(108, 112, 134); // Line numbers turned off
        Color currentLineFg = new Color(245, 194, 231); // Neon pink/purple for the current line
        Color bgConsola = new Color(24, 24, 37);       // Darker console background

        // Code Editor
        txtACodeEditor.setFont(codeFont);
        txtACodeEditor.setTabSize(4);
        txtACodeEditor.setBackground(bgEditor);
        txtACodeEditor.setForeground(fgEditor);
        txtACodeEditor.setCaretColor(new java.awt.Color(245, 224, 220)); // Glowing cursor
        txtACodeEditor.setSelectionColor(new java.awt.Color(69, 71, 90)); // Text selection color

        // This code shows the lines number in the code editor
        TextLineNumber lineNumber = new TextLineNumber(txtACodeEditor);
        lineNumber.setFont(txtACodeEditor.getFont());
        lineNumber.setBackground(bgEditor);
        lineNumber.setForeground(lineNumbersFg);
        lineNumber.setCurrentLineForeground(currentLineFg); // Color of the line where the cursor is located
        jScrollPane1.setRowHeaderView(lineNumber);
        
        // Console Style
        jTextArea2.setBackground(bgConsola);
        jTextArea2.setForeground(new java.awt.Color(166, 227, 161)); // Green terminal for outputs
        txtFCommandConsole.setBackground(bgConsola);
        txtFCommandConsole.setForeground(fgEditor);
        
        // Highlight stack buttons
        jButton1.setBackground(new java.awt.Color(137, 180, 250)); // Soft blue
        jButton1.setForeground(java.awt.Color.BLACK);
        jButton2.setBackground(new java.awt.Color(243, 139, 168)); // Soft Pink
        jButton2.setForeground(java.awt.Color.BLACK);

        // Estyle for the State Bar
        lblStateBar.setBackground(new java.awt.Color(17, 17, 27));
        lblStateBar.setForeground(new java.awt.Color(147, 153, 178));
        lblStateBar.setText(" Status: Ready | Mode: Editing ");

        // Clean bordered
        jSplitPane1.setBorder(null);
        jSplitPane2.setBorder(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlCodeEditor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtACodeEditor = new javax.swing.JTextArea();
        pnlConsole = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        txtFCommandConsole = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlStackViewer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlAST = new javax.swing.JPanel();
        pnlSymbolTable = new javax.swing.JPanel();
        pnlErrorReport = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblErrorReport = new javax.swing.JTable();
        pnlTranslatedCode = new javax.swing.JPanel();
        lblStateBar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCompile = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1225, 850));
        setPreferredSize(new java.awt.Dimension(1225, 850));
        setSize(new java.awt.Dimension(1225, 850));

        jSplitPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));
        jSplitPane2.setDividerLocation(500);
        jSplitPane2.setToolTipText("");

        jSplitPane1.setDividerLocation(425);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnlCodeEditor.setMinimumSize(new java.awt.Dimension(425, 300));
        pnlCodeEditor.setPreferredSize(new java.awt.Dimension(400, 300));
        pnlCodeEditor.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setMinimumSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 300));

        txtACodeEditor.setColumns(20);
        txtACodeEditor.setRows(5);
        jScrollPane1.setViewportView(txtACodeEditor);

        pnlCodeEditor.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(pnlCodeEditor);

        pnlConsole.setLayout(new java.awt.BorderLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        pnlConsole.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        txtFCommandConsole.setText("Enter the command");
        txtFCommandConsole.addActionListener(this::txtFCommandConsoleActionPerformed);
        pnlConsole.add(txtFCommandConsole, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setRightComponent(pnlConsole);

        jSplitPane2.setLeftComponent(jSplitPane1);

        pnlStackViewer.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Previous");
        jPanel4.add(jButton1);

        jButton2.setText("Next");
        jPanel4.add(jButton2);

        pnlStackViewer.add(jPanel4, java.awt.BorderLayout.NORTH);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        pnlStackViewer.add(jScrollPane3, java.awt.BorderLayout.SOUTH);

        jTabbedPane1.addTab("Stack", pnlStackViewer);

        pnlAST.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("AST", pnlAST);

        pnlSymbolTable.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Symbol Table", pnlSymbolTable);

        pnlErrorReport.setLayout(new java.awt.BorderLayout());

        tblErrorReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblErrorReport);

        pnlErrorReport.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Error's Report", pnlErrorReport);
        jTabbedPane1.addTab("Translated Code", pnlTranslatedCode);

        jSplitPane2.setRightComponent(jTabbedPane1);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        lblStateBar.setText("jLabel1");
        getContentPane().add(lblStateBar, java.awt.BorderLayout.SOUTH);

        jPanel1.setMinimumSize(new java.awt.Dimension(80, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 50));

        btnCompile.setText("Compile");
        btnCompile.addActionListener(this::btnCompileActionPerformed);
        jPanel1.add(btnCompile);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }

    private void txtFCommandConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCommandConsoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCommandConsoleActionPerformed

    private void btnCompileActionPerformed(java.awt.event.ActionEvent evt) {                                           
        onCompileExecuted();
    }

    private void setupCustomComponents() {
        setupPnlAST();

        //* Configure pnlSymbolTable
        pnlSymbolTable.removeAll();
        pnlSymbolTable.setLayout(new BorderLayout());

        tblSymbols = new JTable();
        tblTypes = new JTable();

        //* Prevent columns from being reordered
        tblSymbols.getTableHeader().setReorderingAllowed(false);
        tblTypes.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollSymbols = new JScrollPane(tblSymbols);
        scrollSymbols.setBorder(BorderFactory.createTitledBorder("Symbol Table (Variables, Functions)"));

        JScrollPane scrollTypes = new JScrollPane(tblTypes);
        scrollTypes.setBorder(BorderFactory.createTitledBorder("Type Table (Primitives & Structs)"));

        JSplitPane splitTables = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollSymbols, scrollTypes);

        //* Height of the division
        splitTables.setDividerLocation(350);
        splitTables.setBorder(null);

        pnlSymbolTable.add(splitTables, BorderLayout.CENTER);

        //* Configure JTable Errors
        pnlErrorReport.removeAll();
        pnlErrorReport.setLayout(new BorderLayout());

        if(tblErrorReport == null){ tblErrorReport = new JTable(); }

        //* Allow resize columns manually
        tblErrorReport.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //* Force reordering header
        tblErrorReport.getTableHeader().setReorderingAllowed(false);
        tblErrorReport.getTableHeader().setResizingAllowed(true);

        JScrollPane errorScrollPane = new JScrollPane(tblErrorReport);
        errorScrollPane.setBorder(null);

        //* Ensure the header viewport is always active
        errorScrollPane.setColumnHeaderView(tblErrorReport.getTableHeader());

        pnlErrorReport.add(errorScrollPane, BorderLayout.CENTER);

        //* Stack Visualizer
        stackBlocksPanel = new JPanel();
        stackBlocksPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
        stackBlocksPanel.setBackground(new Color(255, 255, 255));
        stackBlocksPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane stackScroll = new JScrollPane(stackBlocksPanel);
        stackScroll.setBorder(BorderFactory.createLineBorder(new Color(200, 180, 140), 2));
        stackScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        pnlStackViewer.add(stackScroll, BorderLayout.CENTER);

        jTextArea1.setBackground(new Color(24, 24, 37));
        jTextArea1.setForeground(new Color(150, 214, 244));
        jTextArea1.setFont(codeFont);
        jTextArea1.setEditable(false);
        jTextArea1.setText("Press Compile to generate stack trace...");
    }

    private void setupPnlAST(){

        pnlAST.removeAll();
        pnlAST.setLayout(new BorderLayout());
        pnlAST.setBackground(new Color(30, 30, 46));

        // Toolbar
        JPanel astToolBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        astToolBar.setBackground(new Color(30, 30, 46));

        JButton btnZoomIn = createStyledToolButton("Zoom +", new Color(137, 180, 250));
        JButton btnZoomOut = createStyledToolButton("Zoom -", new Color(243, 139, 168));
        JButton btnFit = createStyledToolButton("Fit View", new Color(166, 227, 161));
        JButton btnExport = createStyledToolButton("Export PNG", new Color(245, 194, 231));

        btnZoomIn.addActionListener(e -> astGraphComponent.zoomIn());
        btnZoomOut.addActionListener(e -> astGraphComponent.zoomOut());
        btnFit.addActionListener(e -> astGraphComponent.zoomAndCenter());
        btnExport.addActionListener(e -> exportASTImage());

        astToolBar.add(btnZoomIn);
        astToolBar.add(btnZoomOut);
        astToolBar.add(btnFit);
        astToolBar.add(btnExport);

        // Graph
        astGraph = new mxGraph();
        astGraph.setCellsEditable(false);
        astGraph.setCellsMovable(true);
        astGraph.setCellsResizable(false);
        astGraph.setCellsSelectable(true);
        astGraph.setAllowDanglingEdges(false);
        astGraph.setAllowLoops(false);
        astGraph.setCellsDisconnectable(false);
        astGraph.setEdgeLabelsMovable(false);

        astGraphComponent = new mxGraphComponent(astGraph);
        astGraphComponent.setBackground(new Color(30, 30, 46));
        astGraphComponent.getViewport().setOpaque(true);
        astGraphComponent.getViewport().setBackground(new Color(30, 30, 46));
        astGraphComponent.setBorder(null);
        astGraphComponent.setConnectable(false);

        // Zoom with wheel mouse
        astGraphComponent.addMouseWheelListener(e -> {
            if (e.getWheelRotation() < 0) astGraphComponent.zoomIn();
            else astGraphComponent.zoomOut();
        });

        pnlAST.add(astToolBar, BorderLayout.NORTH);
        pnlAST.add(astGraphComponent, BorderLayout.CENTER);
    }

    //* Configure Translated Code Panel
    private void setupTranslatedCodePanel(){
        pnlTranslatedCode.setLayout(new BorderLayout());

        JTextArea txtTranslatedCode = new JTextArea();
        txtTranslatedCode.setFont(codeFont);
        txtTranslatedCode.setBackground(new Color(30, 30, 46));
        txtTranslatedCode.setForeground(new Color(166, 227, 161));
        txtTranslatedCode.setEditable(false);
        txtTranslatedCode.setText("Compile first, then click 'Translate to PigLatin' :)");

        JScrollPane scrollPane = new JScrollPane(txtTranslatedCode);
        scrollPane.setBorder(null);
        pnlTranslatedCode.add(scrollPane, BorderLayout.CENTER);

        this.txtTranslatedCode = txtTranslatedCode;
    }

    private void setupTranslateButton(){
        btnTranslatePigLatin = new JButton("Translate to PigLatin");
        btnTranslatePigLatin.setBackground(new Color(166, 227, 161));
        btnTranslatePigLatin.setForeground(Color.BLACK);
        btnTranslatePigLatin.setFont(codeFont.deriveFont(Font.BOLD));
        btnTranslatePigLatin.addActionListener(e -> onTranslatePigLatin());
        jPanel1.add(btnTranslatePigLatin);
        jPanel1.revalidate();
    }

    private void btnTranslatePigLatinActionPerformed(ActionEvent evt){
        onTranslatePigLatin();
    }

    private void onTranslatePigLatin(){
        if (txtTranslatedCode == null) setupTranslatedCodePanel();

        String pigLatinCode = facade.generatePigLatinCode();
        txtTranslatedCode.setText(pigLatinCode);
        jTabbedPane1.setSelectedComponent(pnlTranslatedCode);

        lblStateBar.setText("Status: PigLatin translation generated, OINK OINK :p ");
    }



    private void onCompileExecuted() {
        String code = txtACodeEditor.getText();

        if (code == null || code.trim().isEmpty()) {
            jTextArea2.setText("[SYSTEM]: Source code is empty.");
            return;
        }

        //* Execute analyze with facade
        AnalysisResultDTO result = facade.codeAnalyze(code);

        if (result.isValid()) {
            jTextArea2.setText(">>> Compilation finished successfully. No syntax errors.\n");
            lblStateBar.setText(" Status: Success | Code parsed without errors ");

            //* Clean errors table
            renderErrorsTable(List.of(), tblErrorReport);

            renderASTGraph((DefaultTreeModel) result.getTreeModel());

            //* Dynamically switch to the AST tab.
            jTabbedPane1.setSelectedComponent(pnlAST);

            loadStackStates(result.getStackStateList());

            renderSymbolAndTypeTables(result);

        } else {
            //* Show compilation errors captured by ANTLR4
            jTextArea2.setText(">>> Compilation failed with " +
                    result.getErrorsList().size() +
                    " error(s).\nCheck the Error's Report tab");
            lblStateBar.setText(" Status: Failed | Errors found during compilation ");

            //* Renderer errors in jtable
            renderErrorsTable(result.getErrorsList(), tblErrorReport);

            renderSymbolAndTypeTables(result);

            //* Switch to the Error's Report tab automatically
            jTabbedPane1.setSelectedComponent(pnlErrorReport);
            loadStackStates(result.getStackStateList());
            }
    }

    public void renderErrorsTable(List<CustomErrorDTO> errors, JTable tblErrors) {
        //* Define columns
        String[] columnNames = {"Line", "Column", "Error Description"};

        //* Create table model non-editable
        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
          @Override
          public boolean isCellEditable(int row, int column) {return false;}
        };

        for (CustomErrorDTO error : errors) {
            Object[] rowData = {
                    error.line(),
                    error.column(),
                    error.message()
            };
            model.addRow(rowData);
        }

        tblErrors.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < tblErrors.getColumnCount(); i++) {
            tblErrors.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        //* Column "Line"
        tblErrors.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblErrors.getColumnModel().getColumn(0).setMinWidth(50);
        tblErrors.getColumnModel().getColumn(0).setMaxWidth(80);

        //* Column "Line"
        tblErrors.getColumnModel().getColumn(1).setPreferredWidth(40);
        tblErrors.getColumnModel().getColumn(1).setMinWidth(50);
        tblErrors.getColumnModel().getColumn(1).setMaxWidth(80);

        //* Column "Error Description"
        tblErrors.getColumnModel().getColumn(2).setPreferredWidth(600);
        tblErrors.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        tblErrors.revalidate();
        tblErrors.repaint();


    }

    private void renderSymbolAndTypeTables(AnalysisResultDTO result) {
        if (result.getSymbolTable() == null || result.getTypeTable() == null) return;

        //* --- Render Symbol Table ---
        String[] symCols = {"Scope Level", "Name", "Details"};
        DefaultTableModel symModel = new DefaultTableModel(symCols, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        //* Iterate from the local to the global level.

        //* I'm just testing things out; I hope I don't forget to turn off comments.
        //int level = result.getSymbolTable().getScopeDepth() - 1;
        for (Scope scope : result.getSymbolTable().getAllScopes()) {

            //* I want to test if I can remove negative levels -_-
            /*
            for (Symbol sym : scope.getSymbols().values()) {
                Object[] rowData = {
                        level, //* Scope level
                        sym.getName(),
                        sym.toString() //* Symbol details
                };
                symModel.addRow(rowData);
            }
            level--;
             */
            for (Symbol sym : scope.getSymbols().values()){
                Object[] rowData = {
                        scope.getId(),
                        sym.getName(),
                        sym.toString()
                };
                symModel.addRow(rowData);
            }
        }

        tblSymbols.setModel(symModel);

        // --- Render Type Table ---
        String[] typeCols = {"Type Name", "Category", "Details"};
        DefaultTableModel typeModel = new DefaultTableModel(typeCols, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        TypeTable typeTable = result.getTypeTable();
        for (String typeName : typeTable.getAllTypeNames()) {
            StructType struct = typeTable.getStruct(typeName);
            String category = (struct == null) ? "Primitive" : "Struct";
            String details = (struct == null) ? "Built-in type" : struct.toString();

            typeModel.addRow(new Object[]{typeName, category, details});
        }
        tblTypes.setModel(typeModel);
    }

    //* Stack Visualizer Methods

    private void loadStackStates(List<ParserStackStateDTO> states) {
        this.stackState = states;
        if (!states.isEmpty()) {
            showStackStep(0);
        } else {
            clearStackView();
        }
    }

    private void showNextStackStep() {
        if (currentStackStep < stackState.size() - 1) {
            showStackStep(currentStackStep + 1);
        }
    }

    private void showPreviousStackStep() {
        if (currentStackStep > 0) {
            showStackStep(currentStackStep - 1);
        }
    }

    private void showStackStep(int step) {
        this.currentStackStep = step;

        //* Clear principal panel
        stackBlocksPanel.removeAll();

        //* Renderize from step 0 has to current step
        for (int i = 0; i <= step; i++) {
            ParserStackStateDTO state = stackState.get(i);
            JPanel stateColumn = buildStateColumn(state);
            stackBlocksPanel.add(stateColumn);
        }

        stackBlocksPanel.revalidate();
        stackBlocksPanel.repaint();

        //* Auto-scroll horizontal when new column appears
        SwingUtilities.invokeLater(() ->{
            //* Get the JScrollPane with the stacksBlockPanel
            Container parent = stackBlocksPanel.getParent();
            if(parent instanceof JViewport){
                JScrollPane scrollPane = (JScrollPane) parent.getParent();
                JScrollBar horizontalBar = scrollPane.getHorizontalScrollBar();
                //* Move bar tho maximus value
                horizontalBar.setValue(horizontalBar.getMaximum());
            }
        });

        //* Accumulated Log
        StringBuilder log = new StringBuilder();
        for (int i = 0; i <= step; i++) {
            ParserStackStateDTO s = stackState.get(i);
            log.append(String.format("%d. [%s] %s%n", s.step(), s.operation(), s.detail()));
        }
        jTextArea1.setText(log.toString());

        //* Buttons
        jButton1.setEnabled(step > 0);
        jButton2.setEnabled(step < stackState.size() - 1);

        if (stackState.get(step).tokenLine() > 0) {
            highlightLineInEditor(stackState.get(step).tokenLine());
        }
    }

    private JPanel buildStateColumn(ParserStackStateDTO state) {

        //* Yellow Contaniner
        RoundedPanel column = new RoundedPanel(new BorderLayout(), 15, new Color(254, 245, 215));
        column.setPreferredSize(new Dimension(85, 300));
        column.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));

        //* Header
        JLabel header = new JLabel(String.valueOf(state.step()), SwingConstants.CENTER);
        header.setFont(codeFont.deriveFont(Font.BOLD, 14f));
        header.setForeground(Color.BLACK);
        column.add(header, BorderLayout.NORTH);

        //* Central container with stack elements
        JPanel stackElements = new JPanel();
        stackElements.setLayout(new BoxLayout(stackElements, BoxLayout.Y_AXIS));
        stackElements.setOpaque(false);

        //* Push down the elements
        stackElements.add(Box.createVerticalGlue());

        List<String> stack = state.ruleStack();
        if (stack.isEmpty()) {
            JLabel empty = new JLabel("<html><center>Stack<br>Void</center></html>", SwingConstants.CENTER);
            empty.setFont(codeFont.deriveFont(Font.BOLD, 12f));
            empty.setForeground(Color.BLACK);
            stackElements.add(empty);
            stackElements.add(Box.createVerticalGlue());
        } else {
            //* Draw from top to bottom
            for (int i = stack.size() - 1; i >= 0; i--) {
                String symbol = stack.get(i);

                //* Blue for non-terminals
                //* Pink for terminals
                Color bg = isNonTerminal(symbol) ? new Color(208, 230, 255) : new Color(248, 198, 203);
                RoundedPanel block = createRoundedLabel(symbol, bg);
                stackElements.add(block);
                stackElements.add(Box.createRigidArea(new Dimension(0, 5)));
            }
        }
        column.add(stackElements, BorderLayout.CENTER);

        //* Base Operation (Verde para shift, Morado para reduce)
        //* Green for SHIFT
        //* Purple for REDUCE
        boolean isShift = state.operation().equalsIgnoreCase("SHIFT");
        Color opColor = isShift ? new Color(200, 235, 200) : new Color(225, 205, 235);
        String labelText = isShift ? "shift " + state.detail() : "reduce " + state.detail();

        RoundedPanel opBlock = createRoundedLabel(labelText, opColor);
        //* Resize operation block
        opBlock.setPreferredSize(new Dimension(75, 25));
        opBlock.setMaximumSize(new Dimension(75, 25));
        column.add(opBlock, BorderLayout.SOUTH);

        return column;
    }

    //* This method configure de labels for the stack trace columns
    private RoundedPanel createRoundedLabel(String text, Color bgColor) {
        //* individual block with edges
        RoundedPanel panel = new RoundedPanel(new BorderLayout(), 8, bgColor);
        panel.setMaximumSize(new Dimension(75, 35));
        panel.setPreferredSize(new Dimension(75, 35));

        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(codeFont.deriveFont(Font.PLAIN, 12f));
        label.setForeground(Color.BLACK);
        panel.add(label, BorderLayout.CENTER);

        return panel;
    }
    private void clearStackView() {
        stackBlocksPanel.removeAll();
        JLabel empty = new JLabel("Void Stack", SwingConstants.CENTER);
        empty.setForeground(new Color(108, 112, 134));
        empty.setFont(codeFont.deriveFont(Font.ITALIC));
        stackBlocksPanel.add(empty);
        stackBlocksPanel.revalidate();
        stackBlocksPanel.repaint();
        jTextArea1.setText("No stack trace available.");
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
    }

    private void highlightLineInEditor(int line) {
        try {
            int start = txtACodeEditor.getLineStartOffset(line - 1);
            int end = txtACodeEditor.getLineEndOffset(line - 1);
            txtACodeEditor.setCaretPosition(start);
            txtACodeEditor.moveCaretPosition(end);
            txtACodeEditor.getCaret().setSelectionVisible(true);
        } catch (Exception ignored) {
        }
    }

    private boolean isNonTerminal(String symbol) {
        return NON_TERMINALS.contains(symbol);
    }

    private void setupFileMenu() {
        jMenu3.removeAll();

        JMenuItem mniOpen = new JMenuItem("Open .lat File...");
        JMenuItem mniSave = new JMenuItem("Save .lat File");
        JMenuItem mniExportPig = new JMenuItem("Export to PigLatin (.pig)...");


        mniOpen.addActionListener(e -> openLatFile());
        mniSave.addActionListener(e -> saveLatFile());
        mniExportPig.addActionListener(e -> exportPigFile());

        jMenu3.add(mniOpen);
        jMenu3.add(mniSave);
        jMenu3.addSeparator();
        jMenu3.add(mniExportPig);
    }

    private void openLatFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open Latin source file");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Latin Files (*.lat)", "lat"));

        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            currentOpenFile = fileChooser.getSelectedFile();
            try {
                // Read all the content and place it in the editor.
                String content = new String(java.nio.file.Files.readAllBytes(currentOpenFile.toPath()));
                txtACodeEditor.setText(content);
                lblStateBar.setText(" Status: Opened " + currentOpenFile.getName() + " | Mode: Editing ");
            } catch (java.io.IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveLatFile() {

        if (currentOpenFile == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Latin source file");
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Latin Files (*.lat)", "lat"));

            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                currentOpenFile = fileChooser.getSelectedFile();

                if (!currentOpenFile.getName().toLowerCase().endsWith(".lat")) {
                    currentOpenFile = new java.io.File(currentOpenFile.getAbsolutePath() + ".lat");
                }
            } else {
                return;
            }
        }

        //* Save the editor's text to the original file.
        try {
            java.nio.file.Files.writeString(currentOpenFile.toPath(), txtACodeEditor.getText());
            lblStateBar.setText(" Status: Saved " + currentOpenFile.getName() + " | Mode: Editing ");
        } catch (java.io.IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exportPigFile() {
        String translatedCode = txtTranslatedCode.toString();

        if (translatedCode.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "There is no translated code to export.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Export PigLatin code");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PigLatin Files (*.pig)", "pig"));

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            java.io.File pigFile = fileChooser.getSelectedFile();

            //* Must have .pig extenssion
            if (!pigFile.getName().toLowerCase().endsWith(".pig")) {
                pigFile = new java.io.File(pigFile.getAbsolutePath() + ".pig");
            }

            try {
                java.nio.file.Files.writeString(pigFile.toPath(), translatedCode);
                JOptionPane.showMessageDialog(this, "PigLatin file exported successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (java.io.IOException ex) {
                JOptionPane.showMessageDialog(this, "Error exporting file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private JButton createStyledToolButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setBackground(bg);
        btn.setForeground(Color.BLACK);
        btn.setFont(codeFont.deriveFont(Font.BOLD, 11f));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        return btn;
    }

    private void renderASTGraph(DefaultTreeModel treeModel) {
        if (treeModel == null || treeModel.getRoot() == null) {
            astGraph.removeCells(astGraph.getChildVertices(astGraph.getDefaultParent()));
            return;
        }
        astGraph.getModel().beginUpdate();
        try {
            astGraph.removeCells(astGraph.getChildCells(astGraph.getDefaultParent(), true, true));
            TreeNode root = (TreeNode) treeModel.getRoot();
            Map<TreeNode, Object> vertexMap = new HashMap<>();
            buildGraphFromTreeNode(root, vertexMap);
            mxHierarchicalLayout layout = new mxHierarchicalLayout(astGraph);
            layout.setOrientation(SwingConstants.VERTICAL);
            layout.setInterRankCellSpacing(50);
            layout.setIntraCellSpacing(25);
            layout.setParallelEdgeSpacing(15);
            layout.execute(astGraph.getDefaultParent());
        } finally {
            astGraph.getModel().endUpdate();
        }
        SwingUtilities.invokeLater(() -> astGraphComponent.zoomAndCenter());
    }

    private Object buildGraphFromTreeNode(TreeNode node, Map<TreeNode, Object> vertexMap) {
        String label = node.toString();
        boolean nonTerminal = isNonTerminal(label);
        boolean isLeaf = node.isLeaf();
        int width = Math.max(120, label.length() * 9 + 30);
        int height = 38;

        StringBuilder style = new StringBuilder();
        style.append("shape=rectangle;rounded=1;arcSize=10;fontSize=12;");
        style.append("fontColor=#11111B;labelPosition=center;verticalLabelPosition=middle;");
        style.append("align=center;verticalAlign=middle;");

        if (isLeaf) {
            style.append("shape=ellipse;fillColor=#C6EBC5;strokeColor=#A6E3A1;strokeWidth=2;");
        } else if (nonTerminal) {
            style.append("fillColor=#D0E6FF;strokeColor=#89B4FA;strokeWidth=2;");
        } else {
            style.append("fillColor=#F8C6CB;strokeColor=#F38BA8;strokeWidth=1;");
        }

        Object vertex = astGraph.insertVertex(
                astGraph.getDefaultParent(), null, label, 0, 0, width, height, style.toString()
        );
        vertexMap.put(node, vertex);

        for (int i = 0; i < node.getChildCount(); i++) {
            TreeNode child = node.getChildAt(i);
            Object childVertex = buildGraphFromTreeNode(child, vertexMap);
            String edgeStyle = "strokeColor=#6C7086;endArrow=block;endSize=8;endFill=1;strokeWidth=1.5;edgeStyle=elbowEdgeStyle;elbow=vertical;";
            astGraph.insertEdge(astGraph.getDefaultParent(), null, "", vertex, childVertex, edgeStyle);
        }
        return vertex;
    }

    private void exportASTImage() {
        BufferedImage image = mxCellRenderer.createBufferedImage(
                astGraph, null, 1, new Color(30, 30, 46), true, null
        );
        if (image == null) {
            JOptionPane.showMessageDialog(this, "No AST rendered to export.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Export AST as PNG");
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Image (*.png)", "png"));
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (!file.getName().toLowerCase().endsWith(".png")) {
                file = new File(file.getAbsolutePath() + ".png");
            }
            try {
                ImageIO.write(image, "PNG", file);
                JOptionPane.showMessageDialog(this, "AST exported successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error exporting image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblStateBar;
    private javax.swing.JPanel pnlAST;
    private javax.swing.JPanel pnlCodeEditor;
    private javax.swing.JPanel pnlConsole;
    private javax.swing.JPanel pnlErrorReport;
    private javax.swing.JPanel pnlStackViewer;
    private javax.swing.JPanel pnlSymbolTable;
    private javax.swing.JPanel pnlTranslatedCode;
    private javax.swing.JTable tblErrorReport;
    private javax.swing.JTextArea txtACodeEditor;
    private javax.swing.JTextField txtFCommandConsole;
    // End of variables declaration//GEN-END:variables
}

package com.paboomi.backend.translate;

public class PigLatinTranslator {

    private static final String VOWELS = "AEIOUaeiou";

    public PigLatinTranslator() {
    }

    public static String toPigLatin(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        // Porcine Law: special functions
        if ("LEERE".equals(word)) {
            return "%OINK_OINK";
        }
        if ("IMPREMERE".equals(word)) {
            return "%OINK";
        }

        // Vowel Law
        if (VOWELS.indexOf(word.charAt(0)) >= 0) {
            return word + "way";
        }

        // Consonant Law: move all leading consonants to the end and add 'ay' XD
        int i = 0;
        while (i < word.length() && VOWELS.indexOf(word.charAt(i)) < 0) {
            i++;
        }
        String leadingConsonants = word.substring(0, i);
        String rest = word.substring(i);
        return rest + leadingConsonants + "ay";
    }
}

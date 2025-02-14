
/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
            "abstraction",
            "ambiguous",
            "arithmetic",
            "backslash",
            "bitmap",
            "circumstance",
            "combination",
            "consequently",
            "consortium",
            "decrementing",
            "dependency",
            "disambiguate",
            "dynamic",
            "encapsulation",
            "equivalent",
            "expression",
            "facilitate",
            "fragment",
            "hexadecimal",
            "implementation",
            "indistinguishable",
            "inheritance",
            "internet",
            "java",
            "localization",
            "microprocessor",
            "navigation",
            "optimization",
            "parameter",
            "patrick",
            "pickle",
            "polymorphic",
            "rigorously",
            "simultaneously",
            "specification",
            "structure",
            "lexical",
            "likewise",
            "management",
            "manipulate",
            "mathematics",
            "hotjava",
            "vertex",
            "unsigned",
            "traditional" };

    private static final String[] SCRAMBLED_WORD_LIST = {
            "batsartcoin",
            "maibuguos",
            "ratimhteci",
            "abkclssha",
            "ibmtpa",
            "iccrmutsnaec",
            "ocbmnitaoni",
            "ocsnqeeutnyl",
            "ocsnroitmu",
            "edrcmeneitgn",
            "edepdnneyc",
            "idasbmgiauet",
            "ydanicm",
            "neacsplutaoni",
            "qeiuaveltn",
            "xerpseisno",
            "aficilatet",
            "rfgaemtn",
            "ehaxedicalm",
            "milpmeneatitno",
            "niidtsniugsiahleb",
            "niehiratcen",
            "nietnret",
            "ajav",
            "olacilazitno",
            "imrcpoorecssro",
            "anivagitno",
            "poitimazitno",
            "aparemert",
            "aprtcki",
            "ipkcel",
            "opylomprich",
            "irogorsuyl",
            "isumtlnaoesuyl",
            "psceficitaoni",
            "tsurtcreu",
            "elixalc",
            "ilekiwse",
            "amanegemtn",
            "aminupalet",
            "amhtmetacsi",
            "ohjtvaa",
            "evtrxe",
            "nuisngde",
            "rtdatioialn"
    };

    static final WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * 
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * 
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * 
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * 
     * @param idx       index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}

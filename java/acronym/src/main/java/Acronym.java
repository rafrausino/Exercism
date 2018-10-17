class Acronym {

    private String phrase;

    Acronym(String phrase) {

        this.phrase = phrase;
    }

    String get() {

        String[] words = phrase.split("\\W+");
        String expected = "";
        for (int i = 0; i < words.length ; i++) {
            expected += words[i].charAt(0);

        }
        return expected.toUpperCase();
    }
}

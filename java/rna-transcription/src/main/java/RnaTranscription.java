class RnaTranscription {

    String transcribe(String dnaStrand) {

        String[] convertLetter = dnaStrand.split("");
        String result = "";

        for (int i = 0; i < convertLetter.length; i++) {
            if (convertLetter[i].equals("G")) {
                result += "C";
            } else if (convertLetter[i].equals("C")) {
                result += "G";
            } else if (convertLetter[i].equals("T")) {
                result += "A";
            } else if (convertLetter[i].equals("A")) {
                result += "U";
            }
        }
        return result;
    }
}



class RnaTranscription {

    String transcribe(String dnaStrand) {

        String[] convertLetter = dnaStrand.split("");

        for (int i = 0; i < convertLetter.length; i++) {

            char result;

            if (convertLetter[i].equals('G')) {
                result = 'C';
            } else if (convertLetter[i].equals('C')) {
                result = 'G';
            } else if (convertLetter[i].equals('T')) {
                result = 'A';
            } else if (convertLetter[i].equals('A')) {
                result = 'U';
            } else{
                System.err.println("Inválido!");
                System.exit(1);
            }
        }
        return dnaStrand;
    }
}



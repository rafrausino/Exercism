class Scrabble {

    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {

        char alphabet[] = word.toCharArray();
        int expected = 0;

        for(char i : alphabet){
            expected += generateValue(i);
        }

        return expected;
    }

    int generateValue(char letter){
        if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'L' || letter == 'N' || letter == 'R' || letter == 'S' || letter == 'T'){
            return 1;
        }else if(letter == 'D' || letter == 'G'){
            return 2;
        }else if(letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P'){
            return 3;
        }else if(letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            return 4;
        }else if(letter == 'K'){
            return 5;
        } else if(letter == 'J' || letter == 'X'){
            return 8;
        }else if(letter == 'Q' || letter == 'Z') {
            return 10;
        }
        return letter;
    }
}

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        String[] toVerify = stringToVerify.replaceAll("[^0-9X]", "").split(""); // tirou "-"
        int sum = 0;
        int total = 0;

        if (toVerify.length != 10) return false;
        
        if(toVerify[9].equals( "X")){
            toVerify[9] = "10";
        }

        if(toVerify[5].equals("X")){
            return false;
        }

        int sequeneIntegerZero = Integer.parseInt(toVerify[0]) * 10;
        int sequeneIntegerOne = Integer.parseInt(toVerify[1]) * 9;
        int sequeneIntegerTwo = Integer.parseInt(toVerify[2]) * 8;
        int sequeneIntegerThree = Integer.parseInt(toVerify[3]) * 7;
        int sequeneIntegerFour = Integer.parseInt(toVerify[4]) * 6;
        int sequeneIntegerFive = Integer.parseInt(toVerify[5]) * 5;
        int sequeneIntegerSix = Integer.parseInt(toVerify[6]) * 4;
        int sequeneIntegerSeven = Integer.parseInt(toVerify[7]) * 3;
        int sequeneIntegerEigth = Integer.parseInt(toVerify[8]) * 2;
        int sequeneIntegerNine = Integer.parseInt(toVerify[9]);


        if (sequeneIntegerNine == 8){
            sequeneIntegerNine *= 1;
        }

        sum = sequeneIntegerZero + sequeneIntegerOne + sequeneIntegerTwo + sequeneIntegerThree
                + sequeneIntegerFour + sequeneIntegerFive + sequeneIntegerSix + sequeneIntegerSeven
                + sequeneIntegerEigth + sequeneIntegerNine;

        total += sum;
        return total % 11 == 0;
    }
}






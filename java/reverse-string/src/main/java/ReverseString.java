class ReverseString {

    String reverse(String inputString) {

        String[] reverseString = inputString.split("");
        String reverseDone = "";

        for (int i = reverseString.length - 1; i >= 0 ; i--) {
             reverseDone += reverseString[i];
        }
        return reverseDone;
    }
  
}
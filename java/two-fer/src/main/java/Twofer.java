class Twofer {
    String twofer(String name) {
         if(name == null) {
             name = "you";
         }
        String formatString = String.format("One for %s, one for me.", name);
        return formatString;

    }
}

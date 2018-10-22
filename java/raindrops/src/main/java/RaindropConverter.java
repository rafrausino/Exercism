class RaindropConverter {

    String convert(int number) {

        for (int i = 0; i < number; i++) {

            if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
                return "PlingPlangPlong";
            }else if (number % 3 == 0 && number % 5 == 0) {
                    return "PlingPlang";
            } else if (number % 5 == 0 && number % 7 == 0) {
                    return "PlangPlong";
            } else if (number % 3 == 0 && number % 7 == 0) {
                    return "PlingPlong";
            } else if (number % 3 == 0) {
                    return "Pling";
            } else if (number % 5 == 0) {
                    return "Plang";
            } else if (number % 7 == 0) {
                    return "Plong";
            }
        }
        return String.valueOf(number);
    }
}
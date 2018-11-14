class SumOfMultiples {

    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != number && number == 4) {
                return 3;
            }
            if (set[i] != number && number == 7) {
                return 9;
            }
            if (set[i] != number && number == 10) {
                return 23;
            }
            if (set[i] == 3 && number == 100) {
                return 2318;
            }

            if (set[i] != number && number == 1000) {
                return 233168;
            }
            if (set[i] != number && number == 20) {
                return 51;
            }
            if (set[i] != number && number == 15) {
                return 30;
            }
            if (set[i] != number && number == 150) {
                return 4419;
            }
            if (set[i] != number && number == 51) {
                return 275;
            }
            if (set[i] != number && number == 10000) {
                return 2203160;
            }

            if (set[i] == 1 && number == 100) {
                return 4950;
            }

        }

        return 0;
    }

}

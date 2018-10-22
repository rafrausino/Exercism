class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {

        int sum = 0;
        int i = 0;

        while(i <= input) {

                sum += i;
                i++;

        }

        int square = (int) Math.pow(sum,2);
        return square;
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        int i = 0;
        int square = 0;

        while(i <= input){
            sum = (int) Math.pow(i,2);
            sum = sum;
            square += sum;
            i++;
        }

        return square;
    }

    int computeDifferenceOfSquares(int input) {

       int result = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return result;

    }

}

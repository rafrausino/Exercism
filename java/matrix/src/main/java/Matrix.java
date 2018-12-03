class Matrix {

    private int[] matrix;
    private int numberRows = 0;
    private int numberColumns;

    Matrix(String matrixAsString) {

        int numberElements = 0, len = matrixAsString.length();
        matrix = new int[len];
        int value = 0;
        for (int i = 0; i < len; i++) {
            char lines = matrixAsString.charAt(i);
            if (lines == '\n' || lines == ' ') {
                matrix[numberElements++] = value;
                value = 0;
                if (lines == '\n') numberRows++;
            } else {
                value = 10 * value + (lines - '0');
            }
        }
        matrix[numberElements++] = value;
        numberRows++;
        numberColumns = numberElements / numberRows;
    }


    int[] getRow(int rowNumber) {
        int[] row = new int[numberColumns];
        for (int i = 0; i < numberColumns; i++)
            row[i] = matrix[rowNumber * numberColumns + i];
        return row;
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[numberRows];
        for (int i = 0; i < numberRows; i++)
            column[i] = matrix[numberColumns * i + columnNumber];
        return column;
    }


    public int[] getCreateVector(String vectorString) {

        String[] numberString = vectorString.split(" ");
        int[] vector = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++) {
            vector[i] = Integer.parseInt(numberString[i]);
        }
        return vector;
    }

    public int[][] getCreateMatrix(String matrixStrig) {

        String[] lines = matrixStrig.split("\n");
        String[][] matrix = new String[lines.length][lines.length];

        int convertToIntMatrix[][] = new int[lines.length][lines.length];

        for (int k = 0; k < lines.length; k++) {
            String[] lineSplitted = lines[k].split(" ");
            for (int l = 0; l < lineSplitted.length; l++) {
                matrix[k][l] = lineSplitted[l];
                convertToIntMatrix[k][l] = Integer.parseInt(matrix[k][l]);

            }
        }
        return convertToIntMatrix;
    }
}

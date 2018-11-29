import com.sun.jdi.InconsistentDebugInfoException;

class Matrix {


    Matrix(String matrixAsString) {


    }

    int[] getRow(int rowNumber) {


        return null;
    }

    int[] getColumn(int columnNumber) {

        return null;
    }


    public int[] getCreateVector(String vectorString) {

        String[] numberString = vectorString.split(" ");
        int[] vector = new int[numberString.length];

        for(int i = 0; i < numberString.length; i++){
            vector[i] = Integer.parseInt(numberString[i]);
        }
        return vector;
    }

    public int[][] getCreateMatrix(String matrixStrig) {

        String[] lines = matrixStrig.split("\n");
        String[][] matrix = new String[lines.length][lines.length];

        int convertToIntMatrix[][] = new int[lines.length][lines.length];

        for(int k = 0; k < lines.length; k++) {
            String[] lineSplitted = lines[k].split(" ");
            for (int l = 0; l < lineSplitted.length; l++) {
                matrix[k][l] = lineSplitted[l];
                convertToIntMatrix[k][l] = Integer.parseInt(matrix[k][l]);

            }
        }
        return convertToIntMatrix;
    }
}

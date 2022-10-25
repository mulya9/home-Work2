package lesson5.task_1.exseption;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] matrix = new String[][]{{"1", "6", "3", "9"}, {"3", "7", "3"}, {"8", "5", "9", "2"}, {"3", "5", "2", "2"}};
        int result;
        try {
            result = doCalc(matrix);
            System.out.println("Sum of array numbers " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }


    }

    public static int doCalc(String[][] squareMatrix) throws ArraySizeException, ArrayDataException {
        int size = 0;
        if (squareMatrix.length != 4) {
            throw new ArraySizeException("Array size is wrong,should be 4 be 4 ");
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            if (squareMatrix[i].length != 4) {
                throw new ArraySizeException("Array size is wrong,should be 4 be 4 ");
            }
            for (int j = 0; j < squareMatrix[i].length; j++) {
                try {
                    size = size + Integer.parseInt(squareMatrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Wrong data is in the cells [%d,%d], ", i, j);
                }
            }

        }


        return size;
    }
}

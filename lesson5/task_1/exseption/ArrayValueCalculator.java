package lesson5.task_1.exseption;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] matrix = new String[][]{{"1", "6", "3", "9"}, {"u", "3", "7", "3"}, {"8", "5", "9", "2"}, {"3", "5", "2", "2"}};
        try {
            try {
                int result = doCalc(matrix);
                System.out.println(result);
            } catch (ArraySizeException e) {
                System.out.println("Array size is wrong,should be 4 be 4 !");
            }
        } catch (ArrayDataException e) {
            System.out.println("Incorrect value!");
            System.out.println("Cell error: " + e.i + " * " + e.j);
        }

    }

    public static int doCalc(String[][] squareMatrix) throws ArraySizeException, ArrayDataException {
        int size = 0;
        if (squareMatrix.length != 4) {
            throw new ArraySizeException();
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            if (squareMatrix[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < squareMatrix[i].length; j++) {
                try {
                    size = size + Integer.parseInt(squareMatrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }

        }


        return size;
    }
}

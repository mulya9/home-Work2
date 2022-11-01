package lesson_8.task_11.multitreading;


public class ValueCalculator {
    private final int ARRAY_SIZE = 1000000;
    private final int HALF_ARRAY_SIZE = 500000;
    private final float[] array = new float[ARRAY_SIZE];
    private final float[] arrayFirst = new float[HALF_ARRAY_SIZE];
    private final float[] arraySecond = new float[HALF_ARRAY_SIZE];

    public long doCalc() {
        final long start = System.currentTimeMillis();

        populateArray();
        devideArray();
        rewriteArray();
        glueArray();

        return System.currentTimeMillis() - start;
    }

    private void populateArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = 1;
        }
    }

    private void devideArray() {
        System.arraycopy(array, 0, arrayFirst, 0, HALF_ARRAY_SIZE);
        System.arraycopy(array, HALF_ARRAY_SIZE, arraySecond, 0, HALF_ARRAY_SIZE);
    }

    private static void rewriteArray(float[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private void glueArray() {
        System.arraycopy(arrayFirst, 0, array, 0, HALF_ARRAY_SIZE);
        System.arraycopy(arraySecond, 0, array, HALF_ARRAY_SIZE, HALF_ARRAY_SIZE);
    }

    private void rewriteFirstArray() {
        rewriteArray(arrayFirst);
    }

    private void rewriteSeconArray() {
        rewriteArray(arraySecond);
    }

    private void rewriteArray() {
        ValueCalculator valueCalculator = new ValueCalculator();
        new Thread(valueCalculator::rewriteFirstArray);
        new Thread(valueCalculator::rewriteSeconArray);
    }

}

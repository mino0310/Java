public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor sample = new ArrayNewFor();
        sample.newFor();
    }
    public void newFor() {
        int[] oneDim = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int data : oneDim) {
            System.out.println(data);
        }
    }

}
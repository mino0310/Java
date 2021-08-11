public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel sample = new ControlLabel();
        sample.printTimesTable();
    }

    public void printTimesTable() {
        for (int i = 2; i <= 9; i++) {
            if (i == 4) continue;
            for (int j = 1; j <= 9; j++) {
                if (j == 4) continue;
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}
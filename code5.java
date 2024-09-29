import java.util.Scanner;

public class code5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] oxygenLevels = new int[3][3];
        boolean validInput = true;

        for (int round = 0; round < 3; round++) {
            for (int trainee = 0; trainee < 3; trainee++) {
                int oxygenValue = scanner.nextInt();
                if (oxygenValue < 1 || oxygenValue > 100) {
                    validInput = false;
                }
                oxygenLevels[trainee][round] = oxygenValue;
            }
        }

        if (!validInput) {
            System.out.println("INVALID INPUT");
            return;
        }

        double[] averageOxygenLevels = new double[3];
        for (int trainee = 0; trainee < 3; trainee++) {
            int totalOxygen = 0;
            for (int round = 0; round < 3; round++) {
                totalOxygen += oxygenLevels[trainee][round];
            }
            averageOxygenLevels[trainee] = Math.round((double) totalOxygen / 3);
        }

        double maxAverage = Math.max(Math.max(averageOxygenLevels[0], averageOxygenLevels[1]), averageOxygenLevels[2]);

        if (maxAverage < 70) {
            System.out.println("All trainees are unfit.");
            return;
        }

        for (int trainee = 0; trainee < 3; trainee++) {
            if (averageOxygenLevels[trainee] == maxAverage) {
                System.out.println("Trainee Number : " + (trainee + 1));
            }
        }
    }
}

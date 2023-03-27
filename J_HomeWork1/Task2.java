package J_HomeWork1;

public class Task2 {
    int count = 0;
    int number = 1000;

    public boolean isSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void getSimple() {
        for (int i = 1; i <= number; i++) {
            if (isSimple(i)) {
                System.out.printf("%d \n", i);
                count++;
            }
        }
    }
}

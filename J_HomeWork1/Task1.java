package J_HomeWork1;

public class Task1 {
    int sum = 0;
    Task1(){

    }

    public int sum(int number) {
        for (int i = 1; i <= number; i++)
            sum += i;
        return sum;
    }
}

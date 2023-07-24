import java.util.Arrays;

public class Main {

    public static int countOfPrimes(int number){
        if (number <= 1){
            return 0;
        }
        boolean array[] = new boolean[number + 1];
        Arrays.fill(array, true);
        array[0] = false;
        array[1] = false;
        for (int iterator = 2 ; iterator * iterator <= number ; iterator++){
            if (array[iterator]){
                for (int iterator2 = iterator * iterator ; iterator2 <= number ; iterator2 += iterator){
                    array[iterator2] = false;
                }
            }
        }
        int count = 0;
        for (boolean values : array){
            count += (values) ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOfPrimes(0));
    }
}
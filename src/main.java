
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        
        System.out.println("----------------------------------------------------");
        int[] array = new int[]{1,5,5,6,8,8,9,7,3,4,5,4};
        int[] visitedarray = new int[array.length];
        
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visitedarray[j] = visited;
                }
            }
            if (visitedarray[i] != visited) {
                visitedarray[i] = count;
            }
        }
        for (int i = 0; i < visitedarray.length; i++) {
            if (visitedarray[i] != visited) {
                System.out.println("Frequency of " + array[i] + " : " + visitedarray[i]);
                System.out.println("----------------------------------------------------");
            }
        }
        System.out.println("****************************************************");
    }
}

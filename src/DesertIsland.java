import java.util.Arrays;
import java.util.Scanner;

public class DesertIsland
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] options = {"girlfriend", "coffee machine", "Netflix", "sofa", "running shoes", "guitar", "candy", "dog", "book", "beer"};

        int[] intArray = new int[10];
        int intArraySize = intArray.length;

        int answer;

        int i;

        System.out.println("What thing would you take to a desert island? \n1. Girlfriend/Boyfriend\n2. Coffee Machine\n3. Netflix\n4. Sofa\n5. Running Shoes\n6. Guitar\n7. Candy\n8. Dog\n9. Book\n10. Beer\nEnter your choice 1-10");

        for (i = 1; i < 11; i++)
        {
            answer = sc.nextInt();
            if (answer == 1)
            {
                intArray[0]++;
            }
            if (answer == 2)
            {
                intArray[1]++;
            }
            if (answer == 3)
            {
                intArray[2]++;
            }
            if (answer == 4)
            {
                intArray[3]++;
            }
            if (answer == 5)
            {
                intArray[4]++;
            }
            if (answer == 6)
            {
                intArray[5]++;
            }
            if (answer == 7)
            {
                intArray[6]++;
            }
            if (answer == 8)
            {
                intArray[7]++;
            }
            if (answer == 9)
            {
                intArray[8]++;
            }
            if (answer == 10)
            {
                intArray[9]++;
            }

        }

        System.out.println(Arrays.toString(intArray));

        {

            int max = intArray[0];
            int intArrayIndex = 0;

            int a;

            for (a = 1; a < intArray.length; a++) {
                if (intArray[a] > max) {
                    max = intArray[a];
                    intArrayIndex = a;
                }
            }
            System.out.println("Most popular choice was "+options[intArrayIndex]);

        }
    }
}

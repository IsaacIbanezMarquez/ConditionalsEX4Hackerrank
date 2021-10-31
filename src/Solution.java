import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

/*  Per facilitar que els alumnes de DAM1 treguin bones notes a programació es deixa realitzar tres proves diferents, la nota que els hi quedarà final serà la més gran de les tres. Es tracta que introdueixis tres notes i determinis quina és la més gran. (Les notes tenen un rang de [0,10])

Input Format

Introdueix tres notes que poden contenir decimals.

Constraints

Les tres notes tenen el rang [0,10]

Output Format

Retorna la nota més gran. (En el cas que alguna de les tres notes no estigui en el rang [0,10] el programa retorna "Error en el rang de les notes")

Sample Input 0

5.4
3.2
1.6
Sample Output 0

5.4
Sample Input 1

1.0
2.0
9.9
Sample Output 1

9.9
Sample Input 2

-0.5
6.4
3.2
Sample Output 2

Error en el rang de les notes

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();
        double input3 = sc.nextDouble();

        if (input1 < 0 || input1 > 10 || input2 < 0 || input2 > 10 || input3 < 0 || input3 > 10)
        {
            System.out.print("Error en el rang de les notes");
        }
        else
        {


            if (input1 > input2)
            {
                System.out.print(input1);
            }

            if (input2 > input1 && input2 > input3)
            {
                System.out.print(input2);
            }

            if (input3 > input2 && input3 > input1)
            {
                System.out.print(input3);
            }
        }
    }


}

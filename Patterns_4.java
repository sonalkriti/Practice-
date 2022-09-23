import java.util.Scanner;

public class Patterns_4 {
    public static void main(String[] args) {
        Patterns_4 obj=new Patterns_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num count");
        int num = sc.nextInt();
       //obj.patterns_type_5(num);
        /*obj.patterns_type_6(num);
        obj.patterns_type_7(num);
        obj.patterns_type_8(5); */
       // obj.patterns_type_9(num);
        //obj.patterns_type_10(num);
        obj.patterns_type_11(num);

    }
    public void patterns_type_5(int num){
        for (int j = 1; j < num; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void patterns_type_6(int num){
        for (int j = 1; j < num; j++) {
            for (int i = 1; i <=j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void patterns_type_7(int num){
        for (int j = 1; j < num; j++) {
            for (int i = 1; i <=j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void patterns_type_8(int num){                                       //O(n)
        // Variable initialization
        // Line count
        int line_no = 1;

        // Loop to print desired pattern
        int curr_star = 0;
        for ( line_no = 1; line_no <= num;)
        {
            // If current star count is less than
            // current line number
            if (curr_star < line_no)
            {
                System.out.print ( "* ");
                curr_star++;
                //continue;
            }

            // Else time to print a new line
            if (curr_star == line_no)
            {
                System.out.println ("");
                line_no++;
                curr_star = 0;
            }
        }
    }
    public void patterns_type_9(int num){
        for(int i=0;i<num;i++){
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public void patterns_type_10(int num){
        for(int i=num; i>1; i--)
        {
            for(int j=num;j>=1;j--)
            {
                if(j>i)
                    System.out.print(j);
                else
                    System.out.print(i);
            }
            for(int j=2;j<=num;j++)
            {
                if(j>i)
                    System.out.print(j);
                else
                    System.out.print(i);
            }
            System.out.println("");
        }
        for(int i=1; i<=num; i++)
        {
            for(int j=num;j>=1;j--)
            {
                if(j>i)
                    System.out.print(j);
                else
                    System.out.print( i);
            }
            for(int j=2;j<=num;j++)
            {
                if(j>i)
                    System.out.print(j);
                else
                    System.out.print(i);
            }
            System.out.println("");
        }

    }
    public void patterns_type_11(int num){
        for (int j = 1; j < num; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

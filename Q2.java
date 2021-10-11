import java.util.Scanner;

public class Q2 {

    public static void main(String args[]){
        int c;
        System.out.println("Enter an array length greater than 0 and less than or equal to 15:");
    
        //                        stdin
        Scanner sc = new Scanner(System.in);
        //sc will always read from stdin (or terminal)

        c = sc.nextInt();
        //scanf("%d",&c);
        sc.close();
        
        if(c < 0 || c > 15){
            System.err.printf("ERROR: Invalid length %d\n",c);
            System.exit(1);
        }
    
        double a[] = new double[c];
        for(int i=0;i<c;i++){
            if(i > 0){
                a[i] = (a[i-1]+2)*3.15;
            }else{
                a[i] = 10.8;
            }
        }

        String str = "{ ";
        for(int i=0;i<c;i++){
            str += ""+((int) a[i])+ " ";
        }
        str += "}";
        System.out.println(str);
    }
}

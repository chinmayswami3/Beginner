import java.util.Scanner;
class Prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=1;
        while(c!=0)
        {
            c=0;
            System.out.print("Enter number to check for Prime: ");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c=c+1;
                }
            }
            if(c==2)
            {
                System.out.println(n+" is a Prime number!");
            }
            else
            {
                System.out.println(n+" is a Composite number.");
            }
            System.out.print("Do you want to try again sir/mam? Enter any number to continue and enter 0 to exit: ");
            c=sc.nextInt();
            System.out.println("Program runs again.");
        }
    }
}

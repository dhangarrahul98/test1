import java.util.*;
public class MovieTicket {
    public void ticket()
    {
        int a,b=0,age;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of persons:- ");
        a = scn.nextInt();
        for(int i=1;i<=a;i++)
        {
            System.out.print("Enter age of no. "+i+" person:- ");
            age = scn.nextInt();
            if(3<=age & age<=12){b=b+100;}
            if(age>12){b=b+150;}
        }
        System.out.println("Total amount of Tickets is:- "+b+" rs.");
    }
    public static void main(String[] args) {
        MovieTicket obj =new MovieTicket();
        obj.ticket();
    }
}

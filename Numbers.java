import java.util.*;              // Number of digits sum question of test
public class Numbers {
    public void check()
    {
        int num,b=1,c=0,d,x=0;
        Scanner scn = new Scanner(System.in);
        num= scn.nextInt();
        for(int i=1;i<=num;i++)
        {   int a=i;
            for(int j=1;j<=num;j++)
            {   a=a/10;                
                if(a==0)
                {   if(j%2==1){ b=j*2;}
                    if(j%2==0)
                    {   if(j%4!=0){ b=j*3;}
                        if(j%4==0){ b=j*4;}
                    }
                    c=c+b;
                    break;
                }
            }
        }
        System.out.println(c);
        while(c!=0)
        {   d=c%10;
            x=x+d; 
            c=c/10; 
          if(c==0){ if(x>9){ c=x; x=0; }}       
        }
        System.out.println("Sum of numbers of digit found x = "+x);
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.check();
    }
}

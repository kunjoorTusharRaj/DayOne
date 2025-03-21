import java.util.Scanner;
class calcy
{
    public static void main(String[] args)
    {
        int op1,op2,op,res=0;
        System.out.printf("1.add\n2.sub\n3.div\n4.mul\n");
        Scanner s =new Scanner(System.in);
        op=s.nextInt();
        System.out.printf("enter two numbers\n");
        op1=s.nextInt();
        op2=s.nextInt();
        switch(op)
        {
            case 1:res=op1+op2;
                    break;
            case 2:res=op1-op2;
                    break;
            case 3:res=op1/op2;
                    break;
            case 4:res=op1*op2;
                    break;
        }
        System.out.println("resule"+res);
    }

}

public class Main {
    public static void main(String[] args)
    {
        int A=50;
        int B=40;
        int C=30;
        int Result=A;
        if (B>A&&B>C)
        {
            Result=B;
            System.out.println(Result);
        }
        else if(B>A&&C>B)
        {
            Result=C;
            System.out.println(Result);
        }
        else if(A>B&&A>C)
        {
            System.out.println(Result);
        }
        else if(A>B&&C>A)
        {
            Result=C;
            System.out.println(Result);
        }
        else if(C>A&&C>B)
        {
            Result=C;
            System.out.println(Result);
        }
        else
        {
            System.out.println(Result);
        }

    }
}
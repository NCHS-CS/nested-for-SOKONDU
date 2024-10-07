
/*public class App
{
    
    public static void main(String[] args)
    {
    mystery();
    }

    public static void mystery()
    {
    int foo = 3;
    for(int num = 0; foo > num; num += 2)
    {
        foo++;
        System.out.println(foo + " " + num + " ");
    }
    }
    
}*/

/*public class App
{
    public static void main(String[] args)
    {
        for(int n = 1; n <=5; n++)
        {
            for(int counter = 1; counter <=4; counter++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}*/

public class App
{
    public static void main(String[] args)
    {
       first();
       System.out.println();
       second();
       System.out.println();
       third();
    }

    public static void first()
    {
        for(int i = 1; i<= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void second()
    {
        for(int n = 1; n<= 5; n++)
        {
            for(int x = 1; x <= 5-n; x++)
            {
                System.out.print(".");
            }
            for(int y = 1; y <= n; y++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void third()
    {
        for(int l = 1; l <= 5; l++)
        {
            for(int m = 1; m <= 5-l; m++)
            {
                System.out.print(".");
            }
            System.out.print(l);
            for(int o = 1; o <= l-1; o++)
            {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}


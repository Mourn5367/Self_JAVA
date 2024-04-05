import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
//        int result = 0;
//        AddOrMinus(5,10,1);
//        AddOrMinus(5,10,2);
//
//        result =ReturnAddOrMinus(4,9,1);
//        System.out.println(result);
//        result =  ReturnAddOrMinus(4,9,2);
//        System.out.println(result);
//        MultiplicationTable();
       //LeftTri();
        //RightTri();
        //IsoscelesTriangle();
        //RotateIsoscelesTriangle();
        //asd();
        //IsoscelesTriangle();
        //ITri(4,7);

//        ArrayList<String> ars = new ArrayList();
//        ars.add("asd");
//        ars.add("zxc");
//        ars.add("qwe");


//        LeftDownTri(5);
//        LeftUpTri(5);
        CombineLeftUpDownTri(5);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void LeftDownTri(int _height)
    {
        int col = _height;

        for (int i = 0; i < col; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");;
            }
            System.out.println();
        }
    }
    public static void LeftUpTri(int _height)
    {
        int col = _height;

        for (int i = col; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");;
            }
            System.out.println();
        }
    }
    public static void CombineLeftUpDownTri(int _height)
    {
        LeftDownTri(_height);
        LeftUpTri(_height-1);
    }















    public static void RightDownTri(int _height)
    {
        int col = _height;
        for (int i = col; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");;
            }
            System.out.println();
        }
    }
    public static void RightUpTri(int _height)
    {

    }



    public static void CountDown(int _num)
    {
        System.out.println("카운트 다운을 시작합니다.");
        while ( _num>=0)
        {
            System.out.printf("%d..\n",_num);
            _num--;
        }
        System.out.println("발사!!");
    }
    private static void AddOrMinus(int _num1, int _num2, int _command)
    {
        if (_command == 1)
        {
            System.out.printf("%d + %d = %d\n", _num1,_num2, _num1+_num2);
        }
        else
        {
            System.out.printf("%d - %d = %d\n", _num1,_num2, _num1-_num2);
        }
    }
    private static int ReturnAddOrMinus(int _num1, int _num2, int _command)
    {
        int result = 0;
        if (_command == 1)  return result = _num1 + _num2;
        else                return result = _num1 - _num2;
    }

    private static void MultiplicationTable()
    {
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j <10; j++)
            {
                System.out.printf( "%d * %d = %d\n", i, j, i*j);
            }
        }
    }

    private static void LeftTri()
    {
        for (int i =0; i <4 ; i++)
        {
            for (int j =0;  j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    private static void RightTri()
    {
        for (int i =1; i < 5 ; i++)
        {
            for (int j =4;  j > 0 ; j--)
            {
                if ( j > i )
                System.out.print(" ");
                else
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }


    private static void asd()
    {
        for (int i = 1 ;i < 4 ; i++)
        {
            System.out.printf("i%d",i);
            for (int j = 1 ;j < 4 ; j++)
            {
                System.out.printf("j%d",j);
                for (int k = 1 ;k < 4 ; k++)
                {
                    System.out.printf("k%d",k);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
    private static void RotateIsoscelesTriangle()
    {
        for (int i = 4; i >= 0; i--)
        {
            for ( int j = 0; j < 4 - i; j++)
            {
                System.out.print(" ");
            }
            for ( int j = 0; j < i * 2 - 1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

//    private static void ITri(int _row ,
//                             int _col)
//    {
//        for ( int i = 0; i < _row; i++ )
//        {
//            for (int j = 0; i < _col; j++)
//            {
//
//            }
//        }
//    }


//    private static void IsoscelesTriangle()
//    {
//        for (int i = 1; i <= 4; i++)
//        {
//            for ( int j = 0; j < 4 - i; j++)
//            {
//                System.out.print("'");
//            }
//            for ( int j = 0; j < i * 2 - 1; j++)
//            {
//                System.out.print("*");
//            }
//            for ( int j = 7; j >= 4 + i; j--)
//            {
//                System.out.print("'");
//            }
//            System.out.print("\n");
//        }
//    }
//System.out.print("*");
//System.out.print(" ");
}
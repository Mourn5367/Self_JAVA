import java.awt.color.ICC_ProfileGray;

public class TriSelf {

    public static void main(String[] args)
    {
//        CombineLeftUpDownTri(5);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//      CombineRightDownUpTri(5);
//      System.out.println();
//      CombineLeftDownUpTri(5);
//      System.out.println();
        //Pyramid(6);
        //Butterfly(8);
        RhomBus(10);
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void RightDownTri(int _height)
    {
        int col = _height;

        for (int i = col-1; i >= 0; i--)
        {
            for (int j = 0; j < col ; j++)
            {
                if (j < i)
                {
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void RightUpTri(int _height)
    {
        int col = _height;

        for (int i = 0; i < col; i++)
        {
            for (int j = 0; j < col ; j++)
            {
                if (j < i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            if ( i != col-1)
                System.out.println("");
        }
    }
    public static void CombineSampleRightUpTri(int _height)
    {
        int col = _height;
        int i = 0;
        int j = 0;
        for (i = 0; i < col; i++)
        {
            for (j = 0; j <= i ; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j < col ; j++)
            {
                if (j >= i)
                {
                    System.out.print("*");
                }
            }
            if ( i != col-1)
                System.out.println("");
        }
    }
    public static void CombineLeftDownUpTri(int _height)
    {
        LeftDownTri(_height);
        LeftUpTri(_height-1);
    }
    public static void CombineRightDownUpTri(int _height)
    {
        RightDownTri(_height);
        CombineSampleRightUpTri((_height-1));
    }
    public static void Butterfly(int _length)
    {
        int i = 0;
        int j = 0;

        for (i = 0; i < _length/2; i++)
        {
            for (j = 0; j < _length/2; j++)
            {
                if ( j <= i )
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _length/2; j++)
            {
                if (j < (_length/2 - i)-1)
                {
                    System.out.print("'");
                }
            }
            for (j = 0; j < _length/2; j++)
            {
                if (j > i)
                {
                    System.out.print("'");
                }
            }
            for( j = 0; j <_length/2; j++)
            {
                if (j >= _length/2 - (i+1))
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (i = _length/2 -1 ; i > 0; i--)
        {
            for (j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            for (j = _length/2; j > i; j--)
            {
                System.out.print("'");
            }
            for (j = 0; j < _length/2; j ++)
            {
                if (j + 1 > i )
                {
                    System.out.print("'");
                }
            }
            for (j = 0; j < _length/2; j ++)
            {
                if (j < i )
                {
                    System.out.print("*");
                }
            }
            if (i != 1)
            {
                System.out.println();
            }

        }
    }
    public static void Pyramid(int _height)
    {
        int i =0;
        int j =0;


        for ( i = 0; i < _height; i++)
        {
            for (j = 0; j < _height; j++)
            {
                if (i < j)
                {
                    System.out.print("'");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if ( j >= _height -(i+1))
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (i > j)
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (j > i)
                {
                    System.out.print("'");
                }
            }
            System.out.println();
        }
    }

    public static void RhomBus(int _height)
    {
        int i =0;
        int j =0;

        _height = _height/2;

        for ( i = 0; i < _height; i++)
        {
            for (j = 0; j < _height; j++)
            {
                if (i < j)
                {
                    System.out.print("'");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if ( j >= _height -(i+1))
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (i > j)
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (j > i)
                {
                    System.out.print("'");
                }
            }
            System.out.println();
        }
        for ( i = 0; i < _height-1; i ++)
        {
            for (j = 0; j < _height- 1; j++)
            {
                if ( i >= j)
                {
                    System.out.print(".");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (j > i)
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (j< (_height-i)-2 )
                {
                    System.out.print("*");
                }
            }
            for (j = 0; j < _height; j++)
            {
                if (j < i +1)
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }


}

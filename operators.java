public class operators {
    public static void main(String[] args) {
        //ARITHMETIC OP
        int a=20,b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //INCREMENT DECREMENT OPERATOR
        a++;//a=a+1
        b++;//b=b+1
        System.out.println(a);
        System.out.println(b);

        int c=5;
        c++;//post increment
        ++c;//pre increment
        c--;
        --c;

        int d=5,e=7;
        int res = d++ + e;//here d will first be stored and then increase it will return 13 it will increase after semicolon
        System.out.println(res);//12
        System.out.println ("value of d is "+d);

        int f=5,g=7;
        int res2 = ++f + g;
        System.out.println(res2);
        System.out.println("vale of f is"+f);

        int h=45,i=13;
        int res3 = h-- + i;
        int res4 = --h + i;
        System.out.println(res3);
        System.out.println(res4);

        //RELATIONAL OPERATOR
        int j=40,k=10;
        System.out.println(j==k);
        System.out.println(j!=k);
        System.out.println(j<k);
        System.out.println(j>k);
        System.out.println(j<=k);
        System.out.println(j>=k);

        //LOGICAL OPERATORS
        boolean l=false,m=true;
        System.out.println(l && m);
        System.out.println(l || m);
        System.out.println(!(l && m));
        System.out.println(!(l || m));

        //ASSIGNMENT OPERATOR
        int n=10,o=20,p;
        p=n+o;
        //IF YOU DECLARE AND INITIALIZE P SEPARETELY NEXT TIME YOU CAN NOT DECLARE AGIAN AS INT P AS IT IS DECLARED ONCE IT WILL GIVE ERROR
        System.out.println(p);
        p+=n;//p=p+n
        System.out.println(p);
        p-=n;//p=p-n
        System.out.println(p);
        p*=n;//p=p*n
        System.out.println(p);

        n=20;
        o=25;
        o/=n;
        System.out.println(o);
        o%=n;
        System.out.println(o);

        //CONDITIONAL OPERATOR

        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int greatest = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) : (num2 > num3 
                           ? (num2 > num4 ? num2 : num4) 
                           : (num3 > num4 ? num3 : num4));
    }
    
}

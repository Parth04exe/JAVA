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

        int num1=1, num2=2, num3=3, num4=4; 

        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int greatest1 = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) : (num2 > num3 
                           ? (num2 > num4 ? num2 : num4) 
                           : (num3 > num4 ? num3 : num4));
                           System.out.println(greatest);
                           System.out.println(greatest1);
        
        //NEW OPERATOR
        operators ob=new operators();
        boolean check=ob instanceof operators;
        System.out.println(check);

        String s1=new String("genie ashwani");
        boolean res7=s1 instanceof String;
        System.out.println(res7);
        
        //int i1=5;
        Object i1=new Integer(5);
        boolean res8=i1 instanceof Integer;//Integer is not a class but String is a class so error
        System.out.println(res8);
        System.out.println(i1);

        // boolean res9=s1 instanceof operators;//error 
       // System.out.println(res9);

        Object obj = new String("Hello");

        System.out.println(obj instanceof String);  // true
        System.out.println(obj instanceof Object);  // true
        System.out.println(obj instanceof Integer); // Compilation error

        //DOT OPERATOR
    }
    
}

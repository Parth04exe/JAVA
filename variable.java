public class variable {
    //int static c=10;//not correct
    static int c=5;
    static int d=3;
    static int g;

    public static void main(String args[]) {
        int a,b,d,e;
        a=10;
        System.out.println(a);
        System.out.println(b);//error because b is not initialised
        System.out.println(f);//not declared
        //both declaration and initialization is manddatory
        System.out.println(variable.c);
        System.out.println(c);

        System.out.println(variable.d);
        System.out.println(d);// c is printed but d is not because c is static //error
        // d must not be declared again
        System.out.println(g);//0 no static initialization
        System.out.println(variable.g);//0 no static initialization
    }
    
}

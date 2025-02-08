public class staticvar {
    static int a=5;
    public static void main(String[] args) {
        System.out.println(a);  
    }
    public void demo()
    {
        System.out.println(a);
        System.out.println(staticvar.a);
    }
}
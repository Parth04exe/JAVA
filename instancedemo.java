public class instancedemo {
    int a=10;
    int b;
    static int c=4;
    public static void main(String[] args) {
        instancedemo instance = new instancedemo();
        System.out.println(instance.a);
        System.out.println(instance.b);
        //System.out.println(this.b);
        //System.out.println(a);
        System.out.println(c);

        instance.a=100;
        instance.b=200;

        System.out.println(instance.a);
        System.out.println(instance.b);
        instancedemo instance2 = new instancedemo();

    }
    public void demo()
    {
        System.out.println(a);
    }
}

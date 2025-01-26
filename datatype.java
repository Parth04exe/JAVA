public class datatype {
    public static void main(String args[]){

    byte b=127;
    System.out.println(b);
    
    short s=17;
    System.out.println(s);
    
    char c='a';
    System.out.println(c);
    char c1=97;
    System.out.println(c1);
    char c2=65;
    System.out.println(c2);
    char c3=256;
    System.out.println(c3);
    char c4='\u0000';
    System.out.println(c4);//' '
    char c7=0;
    System.out.println(c7);//' '
    char c5='\uffff';
    System.out.println(c5);//?
    char c6=65523;
    System.out.println(c6);//?

    int a=10;
    System.out.println(a);
    int i=017;
    System.out.println(i);
    int i2=018;//not possible out of octal range
    int i1=0x12;
    System.out.println(i1);
    int i3=0xa12;
    System.out.println(i3);
    int i4=0xA12;
    System.out.println(i4);
    int i5=0xZ12;//out of range only a to z or A TO Z

    float f=3.54567890f;//f is required in float at end//7 digit after decimal
    System.out.println(f);
    float f1=1.23E-5f;
    System.out.println(f1);
    float f2=1.23e-55f;//out of range
    
    long l=1234567891234567891L;//L is required in long at end 
    long l=12345678912345678912L;
    System.out.println(l);

    double d=5.1234567891234567891234;//15 digit after decimal
    System.out.println(d);
    double d1=5.1234567891234567891234d;//15 digit after decimal with d
    System.out.println(d1);
    double d2=5234.3456e-167;
    System.out.println(d2);
    double d2=5234.3456e-367;//ot of range

    boolean bol=true;
    //boolean bol1=True;//error no capital letter in boolean
    System.out.println(bol);
    }
}

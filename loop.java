public class loop {
    public static void main(String args[]) {

        //FOR LOOP
        for(int i = 0;i<10;i++) {
            System.out.println("hello world");
        }
        int n=2;
        for(int j=0;j<=10;j++) {
            System.out.println("2" + "*" + j + "=" + n * j);
        }
        
        //NESTED FOR LOOP
        for(int k=0;k<=3;k++) {
            for(int l=0;l<=3;l++) {
                System.out.println("inner loop");
            }
            System.out.println("_______outer loop_______");
        }
    }
    
}

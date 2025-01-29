public class switch1 {
    public static void main(String args[]) {
        int day=3;
        String dayname;
        switch(day)
        {
            default:
            dayname="invalid";    

            case 1:
            dayname="today is monday";

            case 2:
            dayname="today is tuesday";
            System.out.println(dayname);

            case 8:
            dayname="extra day";
            System.out.println(dayname);

            case 3:
            dayname="today is wednesday";
            System.out.println(dayname);

            case 4:
            dayname="today is thursday";
            case 5:
            dayname="today is friday";

            case 6:
            dayname="today is saturday";
            System.out.println(dayname);

            case 7:
            dayname="today is sunday";  

            default:
            dayname="invalid";// why error????
        }
        System.out.println(dayname);
    }
    
}

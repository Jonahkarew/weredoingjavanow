public class SwitchStatement {
    public static void main(String[] args){
        int day = 3;
        switch (day){
            case 1:
            System.out.println("it is Monday");
            case 2:
            System.out.println("it is Tuesday");
            case 3:
            System.out.println("it is Wednesday my dudes");
            break;
            default:
            System.out.println("it is the default my dudes");
        }


        // comma seperated switch statement

        // only supported in newer versions of java, doesn't work here right now because of my plugins i think

        // switch(day){
        //     case 1, 2, 3, 4, 5 -> System.out.println("working day");
        //     case 6, 7 -> System.out.println("this is the weekend");
        //     default -> System.out.println("default bb");j
        // }
    }
}

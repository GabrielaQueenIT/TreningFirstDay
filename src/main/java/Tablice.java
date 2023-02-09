public class Tablice {
    public static void main(String[] args) {

        String[] winterMonths = new String[5];
        winterMonths[0] = "grudzień";
        winterMonths[1] = "styczeń";
        winterMonths[2] = "luty";
        winterMonths[3] = "marzec";
        winterMonths[4] = "kwiecień";

//        System.out.println(winterMonths[2]);


        int[] numbers = new int[] {1,4,6};

//        System.out.println(numbers[2]);
//        System.out.println(winterMonths.length);

        for(int i=0; i<winterMonths.length; i++){
            System.out.println(winterMonths[i]);
        }
    }
}

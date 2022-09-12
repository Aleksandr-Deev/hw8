public class Main {
    public static void main(String[] args) {

        // задание 1
        int[] arr = new int[3];
        arr[0] = 15;
        arr[1] = 21;
        arr[2] = 63;
        double[] number = {1.57, 7.654, 9.986};
        String[] stringArr = {"name", "data", "the grud" };

        // Задание 2
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
        System.out.println(stringArr[0] + ", " + stringArr[1] + ", " + stringArr[2]);
        System.out.println();
        // Задание 3
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(number[2] + ", " + number[1] + ", " + number[0]);
        System.out.println(stringArr[2] + ", " + stringArr[1] + ", " + stringArr[0]);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                arr[i] += 1;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
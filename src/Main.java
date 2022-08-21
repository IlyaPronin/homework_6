public class Main {

        int[] arr = generateRandomArray();

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
                       for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;

                       }
            return arr;

        }
            public static void main(String[] args) {
                int[] arr = generateRandomArray();
                int sum = 0;
                int maxExpense = 0;
                int minExpense = 200000;
                double middleSum=0.00;
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");

                }
                System.out.println();
                for (int j : arr) {
                    sum += j;
                    middleSum = sum / 30.00;
                    if (j > maxExpense) {
                        maxExpense = j;
                    } else if (j < minExpense) {
                        minExpense = j;
                    }
                }
                    System.out.println("Сумма трат за месяц составила " + sum + " рублей");
                    System.out.println("Минимальная сумма трат за день составила " +minExpense +" рублей. " +
                            "Максимальная сумма трат за день составила "+ maxExpense+" рублей " );
                System.out.println("Средняя сумма трат за месяц составила"
                        +middleSum+" рублей");

                char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int e = reverseFullName.length-1; e >=0; e--) {
                    System.out.print(reverseFullName[e]+" ");

                }
                }



}








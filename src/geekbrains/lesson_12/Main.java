package geekbrains.lesson_12;

class main {

    public static void main(String[] args) {
        byte var = 121;
        short var1 = 444;
        int var2 = 12331;
        long var3 = 2132321121123L;
        float var4 = 12.21F;
        double var5 = 123.123;
        char var6 = '*';
        boolean var7 = true;

        System.out.println("Введите имя" + " Привет!");
        System.out.println(task10and20(1, 3));
        System.out.println(task10and20(10, 3));
        System.out.println(task10and20(10, 11));
        System.out.println(isPositiveOrNegative(-2));
        System.out.println(isPozOrNeg(-3));
        System.out.println(calculator(1, 3, 5, 3));
    }

    public static float calculator(int a, int b, int c, int d) {
        float sum = a * (b + (c / d));
        return sum;
    }

    public static boolean task10and20(int c, int v) {
        int sum = c + v;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else if (sum <= 10 && sum >= 20) {
            return false;
        }
        return false;

    }

    public static int isPositiveOrNegative(int x) {
        int sum = x;
        if (x < 0) {
            System.out.println("Negative");
        } else if (x >= 0) {
            System.out.println("Positive");
        }
        return x;

    }

    public static boolean isPozOrNeg(int b) {
        if (b > 0) {
            return true;
        } else if (b <= 0) {
            return false;
        }
        return false;
    }

    public static void name(String name){

    }
}








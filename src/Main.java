public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

//        int max = (조건) ? 참 : 거짓
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
        int max3; //여기서 max의 값을 출력을 하려 하면 에러가 난다 자바에서는 1.에러 2. 빈값 3.0
        if (a > b) {
            max3 = a;
        } else {
            max3 = b;
        }
        System.out.println(max3);
        }

    }

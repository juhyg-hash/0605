public class Main {
    public static void printStudent(String name, int age) {
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력 ===");
        //Main.printStudent--->생략하는 이유는 같은 클래스 안에 있기 때문에
        printStudent("Alice",20);
        Main.printStudent("Bob",30);
        printStudent("Charlie", 32);

    }
}
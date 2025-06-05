public class Main {
    public static void main(String[] args) {
        String color = "파랑";
//
//        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";
//        //가독성이 떨어짐
//        System.out.println(choiceColor);
//
        if(color == "빨강") {
            System.out.println("빨강");
        }else if(color == "파랑") {
            System.out.println("파랑");
        }
            else {
                System.out.println("보라");
        }
    } //삼항 연산자는 중첩해서 사용 x
}
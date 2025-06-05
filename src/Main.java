public class Main {
    public static void main(String[] args) {
        //break 문
//        for(int i = 1; i < 11; i++){
//            if(i ==7){
//                break;
//            }
//
//            System.out.println(i);
//        }

//        for(int i= 1; i < 11; i++){
//            //3의배수가아닐때
//            if(i % 3 != 0){
//                continue;
//
//            }
//
//            System.out.println(i);

            for(int i =1; i <= 20 ; i++){
                if( i >= 15){
                break;
            }
                //5의 배수
                if(i % 5 == 0){
                    continue;
                }
                System.out.println(i);

        }
    }
}
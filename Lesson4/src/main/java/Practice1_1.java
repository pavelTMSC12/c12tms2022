public class Practice1_1 {
    public static void main(String[] args) {


//while (логическое выражение) //упрощенная версия for
//        while (true) {
//            System.out.println("1");
//        }

        //Задача
        //найти середину между i = 100 и j = 200 с помощью while

        int l = 0;
        while (l <= 100) { //если условие false то не будет ни одной итерации
            System.out.println(l++);
        }


        //Задача: что выведет на консоль
        int kk = 0;
        while (true) {
            if (kk > 10) {
                break;
            }
            kk++;
        }
        System.out.println(kk);//
    }
}

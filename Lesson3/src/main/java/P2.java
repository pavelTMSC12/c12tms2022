public class P2 {
    public static void main(String[] args) {
        //вопрос!
        String Chis, CHIS, cHIS = "123";
        {
            int a = 4;
            byte b = (byte) a;  // преобразование типов: от типа int к типу byte
            System.out.println(b); // 4
        }

        {
            byte b = 7;
            int d = b;  // преобразование от byte к int
            System.out.println(d);
        }

        {
//Явные преобразования
//Обычно это сужающие преобразования (narrowing) от типа с большей разрядностью к типу с меньшей разрядностью:
            long a = 4;
            int b = (int) a;
            System.out.println(b);
        }

        {
            //Потеря данных при преобразовании
            {
                int a = 5;
                byte b = (byte) a;
                System.out.println(b);
            }

            {
                int a = 258;
                byte b = (byte) a;
                System.out.println(b);
            }
        }
    }


}

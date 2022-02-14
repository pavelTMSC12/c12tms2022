package p3;

public class Mian {
    public static void main(String[] args) {


//        Printer.Printable printable = null;
        final String name = "вокруг света";
        Printer.Printable journal = new Journal(name);
        journal.print();
        journal.info();

        //1 вариант
        ((Printer.Printable) () -> System.out.println("Journal называется ")).print();
//        journal1.print();

        Printer.Printable.print2();

        Printer.Printable printable1 = () -> {
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
        };//
        printable1.print();


        {
            Printer.Printable printable = new Printer.Printable() {//сгенерировать лямда и показать
                @Override
                public void print() {
                    System.out.println("print " + name);
                }
            };
            printable.print();
        }

        //2 вариант
//        Printer.Printable journal = new Journal(name);
//        journal.print();
//
//        //3 вариант
//        {
//            Printer.Printable printable = () -> System.out.println("sdfsd " + name);
//            printable.print();
//        }
    }
}

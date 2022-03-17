import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HomeWork {
    //    * 1) Список каталога
//     * Написать метод который циклически просматривает содержимое заданного каталога и выводит на
//    печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
//            * Используем рекурсию.
    public static void main(String[] args) {
        readFiles(null);
    }

    public static void readFiles(File[] directory) {
//        if (directory.isDirectory()) {
//            File[] arrayFiles = directory.listFiles();


        List<String> collect = Arrays.stream(Optional.ofNullable(directory)
                .orElseGet(() -> new File[]{})).
                map(File::getName)
                .collect(Collectors.toList());


//            if (CollectionUtils.isNotEmpty(arrayFiles)) {
//                for (File file : arrayFiles) {
//                    if (file.isFile()) {
//                        System.out.println(file.getName() + " файл");
//                    } else {
//                        System.out.println(file.getName() + " каталог");
//                        readFiles(file);
//                    }
//                }
//            }
//        } else {
//            System.out.println(directory.getName() + " файл");
//        }
    }
}

package com.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
@ToString
public class Computer {
    private String cpu;
    private int ram;
    private int disk;
    private int resourceCycles;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean burned;

    public Computer(String cpu, int ram, int disk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.resourceCycles = resourceCycles;
    }

    public void info() {
        System.out.println("процессор " + cpu + " оперативка " + ram + " жесткий диск " + disk + " ресурс полных циклов работы " + resourceCycles);
        System.out.printf("процессор %s оперативка %d жесткий диск %d ресурс полных циклов работы %d\n", cpu, ram, disk, resourceCycles);
    }

    public void on() {
        if (!isBurned()) {
            System.out.println("Включение...");
            if (checkAction() && checkResourceCycles()) {
                System.out.println("Компьютер включен");
//                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
        burned = true;
    }

    private boolean checkAction() {
        int value = -1;
        do {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Некорректные данные");
            }
        } while (!(value == 0 || value == 1));
        return random.nextInt(2) == value;
    }

    private boolean checkAction2() {
        while (true) {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value == 0 || value == 1) {
                    return random.nextInt(2) == value;
                } else {
                    System.out.println("Некорректные данные");
//                    scanner.next();   //надо или нет?
                }
            } else {
                System.out.println("Некорректные данные");
                scanner.next();
            }
        }
    }

    public void off() {
        if (!isBurned() && checkResourceCycles()) {
            System.out.println("Выключение...");
            System.out.println("Компьютер выключен");
            resourceCycles--;
            System.out.println("Количество оставшихся циклов: " + resourceCycles);
//            on();
        } else {
            burned();
        }
    }

    private boolean checkResourceCycles() {
        return resourceCycles > 0;
    }
}

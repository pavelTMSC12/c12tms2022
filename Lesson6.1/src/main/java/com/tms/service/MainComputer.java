package com.tms.service;

import com.tms.model.Computer;
import lombok.SneakyThrows;

public class MainComputer {
    @SneakyThrows
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 8000, 1000, 10);

        for (int i = 0; i < 10; i++) {
            if (computer.isBurned()) {
                break;
            }
            computer.on();
            computer.off();
        }
        System.out.println(computer);

//        while (true) {
//            Computer computer1 = new Computer();
//            Thread.sleep(100);
//        }
    }
}

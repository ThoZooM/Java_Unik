package com.mycompany.testingpr;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author home
 */


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void scanDirectory(String path) {
        System.out.println("Scanning " + path);
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                Arrays.sort(files, (file1, file2) -> {
                    if (file1.isDirectory() && !file2.isDirectory()) {
                        return -1;
                    } else if (!file1.isDirectory() && file2.isDirectory()) {
                        return 1;
                    } else {
                        return file1.getName().compareTo(file2.getName());
                    }
                });

                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getAbsolutePath());
                        scanDirectory(file.getAbsolutePath());
                    } else {
                        System.out.println(file.getAbsolutePath() + " " + file.length());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Вариант 5 Гуровский Игорь Дмитриевич РИБО-01-22");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к каталогу для сканирования: ");
        String userPath = scanner.nextLine();
        scanner.close();
        scanDirectory(userPath);
    }
}
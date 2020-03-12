package ru.gb.java1.lesson3;

    import java.util.Random;
    import java.util.Scanner;

public class Java1Lesson3 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static int fieldSizeX = 3;
    private static int fieldSizeY = 3;
    private static int toWin = 3;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField() {
//        fieldSizeY = 3;
//        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("------");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >=0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y (от 1 до 3) через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }
//    private static void aiTurn() {
//        if (!checkAITurn()) {
//            int x, y;
//            do {
//                x = RANDOM.nextInt(fieldSizeX) + 1;
//                y = RANDOM.nextInt(fieldSizeY) + 1;
//            } while (!isEmptyCell(x, y));
//            field[y - 1][x - 1] = DOT_AI;
//        }
//    }


    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
/*
1) use the cycles, Luke
2) Если сделал ДЗ 2-го урока 5* - это хорошо, если нет - посмотри его разбор на третьем уроке, это поможет.
3) Пролистай чуть наверх, я там тоже спрашивал совета, где-то в час ночи, написал свои мысли. Спойлер: то, как написано, на самом деле не сработает, надо доработать.
Допустим, есть у меня метод, положим он принимает char и отдает булевое.
Хочу я в начале объявить переменную, затем стартуют циклы.
Роятся эти циклы в массиве, роятся, значит, и если находят char, то переменная делает ++
В конце всей этой каши я говорю: если переменная достигла значения n то true.
 */
//    private static boolean checkWin(char c) {
//        int [][] arr = new int[fieldSizeY][fieldSizeX];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                field[i][i] = c;                  // диагональ 1
//                field[i][arr.length - 1 - i] = c; // горизонталь
//                field[arr.length - 1 - i][i] = c; // вертикаль
//                }
//            //} return true;
////        } for (int i = 0; i < arr.length; i++) {
////            arr[i][arr.length - 1 - i] = c;
////        } for (int i = 0; i < arr.length; i++) {
////            arr[arr.length - 1 - i][i] = c;
//        }
//
//
//
////        for (int y = 0, x = 0; y < fieldSizeY && x < fieldSizeX; x++) {
////            for (int x = 0; x < fieldSizeX; x++) {
////            }
//        //}
//        return true;
//    }

    public static boolean checkWin(char c) {
        return checkHor() || checkVert() || checkDiag();
    }

    public static boolean checkHor() {
        int [][] arr = new int[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            boolean bool = true;
            for (int j = 1; j < fieldSizeY && bool; j++)
                bool = arr[i][j] == arr[i][0];
            if (bool)
                return true;
        }
        return false;
    }

    public static boolean checkVert() {
        int [][] arr = new int[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeX; i++) {
            boolean bool = true;
            for (int j = 1; j < fieldSizeX && bool; j++)
                bool = arr[j][i] == arr[0][i];
            if (bool)
                return true;
        }
        return false;
    }

    public static boolean checkDiag() {
        int [][] arr = new int[fieldSizeY][fieldSizeX];
        boolean bool = true;
        for (int i = 1; i < fieldSizeX && bool; i++)
            bool = (arr[i][i] == arr[0][0]);
        if (bool)
            return true;
        bool = true;
        for (int i = 1; i < fieldSizeX && bool; i++)
            bool = arr[fieldSizeY - i - 1][i] == arr[fieldSizeY - 1][0];
        return bool;
    }

//    private static boolean checkWin(char c) {
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//        return false;
//    }

    public static void main(String[] args) {
        while (true) {
        playOneRound();
            System.out.println("Play again?");
            if (SCANNER.next().equals("no") /*|| SCANNER.next().equals("n")*/)
                break;
        }
    }

    private static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

}

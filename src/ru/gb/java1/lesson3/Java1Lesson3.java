package ru.gb.java1.lesson3;

    import java.util.Random;
    import java.util.Scanner;

public class Java1Lesson3 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static int fieldSizeX = 3;
    private static int fieldSizeY = 3;
    //private static int toWin = 3;
    private static char[][] field;
    private static int row;
    private static int col;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField() {
//        fieldSizeY = 3;
//        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (row = 0; row < fieldSizeY; row++) {
            for (col = 0; col < fieldSizeX; col++) {
                field[row][col] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("------");
        for (int row = 0; row < fieldSizeY; row++) {
            for (col = 0; col < fieldSizeX; col++) {
                System.out.print(field[row][col] + "|");
            }
            System.out.println();
        }
    }

    private static boolean isValidCell(int row, int col) {
        return row >= 0 && row < fieldSizeY && col >=0 && col < fieldSizeX;
    }

    private static boolean isEmptyCell(int row, int col) {
        return field[row][col] == DOT_EMPTY;
    }

    private static void humanTurn() {
        do {
            System.out.println("Введите координаты хода X и Y (от 1 до 3) через пробел >>> ");
            row = SCANNER.nextInt() - 1;
            col = SCANNER.nextInt() - 1;
        } while (!isValidCell(col, row) || !isEmptyCell(col, row));
        field[row][col] = DOT_HUMAN;
    }

//    private static void aiTurn() {
//        int x;
//        int y;
//        do {
//            x = RANDOM.nextInt(fieldSizeX);
//            y = RANDOM.nextInt(fieldSizeY);
//        } while (!isEmptyCell(x, y));
//        field[y][x] = DOT_AI;
//    }

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
        for (int row = 0; row < fieldSizeY; row++) {
            for (int col = 0; col < fieldSizeX; col++) {
                if (field[row][col] == DOT_EMPTY) return false;
            }
        }
        return true;
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


//    private static boolean checkWin(char c) {
//        int [][] arr = new int[fieldSizeY][fieldSizeX];
//        for (int i = 0; i < arr.length; i++) {
//            field[i][i] = c;                  // диагональ 1
//            field[i][arr.length - 1 - i] = c; // диагональ 2горизонталь
//            for (int j = 0; j < arr.length; j++) {
//                field[j][arr.length - 1 - i] = c; // вертикаль
//                field[arr.length - 1 - i][j] = c; // горизонталь
//                }
//            } return true;
//        } for (int i = 0; i < arr.length; i++) {
//            arr[i][arr.length - 1 - i] = c;
//        } for (int i = 0; i < arr.length; i++) {
//            arr[arr.length - 1 - i][i] = c;
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
//
//    public static boolean checkWin(char c) {
//        return checkHor() || checkVert() || checkDiag();
//    }
//
//    public static boolean checkHor() {
//        int [][] arr = new int[fieldSizeY][fieldSizeX];
//        for (int i = 0; i > 0 && i < 2; i++) {
//            boolean bool = true;
//            for (int j = 1; i > 0 && i < 2 && bool; j++)
//                bool = arr[i][j] == arr[i][0];
//            if (bool)
//                return true;
//        }
//        return false;
//    }
//
    private static boolean checkWin(char dotHuman) {
        return checkVert(row, col, field) ||
                checkHoriz(row, col, field); //||
                //checkRightDiag(row, col, field) ||
                //checkLeftDiag(row, col, field);
    }
//    private static boolean checkWin() {
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[0].length; j++) {
//                return
//                        checkVert(i, j, field); //||
//                                //checkHoriz(i, j, field); //||
//                                //checkRightDiagonal(i, j, field) ||
//                                //checkLeftDiagonal(i, j, field);
//            }
//        } return false;
//    }

    public static boolean checkHoriz(int i,int j, char[][] field) {
        //int rows = field.length;
        int cols = field[0].length;
        for (int u = 0; u < cols; u++) {
            if (u != j && field[i][j] != field[i][u]) return false;
        }
        return true;
    }
    public static boolean checkVert(int i,int j, char[][] field) {
        int rows = field[0].length;
        for (int r = 0; r < rows; r++) {
            if (r != i) {
                if (field[i][j] != field[r][j]) {
                    return false;
                }
            }
        }
        return true;
    }
//    public static boolean checkVert(int i,int j, char[][] field) {
//        int rows = field.length;
//        int cols = field[0].length;
//        for (int r = 0; r < rows; r++) {
//            if(r != i && field[i][j] != field[r][j]) return false;
//        }
//        return true;
//    }
//    public static boolean checkVert() {
//        int [][] arr = new int[fieldSizeY][fieldSizeX];
//        for (int i = 0; i < fieldSizeX; i++) {
//            boolean bool = true;
//            for (int j = 1; j < fieldSizeX && bool; j++)
//                bool = arr[j][i] == arr[0][i];
//            if (bool)
//                return true;
//        }
//        return false;
//    }
//
//    public static boolean checkDiag() {
//        int [][] arr = new int[fieldSizeY][fieldSizeX];
//        boolean bool = true;
//        for (int i = 1; i < fieldSizeX && bool; i++)
//            bool = (arr[i][i] == arr[0][0]);
//        if (bool)
//            return true;
//        bool = true;
//        for (int i = 1; i < fieldSizeX && bool; i++)
//            bool = arr[fieldSizeY - i - 1][i] == arr[fieldSizeY - 1][0];
//        return bool;
//    }
//    public static boolean checkLeftDiag(int i,int j, char[][] field){
//        //if( i==1 && j==1 || i==0 && j==0 || i==0 && j=fieldSizeY-1 || i==fieldSizeX-1 && j==0 || i==fieldSizeX-1 && j=fieldSizeY-1 ) return false;
//        int rows = field.length;
//        for(int u =0; u < fieldSizeY; u ++) {
//            if(field[i][j] != field[u][u]) return false;
//        }
//        return true;
//    }
//    public static boolean checkRightDiag(int i,int j, char[][] field) {
//        //if( i==1 && j==1 || i==0 && j==0 || i==0 && j=fieldSizeY-1 || i==fieldSizeX-1 && j==0 || i==fieldSizeX-1 && j=fieldSizeY-1 ) return false;
//        int rows = field.length;
//        for (int r = 0; r < fieldSizeY; r++) {
//            for (int c = fieldSizeX - 1; c > 0; c--) {
//                if (field[i][j] != field[r][c]) return false;
//            }
//        } return true;
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
//            aiTurn();
//            printField();
//            if (checkWin()) {
//                System.out.println("Выиграл компьютер!");
//                break;
//            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }
}

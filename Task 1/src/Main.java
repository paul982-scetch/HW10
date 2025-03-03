import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priceBook = inputPriceBook();
            addBook(name);
            addBook(name, pageCount);
            addPriceBook(name, pageCount, priceBook);//todo использовать новый метод тут
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPriceBook() {
        System.out.println("Введите цену книги в рублях:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") +
                " стр."  + " \n";
    }
    public static void addPriceBook(String bookName, int pageCount, int priceBook){
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") +
                " стр."  + " " + (priceBook <= 0 ? " Не установлено " : priceBook)
                + "руб" + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }



}

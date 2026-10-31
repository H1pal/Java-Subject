package test02.problem05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager notebookManager = NotebookManager.getInstance();

        int rents = sc.nextInt(); sc.nextLine();
        int returns = sc.nextInt(); sc.nextLine();

        notebookManager.rentNotebook(rents);
        notebookManager.returnNotebook(returns);
        notebookManager.showInfo();
    }
}

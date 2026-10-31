package test02.problem05;

public class NotebookManager {
    private static NotebookManager instance = new NotebookManager();

    private Notebook notebook = new Notebook();

    private NotebookManager() {}

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int rents) {
        notebook.rentNotebook(rents);
    }

    public void returnNotebook(int returns) {
        notebook.returnNotebook(returns);
    }

    public void showInfo() {
        System.out.println("==노트북 대여 현환==");
        notebook.showInfo();
    }
}

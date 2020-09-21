
import java.util.Scanner;

class DataInOutCons implements DataInputOutput {
    private Scanner scanner = new Scanner(System.in);

    private String dataInput(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }


    public String input() {
        return dataInput("Введите выражение: ");
    }


    public void output(String out) {
        System.out.println("Результат вычесления: " + out);
    }
}


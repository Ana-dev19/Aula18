import java.util.ArrayList;
import java.util.List;

public class ExercicioDois {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Açucar");
        list.add("Amendoim");
        list.add("Feijão");
        list.add("Arroz");

        System.out.println("Lista antes do elemento inserido; " + list);

        // Inserir um elemento na posição 4
        list.add(4, "Farinha");

        System.out.println("Lista após inserir elemento: " + list);
    }
}

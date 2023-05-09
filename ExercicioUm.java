import java.util.ArrayList;

public class ExercicioUm {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Café");
            list.add("Pão");
            list.add("Leite");
            list.add("Açucar");

            System.out.println("Lista antes da remoção: " + list);

            // Removendo o segundo elemento da lista
            list.remove(1);

            System.out.println("Lista após a remoção: " + list);
        }
    }

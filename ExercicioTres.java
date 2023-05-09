import java.util.ArrayList;
import java.util.List;

public class ExercicioTres {

        public static void main(String[] args) {
            int tamanho = 5;
            List<Integer> lista = new ArrayList<>(tamanho);
            for (int i = 0; i < tamanho; i++) {
                lista.add(i);
            }
            System.out.println(lista);
        }
    }

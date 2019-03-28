package ListaUnica;
import java.util.Arrays;
import java.util.HashSet;
/**
 * @author {Renata Vieira}
 *
 * Mar 17th, 2019
 */
public class ListaUnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> duplicatas = Arrays.asList("abc", "def", "ghi", "def", "def", "ghi");
        java.util.HashSet<String> unicas = new HashSet<String>();
        System.out.println("Encontrando objetos duplicados em java usando Set");
        for (String s : duplicatas) {
            if (!unicas.add(s)) {   
            	System.out.println(s);
            }
        }
	}

}

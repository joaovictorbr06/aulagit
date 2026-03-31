import java.util.ArrayList;
import java.util.Arrays;

public class TesteEmpregado {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("João Victor", 18, 1, 5000, 0, 0, "Masculino");
        Empregado empregado2 = new Empregado("Ana", 18, 1, 2500, 0,0, "Feminino");
        Empregado empregado3 = new Empregado("Victoria", 18, 3, 5000, 0, 10, "Feminino");


        ArrayList<Empregado> empregados = new ArrayList<>(Arrays.asList(empregado1, empregado2, empregado3));
        ArrayList<Empregado> empregados2 = empregados;
      
        
    
        for(Empregado empregado : empregados2){

    System.out.println("Nome:" + empregado.getNome());
        System.out.println("Salario" + empregado.calcularSalario());
        System.out.println();

        }
        
        System.out.println(empregado1.getNome());
        System.out.println(empregado2.getNome());
        System.out.println(empregado3.getNome());

        



        

        
        


    }
}

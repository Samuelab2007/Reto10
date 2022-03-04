import java.util.ArrayList;
import java.util.List;

public class Reto10 {

    public static int sumaDeDigitos(int n,int sumaUnidades){
        if(n/10 == 0){
            sumaUnidades += n;
        }else{
            sumaUnidades = n%10 + sumaDeDigitos(n/10,sumaUnidades);
        }
        return sumaUnidades;
    }
    //Para un valor acertado es necesario llamarlo con el segundo parametro valiendo 0.

    public static List<Double> raicesCuadradas(List<Double> numeros){
        return numeros.stream().map(a->Math.sqrt(a)).toList();
    }


    public static void main(String[] args){

        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.2);
        numeros.add(5.0);
        numeros.add(4.0);
        numeros.add(45.32);
        numeros.add(100.0);
        System.out.println(sumaDeDigitos(5876,0));

        System.out.println(raicesCuadradas(numeros));




    }
}

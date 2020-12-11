import java.util.Arrays;

public class EJ02 {
    public static void main(String[] args) {
        int[] v ={1,4,6,8};

        System.out.println(Arrays.toString(insertarValor(v,3,5)));



    }public static int [] insertarValor(int [] v ,int pos,int valor){
        int [] resultado;
        resultado.length=v.length+1;

        for (int i = 0; i < v.length; i++) {
            if (i<pos){
                resultado[i]=v[i];
            }if (i==pos){
                resultado[i]=valor;

            }if (i>pos){
                resultado[i]=v[i]+1;
            }

        }return resultado;


    }

}
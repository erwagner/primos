
package primos;
public class Primos {

    public static No inicio = null;
    public static void main(String[] args) {
        int N = 10;
        
        for (int i = 0; i <= N; i++)
            inserir(i); 
        
        exibir(inicio);
        
        
    }
    
    static void inserir(int x){
        if(inicio == null)
            inicio = new No(x);
        else{
            No temp = inicio;
            while(temp.prox!= null)
                temp = temp.prox;
            temp.prox = new No(x);
        }
    }
    
    static void exibir(No temp){
        if(temp!=null){
            System.out.println(temp.valor);
            exibir(temp.prox);
        }
    }
    
}


package primos;
public class Primos {

    public static No inicio = null;
    public static void main(String[] args) {
        int N = 60;
        
        for (int i = 0; i <= N; i++)
            inserir(i); 
        
        primos();
        exibir(inicio);
        
        
    }
    
    
    static void primos(){
        if(inicio.valor == 0)
            inicio = inicio.prox;
        if(inicio.valor == 1)
            inicio = inicio.prox;
        
        No temp1 = inicio;
        while(temp1 != null){
            int multiplo = temp1.valor;
            No temp2 = temp1;
            while(temp2.prox!=null){
                if((temp2.prox.valor%multiplo)==0)
                    temp2.prox = temp2.prox.prox;
                else
                    temp2 = temp2.prox;
            }

            temp1 = temp1.prox;
        }
        
        
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

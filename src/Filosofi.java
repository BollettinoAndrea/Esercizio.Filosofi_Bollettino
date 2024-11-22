public class Filosofi {
    public static void main(String[] args) {
        int i;
        Tavola M=new Tavola();
        filosofo []F=new filosofo[5];
        for(i=0;i<5;i++){
            F[i]=new filosofo(M, i);
        }
        for(i=0;i<5;i++){
            F[i].start();
        }
    }
}
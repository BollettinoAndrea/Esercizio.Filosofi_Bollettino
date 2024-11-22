public class filosofo extends Thread
{ Tavola m;
    int i;
    int pasti;
    public filosofo(Tavola M, int id){this.m =M;this.i=id;this.pasti=0;}
    public void run()
    { try{
        while(true)
        { System.out.print("Filosofo "+ i+" pensa....\n");
            m.prendiForchette(i);
            System.out.print("Filosofo "+ i+" mangia....\n");
            sleep(1800);
            pasti++;
            System.out.print("Filosofo "+ i+" ha mangiato: " + pasti + "volte.\n");
            m.rilasciaForchette(i);
            sleep(2000);
        }
    }catch(InterruptedException e){}
    }
}

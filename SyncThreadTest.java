
public class SyncThreadTest {
    
    public static void main(String arge[]){

         final Bank bank = new Bank();
        
         Thread  addThread = new Thread(new Runnable() {
            
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    bank.addMoney(100);
                    bank.lookMoney();
                    System.out.println("\n");  
                }
            }
        });
         
         
         
         Thread subThread = new Thread(new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    bank.subMoney(100);  
                    bank.lookMoney();  
                    System.out.println("\n");  
                }
            }
        });
         
         addThread.start();
         subThread.start();
        
    }

}


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author wuwei
 *
 */
public class Bank {

    private  int count= 0;
    Lock lock  = new ReentrantLock();
    
    
    public  void addMoney(int money){
    lock.lock();
    try{ 
     count  = count+money;
     System.out.println(System.currentTimeMillis()+"存进："+money);
    }finally{
        lock.unlock();
    }   
    }
    
    public void subMoney(int money){
        lock.lock();
        try{
        if(count-money <0){
            System.out.println("账户余额不足");
            return;
        }
        count = count - money;
        }finally{
            lock.unlock();
        }
        System.out.println(System.currentTimeMillis()+"取出："+money);
    }
    
    
    public void lookMoney(){
        System.out.println("账户余额:"+count);
    }
    
}

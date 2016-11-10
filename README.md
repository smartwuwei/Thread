# Thread
Java thre
多个线程读写同一个资源时，要考虑到线程同步，主要介绍线程同步的几种方法：
1.synchronized
  同步的关键字修饰方法，由于java的每个对象都有一个内置锁，当用关键字修饰方法或者代码区块时，内置锁会保护这个方法和代码区，在调用该方法时，首先要获取到对象锁，否则线程就处于阻塞状态。
 代码示例：
  public synchronized void addMoney(int money){
    count+=money;
  };
  
  public void addMoney(int money){
    synchronized(this){
        count+=money;
    }
  }
2. 使用特属域变量（Volatile）实现线程同步
   每次都是从内存里面获取记录，而不是从缓存（寄存器）中取值，它不能用来修饰final类型的变量
   代码示例：private volatile int count;
   

3. Lock(重入锁)
   jdk1.5中新增了一个java.util.concurrent包来支持同步。
   //创建锁 
   Lock lock = new ReentrantLock();
   //获得锁
   lock.lock();
   //释放锁
   lock.unlock();
  


4.使用局部变量实现线程同步
  ThreadLocal
这种方法实际开发中遇到的很少，也不想再花时间深入去了解 

最后:附图一张，线程的活动图

http://upload-images.jianshu.io/upload_images/1689841-383f7101e6588094.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240




   
   



  
  
  
  
  
  
  










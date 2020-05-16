package cww516;
public class thread {
    public static void main(String[] args) throws InterruptedException {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000000);      //线程休眠
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        } ,"迪迦奥特曼").start();         //启动
////        Thread.sleep(10000000);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000000);      //线程休眠
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        } ,"迪迦奥特曼").start();
//        Thread.sleep(10000000);
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(10000000);   //在哪个线程中，就让那个线程休眠
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"戴拿奥特曼");
//        thread.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(10000000);   //在哪个线程中，就让那个线程休眠
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("戴拿奥特曼");
            }
        },"戴拿奥特曼").start();         //
//        thread.run();
        System.out.println("main");
  }
}

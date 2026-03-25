public class _11_Thread {
    public static void main(String[] args) throws InterruptedException {
        /*
        
        Thread : 여러 작업을 동시에 할 때 
        class className extends Thread {
            publie void run() {
            }
        }

        */

        class MyThread extends Thread {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread " + i);
                }
            }
            
        }

        MyThread myThread = new MyThread();
        myThread.start();
        
        /*

        Runnalbe : 여러 작업을 동시에 할 때 (인터페이스)
        class className implements Runnable {
            publie void run() {
            }
        }

        자바에서 클래스와 인터페이스의 차이로 인해 러너블을 사용할 때가 있다. 
        자바에서 클래스를 다중 상속할 수 없기 때문에 쓰레드 클래스를 상속하는 경우 다른 클래스를 상속할 수 없다. 
        러너블을 이용하면 다른 클래스를 사용할 수 있다.
        */

        class MyRunnable implements Runnable {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable " + i);
                }
            }
        }

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        /*
        Join : 쓰레드가 종료될 때 까지 기다림
        대신 메인 메소드에 예외 처리 필요 
        throws InterruptedException
        
        thread.join()
        */

        /* 
        다중쓰레드
        thread1.start()
        thread2.start()
        */
        
        /* 동기화 : 여러 쓰레드가 특정 메소드, 변수에 접근하지 못하도록 
        synchronized 메소드명() {
        }
        synchronized 변수 
         */

    }
    
}

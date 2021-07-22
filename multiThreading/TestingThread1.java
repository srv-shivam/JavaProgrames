package multiThreading;

class A extends Thread {
	
	public void run() {
		
		System.out.println("Inside Thread A....");
		for(int i=1; i<=5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("Thread B Ended");
	}
}

class B extends Thread {
	
	public void run() {
		
		System.out.println("Inside Thread B....");
		for(int j=1; j<=5; j++) {
			System.out.println("j = " + j);
		}
		System.out.println("Thread B Ended");
	}
}

class C extends Thread {
	
	public void run() {
		
		System.out.println("Inside Thread C....");
		for(int k=1; k<=5; k++) {
			System.out.println("k = " + k);
		}
		System.out.println("Thread B Ended");
	}
}

public class TestingThread1 {

	public static void main(String[] args) {
		
		A aa = new A();
		B bb = new B();
		C cc = new C();
		
		aa.setPriority(bb.getPriority()-2);
		cc.setPriority(Thread.MAX_PRIORITY);
		bb.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Thread A started.....");
		aa.start();
		
		System.out.println("Thread B started.....");
		bb.start();
		
		cc.start();
		System.out.println("Thread C started.....");
	}

}

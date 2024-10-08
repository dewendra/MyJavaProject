package multithreading;

public class SingleThread implements Runnable {
	public static void main(String[] args) {
		System.out.println("My Single thread program");
		SingleThread thread = new SingleThread();
		Thread thread1 = new Thread(thread);
		thread1.start();
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		System.out.println("This is my first thread");
		System.out.println("Table of 2:");
		for (int i = 1; i <= 10; i++) {
			int j = i * 2;
			System.out.println(j);

		}

	}

}

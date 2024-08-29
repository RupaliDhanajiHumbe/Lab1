package A;

public class Concur2 implements Runnable {

	static Thread t;

	public void run() {

	try{

	for(int i=0;i<3-1;i=i+2, i--) {

	System.out.println("Hello");

	t.sleep(1500);

	}

	}catch(InterruptedException ie) {

	ie.printStackTrace();

	}

	}

	public static void main(String ar[]) {

		Concur2 jd=new Concur2();

	t = new Thread(jd);

	t.start();

	}

	}



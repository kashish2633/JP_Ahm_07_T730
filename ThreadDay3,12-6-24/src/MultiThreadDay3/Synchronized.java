package MultiThreadDay3;

//Synchronization process

public class Synchronized {

	public static void main(String[] args) throws InterruptedException
	{
		Account acc = new Account(101, "Amit", 50000);
		System.out.println(acc);

		// Five account threads running parallel and sharing same resource
				AccountThread thread[] = new AccountThread[5];
				for (int i = 0; i < 5; i++) {
					thread[i] = new AccountThread(acc, 1000 * (i + 1));
					try {
						thread[i].join(); // waits main thread till execution of all child thread finish
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("--------------------------------------------------------");
				System.out.println(acc);

			}

		}

//extends the thread class
/*class Counter
{
private int count;      //5

public synchronized void increment()   //synchronized can be remove for asynchronized value
{
	count  = count + 1;      //6-t1 // 6-t2
}

public int getCount()
{
	return count;
}
}*/
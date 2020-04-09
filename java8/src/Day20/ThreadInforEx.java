package Day20;

import java.util.Map;
import java.util.Set;

		//Thread 그룹 -1

public class ThreadInforEx {

	public static void main(String[] args) {
			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setName("AutoSaveThread");
			autoSaveThread.setDaemon(true); //setDaemon은 start()전에 해야됨. 그래야 실행됨.
			autoSaveThread.start();
			
			Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
			Set<Thread> threads = map.keySet();
			for(Thread thread : threads) {
				System.out.println("Name: " + thread.getName() + ((thread.isDaemon())? "(데몬)" : "(주)"));
				System.out.println("\t" + "소속그룹" + thread.getThreadGroup().getName());
				System.out.println();
			}
	}
		
}


//출력구문
/*Name: Signal Dispatcher(데몬)
	소속그룹system

Name: AutoSaveThread(데몬)
	소속그룹main

Name: main(주)
	소속그룹main

Name: Attach Listener(데몬)
	소속그룹system

Name: Finalizer(데몬)
	소속그룹system

Name: Reference Handler(데몬)
	소속그룹system
*/

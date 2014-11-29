import com.jeroIsland.model.BasicMicrophone;
import com.jeroIsland.model.old.Recorder;


public class ThreadTest {
	public static void main(String[] args) {
		Recorder recorder = new Recorder();
		recorder.addSource(new BasicMicrophone());
		recorder.rec();
		try {
			Thread.sleep((int)(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();	
		}
		recorder.stop();
		recorder.play();
	}
	
}

package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * 
 * @author lleonardx
 */
public class SingletonEager {
	private static class InstanceHolder{
		public static SingletonEager instancia = new SingletonEager();
	}	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstacia() {
		return InstanceHolder.instancia;
	}
}

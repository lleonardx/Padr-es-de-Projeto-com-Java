package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apressado"
 * 
 * @author lleonardx
 */
public class SingletonHolder {
	private static SingletonHolder instancia = new SingletonHolder();
	
	private SingletonHolder() {
		super();
	}
	public static SingletonHolder getInstacia() {
		return instancia;
	}
}

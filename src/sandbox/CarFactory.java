package sandbox;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;

public interface CarFactory {
	Car newCar();

	default void exhibit() {

	}

	public <T extends InputStream> void read(final T stream);

	public <T, J extends T> void action(final T initial, final J next);

	public <T extends Serializable & Runnable> void performAction(final T instance);

	public void interate(final Collection<? super Car> objects);
}

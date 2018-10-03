package sandbox;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;

public class FordDealer implements CarFactory {

	@Override
	public Car newCar() {
		return new FordCar();
	}

	@Override
	public <T extends InputStream> void read(T stream) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T, J extends T> void action(T initial, J next) {

	}

	@Override
	public void interate(Collection<? super Car> objects) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends Serializable & Runnable> void performAction(T instance) {
		// TODO Auto-generated method stub
		
	}

}

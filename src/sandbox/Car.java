package sandbox;

public class Car implements Cloneable {
	Long id;
	String name;
	String description;
	String condition;

	public Car() {
	}

	public Car(Long id, String name, String description, String condition) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
	}

	@CarAnnotation("Id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", description=" + description + ", condition=" + condition + "]";
	}

	@Override
	public Car clone() throws CloneNotSupportedException {
		final Car car = (Car) super.clone();
		car.id = this.id;
		car.name = this.name;
		car.description = this.description;
		car.condition = this.condition;
		return car;
	}
}

package prueba.prueba1;

public class Persona {

	/**
	 * @param name
	 * @param age
	 * @param mail
	 */
	public Persona(String name, String age, String mail) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
	}

	public Persona() {

	}

	String name;
	String age;
	String mail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
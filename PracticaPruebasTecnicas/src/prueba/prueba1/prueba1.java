package prueba.prueba1;

public class prueba1 {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setName("Camilo");
		persona.setAge("24");
		persona.setMail("Camilo@gmail.com");

		System.out.println(" | " + persona.getName() + " | " + persona.getAge() + " | " + persona.getMail() + " | ");

	}
}
package Animal;
public class Puppy {
	private  String HW7;
	public String getName() {
		return HW7;
	}
	public Puppy(String a) {
		this.HW7 = a;
	}

public static void main(String[] args){
	Puppy ABC = new Puppy("Linda");
	System.out.println(ABC.getName());
	}
}
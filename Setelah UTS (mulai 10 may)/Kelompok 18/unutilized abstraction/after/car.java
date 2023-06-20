
abstract class car{
	public void type(){
		System.out.println("stock");
	}
	abstract void parkingSensor();
	abstract void turbo();
	abstract void headLamps();
}

class sedan extends car {
	public void parkingSensor() {
		System.out.println("installed");
	}
	public void turbo() {
		System.out.println("not installed");
	}
	public void headLamps() {
		System.out.println("installed");
	}
	public void tes() {
		System.out.println("tes");
	}
}
package testJDK8.testEnum;

public enum Gender {
	Man("Mann"),Women("Womenn");
	private final String value;
	Gender(String value){
		this.value = value;
	}
	public String getValue(){
		return value;
	}
	@Override
	public String toString(){
		return this.value;
	}
}

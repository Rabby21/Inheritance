
public class Parent {
	public String name,skin_color,height;
	
	public void details()
	{
		name="Rabby";
		skin_color="white";
		height="6";
		System.out.println("the details:"+"\n"+"Name:"+ name+"\n"+"skin color: "+skin_color+"\n"+"height:"+height);
	}

	public Parent(String name, String skin_color, String height) {
		super();
		this.name = name;
		this.skin_color = skin_color;
		this.height = height;
	}
	

}

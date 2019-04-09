
public class Son extends Parent{
	public String language="English";
	@Override
	public void details()
	{
		//System.out.println(language);
		System.out.println("the details:"+"\n"+"Name:"+ name+"\n"+"skin color: "+skin_color+"\n"+"height:"+height);
		System.out.println("language:"+language);
	}
	public Son(String name, String skin_color, String height) {
		super(name, skin_color, height);
	}
	
}
	

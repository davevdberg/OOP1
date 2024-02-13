public class Telivision {
	private String brand;
	private String model;
	private int volume;
	private int channel;
	private String childLockCode;
	
	public Telivision(String brand, String model){
		this.brand = brand;
		this.model = model;
		setChannel(20);
		setVolume(50);
		this.childLockCode = null;
	}
	
	public String getBrand(){
		return this.brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public int getVolume(){
		return this.volume;
	}
	
	public void setVolume(int volume){
		if(volume > 100){
			volume = 100;
		} else if(volume < 0) {
			volume = 0;
		}
		this.volume = volume;
	}
	
	public void increaseVolume(){
		setVolume(this.volume + 1);
	}
	
	public void decreaseVolume(){
		setVolume(this.volume - 1);
	}
	
	public int getChannel(){
		return this.channel;
	}
	
	public void setChannel(int channel){
		if(channel > 75){
			channel = 75;
		} else if(channel < 1) {
			channel = 1;
		}
		this.channel = channel;
	}
	
	public void increaseChannel(){
		setChannel(this.channel + 1);
	}
	
	public void decreaseChannel(){
		setChannel(this.channel - 1);
	}
	
	public String getChildLockCode(){
		return this.childLockCode;
	}
	
	public void setChildLockCode(String childLockCode){
		if(childLockCode.length() == 4){
			this.childLockCode = childLockCode;	
		}
	}
	
	public void removeChildLockCode(String childLockCode){
		if(this.childLockCode == childLockCode){
			childLockCode = null;
		}
	}
	
	
}
//television class
public class Television 
{
	private String state;//instance member
	private int channel;
	private int volume;
	
	
	
	public Television(String state, int channel, int volume) //constructor
	{
		super();
		this.state = state;
		this.channel = channel;
		this.volume = volume;
	}

	public int getChannel() //getter
	{
		return channel;
	}

	public void setChannel(int channel) //getter
	{
		this.channel = channel;
	}

	public int getVolume() //getter
	{
		return volume;
	}
	
	public void IncVolume()//function to increase volume
	{
		this.volume+=1;
	}
	
	public void DecVolume()//function to decrease volume
	{
		this.volume-=1;
	}

	public String getState()//getter
	{
		return state;
	}

	public void setState(String state)//setter
	{
		this.state=state;
	}
	
}

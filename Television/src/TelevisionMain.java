import java.util.Scanner;
//televison main function to take inputs
public class TelevisionMain {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Television Remote=new Television("OFF", 1, 10);//create object ith initial condition
		int volume,channel;//local variables
		
		System.out.println("Switch ON/OFF");
		String state=scanner.nextLine();//input state
		Remote.setState(state);
		if(state.equals("ON"))//check for ON condition
		{
			System.out.println("Enter Channel Number:");
			channel=scanner.nextInt();//input channel number
			Remote.setChannel(channel);
			
			System.out.println("Press 1 or 0 to increase or Decrease Volume:");
			volume=scanner.nextInt();//input the volume function
			if(volume==1)
			{
				Remote.IncVolume();
			}
			else if(volume==0)
			{
				Remote.DecVolume();
			}
			
			
			System.out.println("The Television information:");//display television details
			System.out.println("State:"+Remote.getState());
			System.out.println("Channel:"+Remote.getChannel());
			System.out.println("Volume:"+Remote.getVolume());
					
		}
		Remote.setState("OFF");
		

	}

}

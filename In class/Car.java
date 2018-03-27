public class Car
{   
	int sp;
  	public Car(int speed)
  	{
        sp=speed;
  	}
        public int gettime(int distance)

        {
            int time=distance/sp;
            return time;
        }
          	

} 
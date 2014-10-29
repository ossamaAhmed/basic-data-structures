
public class StopWatch 
{
	private long startTime;
	private long stopTime;
	public void start()
	{
		startTime=System.nanoTime();
	}
	public void stop()
	{
		stopTime=System.nanoTime();
	}
	public long getTimeNano()
	{
		long timeNano=stopTime-startTime;
		return timeNano;
	}
	public long getTimeMicro()
	{
		long timeMicro=(stopTime-startTime)/1000;
		return timeMicro;
	}
	public long getTimeMilli()
	{
		long timeMilli=(stopTime-startTime)/1000000;
		return timeMilli;
	}
	public long getTimeSeconds()
	{
		long timeSeconds=(stopTime-startTime)/1000000000;
		return timeSeconds;
	}

}

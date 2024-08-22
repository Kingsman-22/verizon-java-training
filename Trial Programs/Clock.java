class Clock{
	public static void main(String args[]) throws Exception{
		for(int i = 0; i<24; i++){
			for(int j = 0; j<60; j++)
			{
				for(int k = 0; k<60; k++)
				{	
					String hours = i > 9? Integer.toString(i) : "0"+Integer.toString(i);
					String mins = j > 9? Integer.toString(j) : "0"+Integer.toString(j);
					String seconds = k > 9? Integer.toString(k) : "0"+Integer.toString(k);
					System.out.print(hours+":"+mins+":"+seconds+"\n");
					Thread.sleep(1000);
				}
			}	
		}
	
	}

}
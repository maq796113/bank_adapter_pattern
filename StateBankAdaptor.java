
public class StateBankAdaptor implements BankData {
	
	private StateBankData sbd = new StateBankData() ;
	
	

	@Override
	public void DataProcessing(int i) {
		
		String converted = Integer.toString(i);
	    sbd.StateDataProcessing(converted);
		
	}
	
	

}

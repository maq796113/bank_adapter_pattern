
public class Driver {

	public static void main(String[] args) {
		
		int data  = 60;
		
		BankData hbl = new HblBankData();
		hbl.DataProcessing(60);
		
		StateBankAdaptor sbd  = new StateBankAdaptor();
		
		sbd.DataProcessing(data);
		

	}

}


// Adaptor Patern

/*

client  --> base class<Interface>  

                Concret
              
      Adaptee               Service




*/
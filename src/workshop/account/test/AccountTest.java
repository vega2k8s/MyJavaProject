package workshop.account.test;

//ctrl + shift + o
import workshop.account.entity.Account;

public class AccountTest {
	public static void main(String[] args) {
		//Account ��ü
		Account account = new Account("A1100","221-22-3477",100000);
		System.out.println(account); //account.toString()
		System.out.println("����ȣ : " + account.getCustId());
		System.out.println("���¹�ȣ : " + account.getAcctId());
	}
	
}

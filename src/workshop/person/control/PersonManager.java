package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public static void main(String[] args) {
		/*
		 * persons �� PersonEntity[] Ÿ��
		 * persons[0] �� PersonEntity Ÿ��
		 */
		//PersonEntity Ÿ���� �迭�� ���� �� ����
		PersonEntity[] persons = new PersonEntity[2];
		//Person��ü����
		//PersonEntity person = new PersonEntity();
		
		//PersonEntity�迭 �ʱ�ȭ 
		persons[0] = new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932");
		persons[1] = new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932");
		
		//Enhanced for Loop
		for (PersonEntity person : persons) {
			System.out.println(person.getName() + " " + person.getGender() + " " + person.getPhone());
		}
		
	}
}

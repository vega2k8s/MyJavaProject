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
		persons[0] = new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932");
		
	}
}

package ch07.ex08;

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] friend = new Friend[5];
		
		friend[0] = new Friend("김일번","01011111111","email1.com");
		friend[1] = new Friend("박이번","01022222222","email2.com");
		friend[2] = new Friend("이삼번","01033333333","email3.com");
		friend[3] = new Friend("정사번","01044444444","email4.com");
		friend[4] = new Friend("최오번","01055555555","email5.com");
		
		System.out.println("  이름   "+ "   전화번호   "+"  메일주소  ");
		System.out.println("------------------------------------");
		String info = null;
		for(int i=0; i<friend.length; i++) {
			info = friend[i].getInfo();
			System.out.println(info);
		}
	}

}

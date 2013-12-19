package ChainofResponsibility;

public class ChainofResponsibility {

	/*
	 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
	 */
	public static void main(String[] args) {
		BorrowChain borrowChain = new BorrowChain();
		System.out.println("-------------------------------");
		borrowChain.borrow(5);
		System.out.println("-------------------------------");
		borrowChain.borrow(25);
		System.out.println("-------------------------------");
		borrowChain.borrow(500);
	}
}

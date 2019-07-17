
package sumpleFizzBuzz;

/**
 * @class 引数をチェックしFizzかBuzzかFizzBuzzに分ける
 * @author yamada
 *
 */
public class FizzBuzzClass {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}
		if (isNumber(args[0]) == false) {
			System.out.println("数字ではありません。");
			return;
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("引数：" + num);

		//他クラスからforメソッドのよびだし？
		ForMethod ch = new ForMethod();
		ch.chack();

	}


	private static boolean isNumber(String num) {
		try {
			Integer.parseInt(num);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}





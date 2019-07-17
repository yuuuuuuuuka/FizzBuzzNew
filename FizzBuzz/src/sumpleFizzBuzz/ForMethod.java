package sumpleFizzBuzz;
/**
 * @class 数字出力処理クラス
 * @method
 * @author yuuka
 */

public class ForMethod {

	private void getNum() {

	}

	public void setNum() {
		return;
	}
	int num;

// 数字を判断し出力する
	public int chack() {

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}



}

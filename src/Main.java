import java.net.URLDecoder;

public class Main {

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		measure();
		measure();
	}

	public static void measure() throws Throwable {
		String input = URLDecoder
				.decode("http://www.google.co.jp/?q=URLEncoder%E3%81%AF%E3%81%A9%E3%82%8C%E3%81%8F%E3%82%89%E3%81%84%E9%81%85%E3%81%84%E3%81%AE%E3%81%8B%E3%80%81commons-codec%E3%81%A8%E6%AF%94%E8%BC%83%E3%81%97%E3%81%A6%E3%81%BF%E3%81%BE%E3%81%99",
						"UTF-8");

		Stopwatch stopwatch = new Stopwatch();

		stopwatch.start();
		for (int i = 0; i < times; i++) {
			java.net.URLEncoder.encode(input, "UTF8");

		}
		stopwatch.stop();
		System.out.println(stopwatch.result());
	}

	static int times = 1000000;

}

class Stopwatch {
	long startTime;
	long endTime;

	void start() {
		startTime = System.currentTimeMillis();
	}

	void stop() {
		endTime = System.currentTimeMillis();
	}

	long result() {
		return endTime - startTime;
	}
}

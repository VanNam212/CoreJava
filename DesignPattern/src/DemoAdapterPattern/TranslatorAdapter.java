package DemoAdapterPattern;

public class TranslatorAdapter implements VietnameseTarget {
	private JapaneseAdapter adapter;

	public TranslatorAdapter(JapaneseAdapter adapter) {
		this.adapter = adapter;
	}

	@Override
	public void send(String words) {
		System.out.println("Reading Words ...");
		System.out.println(words);
		String vietnameseWords = this.translate(words);
		System.out.println("Sending Words ...");
		adapter.receive(vietnameseWords);
	}

	private String translate(String vietnameseWords) {
		System.out.println("Translated!");
		return "阮文南";
	}
}

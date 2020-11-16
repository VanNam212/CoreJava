package DemoAdapterPattern;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VietnameseTarget client = new TranslatorAdapter(new JapaneseAdapter());
		client.send("Nguyễn Văn Nam");
	}

}

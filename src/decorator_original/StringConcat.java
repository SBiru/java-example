package decorator_original;

public class StringConcat extends TextDecorator {

	public StringConcat(Text text) {
		super(text);
	}

	public String format(String s) {

		return text.format(s).concat(s);
	}
}

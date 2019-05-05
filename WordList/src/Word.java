// Add an invariant here.
public class Word implements Comparable<Word> {
	private String content;

	// No contracts required for the following methods.
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Word))
			return false;
		Word w = (Word) o;
		return content.equals(w.content);
	}

	public int compareTo(Word w) {
		return content.compareTo(w.content);
	}

	// Add contracts to all following methods.
	public Word(String c) {
		content = c;
	}

	public Word(Word w) {
		this(w.content);
	}

	@Override
	public String toString() {
		return content;
	}
}

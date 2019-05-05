import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Add an invariant here.
public class WordList {
	private ArrayList<Word> words;

	// No contracts required for the following methods.
	public WordList(WordList o) {
		words = new ArrayList<Word>(o.words);
	}

	public int size() {
		return words.size();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof WordList))
			return false;
		WordList other = (WordList) o;
		return words.equals(other.words);
	}

	// Add contracts to all following methods.
	public WordList(List<String> input) {
		words = new ArrayList<Word>();
		for (String s : input) {
			words.add(new Word(s));
		}
	}

	public Word get(int i) {
		return words.get(i);
	}

	public void set(int i, Word w) {
		words.set(i, w);
	}

	public void sort() {
		Collections.sort(words);
	}

	public int search(Word in) {
		return Collections.binarySearch(words, in);
	}
}

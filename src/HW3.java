class WordFreq {
    String word;
    int frequency;

    WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String toString() {
        return "(" + word + ", " + frequency + ")";
    }
}

public class HW3 {
    public static void main(String[] args) {
        WordFreq[] arr = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };
    }
}

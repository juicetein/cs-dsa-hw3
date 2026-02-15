class WordFreq {
    String word;
    int frequency;

    WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "(" + word + ", " + frequency + ")";
    }
}

public class HW3 {

    static void maxHeapify(WordFreq[] a, int heapSize, int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int largest = i;

            if (left < heapSize && a[left].frequency > a[largest].frequency) {
                largest = left;
            }
            if (right < heapSize && a[right].frequency > a[largest].frequency) {
                largest = right;
            }

            if (largest == i) break;

            WordFreq temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            i = largest;
        }
    }

    static void buildMaxHeap(WordFreq[] a) {
        int heapSize = a.length;
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            maxHeapify(a, heapSize, i);
        }
    }

    static void printArray(WordFreq[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
    }

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

        buildMaxHeap(arr);
        printArray(arr);
    }
}

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

    public static void main(String[] args) {
        WordFreq[] arr = {
            // ...
        };
    }
}


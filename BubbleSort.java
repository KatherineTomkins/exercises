public class BubbleSort {

    public static int[] bubbleSort(int[] bubbles) {
        boolean swap = true;
        int l = bubbles.length - 1;

        while (swap) {
            swap = false;
            for (int c = 0; c < l; c++) {
                if (bubbles[c] > bubbles[c + 1]) {
                    int t = bubbles[c];
                    bubbles[c] = bubbles[c + 1];
                    bubbles[c + 1] = t;
                    swap = true;
                }
            }
        }
        return bubbles;
    }

    public static void main(String[] args) {
        int[] bubbles = new int[] { 71, 9, 3000, 0, -5, 9999, 0 };
        int[] myBubbles = bubbleSort(bubbles);
        for (int myBubble : myBubbles) {
            System.out.print(myBubble + " ");
        }
    }

}

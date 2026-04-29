import java.util.*;
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Arrays.sort(deck); // step 1: sort

        boolean skip = false;
        int i = 0; // pointer for deck
        int j = 0; // pointer for result (circular)

        while (i < n) {

            if (result[j] == 0) { // empty position

                if (!skip) {
                    result[j] = deck[i];
                    i++;
                }

                skip = !skip; // alternate
            }

            j = (j + 1) % n; // circular move
        }

        return result;
    }
}
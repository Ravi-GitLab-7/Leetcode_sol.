class Solution {

    // Function to remove next opponent senator
    public boolean removeSenator(StringBuilder senate, char ch, int idx) {
        boolean removedFromLeft = false;

        while (true) {
            if (idx == 0) {
                removedFromLeft = true;
            }

            if (senate.charAt(idx) == ch) {
                senate.deleteCharAt(idx); // remove senator
                break;
            }

            idx = (idx + 1) % senate.length();
        }

        return removedFromLeft;
    }

    public String predictPartyVictory(String senateStr) {

        StringBuilder senate = new StringBuilder(senateStr);

        int R_count = 0;
        for (char c : senateStr.toCharArray()) {
            if (c == 'R') R_count++;
        }

        int D_count = senate.length() - R_count;

        int idx = 0;

        while (R_count > 0 && D_count > 0) {

            if (senate.charAt(idx) == 'R') {

                boolean left = removeSenator(senate, 'D', (idx + 1) % senate.length());
                D_count--;

                if (left) idx--;

            } else {

                boolean left = removeSenator(senate, 'R', (idx + 1) % senate.length());
                R_count--;

                if (left) idx--;
            }

            // move to next index safely
            idx = (idx + 1 + senate.length()) % senate.length();
        }

        return R_count > 0 ? "Radiant" : "Dire";
    }
}
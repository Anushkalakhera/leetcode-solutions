class Solution {
    String[] map={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };

    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return ans;
        }
        backtrack(digits, 0, new StringBuilder());
        return ans;
    }

    public void backtrack(String digits,int idx,StringBuilder current){
        if (idx==digits.length()) {
            ans.add(current.toString());
            return;
        }

        char digit =digits.charAt(idx);
        String letters = map[digit - '0'];

        // Try every letter
        for(int i=0;i<letters.length();i++) {

            char ch = letters.charAt(i);
            // Choose
            current.append(ch);
            // Explore
            backtrack(digits, idx + 1, current);
            // Undo
            current.deleteCharAt(current.length() - 1);
        }
    }
}
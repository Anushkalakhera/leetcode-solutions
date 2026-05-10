class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            
            int num = Integer.parseInt(parts[i]);
            res.append(Integer.toBinaryString(num));

            if (i != parts.length - 1) {
                res.append("-");
            }
        }

        return res.toString();
    }
}
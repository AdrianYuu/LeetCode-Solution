class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
		 
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(c);
            }
        }
        
        for(int i = 0; i < res.length() / 2; i++){
        	if(res.charAt(i) != res.charAt(res.length() - 1 - i)){
        		return false;
        	}
        }

        return true;
    }
}
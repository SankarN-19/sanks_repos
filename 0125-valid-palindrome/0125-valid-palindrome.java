class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String str=sb.toString();
        sb.reverse();
        if(str.equals(sb.toString())){
            return  true;
        }
        return false;
    }
}
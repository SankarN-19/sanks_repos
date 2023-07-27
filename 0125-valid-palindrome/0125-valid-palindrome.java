class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
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
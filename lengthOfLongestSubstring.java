class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int e=0;
        int n=s.length();
        int maxi=0;
        Set<Character> hs=new HashSet<>();
        while(e<n){
            if(!hs.contains(s.charAt(e))){
                hs.add(s.charAt(e++));
                maxi=Math.max(maxi,e-st);


            }
            else{
                hs.remove(s.charAt(st++));
            }

        }
        return maxi;
        
    }
}

class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(String s : sentences){
            String[] arr=s.split(" ");
            c=Math.max(c,arr.length);
        }
        return c;
    }
}
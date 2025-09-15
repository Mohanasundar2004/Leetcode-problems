class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int max=0,c=0;
        
        String[] st=text.split(" ");
        if(brokenLetters.length()==0){
            return st.length;
        }
        for(int i=0;i<st.length;i++){
            c=0;
            for(char j:brokenLetters.toCharArray()){
                if(st[i].indexOf(j)!=-1){
                    break;
                }
                else{
                    c++;
                    if(c==brokenLetters.length()){
                        max++;
                    }
                }
            }
        }
        return max;
    }
}
class Solution {
    public String sortVowels(String s) {
        List<Character>l=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
                    l.add(ch);
                }
        }
        Collections.sort(l);
        char []arr=s.toCharArray();
        int j=0;
        String st="";
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
                    arr[i]=l.get(j++);
            }
            st+=arr[i];
        }
        return st;
    }
}
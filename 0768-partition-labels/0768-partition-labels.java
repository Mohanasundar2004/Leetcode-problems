class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer>l=new ArrayList<>();
        int st=0,en=0;
        for(int i=0;i<s.length();i++){
            en=Math.max(en,map.get(s.charAt(i)));
            if(i==en){
                l.add(en-st+1);
                st=i+1;
            }
        }
        return l;
    }
}
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0,n=items.size();
        for(int i=0;i<n;i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                c++;
            }
            if(ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                c++;
            }
            if(ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                c++;
            }
        }
        return c;
    }
}
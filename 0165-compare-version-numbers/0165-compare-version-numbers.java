class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0,n=version1.length(),m=version2.length();
        while(i<n || j<m){
            long a=0,b=0;
            while(i<n && version1.charAt(i)!='.'){
                a=a*10+version1.charAt(i)-'0';
                i++;
            }
            while(j<m && version2.charAt(j)!='.'){
                b=b*10+version2.charAt(j)-'0';
                j++;
            }
            if(i<n && version1.charAt(i)=='.'){
                i++;
            }
            if(j<m && version2.charAt(j)=='.'){
                j++;
            }
            if(a<b){
                return -1;
            }
            if(a>b){
                return 1;
            }
        }
        return 0;
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }

        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,"",map,ans);
        return ans;
    }

    public void backtrack(String digits,int index,String current,String[] map,List<String>ans){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        int digit=digits.charAt(index)-'0';
        String letter=map[digit];

        for(int i=0;i<letter.length();i++){
            current=current+letter.charAt(i);

            backtrack(digits,index+1,current,map,ans);

            current=current.substring(0,current.length()-1);
        }
    }
}
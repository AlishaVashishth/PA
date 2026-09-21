// Leetcode 71

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] directories = path.split("/");
        for(String p:directories){
            if(p.equals("") || p.equals(".")){
                continue;
            }
            else if(p.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else{
                stack.push(p);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String s:stack){
            res.append("/");
            res.append(s);
        }
        if(res.length()==0) return "/";
        return res.toString();
    }
}

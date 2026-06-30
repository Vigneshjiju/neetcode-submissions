class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String parts[]=path.split("/");
        for(int i=0;i<parts.length;i++)
        {
            String part=parts[i];
            if(part.equals("")|| part.equals("."))
            {
                continue;
            }
            if(part.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(part);
            }   
        }
        if(stack.isEmpty())
            {
                return "/";
            }
        StringBuilder a=new StringBuilder();
        for(int i=0;i<stack.size();i++)
        {
            a.append("/").append(stack.get(i));
        }
        return a.toString();
    }
}
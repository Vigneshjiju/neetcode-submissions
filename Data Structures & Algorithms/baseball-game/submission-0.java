class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String op:operations)
        {
            if(op.equals("+"))
            {
            int top=stack.pop();
            int max=top+stack.peek();
            stack.push(top);
            stack.push(max);
            }
            else if(op.equals("C"))
            {
                stack.pop();
            }
            else if(op.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }
        }
            int sum=0;
            while(!stack.isEmpty())
            {
                sum=sum+stack.pop();
            }
        return sum;
    }
}
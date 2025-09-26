package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data)
    {
        arrayStack.add(data);
    }

    public String pop()
    {
        int len = arrayStack.size();
        if (len == 0)
        {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return (arrayStack.remove(len-1)); //remove는 지우고 그 값을 반환해주기 때문에 출력이 되네
    }
}

public class StackTest
{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

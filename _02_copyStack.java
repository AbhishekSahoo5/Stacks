import java.util.*;
public class _02_copyStack {

    public static Stack<Integer> copyStack(Stack<Integer> st)
    {
        Stack<Integer> demo=new Stack<>();
        Stack<Integer> copy=new Stack<>();

        while(st.size()>0){
            demo.push(st.pop());
        }
        while(demo.size()>0){
            copy.push(demo.pop());
        }
        return copy;
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        Stack<Integer> copy=copyStack(st);
        System.out.println(copy);



    }
    
}

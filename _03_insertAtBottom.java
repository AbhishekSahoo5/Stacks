import java.util.Stack;

public class _03_insertAtBottom {

    public static void insertAtBottom(Stack<Integer> st,int n,int pos)
    {
        Stack<Integer> demo=new Stack<>();
        while(st.size()>=pos){
            demo.push(st.pop());
        }
        demo.push(n);

        while(demo.size()>0)
        {
            st.push(demo.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        insertAtBottom(st,100,3);
        System.out.println(st);

    }
    
}

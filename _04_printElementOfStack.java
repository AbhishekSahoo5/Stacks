import java.util.Stack;

public class _04_printElementOfStack {

    // Printing element iteratively
    public static void printElement_iter(Stack<Integer> st)
    {
        int n=st.size();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[n-i-1]=st.pop();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }

    }

    // Printing  reverse element iteratively
    public static void printElement_rev_iter(Stack<Integer> st)
    {
        int n=st.size();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            st.push(arr[n-i-1]);
        }

    }


    // Printing reverse element recursively
    public static void printElement_rev_recur(Stack<Integer> st)
    {
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        printElement_rev_recur(st);
        st.push(top);
    }

    // Printing reverse element recursively
    public static void printElement_recur(Stack<Integer> st)
    {
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        printElement_recur(st);
        System.out.print(top+" ");
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        printElement_iter(st);
        System.out.println();
        printElement_rev_iter(st);
        System.out.println();
        printElement_rev_recur(st);
        System.out.println();
        printElement_recur(st);

    }
    
}

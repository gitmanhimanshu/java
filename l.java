import java.util.Scanner;

class l {
    node head = null, temp = null;

    public static void main(String[] args) {
        int c = 1;
        l h = new l();
        Scanner sc = new Scanner(System.in);
        while (c == 1) {
            System.out.println("enter the data");
            int data = sc.nextInt();
            h.insert(data);
            System.out.println("1=more");
            c = sc.nextInt();
        }
        h.show();
        h.rotate(h.head, 2);
        System.out.println();
        h.show();
        // if(h.ispalindrome(h.head)){
        //     System.out.println("it is palindrome");
        // }
        // else{
        //     System.out.println("it is not palindrome");
        // }
    //    System.out.println(h.size(h.head));
    //    node prev=null;
    //    node next=null;
    //    node curr=h.head;
    //    int i=0,k=2;
    //    System.out.println();
    //    while(i<=h.size(h.head)-k){
    //     System.out.print(" "+curr.data);
    //   prev=curr;
    //   curr=curr.next;
    //     i++;
    //    }
    // //    h.addfirst(h.head,curr);
    //    h.show();
       
     
    }
//     void addfirst(node head,node curr){
//         node temp1=curr;
//             while(temp1!=null){
//                 temp1=temp1.next;
//                 curr.next=head;
//  head=curr;               
//             }
//     }
void addf(node h){
    if(head==null){
        head=h;
        return;
    }
    h.next=head;
    head=h;
}
void rotate(node head,int k){

    int i=0;
    while(i<k){
            node temp=head;
    node prev=null;
    while(temp.next!=null){
            prev=temp;
            temp=temp.next;
    }
    prev.next=null;
    addf(temp);

    i++;
}
}
    int size(node head){
        node temp1=head;
        int c=0;
        while(temp1!=null){
temp1=temp1.next;
c++;
        }
        return c;
    }
    boolean ispalindrome(node head){
        node mid=findMid(head);
        node teasmp=head;
        node secondhead=rev(mid);
        while (temp!=null&&secondhead!=null) {
            if(temp.data!=secondhead.data){
                break;
            }
            temp=temp.next;
            secondhead=secondhead.next;
        }
        return head==null||secondhead==null;

    }
    void re_order(node head,node mid){
        node hs=head;
        node he=rev(mid);
        while(hs!=null&&he!=null){
            node temp=hs.next;
            hs.next=he;
            hs=temp;
            temp=he.next;
            he.next=hs;
            he=temp;
        }
        while(hs!=null){
           hs.next=null;
        }
    }

    node rev(node head){
        node prev=null;
        node curr=head;
        while(curr!=null){
            node nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    node findmidpic(node head,node mid){
        node prev=null,nxt=head;
        while(nxt!=mid){
            prev=nxt;
            nxt=nxt.next;

        }
        return prev;
    }

    node findMid(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node s = head;
        node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

        }
        return s;
    }

    void show() {
        if (head == null) {
            return;
        }
        node i = head;
        while (i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }
    }

    void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = temp = newnode;
            return;
        }
        temp.next = newnode;
        temp = newnode;
    }
}

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

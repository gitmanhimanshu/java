public class Trie {
    Node root;
    class Node{
        Node [] child;
        boolean end;
        Node(){
            child=new Node[26];
            end=false;
        }
  
    }
   Trie(){
    root=new Node();
   }
   void add(String s){
        Node curr=root;
   for(int i=0;i<s.length();i++){
    if(curr.child[s.charAt(i)-'a']==null){
        curr.child[s.charAt(i)-'a']=new Node();
    }
    
    if(i==s.length()-1){
        curr.end=true;
    }
    curr=curr.child[s.charAt(i)-'a'];
   }
   }
   boolean check(String s){
    Node curr=root;
    for(int i=0;i<s.length();i++){
        if(curr.child[s.charAt(i)-'a']==null){
            return false;
        }
        if(i==s.length()-1){
            if(curr.end==false){
                return false;
            }
        }
        curr=curr.child[s.charAt(i)-'a'];

    }
    return true;
   }
    public static void main(String[] args) {
        Trie obj=new Trie();
        String Words[]={"cats","dog","sand","and","cat"};
        for(String s: Words){
            obj.add(s);
        }
    System.out.println(obj.wordBreak("catsandog"));

    }
    boolean wordBreak(String s){
        if(s.length()==0){
            return true;
        }
        for(int i=1;i<=s.length();i++){
            if(check(s.substring(0,i))&&wordBreak(s.substring(i))){
                return true;
            }
        }
        return false;
    }
}

class main{
    int a[]=new int[100];
    int size;
     main(){
a[0]=-1;
size=0;
     }
    void insert(int data){
        size=size+1;
        int index=size;
        a[index]=data;
        while (index>1) {
            int parent=index/2;
            if(a[parent]<a[index]){
                int c=a[parent];
                a[parent]=a[index];
                a[index]=c;
                index=parent;
            }
            else{
                return;
            }
        }
    }
    void print(){
        for(int i=1;i<=size;i++){
            System.out.print(a[i]+" ");
        }
    }
    void delete(){
        2222222222222222222222222222222222222222222222
    }
}
class heap{
    public static void main(String[] args) {
      main a=new main();
        a.insert(98);
        a.insert(798);
        a.insert(65);
        a.print();
    }
}
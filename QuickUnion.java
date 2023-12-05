public class QuickUnion implements DisjointSet{
    int[] fa;
    public QuickUnion(int size){
        fa=new int[size];
        for(int i=0;i<size;i++)fa[i]=i;
    }
    public void connect(int x,int y){
        fa[find(x)]=find(y);
    }
    public boolean isConnected(int x,int y){
        return find(x)==find(y);
    }
    private int find(int x){
        return fa[x]=fa[x]==x?x:find(fa[x]);
    }
    public static void main(String[] args) {
        QuickUnion x=new QuickUnion(8);
        x.connect(3,2);
        x.connect(5,3);
        x.connect(6,7);
        x.connect(7,1);
        x.connect(1,2);
        System.out.println(x.isConnected(5,7));
    }
}

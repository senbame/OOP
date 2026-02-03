package practice2;

public class StarTriangle {
    private final int width;

    StarTriangle(int width){
        this.width = width;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 1; i<=width;i++){
            for (int j = 1;j<=i;j++){
                s += "[*]";
            }
            s += "\n";
        }
        return s;
    }
    public static void main(String[] args){
        StarTriangle s = new StarTriangle(5);
        System.out.println(s.toString());
    }
}

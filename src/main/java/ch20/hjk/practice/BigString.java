package ch20.hjk.practice;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for(int i = 0 ; i < bigChars.length ; i++){
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 문제 20-1
    public BigString(String string, boolean shared){
        if(shared){
            BigCharFactory factory = BigCharFactory.getInstance();
            bigChars = new BigChar[string.length()];
            for(int i = 0 ; i < bigChars.length ; i++){
                bigChars[i] = factory.getBigChar(string.charAt(i));
            }
        }else{
            bigChars = new BigChar[string.length()];
            for(int i = 0 ; i < bigChars.length ; i++){
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    public void print(){
        for(BigChar bc : bigChars){
            bc.print();
        }
    }
}

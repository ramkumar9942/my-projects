

public class Singleton {
        private static Singleton instance = new Singleton();
        private Singleton(){}
        private static Singleton getinstance(){
            return instance;
        
        }
        public void showmessage(){
            System.out.println("hello");
        }
    
    
     public static void main(String[] args) {
        Singleton.getinstance().showmessage();
    }
    }
    


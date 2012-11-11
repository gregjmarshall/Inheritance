


import java.util.ArrayList; 

public class MobilePhone extends OldPhone {
    
        private ArrayList<Integer> lastTen = new ArrayList<Integer>();
        
        public void ringAlarm(String alarmInput) {
        
        }
    
        public void playGame(String gameInput) {

        }
    
        public void lastTen() {
            Object[] numList = lastTen.toArray();
                for (int y = 0; y < lastTen.size();y++) {
                    System.out.println(numList[y]);
                }
        }
        
    
        public void ring() {
            super.ring();
            
        }
}

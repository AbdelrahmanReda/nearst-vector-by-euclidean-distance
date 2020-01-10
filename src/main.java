//Author : Abdelrahman Reda Fadl
//version 1
//date 12/8/2019
//e-mail : boodycat09@gmail.com


import java.util.ArrayList;
import java.util.Collections;
public class main {
    public static void main(String args []){
        ArrayList <ArrayList<Integer>> bigMatrix= new ArrayList<>();
        ArrayList <Integer> b1 = new ArrayList<>();
        b1.add(1); b1.add(2); b1.add(3); b1.add(4);
        
        ArrayList <Integer> b2 = new ArrayList<>();
        b2.add(7); b2.add(9); b2.add(6); b2.add(6);
        
        ArrayList <Integer> b3 = new ArrayList<>();
        b3.add(4); b3.add(11); b3.add(12); b3.add(12);
        
        ArrayList <Integer> b4 = new ArrayList<>();
        b4.add(4); b4.add(9); b4.add(10); b4.add(10);
        
        ArrayList <Integer> b5 = new ArrayList<>();
        b5.add(15); b5.add(14); b5.add(20); b5.add(18);
        
        ArrayList <Integer> b6 = new ArrayList<>();
        b6.add(9); b6.add(9); b6.add(8); b6.add(8);
        
        ArrayList <Integer> b7 = new ArrayList<>();
        b7.add(4); b7.add(3); b7.add(4); b7.add(5);
        
        ArrayList <Integer> b8 = new ArrayList<>();
        b8.add(17); b8.add(16); b8.add(18); b8.add(18);
        
        ArrayList <Integer> b9 = new ArrayList<>();
        b9.add(1); b9.add(4); b9.add(5); b9.add(6);
        bigMatrix.add(b1);
        bigMatrix.add(b2);
        bigMatrix.add(b3);
        bigMatrix.add(b4);
        bigMatrix.add(b5);
        bigMatrix.add(b6);
        bigMatrix.add(b7);
        bigMatrix.add(b8);
        bigMatrix.add(b9);
        
        ArrayList <ArrayList<Integer>> smallMatrix= new ArrayList<>();
        ArrayList <Integer> bb1 = new ArrayList<>();
        bb1.add(4); bb1.add(5); bb1.add(5); bb1.add(5);
        ArrayList <Integer> bb2 = new ArrayList<>();
        bb2.add(5); bb2.add(6); bb2.add(6); bb2.add(6);
        ArrayList <Integer> bb3 = new ArrayList<>();
        bb3.add(9); bb3.add(11); bb3.add(14); bb3.add(14);
        ArrayList <Integer> bb4 = new ArrayList<>();
        bb4.add(11); bb4.add(13); bb4.add(16); bb4.add(15);
        smallMatrix.add(bb1);
        smallMatrix.add(bb2);
        smallMatrix.add(bb3);
        smallMatrix.add(bb4);
        
        ArrayList <ArrayList<Integer>> differences = new ArrayList<>();
        for (int i = 0; i <smallMatrix.size() ; i++) { ArrayList <Integer> filler = new ArrayList<>();differences.add(filler);}
        ArrayList<Integer> maximi = new ArrayList<>();
        for (int i = 0; i <bigMatrix.size() ; i++) {
            for (int j = 0; j <bigMatrix.get(i).size() ; j++) {
                for (int k = 0; k <smallMatrix.size() ; k++) {
                    int difference = (int)Math.pow(bigMatrix.get(i).get(j)-smallMatrix.get(k).get(j),2);
                    differences.get(k).add(difference);
                }
            }
            for (int j = 0; j <differences.size() ; j++) {
                int summation = 0;
                for (int k = 0; k <differences.get(j).size() ; k++) {
    
                    summation=summation+differences.get(j).get(k);
                }
                maximi.add(summation);
            }
            System.out.println("vector number"+(i+1)+" will be located to to vector number"+(maximi.indexOf(Collections.min(maximi))+1));
                differences.clear();
            maximi.clear();
            for (int ii = 0; ii <smallMatrix.size() ; ii++) { ArrayList <Integer> filler = new ArrayList<>();differences.add(filler);}
        }
    }
}

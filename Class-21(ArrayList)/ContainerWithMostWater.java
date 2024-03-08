import java.util.ArrayList;

public class ContainerWithMostWater {

    //brute force approach --> O(n2)
//    public static int store_water(ArrayList<Integer> height){
//        int maxWater = 0;
//
//        for(int i=0; i<height.size(); i++){
//            for(int j=i+1; j<height.size(); j++){
//                int ht = Math.min(height.get(i), height.get(j));
//                int wt = j-i;
//                int currWater = ht * wt;
//                maxWater = Math.max(currWater,maxWater);
//            }
//        }
//
//        return maxWater;
//    }

    //optimized approach --> O(n) --> two pointer
    public static int store_water(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int currentWater = ht * wt;
            maxWater = Math.max(currentWater, maxWater);

            //update ptr we only check small height
            if(height.get(lp) < height.get(rp)){
                lp++;   //if lp height is small then lp++
            } else {
                rp--;   ////if rp height is small then lp--
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(store_water(height));
    }
}

package com.company.day5;
// write a while loop
// find a number than can be divided by 7, 45 and 2
//higher than a 1000
//quit the loop by using break

public class dowhile {
    public static void main(String[] args) {
        int j=999;
        while (true){
            j++;
            if((j % 7 !=0) || (j % 45!= 0) || (j % 2!= 0)) {
                continue;  // this is not what I want, take next j (go further with while loop)
            }
            else {
                System.out.println(j + " can be divided by 45, 7 and 2, as number above 1000");
                break;  // go out of the loop
            }
         }
    }
}

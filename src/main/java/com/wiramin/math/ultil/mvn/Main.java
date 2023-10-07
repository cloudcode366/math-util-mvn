/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiramin.math.ultil.mvn;

import com.wiramin.math.ultil.core.MathUtility;

/**
 *
 * @author MyMy
 */
public class Main {
    
    public static void main(String[] args) {
        //test thử hhamf mình vừa viết tính giai thừa có đúng không
        //chuẩn bị bộ data test, test case
        //Test Case #1:Check if getFactorial() runs well with n=0
        //Test procedures/Steps:
        //  Given n =0;
        //  Invoke getFactorial (n=0)
        
        //Expected Result:1; 
        //0!==1???
        
        long expected = 1; //em hi vọng 1 được trả về
        int n =0; //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n); //Chạy hàm mới biết
        
        //in ra và tự kết luận có giống kì vọng không
        System.out.println(n + "! | expected = "+expected+" | actual = "+actual);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiramin.math.ultil.test;
import com.wiramin.math.ultil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author MyMy
 */
public class MathUtilityTest {
    @Test
    public void TC_01(){
        assertEquals(6,MathUtility.getFactorial(3));
    }
    @Test
    public void TC_02(){
        assertEquals(24,MathUtility.getFactorial(4));
    }
    @Test
    public void TC_03(){
        assertEquals(1,MathUtility.getFactorial(3));
    }
}

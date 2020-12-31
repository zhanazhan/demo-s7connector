package com.example.demo;

import com.github.s7connector.api.annotation.S7Variable;
import com.github.s7connector.impl.utils.S7Type;

import java.time.LocalDateTime;

public class Data {
    public LocalDateTime date = LocalDateTime.now();

    @S7Variable(byteOffset=0 * 4, type= S7Type.REAL)
    public double num1;
    @S7Variable(byteOffset=1 * 4, type= S7Type.REAL)
    public double num2;
    @S7Variable(byteOffset=2 * 4, type= S7Type.REAL)
    public double num3;
    @S7Variable(byteOffset=3 * 4, type= S7Type.REAL)
    public double num4;
    @S7Variable(byteOffset=4 * 4, type= S7Type.REAL)
    public double num5;
    @S7Variable(byteOffset=5 *4, type= S7Type.REAL)
    public double num6;
    @S7Variable(byteOffset=6*4, type= S7Type.REAL)
    public double num7;
    @S7Variable(byteOffset=7*4, type= S7Type.REAL)
    public double num8;
    @S7Variable(byteOffset=8*4, type= S7Type.REAL)
    public double num9;
    @S7Variable(byteOffset=9*4, type= S7Type.REAL)
    public double num10;
    @S7Variable(byteOffset=10*4, type= S7Type.REAL)
    public double num11;
    @S7Variable(byteOffset=11*4, type= S7Type.REAL)
    public double num12;
    @S7Variable(byteOffset=12*4, type= S7Type.REAL)
    public double num13;
    @S7Variable(byteOffset=13*4, type= S7Type.REAL)
    public double num14;
    @S7Variable(byteOffset=14*4, type= S7Type.REAL)
    public double num15;
    @S7Variable(byteOffset=15 *4, type= S7Type.REAL)
    public double num16;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public double getNum6() {
        return num6;
    }

    public void setNum6(double num6) {
        this.num6 = num6;
    }

    public double getNum7() {
        return num7;
    }

    public void setNum7(double num7) {
        this.num7 = num7;
    }

    public double getNum8() {
        return num8;
    }

    public void setNum8(double num8) {
        this.num8 = num8;
    }

    public double getNum9() {
        return num9;
    }

    public void setNum9(double num9) {
        this.num9 = num9;
    }

    public double getNum10() {
        return num10;
    }

    public void setNum10(double num10) {
        this.num10 = num10;
    }

    public double getNum11() {
        return num11;
    }

    public void setNum11(double num11) {
        this.num11 = num11;
    }

    public double getNum12() {
        return num12;
    }

    public void setNum12(double num12) {
        this.num12 = num12;
    }

    public double getNum13() {
        return num13;
    }

    public void setNum13(double num13) {
        this.num13 = num13;
    }

    public double getNum14() {
        return num14;
    }

    public void setNum14(double num14) {
        this.num14 = num14;
    }

    public double getNum15() {
        return num15;
    }

    public void setNum15(double num15) {
        this.num15 = num15;
    }

    public double getNum16() {
        return num16;
    }

    public void setNum16(double num16) {
        this.num16 = num16;
    }

    @Override
    public String toString() {
        return "Data{" +
                "date=" + date +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                ", num6=" + num6 +
                ", num7=" + num7 +
                ", num8=" + num8 +
                ", num9=" + num9 +
                ", num10=" + num10 +
                ", num11=" + num11 +
                ", num12=" + num12 +
                ", num13=" + num13 +
                ", num14=" + num14 +
                ", num15=" + num15 +
                ", num16=" + num16 +
                '}';
    }
}

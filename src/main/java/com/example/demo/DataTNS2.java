package com.example.demo;

import com.github.s7connector.api.annotation.S7Variable;
import com.github.s7connector.api.S7Type;

import java.time.LocalDateTime;

public class DataTNS2 {
    public LocalDateTime date = LocalDateTime.now();

    @S7Variable(byteOffset=0, type= S7Type.REAL) public double PT1_P1_2;
    @S7Variable(byteOffset=4, type= S7Type.REAL) public double TT1_P1_2;
    @S7Variable(byteOffset=8, type= S7Type.REAL) public double VT1_P1_2;
    @S7Variable(byteOffset=12, type= S7Type.REAL) public double PT1_P2_2;
    @S7Variable(byteOffset=16, type= S7Type.REAL) public double TT1_P2_2;
    @S7Variable(byteOffset=20, type= S7Type.REAL) public double VT1_P2_2;
    @S7Variable(byteOffset=24, type= S7Type.REAL) public double PT1_P3_2;
    @S7Variable(byteOffset=28, type= S7Type.REAL) public double TT1_P3_2;
    @S7Variable(byteOffset=32, type= S7Type.REAL) public double VT1_P3_2;
    @S7Variable(byteOffset=36, type= S7Type.REAL) public double PT1_P4_2;
    @S7Variable(byteOffset=40, type= S7Type.REAL) public double TT1_P4_2;
    @S7Variable(byteOffset=44, type= S7Type.REAL) public double VT1_P4_2;
    @S7Variable(byteOffset=48, type= S7Type.REAL) public double Temp_P1_B1;
    @S7Variable(byteOffset=52, type= S7Type.REAL) public double Temp_P1_B2;
    @S7Variable(byteOffset=56, type= S7Type.REAL) public double Temp_P1_m1;
    @S7Variable(byteOffset=60, type= S7Type.REAL) public double Temp_P1_m2;
    @S7Variable(byteOffset=64, type= S7Type.REAL) public double Temp_P1_m3;
    @S7Variable(byteOffset=68, type= S7Type.REAL) public double Temp_P2_B1;
    @S7Variable(byteOffset=72, type= S7Type.REAL) public double Temp_P2_B2;
    @S7Variable(byteOffset=76, type= S7Type.REAL) public double Temp_P2_m1;
    @S7Variable(byteOffset=80, type= S7Type.REAL) public double Temp_P2_m2;
    @S7Variable(byteOffset=84, type= S7Type.REAL) public double Temp_P2_m3;
    @S7Variable(byteOffset=88, type= S7Type.REAL) public double Temp_P3_B1;
    @S7Variable(byteOffset=92, type= S7Type.REAL) public double Temp_P3_B2;
    @S7Variable(byteOffset=96, type= S7Type.REAL) public double Temp_P3_m1;
    @S7Variable(byteOffset=100, type= S7Type.REAL) public double Temp_P3_m2;
    @S7Variable(byteOffset=104, type= S7Type.REAL) public double Temp_P3_m3;
    @S7Variable(byteOffset=108, type= S7Type.REAL) public double Temp_P4_B1;
    @S7Variable(byteOffset=112, type= S7Type.REAL) public double Temp_P4_B2;
    @S7Variable(byteOffset=116, type= S7Type.REAL) public double Temp_P4_m1;
    @S7Variable(byteOffset=120, type= S7Type.REAL) public double Temp_P4_m2;
    @S7Variable(byteOffset=124, type= S7Type.REAL) public double Temp_P4_m3;
    @S7Variable(byteOffset=128, type= S7Type.BOOL) public boolean STATE_P1;
    @S7Variable(byteOffset=130, type= S7Type.REAL) public double CURR_P1;
    @S7Variable(byteOffset=134, type= S7Type.BOOL) public boolean STATE_P2;
    @S7Variable(byteOffset=136, type= S7Type.REAL) public double CURR_P2;
    @S7Variable(byteOffset=140, type= S7Type.BOOL) public boolean STATE_P3;
    @S7Variable(byteOffset=142, type= S7Type.REAL) public double CURR_P3;
    @S7Variable(byteOffset=146, type= S7Type.BOOL) public boolean STATE_P4;
    @S7Variable(byteOffset=148, type= S7Type.REAL) public double CURR_P4;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPT1_P1_2() {
        return PT1_P1_2;
    }

    public void setPT1_P1_2(double PT1_P1_2) {
        this.PT1_P1_2 = PT1_P1_2;
    }

    public double getTT1_P1_2() {
        return TT1_P1_2;
    }

    public void setTT1_P1_2(double TT1_P1_2) {
        this.TT1_P1_2 = TT1_P1_2;
    }

    public double getVT1_P1_2() {
        return VT1_P1_2;
    }

    public void setVT1_P1_2(double VT1_P1_2) {
        this.VT1_P1_2 = VT1_P1_2;
    }

    public double getPT1_P2_2() {
        return PT1_P2_2;
    }

    public void setPT1_P2_2(double PT1_P2_2) {
        this.PT1_P2_2 = PT1_P2_2;
    }

    public double getTT1_P2_2() {
        return TT1_P2_2;
    }

    public void setTT1_P2_2(double TT1_P2_2) {
        this.TT1_P2_2 = TT1_P2_2;
    }

    public double getVT1_P2_2() {
        return VT1_P2_2;
    }

    public void setVT1_P2_2(double VT1_P2_2) {
        this.VT1_P2_2 = VT1_P2_2;
    }

    public double getPT1_P3_2() {
        return PT1_P3_2;
    }

    public void setPT1_P3_2(double PT1_P3_2) {
        this.PT1_P3_2 = PT1_P3_2;
    }

    public double getTT1_P3_2() {
        return TT1_P3_2;
    }

    public void setTT1_P3_2(double TT1_P3_2) {
        this.TT1_P3_2 = TT1_P3_2;
    }

    public double getVT1_P3_2() {
        return VT1_P3_2;
    }

    public void setVT1_P3_2(double VT1_P3_2) {
        this.VT1_P3_2 = VT1_P3_2;
    }

    public double getPT1_P4_2() {
        return PT1_P4_2;
    }

    public void setPT1_P4_2(double PT1_P4_2) {
        this.PT1_P4_2 = PT1_P4_2;
    }

    public double getTT1_P4_2() {
        return TT1_P4_2;
    }

    public void setTT1_P4_2(double TT1_P4_2) {
        this.TT1_P4_2 = TT1_P4_2;
    }

    public double getVT1_P4_2() {
        return VT1_P4_2;
    }

    public void setVT1_P4_2(double VT1_P4_2) {
        this.VT1_P4_2 = VT1_P4_2;
    }

    public double getTemp_P1_B1() {
        return Temp_P1_B1;
    }

    public void setTemp_P1_B1(double temp_P1_B1) {
        Temp_P1_B1 = temp_P1_B1;
    }

    public double getTemp_P1_B2() {
        return Temp_P1_B2;
    }

    public void setTemp_P1_B2(double temp_P1_B2) {
        Temp_P1_B2 = temp_P1_B2;
    }

    public double getTemp_P1_m1() {
        return Temp_P1_m1;
    }

    public void setTemp_P1_m1(double temp_P1_m1) {
        Temp_P1_m1 = temp_P1_m1;
    }

    public double getTemp_P1_m2() {
        return Temp_P1_m2;
    }

    public void setTemp_P1_m2(double temp_P1_m2) {
        Temp_P1_m2 = temp_P1_m2;
    }

    public double getTemp_P1_m3() {
        return Temp_P1_m3;
    }

    public void setTemp_P1_m3(double temp_P1_m3) {
        Temp_P1_m3 = temp_P1_m3;
    }

    public double getTemp_P2_B1() {
        return Temp_P2_B1;
    }

    public void setTemp_P2_B1(double temp_P2_B1) {
        Temp_P2_B1 = temp_P2_B1;
    }

    public double getTemp_P2_B2() {
        return Temp_P2_B2;
    }

    public void setTemp_P2_B2(double temp_P2_B2) {
        Temp_P2_B2 = temp_P2_B2;
    }

    public double getTemp_P2_m1() {
        return Temp_P2_m1;
    }

    public void setTemp_P2_m1(double temp_P2_m1) {
        Temp_P2_m1 = temp_P2_m1;
    }

    public double getTemp_P2_m2() {
        return Temp_P2_m2;
    }

    public void setTemp_P2_m2(double temp_P2_m2) {
        Temp_P2_m2 = temp_P2_m2;
    }

    public double getTemp_P2_m3() {
        return Temp_P2_m3;
    }

    public void setTemp_P2_m3(double temp_P2_m3) {
        Temp_P2_m3 = temp_P2_m3;
    }

    public double getTemp_P3_B1() {
        return Temp_P3_B1;
    }

    public void setTemp_P3_B1(double temp_P3_B1) {
        Temp_P3_B1 = temp_P3_B1;
    }

    public double getTemp_P3_B2() {
        return Temp_P3_B2;
    }

    public void setTemp_P3_B2(double temp_P3_B2) {
        Temp_P3_B2 = temp_P3_B2;
    }

    public double getTemp_P3_m1() {
        return Temp_P3_m1;
    }

    public void setTemp_P3_m1(double temp_P3_m1) {
        Temp_P3_m1 = temp_P3_m1;
    }

    public double getTemp_P3_m2() {
        return Temp_P3_m2;
    }

    public void setTemp_P3_m2(double temp_P3_m2) {
        Temp_P3_m2 = temp_P3_m2;
    }

    public double getTemp_P3_m3() {
        return Temp_P3_m3;
    }

    public void setTemp_P3_m3(double temp_P3_m3) {
        Temp_P3_m3 = temp_P3_m3;
    }

    public double getTemp_P4_B1() {
        return Temp_P4_B1;
    }

    public void setTemp_P4_B1(double temp_P4_B1) {
        Temp_P4_B1 = temp_P4_B1;
    }

    public double getTemp_P4_B2() {
        return Temp_P4_B2;
    }

    public void setTemp_P4_B2(double temp_P4_B2) {
        Temp_P4_B2 = temp_P4_B2;
    }

    public double getTemp_P4_m1() {
        return Temp_P4_m1;
    }

    public void setTemp_P4_m1(double temp_P4_m1) {
        Temp_P4_m1 = temp_P4_m1;
    }

    public double getTemp_P4_m2() {
        return Temp_P4_m2;
    }

    public void setTemp_P4_m2(double temp_P4_m2) {
        Temp_P4_m2 = temp_P4_m2;
    }

    public double getTemp_P4_m3() {
        return Temp_P4_m3;
    }

    public void setTemp_P4_m3(double temp_P4_m3) {
        Temp_P4_m3 = temp_P4_m3;
    }

    public boolean isSTATE_P1() {
        return STATE_P1;
    }

    public void setSTATE_P1(boolean STATE_P1) {
        this.STATE_P1 = STATE_P1;
    }

    public double getCURR_P1() {
        return CURR_P1;
    }

    public void setCURR_P1(double CURR_P1) {
        this.CURR_P1 = CURR_P1;
    }

    public boolean isSTATE_P2() {
        return STATE_P2;
    }

    public void setSTATE_P2(boolean STATE_P2) {
        this.STATE_P2 = STATE_P2;
    }

    public double getCURR_P2() {
        return CURR_P2;
    }

    public void setCURR_P2(double CURR_P2) {
        this.CURR_P2 = CURR_P2;
    }

    public boolean isSTATE_P3() {
        return STATE_P3;
    }

    public void setSTATE_P3(boolean STATE_P3) {
        this.STATE_P3 = STATE_P3;
    }

    public double getCURR_P3() {
        return CURR_P3;
    }

    public void setCURR_P3(double CURR_P3) {
        this.CURR_P3 = CURR_P3;
    }

    public boolean isSTATE_P4() {
        return STATE_P4;
    }

    public void setSTATE_P4(boolean STATE_P4) {
        this.STATE_P4 = STATE_P4;
    }

    public double getCURR_P4() {
        return CURR_P4;
    }

    public void setCURR_P4(double CURR_P4) {
        this.CURR_P4 = CURR_P4;
    }

    @Override
    public String toString() {
        return "Data{" +
                "date=" + date +
                ", PT1_P1_2=" + PT1_P1_2 +
                ", TT1_P1_2=" + TT1_P1_2 +
                ", VT1_P1_2=" + VT1_P1_2 +
                ", PT1_P2_2=" + PT1_P2_2 +
                ", TT1_P2_2=" + TT1_P2_2 +
                ", VT1_P2_2=" + VT1_P2_2 +
                ", PT1_P3_2=" + PT1_P3_2 +
                ", TT1_P3_2=" + TT1_P3_2 +
                ", VT1_P3_2=" + VT1_P3_2 +
                ", PT1_P4_2=" + PT1_P4_2 +
                ", TT1_P4_2=" + TT1_P4_2 +
                ", VT1_P4_2=" + VT1_P4_2 +
                ", Temp_P1_B1=" + Temp_P1_B1 +
                ", Temp_P1_B2=" + Temp_P1_B2 +
                ", Temp_P1_m1=" + Temp_P1_m1 +
                ", Temp_P1_m2=" + Temp_P1_m2 +
                ", Temp_P1_m3=" + Temp_P1_m3 +
                ", Temp_P2_B1=" + Temp_P2_B1 +
                ", Temp_P2_B2=" + Temp_P2_B2 +
                ", Temp_P2_m1=" + Temp_P2_m1 +
                ", Temp_P2_m2=" + Temp_P2_m2 +
                ", Temp_P2_m3=" + Temp_P2_m3 +
                ", Temp_P3_B1=" + Temp_P3_B1 +
                ", Temp_P3_B2=" + Temp_P3_B2 +
                ", Temp_P3_m1=" + Temp_P3_m1 +
                ", Temp_P3_m2=" + Temp_P3_m2 +
                ", Temp_P3_m3=" + Temp_P3_m3 +
                ", Temp_P4_B1=" + Temp_P4_B1 +
                ", Temp_P4_B2=" + Temp_P4_B2 +
                ", Temp_P4_m1=" + Temp_P4_m1 +
                ", Temp_P4_m2=" + Temp_P4_m2 +
                ", Temp_P4_m3=" + Temp_P4_m3 +
                ", STATE_P1=" + STATE_P1 +
                ", CURR_P1=" + CURR_P1 +
                ", STATE_P2=" + STATE_P2 +
                ", CURR_P2=" + CURR_P2 +
                ", STATE_P3=" + STATE_P3 +
                ", CURR_P3=" + CURR_P3 +
                ", STATE_P4=" + STATE_P4 +
                ", CURR_P4=" + CURR_P4 +
                '}';
    }
}

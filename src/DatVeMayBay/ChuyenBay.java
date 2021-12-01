/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatVeMayBay;

public class ChuyenBay {
    public String DiemDi;
    public String DiemDen;
    public String TgDi;
    public String TgDen;
    public String KhoangCach;
    public int SoGhe;
    public int ChiPhi;

    public ChuyenBay(String DiemDi, String DiemDen, String TgDi, String TgDen, String KhoangCach,int SoGhe, int ChiPhi) {
        this.DiemDi = DiemDi;
        this.DiemDen = DiemDen;
        this.TgDi = TgDi;
        this.TgDen = TgDen;
        this.KhoangCach = KhoangCach;
        this.SoGhe = SoGhe;
        this.ChiPhi = ChiPhi;
    }

    public String getDiemDi() {
        return DiemDi;
    }

    public void setDiemDi(String DiemDi) {
        this.DiemDi = DiemDi;
    }

    public String getDiemDen() {
        return DiemDen;
    }

    public int getSoGhe() {
        return SoGhe;
    }

    public void setSoGhe(int SoGhe) {
        this.SoGhe = SoGhe;
    }

    public int getChiPhi() {
        return ChiPhi;
    }

    public void setChiPhi(int ChiPhi) {
        this.ChiPhi = ChiPhi;
    }

    public void setDiemDen(String DiemDen) {
        this.DiemDen = DiemDen;
    }

    public String getKhoangCach() {
        return KhoangCach;
    }

    public void setKhoangCach(String KhoangCach) {
        this.KhoangCach = KhoangCach;
    }

    public String getTgDi() {
        return TgDi;
    }

    public void setTgDi(String TgDi) {
        this.TgDi = TgDi;
    }

    public String getTgDen() {
        return TgDen;
    }

    public void setTgDen(String tgDen) {
        this.TgDen = TgDen;
    }
}

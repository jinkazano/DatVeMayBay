/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DatVeMayBay.DangNhap;
import db.dbDatVe;

/**
 *
 * @author Admin
 */
public class Main {
    public static  DatVeMayBay.DangNhap dn = new DangNhap();
    public static db.dbDatVe connection = new  db.dbDatVe();

    public static void main(String[] args) {
       DangNhap dn= new   DatVeMayBay.DangNhap();
  
       dn.show();
    }
   
    
}

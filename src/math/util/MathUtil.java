/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math.util;

import core.MathUtils;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc hok
        //       0 coi tính mấy
        //      20 coi tính mấy
        //       21 coi tính ra mấy!!!
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!!
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI HÀM MÀ NÓ BAO GỒM:
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU
        //VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO
        
        long expected = 120; //tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtils.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
               
    }
    
}

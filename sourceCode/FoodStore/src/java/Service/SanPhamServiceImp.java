/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.SanPhamDao;
import Domain.Sanpham;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Duc Anh
 */
public class SanPhamServiceImp implements SanPhamService{

    @Autowired
    private SanPhamDao sanPhamDao;
    @Override
    public ArrayList<Sanpham> getAllProductByMaSP(int MaLoapSP) {
        return sanPhamDao.getAllProductByMaSP(MaLoapSP);
    }

    @Override
    public ArrayList<Sanpham> getAllProduct() {
        return sanPhamDao.getAllProduct();
    }
    
}

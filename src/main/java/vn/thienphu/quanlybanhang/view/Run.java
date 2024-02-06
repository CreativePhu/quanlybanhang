package vn.thienphu.quanlybanhang.view;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vn.thienphu.quanlybanhang.model.NhanVien;
import vn.thienphu.quanlybanhang.model.Quyen;
import vn.thienphu.quanlybanhang.model.TaiKhoan;
import vn.thienphu.quanlybanhang.util.HibernateUtil;

public class Run {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Quyen quyen = new Quyen("ADMIN");
		TaiKhoan taiKhoan = new TaiKhoan("phutot111", false);
		taiKhoan.themQuyen(quyen);
		NhanVien nhanVien = new NhanVien("Ngô Thiên Phú", "0348191482", "phutot1111@gmail.com");
		nhanVien.setTaiKhoan(taiKhoan);
		session.persist(nhanVien);
		session.getTransaction().commit();
		session.close();
	}
}

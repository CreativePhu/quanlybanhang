package vn.thienphu.quanlybanhang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "phieu_mua_hang")
public class PhieuMuaHang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_phieu_mua_hang")
	private long maPhieuMuaHang;
	
	@Column(name = "ngay_lap")
	private Date ngayLap;
	
	@Column(name = "tong_tien")
	private float tongTien;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_nhan_vien")
	private NhanVien nhanVien;
	
	@OneToMany(mappedBy = "phieuMuaHang" ,cascade = CascadeType.ALL)
	private List<ChiTietPhieuMuaHang> danhSachChiTietPhieuMuaHang;

	public PhieuMuaHang() {
		
	}

	public PhieuMuaHang(Date ngayLap, float tongTien) {
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}

	public long getMaPhieuMuaHang() {
		return maPhieuMuaHang;
	}

	public void setMaPhieuMuaHang(long maPhieuMuaHang) {
		this.maPhieuMuaHang = maPhieuMuaHang;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public List<ChiTietPhieuMuaHang> getDanhSachChiTietPhieuMuaHang() {
		return danhSachChiTietPhieuMuaHang;
	}

	public void setDanhSachChiTietPhieuMuaHang(List<ChiTietPhieuMuaHang> danhSachChiTietPhieuMuaHang) {
		this.danhSachChiTietPhieuMuaHang = danhSachChiTietPhieuMuaHang;
	}
	
	public void themChiTietPhieuMuaHang(ChiTietPhieuMuaHang chiTietPhieuMuaHang) {
		if(danhSachChiTietPhieuMuaHang == null) {
			danhSachChiTietPhieuMuaHang = new ArrayList<ChiTietPhieuMuaHang>();
		}
		danhSachChiTietPhieuMuaHang.add(chiTietPhieuMuaHang);
	}

	@Override
	public String toString() {
		return "PhieuMuaHang [maPhieuMuaHang=" + maPhieuMuaHang + ", ngayLap=" + ngayLap + ", tongTien=" + tongTien
				+ ", nhanVien=" + nhanVien + "]";
	}
	
	
}

package vn.thienphu.quanlybanhang.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nhan_vien")
	private long idNhanVien;
	
	@Column(name = "ten_nhan_vien")
	private String tenNhanVien;
	
	@Column(name = "so_dien_thoai")
	private String soDienThoai;
	
	@Column(name = "gmail")
	private String gmail;
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ten_tai_khoan")
	private TaiKhoan taiKhoan;
	
	@OneToMany(mappedBy = "nhanVien" ,cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private List<PhieuMuaHang> danhSachPhieuMuaHang;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String tenNhanVien, String soDienThoai, String gmail) {
		this.tenNhanVien = tenNhanVien;
		this.soDienThoai = soDienThoai;
		this.gmail = gmail;
	}

	public long getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(long idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public List<PhieuMuaHang> getDanhSachPhieuMuaHang() {
		return danhSachPhieuMuaHang;
	}

	public void setDanhSachPhieuMuaHang(List<PhieuMuaHang> danhSachPhieuMuaHang) {
		this.danhSachPhieuMuaHang = danhSachPhieuMuaHang;
	}
	
	public void themPhieuMuaHang(PhieuMuaHang phieuMuaHang) {
		if(danhSachPhieuMuaHang == null) {
			danhSachPhieuMuaHang = new ArrayList<PhieuMuaHang>();
		}
		
		danhSachPhieuMuaHang.add(phieuMuaHang);
	}

	@Override
	public String toString() {
		return "NhanVien [idNhanVien=" + idNhanVien + ", tenNhanVien=" + tenNhanVien + ", soDienThoai=" + soDienThoai
				+ ", gmail=" + gmail + ", taiKhoan=" + taiKhoan + "]";
	}
	
	
	
}

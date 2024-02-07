package vn.thienphu.quanlybanhang.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chi_tiet_phieu_mua_hang")
public class ChiTietPhieuMuaHang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_chi_tiet_phieu_mua_hang")
	private long maChiTietPhieuMuaHang;
	
	@Column(name = "so_luong")
	private int soLuong;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "ma_phieu_mua_hang")
	private PhieuMuaHang phieuMuaHang;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_san_pham")
	private SanPham sanPham;

	public ChiTietPhieuMuaHang() {
		
	}

	public ChiTietPhieuMuaHang(long maChiTietPhieuMuaHang, int soLuong) {
		this.maChiTietPhieuMuaHang = maChiTietPhieuMuaHang;
		this.soLuong = soLuong;
	}

	public long getMaChiTietPhieuMuaHang() {
		return maChiTietPhieuMuaHang;
	}

	public void setMaChiTietPhieuMuaHang(long maChiTietPhieuMuaHang) {
		this.maChiTietPhieuMuaHang = maChiTietPhieuMuaHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public PhieuMuaHang getPhieuMuaHang() {
		return phieuMuaHang;
	}

	public void setPhieuMuaHang(PhieuMuaHang phieuMuaHang) {
		this.phieuMuaHang = phieuMuaHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	@Override
	public String toString() {
		return "ChiTietPhieuMuaHang [maChiTietPhieuMuaHang=" + maChiTietPhieuMuaHang + ", soLuong=" + soLuong
				+ ", phieuMuaHang=" + phieuMuaHang + ", sanPham=" + sanPham + "]";
	}
	
	
}

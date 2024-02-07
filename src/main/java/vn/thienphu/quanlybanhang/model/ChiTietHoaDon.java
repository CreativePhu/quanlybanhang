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
@Table(name = "chi_tiet_hoa_don")
public class ChiTietHoaDon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_chi_tiet_hoa_don")
	private long idChiTietHoaDon;
	
	@Column(name = "so_luong")
	private int soLuong;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "ma_hoa_don")
	private HoaDon hoaDon;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_san_pham")
	private SanPham sanPham;

	public ChiTietHoaDon() {
		
	}

	public ChiTietHoaDon(long idChiTietHoaDon, int soLuong, HoaDon hoaDon, SanPham sanPham) {
		this.idChiTietHoaDon = idChiTietHoaDon;
		this.soLuong = soLuong;
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
	}

	public long getIdChiTietHoaDon() {
		return idChiTietHoaDon;
	}

	public void setIdChiTietHoaDon(long idChiTietHoaDon) {
		this.idChiTietHoaDon = idChiTietHoaDon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [idChiTietHoaDon=" + idChiTietHoaDon + ", soLuong=" + soLuong + ", hoaDon=" + hoaDon
				+ ", sanPham=" + sanPham + "]";
	}

	
}

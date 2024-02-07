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
@Table(name = "hoa_don")
public class HoaDon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_hoa_don")
	private long maHoaDon;
	
	@Column(name = "ngay_lap")
	private Date ngayLap;
	
	@Column(name = "tong_tien")
	private float tongTien;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "id_nhan_vien")
	private NhanVien nhanVien;
	
	@OneToMany(mappedBy = "hoaDon" ,cascade = CascadeType.ALL)
	private List<ChiTietHoaDon> danhSachChiTietHoaDon;

	public HoaDon() {
		
	}

	public HoaDon(Date ngayLap, float tongTien) {
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}

	public long getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(long maHoaDon) {
		this.maHoaDon = maHoaDon;
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

	public List<ChiTietHoaDon> getDanhSachChiTietHoaDon() {
		return danhSachChiTietHoaDon;
	}

	public void setDanhSachChiTietHoaDon(List<ChiTietHoaDon> danhSachChiTietHoaDon) {
		this.danhSachChiTietHoaDon = danhSachChiTietHoaDon;
	}

	public void themChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		if(danhSachChiTietHoaDon == null) {
			danhSachChiTietHoaDon = new ArrayList<ChiTietHoaDon>();
		}
		danhSachChiTietHoaDon.add(chiTietHoaDon);
	}
	
}

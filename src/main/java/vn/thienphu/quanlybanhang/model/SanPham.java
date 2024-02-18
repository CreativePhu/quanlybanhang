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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "san_pham")
public class SanPham {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_san_pham")
	private long idSanPham;

	@Column(name = "ten_san_pham")
	private String tenSanPham;

	@Column(name = "gia_san_pham")
	private float giaSanPham;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "loaiSanPham_sanPham", joinColumns = @JoinColumn(name = "id_san_pham"), inverseJoinColumns = @JoinColumn(name = "ma_loai_sp"))
	private List<LoaiSanPham> danhSachLoaiSanPham;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_anh")
	private Anh anh;
	
	
	@OneToMany(mappedBy = "sanPham" ,cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private List<ChiTietHoaDon> danhSachChiTietHoaDon;

	public SanPham() {

	}

	public SanPham(String tenSanPham, float giaSanPham) {
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
	}

	public long getIdSanPham() {
		return idSanPham;
	}

	public void setIdSanPham(long idSanPham) {
		this.idSanPham = idSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public float getGiaSanPham() {
		return giaSanPham;
	}

	public void setGiaSanPham(float giaSanPham) {
		this.giaSanPham = giaSanPham;
	}

	public List<LoaiSanPham> getDanhSachLoaiSanPham() {
		return danhSachLoaiSanPham;
	}

	public void setDanhSachLoaiSanPham(List<LoaiSanPham> danhSachLoaiSanPham) {
		this.danhSachLoaiSanPham = danhSachLoaiSanPham;
	}

	public void addLoaiSanPham(LoaiSanPham loaiSanPham) {
		if (danhSachLoaiSanPham == null) {
			danhSachLoaiSanPham = new ArrayList<LoaiSanPham>();
		}
		danhSachLoaiSanPham.add(loaiSanPham);
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

	public Anh getAnh() {
		return anh;
	}

	public void setAnh(Anh anh) {
		this.anh = anh;
	}

	@Override
	public String toString() {
		return "SanPham [idSanPham=" + idSanPham + ", tenSanPham=" + tenSanPham + ", giaSanPham=" + giaSanPham
				+ ", danhSachLoaiSanPham=" + danhSachLoaiSanPham + "]";
	}
}

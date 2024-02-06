package vn.thienphu.quanlybanhang.model;

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
import javax.persistence.Table;

@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_loai")
	private long maLoai;
	@Column(name = "ten_loai")
	private String tenLoai;
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(
			name = "loaiSanPham_sanPham",
			joinColumns = @JoinColumn(name = "ma_loai_sp"),
			inverseJoinColumns = @JoinColumn(name = "id_san_pham")
	)
	private List<SanPham> danhSachSanPham;
	public LoaiSanPham() {
		
	}
	public LoaiSanPham(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public long getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(long maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public List<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}
	public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}
	@Override
	public String toString() {
		return "LoaiSanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
	
}

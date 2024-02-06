package vn.thienphu.quanlybanhang.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "anh")
public class Anh {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_anh")
	private long idAnh;

	@Lob
	@Column(name = "hinh_anh")
	private String hinhAnh;

	@OneToOne(mappedBy = "anh", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private SanPham sanPham;

	public Anh() {

	}

	public Anh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public long getIdAnh() {
		return idAnh;
	}

	public void setIdAnh(long idAnh) {
		this.idAnh = idAnh;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	@Override
	public String toString() {
		return "Anh [idAnh=" + idAnh + "]";
	}

}

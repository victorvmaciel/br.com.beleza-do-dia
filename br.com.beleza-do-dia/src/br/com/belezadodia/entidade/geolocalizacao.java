package br.com.belezadodia.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class geolocalizacao {
	
	@Id
	@SequenceGenerator(name = "seq_aluno", initialValue=1)
	@GeneratedValue(generator="seq_aluno",strategy=GenerationType.AUTO)
	private int id;
	
	@Column (name="estab_nome")	
	private String estabName;
	
	@Column (name="geolocLatitude")	
	private String geolocLatitude;
	
	@Column (name="geolocLongitude")	
	private String geolocLongitude;
	
	
	@Column (name="aceitaCupomDesc")	
	private Boolean aceitaCupomDesc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstabName() {
		return estabName;
	}

	public void setEstabName(String estabName) {
		this.estabName = estabName;
	}

	public String getGeolocLatitude() {
		return geolocLatitude;
	}

	public void setGeolocLatitude(String geolocLatitude) {
		this.geolocLatitude = geolocLatitude;
	}

	public String getGeolocLongitude() {
		return geolocLongitude;
	}

	public void setGeolocLongitude(String geolocLongitude) {
		this.geolocLongitude = geolocLongitude;
	}

	public Boolean getAceitaCupomDesc() {
		return aceitaCupomDesc;
	}

	public void setAceitaCupomDesc(Boolean aceitaCupomDesc) {
		this.aceitaCupomDesc = aceitaCupomDesc;
	}
	

}

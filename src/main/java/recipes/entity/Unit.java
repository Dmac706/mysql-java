package recipes.entity;

public class Unit {
	private Integer unitId;
	private String unitNameSingular;
	private String unitNamePlural;
	
	@Override
	public String toString() {
		return "unit [unitId=" + unitId + ", unitNameSingular=" + unitNameSingular + ", unitNamePlural="
				+ unitNamePlural + "]";
	}
	public Integer getUnitId() {
		return unitId;
	}
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	public String getUnitNameSingular() {
		return unitNameSingular;
	}
	public void setUnitNameSingular(String unitNameSingular) {
		this.unitNameSingular = unitNameSingular;
	}
	public String getUnitNamePlural() {
		return unitNamePlural;
	}
	public void setUnitNamePlural(String unitNamePlural) {
		this.unitNamePlural = unitNamePlural;
	}
	

}

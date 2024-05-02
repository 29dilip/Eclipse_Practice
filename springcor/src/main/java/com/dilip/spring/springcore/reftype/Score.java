package com.dilip.spring.springcore.reftype;

public class Score {

	private Double physics;
	private Double chemistry;
	private Double maths;

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "Score [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}

}

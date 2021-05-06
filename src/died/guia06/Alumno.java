package died.guia06;

import java.util.List;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		int creditos=0;
		for(Curso C: this.aprobados) {
			creditos+= (int)C.getCreditos();
		}
		return creditos;
	}

	public void aprobar(Curso c) {
		this.cursando.remove(c);
		this.aprobados.add(c);
	}

	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
		return;
	}
	public boolean equals(Alumno a) {
		if (this.nroLibreta== a.getnroLibreta())return true;
		return false;
	}
	public Integer getnroLibreta() {
		return this.nroLibreta;
	}
	public int compareTo(Alumno a) {
		return this.nombre.compareTo(a.getNombre());
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean tresCursosCL(int ciclec) {
		int en_este_CL=0;
		for (Curso C: this.cursando) {
			if(C.getCL() == ciclec) en_este_CL++;
		}
		if(en_este_CL ==3)return true;
		else return true;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nroLibreta=" + nroLibreta + "]";
	}

}

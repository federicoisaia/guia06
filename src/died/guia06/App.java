package died.guia06;

public class App {

	public static void main(String[] args) {
	Alumno a1= new Alumno("Federico Isaia", 22505);
	Alumno a2= new Alumno("Claudio Paul", 454545);
	Alumno a3= new Alumno("Sebastian Washington", 15656);
	Alumno a4= new Alumno("fewa dsafer", 789789);
	Alumno a5= new Alumno("fda defe", 31421);
	Alumno a6= new Alumno("jyuj jhlll", 46489);
	//Integer id, String nombre, Integer cicloLectivo, Integer cupo,Integer creditos, Integer creditosRequeridos
	Curso c1= new Curso(1,"DIED",3,3,5,0);
	Curso c2= new Curso(2,"GDD",3,30,5, 10);
	Curso c3= new Curso(3,"DdS",3,40,5, 10);
	
	try {
	
	c1.inscribir(a6);
	c1.inscribir(a1);
	//c1.inscribir(a1);
	//c1.inscribir(a1);
	//c1.inscribir(a1);
	System.out.println(a1.tresCursosCL(c1.getCL()));
	c1.imprimirInscriptos();
	a1.aprobar(c1);

	c1.imprimirInscriptos();
	System.out.println(a1.creditosObtenidos());
	}
	catch (cupoLlenoException e) {
		System.out.println(e.getMessage());
	}
	catch (creditosInsuficientesException e) {
		System.out.println(e.getMessage());
	}
	catch (RegistroAuditoriaException e) {
		System.out.println(e.getMessage());
	}
	
	
	}
}

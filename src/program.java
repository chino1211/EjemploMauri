

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
		
		
		try{
			Integer.valueOf(nombre);
			
		}
		catch (Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage()+"ErrorCode: 0000x1231273961");
			
		}
		
		
		crearArray();
		
		Mascota unaMascota = new Mascota();
		Mascota unaMascota1 = new Mascota();
		Mascota unaMascota2 = new Mascota();
		Mascota unaMascota3 = new Mascota();
		Mascota unaMascota4 = new Mascota();
		Mascota unaMascota5 = new Mascota();
		Mascota unaMascota6 = new Mascota();
		
		
		
		
		JOptionPane.showMessageDialog(null, Mascota.contador);
		
		
	}
	
	public static void crearArray()
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++)
		{
			array.add(i);
		}
		
		String mensaje ="";
		
		for(int i =0; i<array.size(); i++)
		{
			mensaje += "valor: " + array.get(i) + " \n";
			i++;
		}
	
		JOptionPane.showMessageDialog(null, mensaje);
	}
		
		
		
		
	}



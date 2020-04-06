package id.d3ti.oopl.keempat.AWT;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TampilanAWT extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String tmp_lahir;
	String tgl_lahir;
	String alamat;
	
	TextField cnim, cnama, ctmp_lahir, ctgl_lahir;
	Choice cjk1;
	TextArea calamat;
	Button b;
	
	public TampilanAWT() {
		super("Data Diri");
		Panel p = new Panel();
		add(p);
		p.setLayout(new GridLayout(7, 2));
		
		p.add(new Label("NIM"));
		p.add(cnim = new TextField());
		
		p.add(new Label("Nama"));
		p.add(cnama = new TextField());
		
		p.add(new Label ("Jenis Kelamin"));
		cjk1 = new Choice();
		cjk1.add("Laki-laki");
		cjk1.add("Perempuan");
		p.add(cjk1);
		
		p.add(new Label("Tempat Lahir"));
		p.add(ctmp_lahir = new TextField());
		
		p.add(new Label("Tanggal Lahir"));
		p.add(ctgl_lahir = new TextField());
		
		p.add(new Label("Alamat"));
		p.add(calamat = new TextArea());
		
		p.add(new Label(""));
		p.add(b = new Button("save"));
		
		setSize(250, 300);
		setVisible(true);
		addWindowListener(this);
	}
	
	public boolean action(Event e, Object what) {
		if(what.equals("save")) {
			nim = cnim.getText();
			nama = cnama.getText();
			jk = cjk1.getSelectedItem().toString();
			alamat = calamat.getText();
			tmp_lahir = ctmp_lahir.getText();
			tgl_lahir = ctgl_lahir.getText();
			
			/*System.out.println(nim);
			System.out.println(nama);
			System.out.println(jk);
			System.out.println(tmp_lahir);
			System.out.println(tgl_lahir);
			System.out.println(alamat);**/
			JFrame frame = new JFrame();
				
			
			
			//Menentukan ukuran Frame
			frame.setSize(400, 300);
			
			//Membuat letak Frame berada di tengat ketika program dijalankan
			frame.setLocationRelativeTo(null);
			JLabel label = new JLabel("NIM= "+nim);
			JLabel label2 = new JLabel("nama= "+nama);
			JLabel label3 = new JLabel("jenis kelamin= "+jk);
			JLabel label4 = new JLabel("alamat= "+alamat);
			JLabel label5 = new JLabel("tmp lahir= "+tmp_lahir);
			JLabel label6 = new JLabel("tgl lahir= "+tgl_lahir);
			
			//Menentukan layout Frame
			frame.setLayout(null);
			
			//Memasukkan Label ke dalam Frame
			frame.add(label);
			frame.add(label2);
			frame.add(label3);
			frame.add(label4);
			frame.add(label5);
			frame.add(label6);
			//Menentukan posisi label di dalam Frame. Menentukan Width dan Height
			label.setBounds(20, 20, 150, 30);
			label2.setBounds(20, 40, 150, 30);
			label3.setBounds(20, 60, 150, 30);
			label4.setBounds(20, 80, 150, 30);
			label5.setBounds(20, 100, 150, 30);
			label6.setBounds(20, 120, 150, 30);
			
			//Mengaktifkan event agar ketika frame di close maka, program akan berhenti
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//[Optional] Untuk menonaktifkan button maximize di Frame
			frame.setResizable(false);
			
			//Aktifkan Visible Frame
			frame.setVisible(true);
		}
		return true;
	}
	
	public static void main (String[] args) {
		new TampilanAWT();
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}

package paneles;

import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.ListaCliente;

public class VPanelForm extends JPanel {

	private ArrayList<JLabel> labels;
	private ArrayList<JTextField> textFields;
	private ArrayList<JButton> buttons;
//	private ListaCliente TextformCliente;

	public VPanelForm(String TextformCliente) {
//		this.TextformCliente = TextformCliente;

		labels = new ArrayList<JLabel>();
		textFields = new ArrayList<JTextField>();
		crearPanelFormCliente(TextformCliente);

	}

	public VPanelForm(String textoBoton, int tamano) {
		buttons = new ArrayList<JButton>();
		crearPanelFormClienteBoton(textoBoton, tamano);

	}

	public void crearPanelFormClienteBoton(String textoBoton, int tamano) {
		// TODO Auto-generated method stub
		buttons.add(new JButton(textoBoton));
		add(buttons.get(buttons.size() - 1));

	}

	public void crearPanelFormCliente(String textformCliente2) {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());

		labels.add(new JLabel(textformCliente2));
		add(labels.get(labels.size() - 1));
		textFields.add(new JTextField(20));
		add(textFields.get(textFields.size() - 1));
	}

	public ArrayList<JLabel> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<JLabel> labels) {
		this.labels = labels;
	}

	public ArrayList<JTextField> getTextFields() {
		return textFields;
	}

	public void setTextFields(ArrayList<JTextField> textFields) {
		this.textFields = textFields;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

}

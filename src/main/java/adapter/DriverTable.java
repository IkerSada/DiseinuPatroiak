package adapter;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import businessLogic.BLFacade;
import businessLogic.BLFactory;
import domain.Driver;

public	class	DriverTable	extends	JFrame{	
	private	Driver	driver;	
	private	JTable	tabla;	

	public	DriverTable(Driver	driver){	
		super(driver.getIzena()+"’s	rides	");	
		this.setBounds(100,	100,	700,	200);	
		this.driver	=	driver;		
		DriverAdapter	adapt	=	new	DriverAdapter(driver);	
		tabla	=	new	JTable(adapt);	
		tabla.setPreferredScrollableViewportSize(new	Dimension(500,	70));	
		//Creamos	un	JscrollPane	y	le	agregamos	la	JTable	
		JScrollPane	scrollPane	=	new	JScrollPane(tabla);	
		//Agregamos	el	JScrollPane	al	contenedor	
		getContentPane().add(scrollPane,	BorderLayout.CENTER);		
	}

	public	static	void	main(String[]	args)	{	
		//		the	BL	is	local	
		String driverEmail = "driver1@gmail.com";

		boolean	isLocal	=	true;	
		BLFacade	blFacade	=	new	BLFactory().getBusinessLogicFactory(isLocal);	
		Driver	d=	(Driver) blFacade.erabiltzaileaBilatu(driverEmail);	
		DriverTable	dt=new	DriverTable(d);	
		dt.setVisible(true);	
	}	
}	

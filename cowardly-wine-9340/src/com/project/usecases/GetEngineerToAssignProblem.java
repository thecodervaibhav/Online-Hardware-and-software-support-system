package com.project.usecases;

import java.util.List;
import java.util.Scanner;
import com.project.bean.EngineerDTO;
import com.project.deo.EngineerDao;
import com.project.deo.EngineerDaoImpl;

public class GetEngineerToAssignProblem {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the proble name");
		String pname= sc.nextLine();

		
		EngineerDao dao = new EngineerDaoImpl();
		
		try {
			
			List<EngineerDTO> dtos=dao.getAlEnginnerAssignProblem(pname);
			
			dtos.forEach(dto -> System.out.println(dto));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
	}

}

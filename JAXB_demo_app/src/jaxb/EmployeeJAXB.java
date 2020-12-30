package jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class EmployeeJAXB {

	public void marshall() {

		try {
			Employee employee=new Employee("fa363585", "Faizan Akhtar", "Bareilly", 40000);
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Marshaller createMarshaller = jc.createMarshaller();
			createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			createMarshaller.marshal(employee, System.out);
			createMarshaller.marshal(employee, new File("src\\data\\Employee.xml"));
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	public void unmarshall() {
		try {
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Unmarshaller createUnmarshaller = jc.createUnmarshaller();
			Employee employee=(Employee)createUnmarshaller.unmarshal(new File("src\\data\\Employee.xml"));
			System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAddress()+" "+employee.getSalary());
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
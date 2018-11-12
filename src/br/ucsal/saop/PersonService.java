package br.ucsal.saop;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.ucsal.model.Person;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface PersonService {

	@WebMethod boolean addPerson(Person person);
	@WebMethod boolean deletePerson(int id);
	@WebMethod  Person getPerson(int id);
	@WebMethod  Person[] getAllPersons();
}

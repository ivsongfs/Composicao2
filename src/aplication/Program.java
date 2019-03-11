package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coment c1 = new Coment("Tenha uma boa viagem!");
		Coment c2 = new Coment("Wow, isso é incrível!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Viajando para Nova Zelândia",
				"Estou indo visistar esse pais maravilhoso!",
				12);
		p1.addComent(c1);
		p1.addComent(c2);
		
		Coment c3 = new Coment("Boa noite!");
		Coment c4 = new Coment("Que a força esteja com você");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Boa noite galera!",
				"Vejo vocês amanha!",
				5);
		p2.addComent(c3);
		p2.addComent(c4);
		
		System.out.println(p1);
		System.out.println("-----------");
		System.out.println(p2);
		
	}

}

package concrete;

import abstracts.GamerService;
import entities.Gamer;
import utils.EdevletGamerChecker;

public class GamerManager implements GamerService{

	@Override
	public void signIn(Gamer gamer) {
		if(EdevletGamerChecker.checkIfPerson(gamer)) {
			System.out.println("Gamer kaydedildi : "+gamer.getFirstName());
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer güncellendi : "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer silindi : "+gamer.getFirstName());
		
	}

}

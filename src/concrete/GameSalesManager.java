package concrete;

import abstracts.GameSalesService;
import entities.Campaign;
import entities.Sales;

public class GameSalesManager implements GameSalesService{

	@Override
	public void sellGame(Sales sales, Campaign cmpaign) {

		System.out.println(cmpaign.getCampaignId()+" kampanya id si ile "+sales.getSaleId()+" id'li satis gerceklestirildi.");
	}


}

package concrete;

import abstracts.GameCampaignService;
import entities.Campaign;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void addCampaign(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id'li kampanya eklendi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignId()+" id'li kampanya guncellendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignId()+" id'li kampanya siindi");
		
	}

}

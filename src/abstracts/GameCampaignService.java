package abstracts;

import entities.Campaign;

public interface GameCampaignService {
	
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);

}

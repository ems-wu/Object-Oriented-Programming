package lab2;

import cs015.labs.VideoLabSupport.SupportVideoPlayer;

public class VideoPlayer extends SupportVideoPlayer {

	CartoonNetworkProvider notAVariable = new CartoonNetworkProvider();

	private CartoonNetworkProvider _networkProvider;

	private Nature _nature;

	private Twitch _twitch;

	public VideoPlayer() {
		_networkProvider = new CartoonNetworkProvider();

		_twitch = new Twitch();

		_nature = new Nature();

	}

	@Override
	public void addProvidersToVideoPlayer() {

		super.getChannelChooser().addProvider(_networkProvider);

		super.getChannelChooser().addProvider(_twitch);

		super.getChannelChooser().addProvider(_nature);

	}

}

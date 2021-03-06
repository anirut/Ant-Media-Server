package io.antmedia.webrtc.api;


public interface IWebRTCMuxer extends IStreamInfo {
	

	
	public void setWebRTCAdaptor(IWebRTCAdaptor webRTCAdaptor);
	
	/**
	 * Register to WebRTC Adaptor
	 */
	public void registerToAdaptor();
	
	
	public String getStreamId();
	
	
	/**
	 * Register new WebRTCClient to send video data
	 * First packet to send should be video conf data
	 * @param webRTCClient
	 */
	public void registerWebRTCClient(IWebRTCClient webRTCClient);
	
	
	/**
	 * Deregisters WebRTCClient from its list and does not send any
	 * video or audio packet to this WebRTCClient
	 * @param webRTCClient
	 */
	public boolean deregisterWebRTCClient(IWebRTCClient webRTCClient);
	
	
	/**
	 * Send video packet to WebRTCClients
	 * @param videoPacket
	 * @param isKeyFrame
	 */
	public void sendVideoPacket(byte[] videoPacket, boolean isKeyFrame, long timestamp);
	
	
	/**
	 * Send audio packet to WebRTCClients
	 * @param audioPacket
	 */
	public void sendAudioPacket(byte[] audioPacket, long timestamp);
	
	
	public boolean contains(IWebRTCClient webRTCClient);
	
	

}

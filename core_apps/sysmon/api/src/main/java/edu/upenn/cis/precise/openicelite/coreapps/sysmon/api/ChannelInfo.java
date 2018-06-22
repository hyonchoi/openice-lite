package edu.upenn.cis.precise.openicelite.coreapps.sysmon.api;

/**
 * A class that holds information about a channel
 *
 * @author Hyun Jung (hyju@seas.upenn.edu)
 */
public class ChannelInfo extends Info {
	
	public static final String[] required =
            {
                    "name", "connection_details_name", "recv_rate", "send_rate",
                    "message_stats_deliver_get_details_rate",
                    "message_stats_publish_details_rate", "ssl"
            };
	
	public ChannelInfo() {
		super();
	}
	
	@Override
	public String[] requiredFields() {
		return required;
	}
}

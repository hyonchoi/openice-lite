package edu.upenn.cis.precise.openicelite.coreapps.sysmon.api;

import java.util.List;

/**
 * A listener interface for receiving periodic data
 *
 * @author Hyun Jung (hyju@seas.upenn.edu)
 */
public interface DataListener extends Listener {
	void handleData(List<Info> data);
}

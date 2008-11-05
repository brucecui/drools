package org.drools.process.instance;

import java.util.Set;

/**
 *
 * @author <a href="mailto:kris_verlaenen@hotmail.com">Kris Verlaenen</a>
 */
public interface InternalWorkItemManager extends WorkItemManager {

	void internalExecuteWorkItem(WorkItem workItem);
	
	void internalAddWorkItem(WorkItem workItem);
	
    void internalAbortWorkItem(long id);
    
	Set<WorkItem> getWorkItems();
	
	WorkItem getWorkItem(long id);

}
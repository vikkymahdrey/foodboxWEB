package com.team.foodybox.services;

import java.util.List;

import com.team.foodybox.domain.Viewer;

public interface AdminService {

	Viewer save(Viewer viewer) throws Exception;

	String getMessageTemplate(Viewer viewers) throws Exception;

	List<Viewer> getViewer()throws Exception;

	String getVisitorCount()throws Exception;

}

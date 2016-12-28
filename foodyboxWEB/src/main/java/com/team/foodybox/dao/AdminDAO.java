package com.team.foodybox.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.team.foodybox.domain.Viewer;

public interface AdminDAO extends JpaRepository<Viewer, Integer> {

	@Query("FROM Viewer")
	List<Viewer> getViewer() throws Exception;

	@Query("select count(v.id) FROM Viewer v")
	Object getVisitorCount();

}

package com.RuleEngine.service;

import java.util.ArrayList;
import java.util.List;

import com.RuleEngine.model.sm_links;

public interface Sm_linksService {
	public void getSm_links(ArrayList<String> linksArea);
	public List<sm_links> getChosenSm_Links();
	public void setChosenSm_linkId(Integer chosenSm_linkId);
}
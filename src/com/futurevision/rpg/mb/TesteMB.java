package com.futurevision.rpg.mb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.futurevision.rpg.bo.CampaignBO;
import com.futurevision.rpg.bo.inter.CampaignBOI;

@ManagedBean
@RequestScoped
public class TesteMB {

	@EJB
	private CampaignBOI campaignBO;
	private String descricao;

	@PostConstruct
	public void init() {
		descricao = campaignBO.getAllCampaign().get(0).getDescription();

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

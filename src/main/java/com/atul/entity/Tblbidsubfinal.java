package com.atul.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the tblbidsubfinal database table.
 * 
 */
@Entity
@NamedQuery(name="Tblbidsubfinal.findAll", query="SELECT t FROM Tblbidsubfinal t")
public class Tblbidsubfinal implements Serializable {

	/**
	 * 
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 7065036053739673680L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bidsubfinalid;

	private String bidderid;

	private String finalcomment;

	private String finalstatus;

	private Integer tenderid;
	
	private Date hashDate;
	public Date getHashDate() {
		return hashDate;
	}

	public void setHashDate(Date hashDate) {
		this.hashDate = hashDate;
	}

	private String remoteid;
	
	private String dfhash;
	private String dfsign;
	
	public String getDfhash() {
		return dfhash;
	}

	public void setDfhash(String dfhash) {
		this.dfhash = dfhash;
	}

	public String getDfsign() {
		return dfsign;
	}

	public void setDfsign(String dfsign) {
		this.dfsign = dfsign;
	}

	public String getRemoteid() {
		return remoteid;
	}

	public void setRemoteid(String remoteid) {
		this.remoteid = remoteid;
	}

	public Date getIndate() {
		return indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}

	private Date indate;

	public Tblbidsubfinal() {
	}

	public Integer getBidsubfinalid() {
		return this.bidsubfinalid;
	}

	public void setBidsubfinalid(Integer bidsubfinalid) {
		this.bidsubfinalid = bidsubfinalid;
	}

	public String getBidderid() {
		return this.bidderid;
	}

	public void setBidderid(String bidderid) {
		this.bidderid = bidderid;
	}

	public String getFinalcomment() {
		return this.finalcomment;
	}

	public void setFinalcomment(String finalcomment) {
		this.finalcomment = finalcomment;
	}

	public String getFinalstatus() {
		return this.finalstatus;
	}

	public void setFinalstatus(String finalstatus) {
		this.finalstatus = finalstatus;
	}

	public Integer getTenderid() {
		return this.tenderid;
	}

	public void setTenderid(Integer tenderid) {
		this.tenderid = tenderid;
	}

}
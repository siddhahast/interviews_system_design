package com.shared.client;

public class Anchor {

	private String sourceId;
	private AnchorSourceType anchorSourceType;
	
	private static String delimValue = "-";
	
	public Anchor(String sourceId, AnchorSourceType anchorSourceType){
		this.sourceId = sourceId;
		this.anchorSourceType = anchorSourceType;
	}
	
	public String getSourceId(){
		return sourceId;
	}
	
	public AnchorSourceType getAnchorSourceType(){
		return anchorSourceType;
	}
	
	public String getSourceId(Anchor anchor){
		return anchor.getSourceId();
	}
	
	public String getSourceId(String anchorDelimValue){
		return anchorDelimValue.split(delimValue)[1];
	}
	
	public AnchorSourceType getAnchorSourceType(String anchorDelimValue){
		return null;
	}
}

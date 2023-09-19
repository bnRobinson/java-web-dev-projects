package org.launchcode;

public abstract class SpinDisc {
    private String spinDirection;
    private Double spinSpeed;
    private String mediaData;
    private String mediaName;
    private Double mediaLength;
    private Double mediaReleaseDate;


    public void spinDisc(String spinDirection, Double spinSpeed){
        System.out.println("Spin to the"+ spinDirection+ "at "+ spinSpeed +"rotations a second");
    };
    public void storeData(String mediaData){
        System.out.println("Data stored Successfully: " + mediaData);
    };
    public void infoReport(String mediaName, Double mediaLength, Double mediaReleaseDate ){
        System.out.println("Information Report: " +
                "Name: "+ mediaName + "Length: "+mediaLength+ "Release Date: "+ mediaReleaseDate);
    };
    public void playMedia(){

    };
}

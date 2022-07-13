package Interface;

import com.sun.security.jgss.GSSUtil;

public class Xiamo implements Phone{

    private int volume;
    private boolean isPowerOn;



    public Xiamo(){
        //  set volume awal
        this.volume= 50;


    }

    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat datang di Xiamo");
        System.out.println("Android version 29");

    }

    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }


    @Override
    public void volumeUp(){
        if(isPowerOn){
            if (this.volume == Max_Volume){
                System.out.println("Volume Full!!");
                System.out.println("sudah" + this.getVolume() + "%");
            } else{

                this.volume += 10;
                System.out.println("Volume sekarang" + this.getVolume());
            }
        }else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == Min_Volume) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }






}

package edu.java.inheritance01;

public class BasicTv {
    // field(속성)
    private boolean powerOn;
    private int channel;
    private int volume;

    // constructor(생성자): default

    // method(메서드)
    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * powerOnOff. TV의 전원을 켜거나 끄는 메서드. TV의 현재 전원이 off이면 on으로, on이면 off로 변경
     * 
     * @return 전원 on 이면 true, off 이면 flase를 리턴.
     */
    public boolean powerOnOff() {
        if (powerOn) {
            powerOn = false;
            System.out.println("꺼짐");
        } else  {
            powerOn = true;
            System.out.println("켜짐");
        }
        return powerOn;

    }

}

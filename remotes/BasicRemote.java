/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotes;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class BasicRemote implements Remote{
    protected Device device;
    
    public BasicRemote(){
        
    }
    
    public BasicRemote(Device device){
        this.device=device;
    }
    
    @Override
    public void power(){
        System.out.println("Remote: power toggle");
        if(device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }
    
    @Override
    public void volumeDown(){
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume()-10);
    }
    
        @Override
    public void volumeUp(){
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume()+10);
    }
    
        @Override
    public void channelDown(){
        System.out.println("Remote: channel down");
        device.setVolume(device.getChannel()-1);
    }
    
            @Override
    public void channelUp(){
        System.out.println("Remote: channel up");
        device.setVolume(device.getChannel()+1);
    }

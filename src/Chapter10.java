package example.com;
import javax.sound.midi.*;
public class BitBox {
 
public void play()
{
try {
  Sequencer sequencer = MidiSystem.getSequencer();
  
  System.out.println("Got it");
  } catch(MidiUnavailableException ex){
  System.out.println("Bummer");
  }}
  
  


  public static void main(String[] args) {
BitBox mt = new BitBox();
mt.play();
  }

}

package Gdish.G005.g01.executors.disrupter.generate2;

import Gdish.G005.g01.executors.disrupter.generate1.Trade;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

public class Handler5 implements EventHandler<Trade>,WorkHandler<Trade> {
	  
    @Override  
    public void onEvent(Trade event, long sequence, boolean endOfBatch) throws Exception {  
        this.onEvent(event);  
    }  
  
    @Override  
    public void onEvent(Trade event) throws Exception {  
    	System.out.println("handler5: get price : " + event.getPrice());
    	event.setPrice(event.getPrice() + 3.0);
    }  
}  
package TH_Singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Singleton {
    private Singleton instance;
    private Singleton(){

    }
    public Singleton getInstance(){
        if(this.instance==null){
            this.instance = new Singleton();
        }
        return this.instance;
    }
}

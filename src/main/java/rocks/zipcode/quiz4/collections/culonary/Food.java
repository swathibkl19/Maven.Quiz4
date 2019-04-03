package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> list = new ArrayList<>();

    public List<Spice> getAllSpices() {

        return list;
    }
   // public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
       public  Map<Class<? extends Spice>, Integer> getSpiceCount (){
        Map<Class<? extends  Spice>, Integer> map = new HashMap<>();
        for(Spice spice :list){
            map.put(spice.getClass() , Collections.frequency(list,spice));
        }

        return map;
    }



    public void applySpice(Spice spice) {

        list.add(spice);
    }



}

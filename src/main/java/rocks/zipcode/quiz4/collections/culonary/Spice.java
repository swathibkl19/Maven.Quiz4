package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public abstract class Spice {

    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}

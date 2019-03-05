
package model;

import java.util.List;


public class PokemonList {
    
    private int count;
    private String next;
    private String previous;
    private List<Pokis> results;

    public PokemonList() {
    }

    public PokemonList(int count, String next, String previous, List<Pokis> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokis> getResults() {
        return results;
    }

    public void setResults(List<Pokis> results) {
        this.results = results;
    }
    
    
    
}

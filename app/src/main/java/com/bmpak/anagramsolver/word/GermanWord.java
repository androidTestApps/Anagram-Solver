package com.bmpak.anagramsolver.word;

import io.realm.RealmObject;

/**
 * Created by charbgr on 10/1/14.
 */
public class GermanWord extends RealmObject {

    private String word;
    private String wordAnagrammized;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordAnagrammized() {
        return wordAnagrammized;
    }

    public void setWordAnagrammized(String wordAnagrammized) {
        this.wordAnagrammized = wordAnagrammized;
    }
}

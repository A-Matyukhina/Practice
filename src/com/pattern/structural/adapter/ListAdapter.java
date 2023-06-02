package com.pattern.structural.adapter;
//Чтобы можно было объекты с таким же типом данных исползовать, то есть альфалист испольщовать в методах беталиста
public class ListAdapter implements BetaList {
    private AlphaList alphaList;

    public ListAdapter(AlphaList alphaList) {
        this.alphaList = alphaList;
    }

    @Override
    public void addValue(int indx) {
        alphaList.add(indx);
    }

    @Override
    public void getValue(int indx) {
        alphaList.get(indx);
    }

    @Override
    public void removeValue(int indx) {
        alphaList.remove(indx);
    }
}

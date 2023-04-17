package model;

public abstract class Peca {
    private final int MIN_HORITZONTAL = 0;
    private final int MAX_HORITZONTAL = 7;
    private final int MIN_VERTICAL = 0;
    private final int MAX_VERTICAL = 7;

    private int actualHoritzontal;
    private int actualVertical;

    public boolean moviment(int DestiHoritzontal, int DestiVertical) {

        boolean limitMaxHoritzontal = DestiHoritzontal <= MAX_HORITZONTAL;
        boolean limitMinHoritzontal = DestiHoritzontal <= MIN_HORITZONTAL;
        boolean limitHoritzontal = limitMaxHoritzontal && limitMinHoritzontal;

        boolean limitMaxVertical = DestiVertical <= MAX_VERTICAL;
        boolean limitMinVertical = DestiVertical <= MIN_VERTICAL;
        boolean limitVertical = limitMaxVertical && limitMinVertical;

        boolean limit = limitHoritzontal && limitVertical;

        boolean validHoritzontal = Math.abs(DestiHoritzontal - this.actualHoritzontal) <= MAX_MOVIMENTS_HORITZONTAL;
        boolean validVertical = Math.abs(DestiVertical - this.actualVertical) <= MAX_MOVIMENTS_VERTICAL;

        boolean valid = validVertical && validHoritzontal;

        return limit && valid; //caso llevado al extremo
    }
}

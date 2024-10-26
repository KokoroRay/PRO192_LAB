/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCala implements ICala {
    private List<Cala> calaList;

    public MyCala() {
        this.calaList = new ArrayList<>();
    }

    public void addCala(Cala cala) {
        this.calaList.add(cala);
    }

    @Override
    public int f1(Cala a) {
        int count = 0;
        for (Cala c : calaList) {
            if (c.getOwner().length() >= 3 && Character.isDigit(c.getOwner().charAt(2))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int f2(Cala a) {
        if (calaList.isEmpty())
            return 0;

        Cala maxPriceCala = Collections.max(calaList, Comparator.comparingInt(Cala::getPrice));
        int count = 0;
        for (int i = 0; i < calaList.size(); i++) {
            if (calaList.get(i).getPrice() == maxPriceCala.getPrice()) {
                count++;
                if (count == 2) {
                    calaList.remove(i);
                    break;
                }
            }
        }
        return count;
    }

    @Override
    public int f3(Cala a) {
        calaList.sort(Comparator.comparing(c -> c.getOwner().charAt(1)));
        return calaList.size();
    }

    public String printData() {
        if (calaList.isEmpty()) {
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        for (Cala c : calaList) {
            sb.append(c.printData()).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2); 
        }
        return sb.toString();
    }
}
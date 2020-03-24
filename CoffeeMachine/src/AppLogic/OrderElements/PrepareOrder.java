package AppLogic.OrderElements;

import AppLogic.Beverages.eBeverageType;

public class PrepareOrder {
    public eBeverageType beverageType;
    public boolean addMilk;
    public int spoonsOfSugar;
    public eCupSize cupSize;

    public PrepareOrder (eBeverageType i_BeverageType,
                         boolean i_AddMilk,
                         int i_SpoonsOfSugar,
                         eCupSize i_CupSize) {
        this.beverageType = i_BeverageType;
        this.addMilk = i_AddMilk;
        this.spoonsOfSugar = i_SpoonsOfSugar;
        this.cupSize = i_CupSize;
    }
}

package _2_商场促销_策略模式;

public class CashContext {
    private CashSuper cs ;

    CashContext(String type){
        switch(type){
            case "normal":
                cs = new CashNormal() ;
                break ;
            case "rebate":
                cs = new CashRebate(0.8) ; // 现在商场策略是打8折
                break ;
            case "return":
                cs = new CashReturn(300,100) ; // 现在商场策略是满300返100
                break ;
        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money) ;
    }
}

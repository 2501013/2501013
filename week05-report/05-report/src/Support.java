public class Support extends Customer {
    public Support(String name, String waterNo) {
        super(name, waterNo);
    }

    @Override
    public int fee() {

        int effectiveUsage = (usage > 100) ? usage - 100 : 0;
        double amount = 0;


        if (effectiveUsage > 0) {
            amount = effectiveUsage * 184.1;
        }

        return BASIC + (int)Math.round(amount);
    }

    @Override
    public String getMessage() {
        return "지원가구";
    }
}
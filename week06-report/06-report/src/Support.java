public class Support extends Customer {
    public Support(String name, String waterNo) {
        super(name, waterNo);
    }

    @Override
    public int fee() {
        int effectiveUsage = Math.max(0, usage - 100);
        double amount = effectiveUsage * 184.1;
        return BASIC + (int)Math.round(amount);
    }

    @Override
    public String getMessage() {
        return "지원가구";
    }
}
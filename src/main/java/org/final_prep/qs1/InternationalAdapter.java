package org.final_prep.qs1;

public class InternationalAdapter implements Command{
    InternationalSalesService internationalSalesService;

    public InternationalAdapter(InternationalSalesService internationalPlaceOrder) {
        this.internationalSalesService = internationalPlaceOrder;
    }
    @Override
    public void execute() {
        internationalSalesService.internationalPlaceOrder();
    }
}

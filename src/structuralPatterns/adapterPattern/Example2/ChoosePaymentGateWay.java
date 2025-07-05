package structuralPatterns.adapterPattern.Example2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChoosePaymentGateWay {

    public static void main(String[] args) {
        System.out.println(processPayment(5000, "Gpay"));
        System.out.println(processPayment(5000, "Phonepay"));
        System.out.println(processPayment(5000, "Razorpay"));
        System.out.println(processPayment(5000, "abc"));
    }

    public static String processPayment(double amount, String gateWay) {
        Map<String, PaymentProcess> paymentProcessMap = mapPaymentGateways(availablePaymentGateways());

        String key = gateWay + "Adapter";
        PaymentProcess processor = paymentProcessMap.get(key);

        if (processor == null) {
            return "Payment gateway '" + gateWay + "' not supported.";
        }

        return processor.makePayment(amount);
    }

    public static Map<String, PaymentProcess> mapPaymentGateways(List<PaymentProcess> paymentProcesses) {
        return paymentProcesses.stream()
                .collect(Collectors.toMap(p -> p.getClass().getSimpleName(), Function.identity()));
    }

    public static List<PaymentProcess> availablePaymentGateways() {
        return Arrays.asList(new GpayAdapter(), new PhonepayAdapter(), new RazorpayAdapter());
    }
}


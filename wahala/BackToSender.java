public class BackToSender {

    public int calculateAllowance(int numberOfSuccessfulDeliveries) {

        int totalDailyPackages = 100;
        int amountPerParcelBelowFiftyPercent = 160;
        int amountPerParcelBetweenFiftyAndFiftyNinePercent = 200;
        int amountPerParcelBetweenSixtyAndSixtyNinePercent = 250;
        int amountPerParcelAboveSeventyPercent = 500;
        int basePay = 5000;
        int result = 0;

        if(numberOfSuccessfulDeliveries % totalDailyPackages < 50) {
            result = amountPerParcelBelowFiftyPercent * numberOfSuccessfulDeliveries + basePay;
        } 

        else if(numberOfSuccessfulDeliveries % totalDailyPackages >= 50 && numberOfSuccessfulDeliveries % totalDailyPackages <= 59) {
            result = amountPerParcelBetweenFiftyAndFiftyNinePercent * numberOfSuccessfulDeliveries + basePay;
        }

        else if(numberOfSuccessfulDeliveries % totalDailyPackages >= 60 && numberOfSuccessfulDeliveries % totalDailyPackages <= 69) {
            result = amountPerParcelBetweenSixtyAndSixtyNinePercent * numberOfSuccessfulDeliveries + basePay;
        }

        else {
            result = amountPerParcelAboveSeventyPercent * numberOfSuccessfulDeliveries + basePay;
        }

        return result;
      
    }

}

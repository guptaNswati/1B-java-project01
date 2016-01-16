/**
 *  Tests the CellularData class by reading in one dimensional arrays of countries.
 *  Given a country name and a range of years, computes the total number of subscriptions
 *  during that period.
 *
 *  @author Foothill College, [Swati Gupta]
 */
public class TestCellularData 
{
    public static void main(String[] args) 
    {
        System.out.println("Part 1 with Partial Data:");
        System.out.println("==============================================================================");
               
        final double[] canadaPartial = {0,0,0.046433382,0.229211886,0.370663166,0.752880479,1.264765577};
        final double[] mexicoPartial = {0,0,0,0,0,0.001815204,0.010079818};
        final double[] usaPartial = {0,0.038253436,0.140659444,0.279060364,0.498659917,0.829863407,1.39281703};
        
        final double[] finlandPartial = {0.870065829,1.065948629,1.37976292,1.733284322,2.144104654,2.790048075,3.82527312};
        final double[] japanPartial = {0.022941813,0.033852133,0.051504866,0.078913191,0.124583309,0.200018213,0.401833216};

        int startingYear = 1983;

        CellularData datatable;
        int numRows = 5; 
        int numColumns = canadaPartial.length;

        datatable = new CellularData(numRows, numColumns, startingYear);

        datatable.addCountry("canada", canadaPartial);
        datatable.addCountry("mexico", mexicoPartial);
        datatable.addCountry("usa", usaPartial);
        datatable.addCountry("finland", finlandPartial);
        datatable.addCountry("japan", japanPartial);

        // print table with country name and their data
        datatable.printTableData();
        System.out.println();

        double totalSubscriptions;

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("japan",1983,1989);
        System.out.printf("japan (1983 to 1989): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("finland",1959, 2000);
        System.out.printf("finland (1959 to 2000): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("usa",1983, 2002);
        System.out.printf("usa (1983 to 2002): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("canada",1990, 2000);
        System.out.printf("canada (1990 to 2000): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("mexico",1983, 1989);
        System.out.printf("mexico (1983 to 1989): %.2f \n \n", totalSubscriptions);


        // Part 2
        System.out.println("\n\nPart 2 with All Data:");
        System.out.println("==============================================================================");

        final double[] canada = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.046433382,0.229211886,0.370663166,0.752880479,1.264765577,2.110674786,2.769888481,3.621301434,4.648371087,6.435664704,8.840378661,11.82226558,14.04583637,17.73689555,22.72196984,28.42909462,34.36625958,37.94941948,42.07126881,47.06386648,52.75959279,57.49320536,61.47310755,66.20487722,70.54830532,75.676078,79.41215888,80.05046389};
        final double[] mexico = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.001815204,0.010079818,0.074266061,0.183067275,0.348322481,0.421293924,0.608553991,0.721767371,1.051320868,1.758956617,3.326889843,7.556565917,13.55289414,20.65462731,24.29476815,27.85371761,35.15321825,42.56115672,49.40875353,58.62729509,65.49948112,71.45817512,77.51826326,79.24118294,83.35070827};
        final double[] usa = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.038253436,0.140659444,0.279060364,0.498659917,0.829863407,1.39281703,2.075802366,2.939643902,4.249049037,6.103716586,9.104921407,12.6047249,16.23815248,20.14238484,24.89063952,30.57610298,38.46809105,44.69057874,48.85103822,54.84681409,62.54719598,68.31769507,76.29353842,82.06414479,85.20916517,88.62364611,91.31165202,94.71891668,95.44786574};

        final double[] finland = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.589014682,0.70201103,0.870065829,1.065948629,1.37976292,1.733284322,2.144104654,2.790048075,3.82527312,5.171190195,6.370787129,7.666908049,9.664672185,13.28153215,20.34240794,29.30153817,42.06724499,55.22721773,63.37991163,72.03009689,80.48036651,86.85667387,91.05950591,95.40312987,100.450445,107.6347185,114.8847345,128.424569,144.0887946,156.3055115,165.8909009,172.3224293};
        final double[] japan = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.011363484,0.016824553,0.022941813,0.033852133,0.051504866,0.078913191,0.124583309,0.200018213,0.401833216,0.710088407,1.123129273,1.390274425,1.723586246,3.490181339,9.408600615,21.56058437,30.59119313,37.76545041,45.30199511,53.12376978,59.39257273,64.25260095,68.48920048,72.15580043,75.98436507,78.51905384,84.35360774,86.70710553,91.31743648,96.80752449,104.2742326,110.9073543};

        startingYear = 1960;

        numRows = 5;
        numColumns = finland.length;

        datatable = new CellularData(numRows, numColumns, startingYear);

        datatable.addCountry("canada", canada);
        datatable.addCountry("mexico", mexico);
        datatable.addCountry("usa", usa);
        datatable.addCountry("finland", finland);
        datatable.addCountry("japan", japan);

        datatable.printTableData();
        System.out.println();

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("usa",1970,1989);
        System.out.printf("usa (1970 to 1989): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("japan",1959, 1989);
        System.out.printf("japan (1959 to 1989): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("mexico",1960,2000);
        System.out.printf("mexico (1960 to 2000): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("canada",1991, 2012);
        System.out.printf("canada (1991 to 2012): %.2f \n \n", totalSubscriptions);

        totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("finland",1988, 2015);
        System.out.printf("finland (1988 to 2015): %.2f \n \n", totalSubscriptions);
    }
}

public class ContactInfo {
    public String GetStreetName()
        {
            return "1 Medison Square";
        }
        public String GetCity()
        {
            return "NewYork";
        }
        public String GetState()
        {
            return "NY";
        }
        public String GetFullAddress()
        {
            String city = GetCity();//1
            String state = GetState();//2
            String streetName = GetStreetName();//3
            return streetName + ";" + city + ";" + state;
        }
}

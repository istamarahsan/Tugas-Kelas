public class User {
    private ContactInfo _contactInfo;
 
        User(ContactInfo contactInfo)
        {
            _contactInfo = contactInfo;
        }
        public String GetFullAddress(){
            return _contactInfo.GetFullAddress();
        }
}


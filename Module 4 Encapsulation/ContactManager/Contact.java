/**
 * This class discusses about the Contact Object.
 * The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 *
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class

class Contact {
    /**.
     * String name
     */
    private String name;
    /**.
     * String email
     */
    private String email;
    /**.
     * String phonenumber
     */
    private String phoneNumber;
    /**.
     * takes, name, email, num
     * @param n name
     * @param e email
     * @param p phine Number
     */
    Contact(final String n, final String e, final String p) {
        this.name = n;
        this.email = e;
        this.phoneNumber = p;
    }

    /**
      * @return name
      */
     public String getName() {
         return this.name;      //obj.getNme();
     }

     /**
      * @return email
      */
     public String getEmail() {
         return this.email;
     }

     /**
      * @return phone number
      */
     public String getPhoneNumber() {
         return this.phoneNumber;
     }

    //   "{ Name = Bob, Email = bob@gmail.com, Phone Number = 9999912345 }"

    public String toString() {
        return "{ Name = " + this.name + ", Email = " + this.email
                                + ", Phone Number = " + this.phoneNumber + " }";
    }

      /**.
       * setting a name
       * @param toSet meant for rename
       */
      public void setName(final String toSet) {
          this.name = toSet;
      }

      /**
       * @param toSet email
       */
      public void setEmail(final String toSet) {
          this.email = toSet;
      }

      /**
       * @param toSet phone Number
       */
      public void setPhoneNumber(final String toSet) {
          this.phoneNumber = toSet;
      }


}

class Show {
    String movie_name;
    String datetime;
    String[] seats;

    Show(String moviename, String datetime,String[] seats) {
        this.movie_name = moviename;
        this.datetime = datetime;
        this.seats = seats;
    }

    public String getMovieName() {
        return this.movie_name;
    }

    public String getDateTime() {
        return this.datetime;
    }

    public String[] getSeats() {
        return this.seats;
    }
    
    public String toString(){
		String t = this.movie_name +" : "+ this.datetime+"\n"+"Available seats:-";
		for(int i = 0; i < seats.length;i++){
			if(seats[i] != null){
				t += seats[i] + " ";
			}
		}
		return t;
    }
    
    public void printTickets(Patron p) {
        if (p.ticket != "") {
            System.out.println("Movie name: " + movie_name + ": Date: " + datetime);
            System.out.println("Patron name: " + p.Pname + ": Patron mobile no. : " + p.Pnumber +
                    " \n Confirmed Seat numbers: " + p.ticket);
        }
        else {
            System.out.println("Booking failed!");
        }
    }

    public void bookAShow(Patron p, String[] bkdSeats){
        String ticket = "";
        if (seats.length < bkdSeats.length) {
            System.out.println("No seats available.");
        }
		for (int i = 0; i < seats.length;i++){
			for (int j = 0; j < bkdSeats.length;j++){
                if (seats[i] != null) {
                    if (seats[i].equals(bkdSeats[j])) {
                        ticket += seats[i] + " ";
                        seats[i] = null;
                    }
                }
			}
        }
        p.setTicket(ticket);
    }
}
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
        // System.out.println("Movie name: " + movie_name + 
        //             " \n Date: " + datetime);
        // System.out.println("Patron name: " + p.Pname + 
        //             " \n Patron mobile no. : " + p.Pnumber +
        //             " \n Seat numbers: " + p.ticket);
    }

    public void bookAShow(Patron p, String[] bkdSeats){
        String ticket = "";
        int c = 0;
		for (int i = 0; i < seats.length;i++){
			for (int j = 0; j < bkdSeats.length;j++){
				// System.out.println(seats[i]);

                // if (bkdSeats.length < seats.length) {
                //     if (seats[i] != null) {
                //         ticket += seats[i] + " ";
                //         seats[i] = null;
                //     }
                // }

                if (seats[i] != null) {
                    if (seats[i].equals(bkdSeats[j])) {
                        ticket += seats[i] + " ";
                        seats[i] = null;
                    }
                }
                else {
                    c += 1;
                }

				// if(seats[i] != null && seats[i].equals(bkdSeats[j])){
				// 	ticket += seats[i] +" ";
				// 	seats[i] = null;
                // }
			}
        }
        p.setTicket(ticket);
	}
}
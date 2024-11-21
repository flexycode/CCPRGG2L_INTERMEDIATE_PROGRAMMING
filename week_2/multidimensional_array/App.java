public class App {
    public static void main(String[] args) throws Exception {

        String[][] seatReservation = {
            { "Available", "Available", "Available", "Available", "Available", "Available", "Available" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Available", "Available", "Available", "Available", "Available", "Selected", "Selected" }
        };

        // Access element that is selected
        System.out.println(seatReservation[6][5]);

        // Access element that is selected
        System.out.println(seatReservation[6][6]);
        
        // 2x1 Array
        String[][] array2x1 = { { "X" }, { "O" } };

        // 2x2 Array
        String[][] array2x2 = { { "X", "O" }, { "O", "X" } };

        // 2x3 Array
        String[][] array2x3 = { { "X", "O", "X" }, { "O", "X", "O" } };

        // 3x3 Array
        String[][] array3x3 = { { "X", "O", "X" }, { "O", "X", "O" }, { "X", "O", "X" } };
    }
}

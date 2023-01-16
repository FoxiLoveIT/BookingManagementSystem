/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeatAssigner;

import java.util.Random;

/**
 *
 * @author bzach
 */
    public class SeatAssigner {

        public static String[] BUSINESS = {"1A", "1B", "1E", "1F", "2A", "2B", "2E", "2F", "3A", "3B", "3E", "3F", "4A", "4B", "4E", "4F", "5A", "5B", "5E", "5F"};
        public static String[] EconomyPlus = {"7A", "7B", "7C", "7D", "7E", "7F", "8A", "8B", "8C", "8D", "8E", "8F", "9A", "9B", "9C", "9D", "9E", "9F", "10A", "10B", "10C", "10D", "10E", "10F", "11A", "11B", "11C", "11D", "11E", "11F", "12A", "12B", "12C", "20A", "20B", "20C", "20D", "20E", "20F", "21A", "21B", "21C", "21D", "21E", "21F"};
        public static String[] ECONOMY = {"12D", "12E", "12F", "14A", "14B", "14C", "14D", "14E", "14F", "15A", "15B", "15C", "15D", "15E", "15F", "22A", "22B", "22C", "22D", "22E", "22F"};

        public static String assignSeat(String seatClass) {

            String assignedSeat = "";
            if (seatClass.equalsIgnoreCase("business")) {
                if (BUSINESS.length > 0) {
                    Random rand = new Random();
                    int randomIndex = rand.nextInt(BUSINESS.length);
                    assignedSeat = BUSINESS[randomIndex];
                    BUSINESS = removeElement(BUSINESS, randomIndex);
                    return assignedSeat;
                } else {
                    return "No seats available";
                }

            } else if (seatClass.equalsIgnoreCase("economyPlus")) {
                if (EconomyPlus.length > 0) {
                    Random rand = new Random();
                    int randomIndex = rand.nextInt(EconomyPlus.length);
                    assignedSeat = EconomyPlus[randomIndex];
                    EconomyPlus = removeElement(EconomyPlus, randomIndex);
                    return assignedSeat;
                } else {
                    return "No seats available";
                }
            } else if (seatClass.equalsIgnoreCase("economy")) {
                if (ECONOMY.length > 0) {
                    Random rand = new Random();
                    int randomIndex = rand.nextInt(ECONOMY.length);
                    assignedSeat = ECONOMY[randomIndex];
                    ECONOMY = removeElement(ECONOMY, randomIndex);
                    return assignedSeat;
                } else {
                    return "No seats available";
                }
            } else {
                assignedSeat = "Invalid class";
            }
            return assignedSeat;

        }

        public static String[] removeElement(String[] array, int index) {
            String[] newArray = new String[array.length - 1];
            for (int i = 0, k = 0; i < array.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[k++] = array[i];
            }
            return newArray;
        }

        public static void addSeat(String classType, String seatNumber) {
            if (classType.equalsIgnoreCase("business")) {
                BUSINESS = addElement(BUSINESS, seatNumber);
            } else if (classType.equalsIgnoreCase("economyPlus")) {
                EconomyPlus = addElement(EconomyPlus, seatNumber);
            } else if (classType.equalsIgnoreCase("economy")) {
                ECONOMY = addElement(ECONOMY, seatNumber);
            }
        }

        public static String[] addElement(String[] array, String seat) {
            String[] newArray = new String[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = seat;
            return newArray;
        }

    }

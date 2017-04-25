package com.rethink.charactermaker.enums;

import java.util.Random;

/**
 * Created by Beast on 4/25/2017.
 */

public class Names {
    private String[] MaleDwarfNames = {
            "Adrik",
            "Alberich",
            "Baern",
            "Barendd",
            "Brottor",
            "Bruenor",
            "Dain",
            "Darrak",
            "Delg",
            "Eberk",
            "Kildrak",
            "Fargrim",
            "Einkil",
            "Flint",
            "Gardain",
            "Harbek",
            "Morgran",
            "Orsik",
            "Oskar",
            "Rangrim",
            "Rurik",
            "Taklinn",
            "Thoradin",
            "Thorin",
            "Tordek",
            "Traubon",
            "Travok",
            "Ulfgar",
            "Veit",
            "Vondal"
    };
    private String[] FemaleDwarfNames = {
            "Amber",
            "Artin",
            "Audhild",
            "Bardryn",
            "Dagnal",
            "Diesa",
            "Eldeth",
            "Falkrunn",
            "Finellen",
            "Gunnloda",
            "Gurdis",
            "Helja",
            "Hlin",
            "Kathra",
            "Kristryd",
            "Ilde",
            "Liftrasa",
            "Mardred",
            "Riswynn",
            "Sannl",
            "Torbera",
            "Torgga",
            "Vistra"
    };

    public String getRandomName(Race race, Gender gender) {
        switch (race) {
            case DWARF:
                switch (gender) {
                    case MALE:
                        return MaleDwarfNames[new Random().nextInt(MaleDwarfNames.length)];
                    case FEMALE:
                        return FemaleDwarfNames[new Random().nextInt(FemaleDwarfNames.length)];
                    default:
                        return "Dwarf Bob";
                }
            default:
                return "Bob";
        }
    }
}

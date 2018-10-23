import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> protein = new ArrayList<>();

        for (String codon: getCodons(rnaSequence)) {
            switch (codon) {
                case "AUG":
                    protein.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    protein.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    protein.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    protein.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    protein.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    protein.add("Cysteine");
                    break;
                case "UGG":
                    protein.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    return protein;
            }
        }

        return protein;
    }

    private String[] getCodons(String rnaSequence) {
        return rnaSequence.split("(?<=\\G...)");
    }
}
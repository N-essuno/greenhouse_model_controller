package no.uio;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * Model controller script.
 * The main reads the asset model and waits for user input.
 * The user input is then parsed and the corresponding action is executed.
 * Possible actions are:
 * - Add a new asset
 * - Remove an existing asset
 * - Update an existing asset
 * - List all assets
 * - List all assets of a specific type
 */
public class Main {
    public static void main(String[] args) {
        // read asset model into Jena model
        Model model = ModelFactory.createDefaultModel();
        model.read("asset_model.ttl");
        // check if model is read correctly
        model.write(System.out, "TURTLE");
    }
}
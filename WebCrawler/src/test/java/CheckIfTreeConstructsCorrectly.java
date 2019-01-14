import EndPoint.Resource;
import Tree.Tree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckIfTreeConstructsCorrectly {
    @Test
    public void checkIfTreeConstrcutsCorrectlyWithGivenParameters(){
        Tree t = new Tree("www.google.ro");
        t.CreateMusicNode("www.music.com");
        t.AddMusic("Titlu","Categorie","Gen","Format","An","Artist","www.music.com");
        assertEquals("Titlu", t.listNodes.get(1).getTitle());
        assertEquals("Categorie", t.listNodes.get(1).getCategory());
        assertEquals("Gen", t.listNodes.get(1).getGenre());
        assertEquals("Format", t.listNodes.get(1).getFormat());
        assertEquals("An", t.listNodes.get(1).getYear());
        assertEquals("Artist", t.listNodes.get(1).getArtist());
        assertEquals("www.music.com", t.listNodes.get(1).getUrl());
    }
}

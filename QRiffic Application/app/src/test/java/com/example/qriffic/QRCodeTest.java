package com.example.qriffic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * Test suite for QRCode class
 */
public class QRCodeTest {

    private QRCode mockQRCode() {

        return new QRCode("uyhpOIUYHPDFnklmd;sajfonui893",
                new GeoLocation(53.1234, 12.5623, "Edmonton"), "Ash", null, null);
    }

    @Test
    void testGetters() {

        QRCode mockQRCode = mockQRCode();

        assertEquals(53.1234, mockQRCode.getGeoLocation().getLongitude());
        assertNotEquals(12.3456, mockQRCode.getGeoLocation().getLongitude());

        assertEquals(12.5623, mockQRCode.getGeoLocation().getLatitude());
        assertNotEquals(12.3456, mockQRCode.getGeoLocation().getLatitude());

        assertEquals("Edmonton", mockQRCode.getGeoLocation().getCity());
        assertNotEquals("Calgary", mockQRCode.getGeoLocation().getCity());

        assertEquals(16088668, mockQRCode.getScore());
        assertNotEquals(16000000, mockQRCode.getScore());

        assertEquals("Ash", mockQRCode.getUsername());
        assertNotEquals("Ash Ketchum", mockQRCode.getUsername());

        // SHA256 output generated by https://emn178.github.io/online-tools/sha256.html
        assertEquals("c914133b717c126ecafc5b9b8bd529bcad06d064edc073906a6b83b58bf57e5c",
                mockQRCode.getIdHash());
        assertNotEquals("c914133b717c126ecafc5b9b8bd529bcad06d064edc073906a6b83b58bf57a5c",
                mockQRCode.getIdHash());

        assertEquals("Grand Purple Garrett's Miteergur", mockQRCode.getName());
        assertNotEquals("NAMED MONSTER", mockQRCode.getName());
    }

    @Test
    void testCompareTo() {

        QRCode mockQRCode = mockQRCode();

        assertEquals(0, mockQRCode.compareTo(new QRCode("uyhpOIUYHPDFnklmd;sajfonui893", null, "Ash", null, null)));
        assertNotEquals(0, mockQRCode.compareTo(new QRCode("ayhpOIUYHPDFnklmd;sajfonui893",null,  "Ash", null, null)));
    }
}

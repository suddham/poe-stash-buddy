package org.jusecase.poe.entities;

import org.jusecase.poe.plugins.ImageHashPlugin;

public class TestHash {
    public static String createHash(String content, int distanceToOriginal) {
        StringBuilder hash = new StringBuilder(content);
        for (int i = 0; i < distanceToOriginal; ++i) {
            hash.append('1');
        }
        for (int i = hash.length(); i < ImageHashPlugin.HASH_LENGTH; ++i) {
            hash.append('0');
        }
        return hash.toString();
    }

    public static String createHash(String content) {
        return createHash(content, 0);
    }
}

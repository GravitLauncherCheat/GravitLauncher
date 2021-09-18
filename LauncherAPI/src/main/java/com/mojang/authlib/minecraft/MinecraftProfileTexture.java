package com.mojang.authlib.minecraft;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public final class MinecraftProfileTexture {
    public enum Type {
        SKIN,
        CAPE,
        ELYTRA
    }

    public static final Set<Type> PROFILE_TEXTURE_TYPES = Collections.unmodifiableSet(EnumSet.allOf(Type.class));

    public static final int PROFILE_TEXTURE_COUNT = PROFILE_TEXTURE_TYPES.size();

    private static String baseName(String url) {
        String name = url.substring(url.lastIndexOf('/') + 1);

        // Remove index
        int extensionIndex = name.lastIndexOf('.');
        if (extensionIndex >= 0)
            name = name.substring(0, extensionIndex);

        // We're done
        return name;
    }

    // Instance
    private final String url;

    private final String hash;

    public MinecraftProfileTexture(String url) {
        this(url, baseName(url));
    }

    public MinecraftProfileTexture(String url, String hash) {
        this.url = url;
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public String getMetadata(String key) {
        return null;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return String.format("MinecraftProfileTexture{url='%s',hash=%s}", url, hash);
    }
}

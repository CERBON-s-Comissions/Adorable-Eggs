package com.cerbon.adorable_eggs.platform;

import com.cerbon.adorable_eggs.AdorableEggs;

import java.util.ServiceLoader;

public class Services {

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        AdorableEggs.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}

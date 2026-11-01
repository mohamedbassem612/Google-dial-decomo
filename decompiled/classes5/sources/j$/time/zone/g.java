package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g {
    public static final java.util.concurrent.CopyOnWriteArrayList b;
    public static final j$.util.concurrent.ConcurrentHashMap c;
    public static volatile java.util.Set d;
    public final java.util.Set a;

    static {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new j$.util.concurrent.ConcurrentHashMap(512, 0.75f, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.security.AccessController.doPrivileged(new j$.time.zone.f(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public g() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : java.util.TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = j$.util.DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.zone.ZoneRules a(java.lang.String str) {
        j$.util.Objects.requireNonNull(str, "zoneId");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = c;
        j$.time.zone.g gVar = (j$.time.zone.g) concurrentHashMap.get(str);
        if (gVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new j$.time.zone.e("No time-zone data files registered");
            }
            throw new j$.time.zone.e("Unknown time-zone ID: " + str);
        }
        if (gVar.a.contains(str)) {
            return new j$.time.zone.ZoneRules(java.util.TimeZone.getTimeZone(str));
        }
        throw new j$.time.zone.e("Not a built-in time zone: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(j$.time.zone.g gVar) {
        j$.util.Objects.requireNonNull(gVar, "provider");
        synchronized (j$.time.zone.g.class) {
            for (java.lang.String str : gVar.a) {
                j$.util.Objects.requireNonNull(str, "zoneId");
                if (((j$.time.zone.g) c.putIfAbsent(str, gVar)) != null) {
                    throw new j$.time.zone.e("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + java.lang.String.valueOf(gVar));
                }
            }
            d = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(c.keySet()));
        }
        b.add(gVar);
    }
}

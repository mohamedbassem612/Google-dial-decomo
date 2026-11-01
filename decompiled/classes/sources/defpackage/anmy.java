package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmy {
    static final defpackage.ahyj a = defpackage.ahyj.d(',');
    public static final defpackage.anmy b = new defpackage.anmy(defpackage.anmh.a, false, new defpackage.anmy(new defpackage.anmh(1), true, new defpackage.anmy()));
    public final byte[] c;
    private final java.util.Map d;

    /* JADX WARN: Type inference failed for: r3v1, types: [anmx, java.lang.Object] */
    private anmy(defpackage.anmx anmxVar, boolean z, defpackage.anmy anmyVar) {
        java.lang.String strB = anmxVar.b();
        if (strB.contains(",")) {
            throw new java.lang.IllegalArgumentException("Comma is currently not allowed in message encoding");
        }
        int size = anmyVar.d.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(anmyVar.d.containsKey(anmxVar.b()) ? size : size + 1);
        for (defpackage.anpu anpuVar : anmyVar.d.values()) {
            ?? r3 = anpuVar.b;
            java.lang.String strB2 = r3.b();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new defpackage.anpu((defpackage.anmx) r3, anpuVar.a));
            }
        }
        linkedHashMap.put(strB, new defpackage.anpu(anmxVar, z));
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        defpackage.ahyj ahyjVar = a;
        java.util.HashSet hashSet = new java.util.HashSet(mapUnmodifiableMap.size());
        for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((defpackage.anpu) entry.getValue()).a) {
                hashSet.add((java.lang.String) entry.getKey());
            }
        }
        this.c = ahyjVar.b(j$.util.DesugarCollections.unmodifiableSet(hashSet)).getBytes(java.nio.charset.Charset.forName("US-ASCII"));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [anmx, java.lang.Object] */
    public final defpackage.anmx a(java.lang.String str) {
        defpackage.anpu anpuVar = (defpackage.anpu) this.d.get(str);
        if (anpuVar != null) {
            return anpuVar.b;
        }
        return null;
    }

    public anmy() {
        this.d = new java.util.LinkedHashMap(0);
        this.c = new byte[0];
    }
}

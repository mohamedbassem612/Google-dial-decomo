package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efx {
    public final defpackage.ipc a;
    private final java.util.Map b;

    public efx(java.util.Map map, boolean z) {
        this.b = map;
        this.a = new defpackage.ipc(z);
    }

    public final java.lang.Object a(defpackage.efw efwVar) {
        java.lang.Object obj = this.b.get(efwVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final java.util.Map b() {
        defpackage.aoiu aoiuVar;
        java.util.Set<java.util.Map.Entry> setEntrySet = this.b.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(setEntrySet, 10)), 16));
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
                aoiuVar = new defpackage.aoiu(key, bArrCopyOf);
            } else {
                aoiuVar = new defpackage.aoiu(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        defpackage.aooh.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final void c() {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.a.a).get()) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d() {
        c();
        this.b.clear();
    }

    public final void e(defpackage.efw efwVar, java.lang.Object obj) {
        c();
        if (obj == null) {
            c();
            this.b.remove(efwVar);
            return;
        }
        if (obj instanceof java.util.Set) {
            java.util.Map map = this.b;
            java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(defpackage.ajsz.cf((java.util.Set) obj));
            defpackage.aooh.e(setUnmodifiableSet, "unmodifiableSet(...)");
            map.put(efwVar, setUnmodifiableSet);
            return;
        }
        boolean z = obj instanceof byte[];
        java.util.Map map2 = this.b;
        if (!z) {
            map2.put(efwVar, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        defpackage.aooh.e(bArrCopyOf, "copyOf(...)");
        map2.put(efwVar, bArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    public final boolean equals(java.lang.Object obj) {
        boolean zN;
        if (!(obj instanceof defpackage.efx)) {
            return false;
        }
        java.util.Map map = ((defpackage.efx) obj).b;
        java.util.Map map2 = this.b;
        if (map != map2) {
            if (map.size() != map2.size()) {
                return false;
            }
            if (!map.isEmpty()) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    java.lang.Object obj2 = map2.get(entry.getKey());
                    if (obj2 != null) {
                        java.lang.Object value = entry.getValue();
                        if (!(value instanceof byte[])) {
                            zN = defpackage.aooh.n(value, obj2);
                        } else if ((obj2 instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj2)) {
                            zN = true;
                        } else {
                            zN = false;
                        }
                    } else {
                        zN = false;
                    }
                    if (!zN) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        java.util.Iterator it = this.b.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final java.lang.String toString() {
        return defpackage.ajsz.cr(this.b.entrySet(), ",\n", "{\n", "\n}", new dkq(15), 24);
    }

    public efx() {
        throw null;
    }

    public /* synthetic */ efx(boolean z) {
        this(new java.util.LinkedHashMap(), z);
    }
}

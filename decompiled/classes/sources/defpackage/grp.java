package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grp {
    public static final defpackage.grp a = new defpackage.ipc((char[]) null).q();
    public final java.util.Map b;

    public grp(defpackage.grp grpVar) {
        if (grpVar == null) {
            defpackage.aooh.i("other");
        }
        this.b = new java.util.HashMap(grpVar.b);
    }

    public final int a(java.lang.String str, int i) {
        java.lang.Object objValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object obj = this.b.get(str);
        if (true == (obj instanceof java.lang.Integer)) {
            objValueOf = obj;
        }
        return ((java.lang.Number) objValueOf).intValue();
    }

    public final long b(java.lang.String str, long j) {
        java.lang.Object objValueOf = java.lang.Long.valueOf(j);
        java.lang.Object obj = this.b.get(str);
        if (true == (obj instanceof java.lang.Long)) {
            objValueOf = obj;
        }
        return ((java.lang.Number) objValueOf).longValue();
    }

    public final java.lang.String c(java.lang.String str) {
        defpackage.aooh.f(str, "key");
        java.lang.Object obj = this.b.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final java.util.Map d() {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(this.b);
        defpackage.aooh.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final boolean e(java.lang.String str, java.lang.Class cls) {
        java.lang.Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public final boolean equals(java.lang.Object obj) {
        boolean zN;
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.aooh.n(getClass(), obj.getClass())) {
            java.util.Map map = this.b;
            java.util.Map map2 = ((defpackage.grp) obj).b;
            java.util.Set<java.lang.String> setKeySet = map.keySet();
            if (defpackage.aooh.n(setKeySet, map2.keySet())) {
                for (java.lang.String str : setKeySet) {
                    java.lang.Object obj2 = map.get(str);
                    java.lang.Object obj3 = map2.get(str);
                    if (obj2 == null || obj3 == null) {
                        zN = obj2 == obj3;
                    } else if (obj2 instanceof java.lang.Object[]) {
                        java.lang.Object[] objArr = (java.lang.Object[]) obj2;
                        if (obj3 instanceof java.lang.Object[]) {
                            zN = defpackage.ajsz.cu(objArr, (java.lang.Object[]) obj3);
                        } else {
                            zN = defpackage.aooh.n(obj2, obj3);
                        }
                    } else {
                        zN = defpackage.aooh.n(obj2, obj3);
                    }
                    if (!zN) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(java.lang.String str) {
        java.lang.Object obj = java.lang.Boolean.FALSE;
        java.lang.Object obj2 = this.b.get(str);
        if (true == (obj2 instanceof java.lang.Boolean)) {
            obj = obj2;
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final long[] g() {
        java.lang.Object obj = this.b.get("timestamps_ms");
        if (obj instanceof java.lang.Object[]) {
            try {
                int length = ((java.lang.Object[]) obj).length;
                aib aibVar = new aib(obj, 10);
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = ((java.lang.Number) aibVar.a(java.lang.Integer.valueOf(i))).longValue();
                }
                return jArr;
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            java.lang.Object value = entry.getValue();
            iHashCode += value instanceof java.lang.Object[] ? j$.util.Objects.hashCode(entry.getKey()) ^ java.util.Arrays.deepHashCode((java.lang.Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final java.lang.String toString() {
        return "Data {" + defpackage.ajsz.cr(this.b.entrySet(), null, null, null, new guv(1), 31) + '}';
    }

    public grp(java.util.Map map) {
        this.b = new java.util.HashMap(map);
    }
}

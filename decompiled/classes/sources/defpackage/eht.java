package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eht extends java.util.LinkedHashMap {
    public static final defpackage.eht a;
    public boolean b;

    static {
        defpackage.eht ehtVar = new defpackage.eht();
        a = ehtVar;
        ehtVar.c();
    }

    private eht() {
        this.b = true;
    }

    private static int d(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ehi) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = defpackage.ehl.a;
        int length = bArr.length;
        int iN = defpackage.anty.N(length, bArr, 0, length);
        if (iN == 0) {
            return 1;
        }
        return iN;
    }

    public final defpackage.eht a() {
        return isEmpty() ? new defpackage.eht() : new defpackage.eht(this);
    }

    public final void b() {
        if (!this.b) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    java.util.Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (!map.containsKey(entry.getKey()) || !defpackage.anty.K(entry.getValue(), map.get(entry.getKey()))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        java.util.Iterator it = entrySet().iterator();
        int iD = 0;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iD += d(entry.getKey()) ^ d(entry.getValue());
        }
        return iD;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        b();
        defpackage.ehl.a(obj);
        defpackage.ehl.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        b();
        for (java.lang.Object obj : map.keySet()) {
            defpackage.ehl.a(obj);
            defpackage.ehl.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        return super.remove(obj);
    }

    private eht(java.util.Map map) {
        super(map);
        this.b = true;
    }
}

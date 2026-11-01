package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apys extends java.util.LinkedHashMap {
    public static final defpackage.apys a;
    public boolean b;

    static {
        defpackage.apys apysVar = new defpackage.apys();
        a = apysVar;
        apysVar.c();
    }

    private apys() {
        this.b = true;
    }

    private static int d(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof defpackage.apyh) {
                throw new java.lang.UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = defpackage.apyj.a;
        int length = bArr.length;
        int iN = anty.N(length, bArr, 0, length);
        if (iN == 0) {
            return 1;
        }
        return iN;
    }

    public final defpackage.apys a() {
        return isEmpty() ? new defpackage.apys() : new defpackage.apys(this);
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
                        if (!map.containsKey(entry.getKey()) || !anty.K(entry.getValue(), map.get(entry.getKey()))) {
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
        defpackage.apyj.a(obj);
        defpackage.apyj.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        b();
        for (java.lang.Object obj : map.keySet()) {
            defpackage.apyj.a(obj);
            defpackage.apyj.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        return super.remove(obj);
    }

    private apys(java.util.Map map) {
        super(map);
        this.b = true;
    }
}

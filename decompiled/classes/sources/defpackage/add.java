package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class add {
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final defpackage.kaw g = new defpackage.kaw((short[]) null, (byte[]) null);
    private final defpackage.den h = new defpackage.den((short[]) null);

    public add(int i) {
        this.a = i;
    }

    protected static final void d(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aooh.f(obj, "key");
        defpackage.aooh.f(obj2, "oldValue");
    }

    protected static void e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            defpackage.aooh.i("key");
        }
        if (obj2 == null) {
            defpackage.aooh.i("value");
        }
    }

    public final java.lang.Object a(java.lang.Object obj) {
        synchronized (this.h) {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) this.g.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objAz;
        java.lang.Object key;
        java.lang.Object value;
        if (obj == null) {
            defpackage.aooh.i("key");
        }
        if (obj2 == null) {
            defpackage.aooh.i("value");
        }
        synchronized (this.h) {
            this.c++;
            int i = this.b;
            e(obj, obj2);
            this.b = i + 1;
            objAz = this.g.az(obj, obj2);
            if (objAz != null) {
                int i2 = this.b;
                e(obj, objAz);
                this.b = i2 - 1;
            }
        }
        if (objAz != null) {
            d(obj, objAz);
        }
        int i3 = this.a;
        while (true) {
            synchronized (this.h) {
                if (this.b < 0 || (this.g.aB() && this.b != 0)) {
                    defpackage.un.b("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= i3) {
                    break;
                }
                defpackage.kaw kawVar = this.g;
                if (!kawVar.aB()) {
                    java.util.Set setEntrySet = ((java.util.LinkedHashMap) kawVar.a).entrySet();
                    defpackage.aooh.e(setEntrySet, "<get-entries>(...)");
                    java.util.Map.Entry entry = (java.util.Map.Entry) defpackage.ajsz.bF(setEntrySet);
                    if (entry == null) {
                        break;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    kawVar.aA(key);
                    int i4 = this.b;
                    e(key, value);
                    this.b = i4 - 1;
                    this.d++;
                } else {
                    break;
                }
            }
            d(key, value);
        }
        return objAz;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object objAA;
        synchronized (this.h) {
            objAA = this.g.aA(obj);
            if (objAA != null) {
                this.b--;
            }
        }
        if (objAA != null) {
            d(obj, objAA);
        }
        return objAA;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.h) {
            int i = this.e;
            int i2 = this.f;
            int i3 = i + i2;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            str = "LruCache[maxSize=" + this.a + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
        }
        return str;
    }
}

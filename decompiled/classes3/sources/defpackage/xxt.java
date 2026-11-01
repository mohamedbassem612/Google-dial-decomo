package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxt {
    private final defpackage.xxp a = new defpackage.xxp();
    private final defpackage.xxs b = new defpackage.xxs();
    private final java.util.Map c = new java.util.HashMap();
    private final java.util.Map d = new java.util.HashMap();
    private final int e;
    private int f;

    public xxt(int i) {
        this.e = i;
    }

    private final defpackage.xxk f(java.lang.Class cls) {
        java.util.Map map = this.d;
        defpackage.xxk xxqVar = (defpackage.xxk) map.get(cls);
        if (xxqVar == null) {
            if (cls.equals(int[].class)) {
                xxqVar = new defpackage.xxq(0);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new java.lang.IllegalArgumentException("No array pool found for: ".concat(java.lang.String.valueOf(cls.getSimpleName())));
                }
                xxqVar = new defpackage.xxq(1);
            }
            map.put(cls, xxqVar);
        }
        return xxqVar;
    }

    private final java.lang.Object g(defpackage.xxr xxrVar, java.lang.Class cls) {
        defpackage.xxp xxpVar = this.a;
        defpackage.xxk xxkVarF = f(cls);
        java.lang.Object objA = xxpVar.a(xxrVar);
        if (objA != null) {
            this.f -= xxkVarF.a(objA) * xxkVarF.b();
            i(xxkVarF.a(objA), cls);
            return objA;
        }
        if (android.util.Log.isLoggable(xxkVarF.d(), 2)) {
            android.util.Log.v(xxkVarF.d(), "Allocated " + xxrVar.a + " bytes");
        }
        return xxkVarF.c(xxrVar.a);
    }

    private final java.util.NavigableMap h(java.lang.Class cls) {
        java.util.Map map = this.c;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, java.lang.Class cls) {
        java.util.NavigableMap navigableMapH = h(cls);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer num = (java.lang.Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, java.lang.Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            java.lang.Object objB = this.a.b();
            anty.aI(objB, "Argument must not be null");
            defpackage.xxk xxkVarF = f(objB.getClass());
            this.f -= xxkVarF.a(objB) * xxkVarF.b();
            i(xxkVarF.a(objB), objB.getClass());
            if (android.util.Log.isLoggable(xxkVarF.d(), 2)) {
                android.util.Log.v(xxkVarF.d(), "evicted: " + xxkVarF.a(objB));
            }
        }
    }

    public final synchronized java.lang.Object a(int i, java.lang.Class cls) {
        java.lang.Integer num;
        int i2;
        num = (java.lang.Integer) h(cls).ceilingKey(java.lang.Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > (i << 3))) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        defpackage.xxk xxkVarF = f(cls);
        int iA = xxkVarF.a(obj);
        int iB = xxkVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            defpackage.xxr xxrVarD = this.b.d(iA, cls);
            this.a.c(xxrVarD, obj);
            java.util.NavigableMap navigableMapH = h(cls);
            java.lang.Integer num = (java.lang.Integer) navigableMapH.get(java.lang.Integer.valueOf(xxrVarD.a));
            navigableMapH.put(java.lang.Integer.valueOf(xxrVarD.a), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        try {
            if (i >= 40) {
                b();
                return;
            }
            if (i >= 20 || i == 15) {
                j(this.e >> 1);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized java.lang.Object e(java.lang.Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}

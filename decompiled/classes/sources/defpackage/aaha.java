package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaha {
    public final java.lang.Object a;
    public java.lang.Object b;

    public aaha(defpackage.aaby aabyVar) {
        this.a = new android.util.SparseIntArray();
        if (aabyVar == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        this.b = aabyVar;
    }

    public final void a() {
        java.lang.Object obj = this.a;
        synchronized (obj) {
            ((android.util.SparseIntArray) obj).clear();
        }
    }

    public final int b(int i) {
        int i2;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            i2 = ((android.util.SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public final android.os.Bundle c(java.lang.String str) {
        android.os.Bundle bundle;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        java.lang.Object obj = this.a;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        defpackage.gim gimVar = (defpackage.gim) obj;
        gimVar.a.a(str);
        defpackage.aogc aogcVar = gimVar.d;
        defpackage.gil gilVarBh = aogcVar.bh(str);
        if (gilVarBh != null) {
            android.os.Bundle bundle2 = gilVarBh.b;
            gilVarBh.b = null;
            return bundle2;
        }
        if (str == null) {
            defpackage.aooh.i("key");
        }
        synchronized (aogcVar.b) {
            bundle = (android.os.Bundle) ((defpackage.adw) aogcVar.c).i(str);
        }
        return bundle;
    }

    public final defpackage.gig d(java.lang.String str) {
        defpackage.gil gilVarBh = ((defpackage.gim) this.a).d.bh(str);
        defpackage.gig gigVar = gilVarBh != null ? gilVarBh.a : null;
        if (gigVar instanceof defpackage.gig) {
            return gigVar;
        }
        return null;
    }

    public final void e(java.lang.String str, defpackage.gig gigVar) {
        boolean z;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        if (gigVar == null) {
            defpackage.aooh.i("provider");
        }
        java.lang.Object obj = this.a;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        if (gigVar == null) {
            defpackage.aooh.i("provider");
        }
        defpackage.gil gilVar = new defpackage.gil(gigVar);
        defpackage.gim gimVar = (defpackage.gim) obj;
        defpackage.aogc aogcVar = gimVar.d;
        if (str == null) {
            defpackage.aooh.i("key");
        }
        java.lang.Object obj2 = aogcVar.b;
        synchronized (obj2) {
            java.lang.Object obj3 = aogcVar.a;
            defpackage.gil gilVar2 = (defpackage.gil) ((defpackage.adw) obj3).a(str);
            if (gilVar2 != null) {
                defpackage.gig gigVar2 = gilVar2.a;
                defpackage.gig gigVar3 = gilVar.a;
                if (gigVar2 != gigVar3) {
                    throw new java.lang.IllegalArgumentException("SavedStateProvider with key '" + str + "' already registered. Existing instance: '" + gigVar2 + "'. New instance: '" + gigVar3 + "'.");
                }
                z = false;
            } else {
                if (str == null) {
                    defpackage.aooh.i("key");
                }
                synchronized (obj2) {
                    ((defpackage.adw) obj3).n(str, gilVar);
                    java.lang.Object obj4 = aogcVar.c;
                    if (defpackage.adw.f((defpackage.adw) obj4, str)) {
                        gilVar.b((android.os.Bundle) ((defpackage.adw) obj4).i(str));
                    }
                    z = true;
                }
            }
        }
        if (z && gimVar.b && !gilVar.c) {
            gilVar.b(null);
        }
    }

    public final void f(java.lang.Class cls) {
        if (!((defpackage.gim) this.a).c) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        java.lang.Object gicVar = this.b;
        if (gicVar == null) {
            gicVar = new gic(this);
        }
        this.b = gicVar;
        try {
            cls.getDeclaredConstructor(null);
            java.lang.Object obj = this.b;
            if (obj != null) {
                java.lang.String name = cls.getName();
                defpackage.aooh.e(name, "getName(...)");
                defpackage.aooh.f(name, "className");
                ((gic) obj).a.add(name);
            }
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoyq, java.lang.Object] */
    public final void g(defpackage.gds gdsVar) {
        this.b = gdsVar;
        this.a.d(gdsVar);
    }

    public aaha() {
        this.a = defpackage.aoyx.c(1, 0, 2, 2);
    }

    public aaha(him himVar) {
        this.a = himVar;
    }

    public aaha(defpackage.gim gimVar) {
        if (gimVar == null) {
            defpackage.aooh.i("impl");
        }
        this.a = gimVar;
    }
}

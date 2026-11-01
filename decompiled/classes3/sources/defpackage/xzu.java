package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzu {
    private static final defpackage.xzp a = new defpackage.xzt(0);
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.Set c = new java.util.HashSet();
    private final dxz d;

    public xzu(dxz dxzVar) {
        this.d = dxzVar;
    }

    private final void f(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new ucm(cls, cls2, xzqVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzq] */
    private final defpackage.xzp g(ucm ucmVar) {
        defpackage.xzp xzpVarB = ucmVar.a.b(this);
        anty.aI(xzpVarB, "Argument must not be null");
        return xzpVarB;
    }

    public final synchronized defpackage.xzp a(java.lang.Class cls, java.lang.Class cls2) {
        defpackage.xzp xzsVar;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z = false;
            for (ucm ucmVar : this.b) {
                java.util.Set set = this.c;
                if (set.contains(ucmVar)) {
                    z = true;
                } else if (ucmVar.c(cls) && ((java.lang.Class) ucmVar.c).isAssignableFrom(cls2)) {
                    set.add(ucmVar);
                    arrayList.add(g(ucmVar));
                    set.remove(ucmVar);
                }
            }
            if (arrayList.size() > 1) {
                xzsVar = new defpackage.xzs(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                xzsVar = (defpackage.xzp) arrayList.get(0);
            } else {
                if (!z) {
                    throw new defpackage.xsp(cls, cls2);
                }
                xzsVar = a;
            }
        } catch (java.lang.Throwable th) {
            this.c.clear();
            throw th;
        }
        return xzsVar;
    }

    public final synchronized java.util.List b(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        try {
            arrayList = new java.util.ArrayList();
            for (ucm ucmVar : this.b) {
                java.util.Set set = this.c;
                if (!set.contains(ucmVar) && ucmVar.c(cls)) {
                    set.add(ucmVar);
                    arrayList.add(g(ucmVar));
                    set.remove(ucmVar);
                }
            }
        } catch (java.lang.Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized java.util.List c(java.lang.Class cls) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        for (ucm ucmVar : this.b) {
            java.lang.Object obj = ucmVar.c;
            if (!arrayList.contains(obj) && ucmVar.c(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        f(cls, cls2, xzqVar, true);
    }

    public final synchronized void e(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        f(cls, cls2, xzqVar, false);
    }
}

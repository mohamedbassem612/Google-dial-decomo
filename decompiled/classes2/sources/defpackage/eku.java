package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eku {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ekt b = defpackage.ekt.a;

    public static final void a(aw awVar, java.lang.String str) {
        aooh.f(awVar, "fragment");
        defpackage.ekr ekrVar = new defpackage.ekr(awVar, str);
        d(ekrVar);
        defpackage.ekt ektVarB = b(awVar);
        if (ektVarB.b.contains(defpackage.eks.c) && e(ektVarB, awVar.getClass(), ekrVar.getClass())) {
            c(ektVarB, ekrVar);
        }
    }

    public static final defpackage.ekt b(aw awVar) {
        while (awVar != null) {
            if (awVar.aG()) {
                awVar.J();
            }
            awVar = awVar.E;
        }
        return b;
    }

    public static final void c(defpackage.ekt ektVar, defpackage.elc elcVar) {
        aw awVar = elcVar.a;
        java.lang.String name = awVar.getClass().getName();
        java.util.Set set = ektVar.b;
        if (set.contains(defpackage.eks.a)) {
            android.util.Log.d("FragmentStrictMode", "Policy violation in ".concat(java.lang.String.valueOf(name)), elcVar);
        }
        if (set.contains(defpackage.eks.b)) {
            java.lang.Runnable adVar = new ad(name, elcVar, 18);
            if (!awVar.aG()) {
                adVar.run();
                return;
            }
            android.os.Handler handler = awVar.J().n.d;
            if (aooh.n(handler.getLooper(), android.os.Looper.myLooper())) {
                adVar.run();
            } else {
                handler.post(adVar);
            }
        }
    }

    public static final void d(defpackage.elc elcVar) {
        if (bo.Z(3)) {
            android.util.Log.d("FragmentManager", "StrictMode violation in ".concat(java.lang.String.valueOf(elcVar.a.getClass().getName())), elcVar);
        }
    }

    public static final boolean e(defpackage.ekt ektVar, java.lang.Class cls, java.lang.Class cls2) {
        java.util.Set set = (java.util.Set) ektVar.c.get(cls.getName());
        if (set != null) {
            return (aooh.n(cls2.getSuperclass(), defpackage.elc.class) || !ajsz.cj(set, cls2.getSuperclass())) && !set.contains(cls2);
        }
        return true;
    }
}

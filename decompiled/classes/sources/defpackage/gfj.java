package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gfj {
    public abstract java.lang.String a();

    public abstract void b(defpackage.gin ginVar, java.lang.Object obj);

    public final java.util.List c(defpackage.gjh gjhVar, java.util.Collection collection) throws java.lang.Exception {
        defpackage.aooh.f(gjhVar, "connection");
        defpackage.aokv aokvVar = new defpackage.aokv(10);
        defpackage.gin ginVarA = gjhVar.a(a());
        try {
            for (java.lang.Object obj : collection) {
                if (obj != null) {
                    b(ginVarA, obj);
                    ginVarA.m();
                    ginVarA.k();
                    aokvVar.add(java.lang.Long.valueOf(defpackage.dez.j(gjhVar)));
                } else {
                    aokvVar.add(-1L);
                }
            }
            defpackage.aooc.M(ginVarA, null);
            return defpackage.ajsz.aX(aokvVar);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.aooc.M(ginVarA, th);
                throw th2;
            }
        }
    }

    public final void d(defpackage.gjh gjhVar, java.lang.Iterable iterable) throws java.lang.Exception {
        defpackage.aooh.f(gjhVar, "connection");
        if (iterable != null) {
            defpackage.gin ginVarA = gjhVar.a(a());
            try {
                for (java.lang.Object obj : iterable) {
                    if (obj != null) {
                        b(ginVarA, obj);
                        ginVarA.m();
                        ginVarA.k();
                    }
                }
                defpackage.aooc.M(ginVarA, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.aooc.M(ginVarA, th);
                    throw th2;
                }
            }
        }
    }

    public final void e(defpackage.gjh gjhVar, java.lang.Object obj) throws java.lang.Exception {
        if (gjhVar == null) {
            defpackage.aooh.i("connection");
        }
        if (obj != null) {
            defpackage.gin ginVarA = gjhVar.a(a());
            try {
                b(ginVarA, obj);
                ginVarA.m();
                ginVarA.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        ginVarA.close();
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                    }
                    throw th2;
                }
            }
        }
    }
}

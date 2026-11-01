package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gfi {
    protected abstract java.lang.String a();

    protected abstract void b(defpackage.gin ginVar, java.lang.Object obj);

    public final int c(defpackage.gjh gjhVar, java.lang.Iterable iterable) throws java.lang.Exception {
        defpackage.aooh.f(gjhVar, "connection");
        int i = 0;
        if (iterable != null) {
            defpackage.gin ginVarA = gjhVar.a(a());
            try {
                for (java.lang.Object obj : iterable) {
                    if (obj != null) {
                        b(ginVarA, obj);
                        ginVarA.m();
                        ginVarA.k();
                        i += defpackage.dez.i(gjhVar);
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
        return i;
    }

    public final void d(defpackage.gjh gjhVar, java.lang.Object obj) throws java.lang.Exception {
        defpackage.aooh.f(gjhVar, "connection");
        if (obj != null) {
            defpackage.gin ginVarA = gjhVar.a(a());
            try {
                b(ginVarA, obj);
                ginVarA.m();
                defpackage.aooc.M(ginVarA, null);
                defpackage.dez.i(gjhVar);
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
}

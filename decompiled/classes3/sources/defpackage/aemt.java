package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class aemt implements ahyc {
    public void a(defpackage.aafw aafwVar, aemc aemcVar) {
        throw null;
    }

    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.aafw aafwVar = (defpackage.aafw) obj;
        aemc aemcVarA = aeme.a();
        if (aafwVar.b("account_name") != null) {
            aemcVarA.b(aafwVar.b("account_name"));
        }
        if (aafwVar.d() != null) {
            aemcVarA.a = aafwVar.d();
        }
        if (aafwVar.f() != null) {
            b(aafwVar, aemcVarA);
        }
        if (aafwVar.e() != null) {
            a(aafwVar, aemcVarA);
        }
        if (aafwVar.b("gaia_id") != null) {
            aemcVarA.d = aafwVar.b("gaia_id");
        }
        c(aafwVar, aemcVarA);
        if (aafwVar.c() != null) {
            aemcVarA.f = aafwVar.c();
        }
        return aemcVarA.a();
    }

    public void b(defpackage.aafw aafwVar, aemc aemcVar) {
        throw null;
    }

    public abstract void c(defpackage.aafw aafwVar, aemc aemcVar);
}

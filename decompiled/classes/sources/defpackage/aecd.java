package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecd {
    public static final defpackage.aecd a = new defpackage.aecd();

    public static final defpackage.aduw a(defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            return defpackage.aduw.a;
        }
        java.lang.Boolean.FALSE.booleanValue();
        return defpackage.aduw.b;
    }

    public final java.lang.Object b(defpackage.adzq adzqVar, java.lang.String str, boolean z) {
        return z ? new defpackage.adub(java.lang.Boolean.TRUE) : new defpackage.adub(java.lang.Boolean.valueOf(defpackage.aooh.n(adzqVar.b(), str)));
    }
}

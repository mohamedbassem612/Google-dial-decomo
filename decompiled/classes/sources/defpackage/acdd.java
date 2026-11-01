package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdd implements defpackage.accr {
    private static final defpackage.aiof b = defpackage.aiof.i("GnpSdk");
    public final defpackage.amwu a;
    private final android.content.Context c;
    private final defpackage.accq d;

    public acdd(android.content.Context context, defpackage.amwu amwuVar, defpackage.acbd acbdVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("syncDataStore");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.c = context;
        this.a = amwuVar;
        this.d = defpackage.accq.e;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        return this.d;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        defpackage.aooh.f(akkjVar, "triggeringConditions");
        try {
            java.lang.String strA = acax.a(this.c);
            if (strA == null || strA.length() == 0) {
                return false;
            }
            java.lang.String str = ((defpackage.achw) defpackage.aoov.ah(defpackage.aols.a, new acbt(this, (defpackage.aoln) null, 7))).f;
            defpackage.aooh.e(str, "getSyncLanguage(...)");
            return defpackage.aooh.n(strA, str);
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) b.d()).k(e)).v("Failed to retrieve SYNC_LANGUAGE from sync data store.");
            return false;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class accj implements defpackage.acci {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");

    @Override // defpackage.acci
    public final defpackage.adtz a(android.content.Context context) {
        defpackage.adub adtwVar;
        defpackage.aooh.f(context, "context");
        defpackage.adty adtyVar = defpackage.adty.f;
        try {
            defpackage.aato.a(context);
            adtwVar = new defpackage.adub(defpackage.aojh.a);
        } catch (java.lang.Exception e) {
            adtwVar = new adtw(e, adtyVar);
        }
        if (adtwVar instanceof defpackage.adtv) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(((defpackage.adtv) adtwVar).b())).v("Failed to install GMS provider");
        }
        return adtwVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abzj implements defpackage.anme {
    static final defpackage.anpc a;
    final android.content.Context b;

    static {
        defpackage.anoz anozVar = defpackage.anph.b;
        int i = defpackage.anpc.d;
        a = new defpackage.anoy("X-Goog-Spatula", anozVar);
    }

    public abzj(android.content.Context context) {
        this.b = context;
    }

    public final java.lang.String a() {
        defpackage.zxw zxwVar = new defpackage.zxw(new android.os.Bundle());
        defpackage.acxg acxgVar = defpackage.zxv.a;
        try {
            return (java.lang.String) defpackage.aazc.u(new defpackage.abce(this.b, zxwVar).t(), 2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            android.util.Log.e("SpatulaClientInterceptor", "Error getting spatula header", e);
            return null;
        }
    }

    @Override // defpackage.anme
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar, defpackage.anmc anmcVar) {
        return new abzi(this, anmcVar.b(anpkVar, anmbVar));
    }
}

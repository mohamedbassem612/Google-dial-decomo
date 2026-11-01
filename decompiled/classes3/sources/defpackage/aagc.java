package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aagc implements aagb {
    final /* synthetic */ aagf a;

    public aagc(aagf aagfVar) {
        j$.util.Objects.requireNonNull(aagfVar);
        this.a = aagfVar;
    }

    public final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        boolean zD = connectionResult.d();
        aagf aagfVar = this.a;
        if (zD) {
            aagfVar.s((defpackage.aahb) null, aagfVar.z());
            return;
        }
        apnt apntVar = aagfVar.r;
        if (apntVar != null) {
            apntVar.l(connectionResult);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aakl implements defpackage.aauh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ defpackage.zzx b;

    public /* synthetic */ aakl(java.lang.Object obj, defpackage.zzx zzxVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = zzxVar;
    }

    @Override // defpackage.aauh
    public final void a(java.lang.Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            android.util.Log.e("DuoStateFetcher", "Error getting duo registered.", exc);
            java.lang.Object obj = this.a;
            ((defpackage.aakh) obj).initCause(exc);
            this.b.h((java.lang.Exception) obj);
            return;
        }
        if (i != 1) {
            java.lang.Object obj2 = this.a;
            ((defpackage.aakh) obj2).initCause(exc);
            this.b.h((java.lang.Exception) obj2);
        } else {
            int i2 = defpackage.aakc.b;
            ((defpackage.acxg) this.a).p(3);
            com.google.android.gms.duokit.GetApiAvailabilityResponse getApiAvailabilityResponse = new com.google.android.gms.duokit.GetApiAvailabilityResponse();
            getApiAvailabilityResponse.a = 1;
            this.b.i(getApiAvailabilityResponse);
        }
    }
}

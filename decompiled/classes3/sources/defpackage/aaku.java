package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aaku implements aauh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aaku(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public final void a(java.lang.Exception exc) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        if (this.$cid == 0) {
            ((acxg) this.a).r(5);
            ((zzx) this.b).h(new java.lang.IllegalStateException("Failed to get Duo state."));
        } else if ((exc instanceof aacw) && (connectionResult = ((aacw) exc).a.i) != null && connectionResult.c == 24) {
            ((aaju) this.a).a.set(this.b);
        }
    }
}

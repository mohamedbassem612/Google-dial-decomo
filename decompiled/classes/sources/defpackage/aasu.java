package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aasu implements defpackage.aafm {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aafm
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            int i = defpackage.aata.a;
            return;
        }
        android.os.IBinder iBinderB = ((defpackage.aafh) obj).b();
        if (iBinderB == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.apps.tachyon.clientapi.IClientApiService");
        ((defpackage.zzx) obj2).i(iInterfaceQueryLocalInterface instanceof defpackage.yro ? (defpackage.yro) iInterfaceQueryLocalInterface : new defpackage.yro(iBinderB));
    }
}

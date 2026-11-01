package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zxf extends defpackage.zxa {
    final /* synthetic */ com.google.android.gms.auth.aang.GetTokenRequest a;
    final /* synthetic */ zzx b;

    public zxf(zxh zxhVar, com.google.android.gms.auth.aang.GetTokenRequest getTokenRequest, zzx zzxVar) {
        this.a = getTokenRequest;
        this.b = zzxVar;
        j$.util.Objects.requireNonNull(zxhVar);
    }

    @Override // defpackage.zxa
    public final void b(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        boolean z = this.a.n;
        zzx zzxVar = this.b;
        if (z) {
            zxh.d(status, getTokenResponse, zzxVar);
        } else {
            zxh.e(status, getTokenResponse, zzxVar);
        }
    }

    @Override // defpackage.zxa
    public final void c(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        boolean z = this.a.n;
        zzx zzxVar = this.b;
        if (z) {
            zxh.d(status, getTokenResponse, zzxVar);
        } else {
            zxh.e(status, getTokenResponse, zzxVar);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zxe extends defpackage.zxa {
    final /* synthetic */ zzx a;

    public zxe(zxh zxhVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(zxhVar);
    }

    @Override // defpackage.zxa
    public final void a(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetAccountsResponse getAccountsResponse) {
        zxh.e(status, getAccountsResponse, this.a);
    }
}

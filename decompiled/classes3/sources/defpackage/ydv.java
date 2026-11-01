package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ydv implements defpackage.yfw {
    final /* synthetic */ android.content.Context a;

    public ydv(defpackage.ydy ydyVar, android.content.Context context) {
        this.a = context;
        j$.util.Objects.requireNonNull(ydyVar);
    }

    @Override // defpackage.yfw
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return (android.net.ConnectivityManager) this.a.getSystemService("connectivity");
    }
}

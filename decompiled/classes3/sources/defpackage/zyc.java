package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyc extends defpackage.zya {
    final /* synthetic */ zzx a;

    public zyc(abce abceVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(abceVar);
    }

    @Override // defpackage.zya
    public final void a(java.lang.String str) {
        aais.ax(str != null ? com.google.android.gms.common.api.Status.a : new com.google.android.gms.common.api.Status(3006, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null), str, this.a);
    }
}

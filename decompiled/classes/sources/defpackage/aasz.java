package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aasz extends defpackage.aaew {
    final /* synthetic */ defpackage.zzx a;

    public aasz(defpackage.aata aataVar, defpackage.zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aataVar);
    }

    @Override // defpackage.aaex
    public final void a(com.google.android.gms.common.api.Status status) {
        defpackage.aais.ax(status, null, this.a);
    }
}

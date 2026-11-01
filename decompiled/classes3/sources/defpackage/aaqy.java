package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaqy extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aaqy(defpackage.aara aaraVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aaraVar);
    }

    @Override // defpackage.aaqt
    public final void i(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.aw(status, java.lang.Boolean.TRUE, this.a, apiMetadata);
    }
}

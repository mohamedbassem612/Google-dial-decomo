package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarj extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aarj(aarp aarpVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aarpVar);
    }

    @Override // defpackage.aaqt
    public final void e(com.google.android.gms.common.api.Status status, java.util.List list, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.av(status, list, this.a, apiMetadata);
    }
}

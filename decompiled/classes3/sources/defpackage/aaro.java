package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaro extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aaro(aarp aarpVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aarpVar);
    }

    @Override // defpackage.aaqt
    public final void h(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.av(status, callingCardRequestStatus, this.a, apiMetadata);
    }
}

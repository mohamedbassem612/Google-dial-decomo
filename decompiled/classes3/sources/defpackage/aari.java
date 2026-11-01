package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aari extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aari(aarp aarpVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aarpVar);
    }

    @Override // defpackage.aaqt
    public final void a(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse createCallingCardResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.av(status, createCallingCardResponse, this.a, apiMetadata);
    }
}

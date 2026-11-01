package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarl extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aarl(aarp aarpVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aarpVar);
    }

    @Override // defpackage.aaqt
    public final void k(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse upsertCallingCardResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.av(status, upsertCallingCardResponse, this.a, apiMetadata);
    }
}

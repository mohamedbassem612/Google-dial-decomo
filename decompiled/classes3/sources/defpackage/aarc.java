package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarc extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aarc(defpackage.aard aardVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aardVar);
    }

    @Override // defpackage.aaqt
    public final void j(com.google.android.gms.common.api.Status status, com.google.android.gms.people.contactssync.model.TetheredSyncStatus tetheredSyncStatus, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.av(status, tetheredSyncStatus, this.a, apiMetadata);
    }
}

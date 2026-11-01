package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aapk extends defpackage.aapg {
    final /* synthetic */ defpackage.zzx a;

    public aapk(defpackage.abce abceVar, defpackage.zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(abceVar);
    }

    @Override // defpackage.aapg
    public final void b(com.google.android.gms.common.api.Status status, com.google.android.gms.mobstore.OpenFileDescriptorResponse openFileDescriptorResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        defpackage.aais.aw(status, openFileDescriptorResponse, this.a, apiMetadata);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatk extends defpackage.aatl {
    final /* synthetic */ defpackage.zzx a;

    public aatk(defpackage.abce abceVar, defpackage.zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(abceVar);
    }

    @Override // defpackage.aatl
    public final void a(com.google.android.gms.common.api.Status status, com.google.android.gms.pseudonymous.PseudonymousIdToken pseudonymousIdToken, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        defpackage.aais.aw(status, pseudonymousIdToken, this.a, apiMetadata);
    }
}

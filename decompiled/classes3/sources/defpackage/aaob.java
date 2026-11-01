package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaob extends defpackage.aant {
    final /* synthetic */ defpackage.aann a;
    final /* synthetic */ zzx b;

    public aaob(zzx zzxVar, defpackage.aann aannVar) {
        this.b = zzxVar;
        this.a = aannVar;
    }

    @Override // defpackage.aanu
    public final void a(com.google.android.gms.location.internal.FusedLocationProviderResult fusedLocationProviderResult, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.aw(fusedLocationProviderResult.a, (java.lang.Object) null, this.b, apiMetadata);
    }

    @Override // defpackage.aanu
    public final void b() {
        this.a.a();
    }
}

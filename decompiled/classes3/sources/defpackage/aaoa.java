package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaoa extends defpackage.aant {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ zzx b;

    public aaoa(java.lang.Object obj, zzx zzxVar) {
        this.a = obj;
        this.b = zzxVar;
    }

    @Override // defpackage.aanu
    public final void a(com.google.android.gms.location.internal.FusedLocationProviderResult fusedLocationProviderResult, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        aais.aw(fusedLocationProviderResult.a, this.a, this.b, apiMetadata);
    }

    @Override // defpackage.aanu
    public final void b() {
    }
}

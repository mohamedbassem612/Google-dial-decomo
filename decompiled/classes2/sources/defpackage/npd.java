package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npd implements uwy {
    final /* synthetic */ defpackage.npe a;

    public npd(defpackage.npe npeVar) {
        this.a = npeVar;
    }

    public final void a() {
        this.a.d();
        defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupTtsModelDownloader$<anonymous>", "onEnqueue", 100, "DobbySettingsService.kt").v("TTS model download enqueued");
    }

    public final void b() {
        defpackage.npe npeVar = this.a;
        aoov.an(npeVar.b, (aolr) null, 0, new defpackage.nht(npeVar, (aoln) null, 19, (short[]) null), 3);
        defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupTtsModelDownloader$<anonymous>", "onError", 117, "DobbySettingsService.kt").v("TTS model download failed");
    }

    public final void c(int i) {
        defpackage.npe npeVar = this.a;
        aoov.an(npeVar.b, (aolr) null, 0, new defpackage.hxo(npeVar, i, (aoln) null, 8), 3);
        defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupTtsModelDownloader$<anonymous>", "onProgress", 108, "DobbySettingsService.kt").w("TTS model download progress: %d%%", i);
    }

    public final void d() {
        defpackage.npe npeVar = this.a;
        aoov.an(npeVar.b, (aolr) null, 0, new defpackage.nht(npeVar, (aoln) null, 20, (int[]) null), 3);
        defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService$setupTtsModelDownloader$<anonymous>", "onSuccess", 126, "DobbySettingsService.kt").v("TTS model download completed");
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxb implements defpackage.uwy {
    final /* synthetic */ ntd a;

    public uxb(ntd ntdVar) {
        this.a = ntdVar;
    }

    @Override // defpackage.uwy
    public final void a() {
        defpackage.uxc.a.b().l("com/android/dialer/tts/api/modelavailability/impl/TtsAvailabilityImpl$requestVoiceLmModelDownload$<anonymous>$<anonymous>", "onEnqueue", 122, "TtsAvailabilityImpl.kt").y("VoiceLM model download enqueued: %s", this.a.e);
    }

    @Override // defpackage.uwy
    public final void b() {
        defpackage.uxc.a.d().l("com/android/dialer/tts/api/modelavailability/impl/TtsAvailabilityImpl$requestVoiceLmModelDownload$<anonymous>$<anonymous>", "onError", 126, "TtsAvailabilityImpl.kt").y("VoiceLM model download failed: %s", this.a.e);
    }

    @Override // defpackage.uwy
    public final void d() {
        defpackage.uxc.a.b().l("com/android/dialer/tts/api/modelavailability/impl/TtsAvailabilityImpl$requestVoiceLmModelDownload$<anonymous>$<anonymous>", "onSuccess", 130, "TtsAvailabilityImpl.kt").y("VoiceLM model download completed: %s", this.a.e);
    }

    @Override // defpackage.uwy
    public final /* synthetic */ void c(int i) {
    }
}

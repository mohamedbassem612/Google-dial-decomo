package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uvr implements ieg {
    final /* synthetic */ defpackage.uvs a;

    public uvr(defpackage.uvs uvsVar) {
        j$.util.Objects.requireNonNull(uvsVar);
        this.a = uvsVar;
    }

    public final void a(boolean z) {
        if (z) {
            defpackage.uvt uvtVar = this.a.a;
            java.lang.String str = uvtVar.e.e;
            defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserPlayedAudioRecording", 75, "FeedbackMetricsLogger.java").v("logging user pressed play on the Audio player");
            uvtVar.f.b(str, new defpackage.uwm(0));
        }
    }

    public final /* synthetic */ void b(erb erbVar) {
        aooh.f(erbVar, "error");
    }

    public final /* synthetic */ void c() {
    }
}

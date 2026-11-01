package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tws implements defpackage.twh {
    final /* synthetic */ defpackage.twu a;
    final /* synthetic */ aosi b;
    private final java.lang.StringBuilder c = new java.lang.StringBuilder();

    public tws(aosi aosiVar, defpackage.twu twuVar) {
        this.b = aosiVar;
        this.a = twuVar;
    }

    @Override // defpackage.twh
    public final void a(defpackage.twg twgVar) {
        aooh.f(twgVar, "error");
        this.a.h = true;
        defpackage.twu.a.d().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl$getSodaEventListener$<anonymous>", "onError", 215, "SodaFileTranscriberImpl.kt").y("Soda File Transcription error %s", twgVar);
        java.util.Objects.toString(twgVar);
        this.b.c(new defpackage.twe("Soda File Transcription error ".concat(java.lang.String.valueOf(twgVar)), twgVar));
    }

    @Override // defpackage.twh
    public final void b(j$.util.Optional optional) {
        aooh.f(optional, "optionalTranscription");
        defpackage.twj twjVar = (defpackage.twj) aooh.q(optional);
        aosi aosiVar = this.b;
        if (twjVar == null) {
            aosiVar.Q(this.c.toString());
            return;
        }
        java.lang.String str = twjVar.b == 1 ? (java.lang.String) twjVar.c : "";
        aooh.e(str, "getTranscript(...)");
        aosiVar.Q(str);
    }

    @Override // defpackage.twh
    public final /* synthetic */ void c(defpackage.tvx tvxVar) {
        aooh.f(tvxVar, "languageDetectionEvent");
    }

    @Override // defpackage.twh
    public final /* synthetic */ void d(amle amleVar) {
        aooh.f(amleVar, "sodaEvent");
    }

    @Override // defpackage.twh
    public final void e(defpackage.twj twjVar) {
        aooh.f(twjVar, "transcription");
    }

    @Override // defpackage.twh
    public final void f(defpackage.twj twjVar) {
        aooh.f(twjVar, "transcription");
        java.lang.String str = twjVar.b == 1 ? (java.lang.String) twjVar.c : "";
        aooh.e(str, "getTranscript(...)");
        if (str.length() > 0) {
            java.lang.StringBuilder sb = this.c;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(twjVar.b == 1 ? (java.lang.String) twjVar.c : "");
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adou implements adsm {
    final /* synthetic */ adow a;
    private final ador b;
    private final defpackage.adnw c;
    private final java.lang.String d;

    public adou(adow adowVar, ador adorVar, defpackage.adnw adnwVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(adowVar);
        this.a = adowVar;
        this.b = adorVar;
        this.c = adnwVar;
        this.d = str;
    }

    public final void a() {
        aimw aimwVarL = adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackFinished", 993, "IncomingCallFlowManager.java");
        int i = this.a.j;
        defpackage.adnw adnwVar = this.c;
        aimwVarL.B("%d:onPlaybackFinished(): triggering playback finished for: \"%s\"", i, adow.i(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.a(adnwVar, this.d))));
    }

    public final void b() {
        aimw aimwVarL = adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackInterrupted", 1006, "IncomingCallFlowManager.java");
        int i = this.a.j;
        defpackage.adnw adnwVar = this.c;
        aimwVarL.B("%d:onPlaybackInterrupted(): triggering playback interrupted for: \"%s\"", i, adow.i(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.c(adnwVar, this.d))));
    }

    public final void c(int i) {
        this.b.f(aify.p(afsq.W(defpackage.adoj.b(this.c, this.d, i))));
    }

    public final void d(int i) {
        aimw aimwVarL = adow.a.b().l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackStarted", 979, "IncomingCallFlowManager.java");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.a.j);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
        defpackage.adnw adnwVar = this.c;
        aimwVarL.M("%d:onPlaybackStarted(): triggering playback started with duration %d for: \"%s\"", numValueOf, numValueOf2, adow.i(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.d(adnwVar, this.d, i))));
    }
}

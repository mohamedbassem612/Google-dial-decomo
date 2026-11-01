package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ljq implements adsm {
    final /* synthetic */ defpackage.ljs a;
    private final ador b;
    private final defpackage.adnw c;
    private final java.lang.String d;

    public ljq(defpackage.ljs ljsVar, ador adorVar, defpackage.adnw adnwVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(ljsVar);
        this.a = ljsVar;
        this.b = adorVar;
        this.c = adnwVar;
        this.d = str;
    }

    public final void a() {
        aimw aimwVarL = defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackFinished", 1071, "ForkedIncomingCallFlowManager.java");
        int i = this.a.j;
        defpackage.adnw adnwVar = this.c;
        aimwVarL.B("%d:onPlaybackFinished(): triggering playback finished for: \"%s\"", i, defpackage.ljs.k(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.a(adnwVar, this.d))));
    }

    public final void b() {
        aimw aimwVarL = defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackInterrupted", 1082, "ForkedIncomingCallFlowManager.java");
        int i = this.a.j;
        defpackage.adnw adnwVar = this.c;
        aimwVarL.B("%d:onPlaybackInterrupted(): triggering playback interrupted for: \"%s\"", i, defpackage.ljs.k(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.c(adnwVar, this.d))));
    }

    public final void c(int i) {
        this.b.f(aify.p(afsq.W(defpackage.adoj.b(this.c, this.d, i))));
    }

    public final void d(int i) {
        aimw aimwVarL = defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager$AudioMessagePlaybackProgressListener", "onPlaybackStarted", 1059, "ForkedIncomingCallFlowManager.java");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.a.j);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
        defpackage.adnw adnwVar = this.c;
        aimwVarL.M("%d:onPlaybackStarted(): triggering playback started with duration %d for: \"%s\"", numValueOf, numValueOf2, defpackage.ljs.k(adnwVar));
        this.b.f(aify.p(afsq.W(defpackage.adoj.d(adnwVar, this.d, i))));
    }
}

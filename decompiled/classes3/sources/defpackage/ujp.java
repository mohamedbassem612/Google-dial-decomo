package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujp {
    public static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/service/SpamFragmentControllerImpl");
    public final aolr b;
    public final aoss c;
    public final aoss d;
    public final rlv e;
    public final defpackage.ujv f;
    public final defpackage.uhp g;
    public final vwb h;
    public final defpackage.vqu i;

    public ujp(aolr aolrVar, aoss aossVar, aoss aossVar2, vwb vwbVar, defpackage.vqu vquVar, rlv rlvVar, defpackage.ujv ujvVar, defpackage.uhp uhpVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(vwbVar, "spamNotificationFragmentState");
        aooh.f(rlvVar, "loggingBindings");
        this.b = aolrVar;
        this.c = aossVar;
        this.d = aossVar2;
        this.h = vwbVar;
        this.i = vquVar;
        this.e = rlvVar;
        this.f = ujvVar;
        this.g = uhpVar;
    }

    public final void a(rmw rmwVar, java.lang.String str, long j) {
        aooh.f(str, "uniqueCallId");
        this.e.h(rmwVar, str, j);
    }
}

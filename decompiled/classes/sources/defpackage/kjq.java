package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kjq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator");
    public static final defpackage.aenj b = new defpackage.aenj("AnnotatedCallLogRefreshRequestRegulator.throttle");
    public static final defpackage.aenj c = new defpackage.aenj("AnnotatedCallLogRefreshRequestRegulator.throttle.conversationHistoryOnly");
    public final android.content.Context d;
    public final defpackage.kjw e;
    public final defpackage.rlv f;
    public final defpackage.ruc g;
    public final java.util.concurrent.Executor h;
    public defpackage.ajcq i;
    public int j;

    public kjq(android.content.Context context, defpackage.kjw kjwVar, defpackage.rlv rlvVar, defpackage.ruc rucVar, defpackage.ajct ajctVar) {
        this.d = context;
        this.e = kjwVar;
        this.f = rlvVar;
        this.g = rucVar;
        this.h = new defpackage.ajdc(ajctVar);
    }

    public final void a() {
        if (this.j != 0) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "refreshIfRequestPending", 212, "AnnotatedCallLogRefreshRequestRegulator.java")).v("start refreshing for the pending request");
            b(this.j);
            this.j = 0;
        }
    }

    public final void b(int i) {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(new defpackage.kjo(this, i, 0)), null));
        this.h.execute(ajdkVar);
        defpackage.agsm.i(197, ajdkVar, "Failed to throttle.", new java.lang.Object[0]);
    }
}

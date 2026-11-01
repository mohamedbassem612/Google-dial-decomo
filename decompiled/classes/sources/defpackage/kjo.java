package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kjo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public kjo(defpackage.afwm afwmVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(afwmVar);
        this.b = afwmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                ((defpackage.dwj) this.b).a(this.a);
                return;
            } else if (i != 2) {
                ((defpackage.afwm) this.b).M(this.a);
                return;
            } else {
                ((defpackage.aeud) this.b).a(this.a + 1);
                return;
            }
        }
        defpackage.aimz aimzVar = defpackage.kjq.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 125, "AnnotatedCallLogRefreshRequestRegulator.java")).v("throttle sequentially");
        defpackage.kjq kjqVar = (defpackage.kjq) this.b;
        if (!defpackage.abyl.h(kjqVar.d)) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 129, "AnnotatedCallLogRefreshRequestRegulator.java")).v("skipping refresh until user unlocks...");
            return;
        }
        int i2 = this.a;
        defpackage.ajcq ajcqVar = kjqVar.i;
        if (ajcqVar != null && !ajcqVar.isDone()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 146, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Skip refresh as previous refresh is still running.");
            if (kjqVar.j == 0) {
                kjqVar.j = i2;
                return;
            } else {
                if (defpackage.gus.aM(i2) > defpackage.gus.aM(kjqVar.j)) {
                    kjqVar.j = 4;
                    return;
                }
                return;
            }
        }
        defpackage.aenj aenjVar = i2 == 1 ? defpackage.kjq.c : defpackage.kjq.b;
        kjqVar.g.j(aenjVar);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 166, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Refreshing conversation history only");
            kjqVar.i = defpackage.ahvr.H(kjqVar.e.g.a(), new jvq(10), defpackage.ajbm.INSTANCE);
        } else if (i3 == 1) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 171, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Refreshing with dirty check");
            kjqVar.i = kjqVar.e.b(2);
        } else if (i3 == 2) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 175, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Refreshing annotated call log feature data only");
            kjqVar.i = kjqVar.e.b(1);
        } else if (i3 == 3) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshRequestRegulator", "throttleInternalSequentially", 180, "AnnotatedCallLogRefreshRequestRegulator.java")).v("Refreshing without dirty check");
            kjqVar.i = kjqVar.e.b(3);
        }
        defpackage.ajcq ajcqVar2 = kjqVar.i;
        ajcqVar2.getClass();
        defpackage.kjp kjpVar = new defpackage.kjp(kjqVar, i2, aenjVar);
        java.util.concurrent.Executor executor = kjqVar.h;
        long j = defpackage.ahqx.a;
        ajcqVar2.c(new defpackage.ajcc(ajcqVar2, new defpackage.sqh(defpackage.ahns.c(false), kjpVar, 2)), executor);
    }

    public /* synthetic */ kjo(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }
}

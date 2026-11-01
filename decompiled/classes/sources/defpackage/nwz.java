package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nwz implements defpackage.abwn {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/duo/data/MeetDataRefresher");
    private final defpackage.rlv b;
    private final defpackage.kjr c;

    public nwz(defpackage.kjr kjrVar, defpackage.rlv rlvVar) {
        if (kjrVar == null) {
            defpackage.aooh.i("annotatedCallLogRefreshStarter");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.c = kjrVar;
        this.b = rlvVar;
    }

    @Override // defpackage.abwn
    public final java.lang.Object a() {
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.abwn
    public final java.lang.Object b(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/MeetDataRefresher", "onChange", 22, "MeetDataRefresher.kt")).v("notify annotated call log to refresh due to Meet data change");
        this.c.a();
        if (!ahbqVar.b.isEmpty()) {
            this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_DATABASE_INSERTED);
        }
        if (!ahbqVar.a.isEmpty()) {
            this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_DATABASE_UPDATED);
        }
        if (!ahbqVar.d.isEmpty()) {
            this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_DATABASE_DELETED);
        }
        return defpackage.aojh.a;
    }
}

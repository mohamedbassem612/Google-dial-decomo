package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kai implements defpackage.kau {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/compose/data/realtime/CallLogRealtimeDataPersister");
    public final defpackage.aoin b;
    public final j$.util.concurrent.ConcurrentHashMap c;
    public final defpackage.zjm d;
    public final defpackage.rsr e;
    private final defpackage.aoss f;
    private final defpackage.aoir g;

    public kai(defpackage.rsr rsrVar, defpackage.zjm zjmVar, defpackage.aoin aoinVar, defpackage.aoss aossVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("annotatedCallLogRefreshStarter");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.e = rsrVar;
        this.d = zjmVar;
        this.b = aoinVar;
        this.f = aossVar;
        this.g = new defpackage.aoiy(new defpackage.jza(this, 6));
        this.c = new j$.util.concurrent.ConcurrentHashMap();
    }

    @Override // defpackage.kau
    public final /* synthetic */ void a(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    @Override // defpackage.kau
    public final void b(java.lang.Long l) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.Map mapAS = defpackage.ajsz.aS(concurrentHashMap);
        concurrentHashMap.clear();
        defpackage.aoov.an(this.f, null, 0, new jpj(this, mapAS, (defpackage.aoln) null, 8, (char[]) null), 3);
    }

    @Override // defpackage.kau
    public final /* synthetic */ void c(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    public final defpackage.kgz f() {
        return (defpackage.kgz) this.g.a();
    }

    @Override // defpackage.kau
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kau
    public final /* synthetic */ void e() {
    }
}

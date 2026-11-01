package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wxm {
    public static final aimz a = aimz.i("com/android/incallui/atlas/logger/AtlasCallMetricsLogger");
    public final java.util.concurrent.Executor b;
    public final java.util.Map c = new aca();

    static {
        aihd.u(defpackage.wvj.TOLL_FREE, defpackage.wvj.TEST_PHENOTYPE, defpackage.wvj.BIRDSONG_CLOUD_SERVICE_TEST_1, defpackage.wvj.BIRDSONG_CLOUD_SERVICE_TEST_2, defpackage.wvj.DUPLEX_VERIFIED_DATA_EXTRACTION_NUMBER);
    }

    public wxm(ajct ajctVar) {
        this.b = new ajdc(ajctVar);
    }

    public final ajcq a(long j) {
        return ahvr.F(new jww(this, j, 12), this.b);
    }

    public final void b(long j, defpackage.alex alexVar) {
        a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "logAtlasLoggingEvent", 144, "AtlasCallMetricsLogger.java").y("hold for me event:%s", alexVar);
        d(j, new defpackage.who(alexVar, 6));
    }

    public final void c(long j, defpackage.alex alexVar) {
        agsm.i(1140, ahvr.F(new defpackage.vgq(this, j, alexVar, 3), this.b), "Failed to log Atlas logging event once.", new java.lang.Object[0]);
    }

    public final void d(final long j, final java.util.function.Consumer consumer) {
        agsm.i(1141, ahvr.F(new java.util.concurrent.Callable() { // from class: wxl
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                this.a.e(j, consumer);
                return null;
            }
        }, this.b), "failed to update metrics for call created at %d", new java.lang.Object[]{java.lang.Long.valueOf(j)});
    }

    public final void e(long j, java.util.function.Consumer consumer) {
        java.util.Map map = this.c;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        akzx akzxVar = (akzx) map.get(lValueOf);
        if (akzxVar != null) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, akzxVar);
            return;
        }
        akzx akzxVarM = defpackage.amoc.a.m();
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, akzxVarM);
        map.put(lValueOf, akzxVarM);
    }
}

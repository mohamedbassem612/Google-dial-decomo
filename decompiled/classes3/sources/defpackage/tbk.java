package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbk implements java.util.concurrent.Callable {
    public final /* synthetic */ tbm a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.util.function.Consumer c;

    public /* synthetic */ tbk(tbm tbmVar, long j, java.util.function.Consumer consumer) {
        this.a = tbmVar;
        this.b = j;
        this.c = consumer;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        tbm tbmVar = this.a;
        java.util.Set set = tbmVar.d;
        java.lang.Long lValueOf = java.lang.Long.valueOf(this.b);
        if (set.contains(lValueOf)) {
            a.bI(tbm.a.d(), "The metrics for this call have already been appended to CallEvent", "com/android/dialer/revelio/impl/tidepods/impl/state/RevelioState", "setRevelioMetrics", 'g', "RevelioState.java", zct.b);
            return null;
        }
        aa$.ExternalSyntheticApiModelOutline1.m(this.c, (akzx) j$.util.Map.-EL.computeIfAbsent(tbmVar.c, lValueOf, new defpackage.rat(17)));
        return null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class abqh extends defpackage.ajbz implements defpackage.ajcs {
    public volatile defpackage.ajcs a;

    public abqh(defpackage.ajcq ajcqVar, defpackage.ajcs ajcsVar) {
        super(ajcqVar);
        this.a = ajcsVar;
        ajcqVar.c(new defpackage.abqg(this, 0), defpackage.ajbm.INSTANCE);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

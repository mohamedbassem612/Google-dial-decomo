package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aduo extends ajbz implements ajcs {
    public volatile ajcs a;

    public aduo(ajcq ajcqVar, ajcs ajcsVar) {
        super(ajcqVar);
        this.a = ajcsVar;
        ajcqVar.c(new defpackage.absj(this, 13), ajbm.a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo((java.util.concurrent.Delayed) obj);
    }

    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

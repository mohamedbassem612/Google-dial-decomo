package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajun implements defpackage.ajup {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ajuo a;
    public final /* synthetic */ java.lang.Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ java.util.concurrent.TimeUnit e;

    public /* synthetic */ ajun(ajuo ajuoVar, java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.a = ajuoVar;
        this.b = runnable;
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // defpackage.ajup
    public final java.util.concurrent.ScheduledFuture a(defpackage.aprf aprfVar) {
        int i = this.$cid;
        java.lang.Runnable runnable = this.b;
        if (i != 0) {
            ajuo ajuoVar = this.a;
            defpackage.acxq acxqVar = new defpackage.acxq(ajuoVar, runnable, aprfVar, 20, (char[]) null);
            java.util.concurrent.TimeUnit timeUnit = this.e;
            long j = this.d;
            return ajuoVar.b.scheduleAtFixedRate(acxqVar, this.c, j, timeUnit);
        }
        ajuo ajuoVar2 = this.a;
        defpackage.acxq acxqVar2 = new defpackage.acxq(ajuoVar2, runnable, aprfVar, 19, (char[]) null);
        java.util.concurrent.TimeUnit timeUnit2 = this.e;
        long j2 = this.d;
        return ajuoVar2.b.scheduleWithFixedDelay(acxqVar2, this.c, j2, timeUnit2);
    }
}

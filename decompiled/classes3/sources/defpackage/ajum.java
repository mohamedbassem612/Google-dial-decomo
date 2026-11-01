package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajum implements defpackage.ajup {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ajuo a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.util.concurrent.TimeUnit c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ajum(ajuo ajuoVar, java.lang.Object obj, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.a = ajuoVar;
        this.d = obj;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // defpackage.ajup
    public final java.util.concurrent.ScheduledFuture a(defpackage.aprf aprfVar) {
        int i = this.$cid;
        java.lang.Object obj = this.d;
        if (i != 0) {
            ajuo ajuoVar = this.a;
            defpackage.wwx wwxVar = new defpackage.wwx(ajuoVar, obj, aprfVar, 15, (int[]) null);
            java.util.concurrent.TimeUnit timeUnit = this.c;
            return ajuoVar.b.schedule(wwxVar, this.b, timeUnit);
        }
        ajuo ajuoVar2 = this.a;
        defpackage.acxq acxqVar = new defpackage.acxq(ajuoVar2, obj, aprfVar, 18, (char[]) null);
        java.util.concurrent.TimeUnit timeUnit2 = this.c;
        return ajuoVar2.b.schedule(acxqVar, this.b, timeUnit2);
    }
}

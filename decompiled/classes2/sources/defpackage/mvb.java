package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvb extends aomh implements aonn {
    java.lang.Object a;
    long b;
    int c;
    final /* synthetic */ nnx d;
    final /* synthetic */ aazc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvb(aazc aazcVar, nnx nnxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = aazcVar;
        this.d = nnxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            j = this.b;
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() / 1000;
            nnx nnxVar = this.d;
            this.a = "STATE_DOBBY_COOL_DOWN_DAYS";
            this.b = jElapsedRealtime;
            this.c = 1;
            obj = nnxVar.b(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            j = jElapsedRealtime;
            obj2 = "STATE_DOBBY_COOL_DOWN_DAYS";
        }
        alcf alcfVar = ((nok) obj).i;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        aldi.g(alcfVar);
        return abxl.L((java.lang.String) obj2, (int) ((j - alcfVar.b) / 86400));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mvb(this.e, this.d, aolnVar);
    }
}

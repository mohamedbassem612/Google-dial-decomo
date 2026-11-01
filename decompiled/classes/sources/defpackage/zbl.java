package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class zbl extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.zat b;
    final /* synthetic */ defpackage.zbm c;
    final /* synthetic */ long d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbl(defpackage.zat zatVar, defpackage.zbm zbmVar, long j, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = zatVar;
        this.c = zbmVar;
        this.d = j;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.zbl) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aoss aossVar;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                defpackage.aooc.af(obj);
            } else {
                aossVar = (defpackage.aoss) this.e;
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        aossVar = (defpackage.aoss) this.e;
        j$.time.Duration duration = this.b.a.f;
        long millis = duration != null ? duration.toMillis() : 30000L;
        this.e = aossVar;
        this.a = 1;
        if (defpackage.aosv.j(millis, this) == aoluVar) {
            return aoluVar;
        }
        defpackage.zbm zbmVar = this.c;
        defpackage.zat zatVar = this.b;
        long j = this.d;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean zR = defpackage.aosv.r(aossVar);
        this.e = null;
        this.a = 2;
        if (zbmVar.b(zatVar, j, jElapsedRealtime, zR, this) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.zbl zblVar = new defpackage.zbl(this.b, this.c, this.d, aolnVar);
        zblVar.e = obj;
        return zblVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zot {
    public static final aimz a = aimz.i("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache");
    public final aoss b;
    public final j$.util.concurrent.ConcurrentHashMap c;
    public final zpz d;
    public final ahda e;

    public zot(zpz zpzVar, aoss aossVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.d = zpzVar;
        this.b = aossVar;
        this.c = new j$.util.concurrent.ConcurrentHashMap();
        this.e = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zor zorVar, aonj aonjVar, long j, aoln aolnVar) {
        defpackage.zos zosVar;
        java.lang.Object objPutIfAbsent;
        if (aolnVar instanceof defpackage.zos) {
            zosVar = (defpackage.zos) aolnVar;
            int i = zosVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zosVar.c = i - Integer.MIN_VALUE;
            } else {
                zosVar = new defpackage.zos(this, aolnVar);
            }
        } else {
            zosVar = new defpackage.zos(this, aolnVar);
        }
        java.lang.Object obj = zosVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zosVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return ((defpackage.zpb) obj).a;
        }
        aooc.af(obj);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.c;
        java.lang.Object zoqVar = concurrentHashMap.get(zorVar);
        if (zoqVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(zorVar, (zoqVar = new defpackage.zoq(this, aonjVar)))) != null) {
            zoqVar = objPutIfAbsent;
        }
        zosVar.c = 1;
        java.lang.Object objF = ((defpackage.zoq) zoqVar).f(j, zosVar);
        return objF != aoluVar ? objF : aoluVar;
    }
}

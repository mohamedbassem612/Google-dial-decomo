package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apaf extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.aoxh[] b;
    final /* synthetic */ int c;
    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger d;
    final /* synthetic */ defpackage.aowi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apaf(defpackage.aoxh[] aoxhVarArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, defpackage.aowi aowiVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = aoxhVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = aowiVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apaf) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        try {
            if (this.a != 0) {
                defpackage.aooc.af(obj);
            } else {
                defpackage.aooc.af(obj);
                defpackage.aoxh[] aoxhVarArr = this.b;
                int i = this.c;
                defpackage.aoxh aoxhVar = aoxhVarArr[i];
                defpackage.apae apaeVar = new defpackage.apae(this.e, i);
                this.a = 1;
                if (aoxhVar.fM(apaeVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            if (this.d.decrementAndGet() == 0) {
                this.e.e(null);
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            if (this.d.decrementAndGet() == 0) {
                this.e.e(null);
            }
            throw th;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.apaf(this.b, this.c, this.d, this.e, aolnVar);
    }
}

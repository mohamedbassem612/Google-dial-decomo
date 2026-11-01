package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class asl extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ aowi c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asl(aowi aowiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = aowiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        aoub aoubVar;
        aoub aoubVar2;
        aoss aossVar = (aoss) this.d;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            aoubVar = this.a;
            try {
                aooc.af(obj);
                aoubVar2 = aoubVar;
                aoubVar2.s((java.util.concurrent.CancellationException) null);
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                aoubVar.s((java.util.concurrent.CancellationException) null);
                throw th;
            }
        }
        aooc.af(obj);
        aoub aoubVarAn = aoov.an(aossVar, (aolr) null, 0, new defpackage.hlf((aoln) null, 1, (byte[]) null), 3);
        try {
            aowi aowiVar = this.c;
            this.d = null;
            this.a = aoubVarAn;
            this.b = 1;
            java.lang.Object objI = aowiVar.i(this);
            if (objI == aoluVar) {
                return aoluVar;
            }
            obj = objI;
            aoubVar2 = aoubVarAn;
            aoubVar2.s((java.util.concurrent.CancellationException) null);
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
            aoubVar = aoubVarAn;
            aoubVar.s((java.util.concurrent.CancellationException) null);
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.asl aslVar = new defpackage.asl(this.c, aolnVar);
        aslVar.d = obj;
        return aslVar;
    }
}

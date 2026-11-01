package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gya extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.Runnable d;
    final /* synthetic */ gyb e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gya(long j, java.lang.Runnable runnable, gyb gybVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = j;
        this.d = runnable;
        this.e = gybVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoss] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r0 = (aoss) this.f;
        aolu aoluVar = aolu.a;
        try {
            if (this.b != 0) {
                java.lang.Object obj2 = this.a;
                aooc.af(obj);
                r0 = obj2;
            } else {
                aooc.af(obj);
                aoub aoubVar = r0.c().get(aoub.d);
                aooh.c(aoubVar);
                aoub aoubVar2 = aoubVar;
                long j = this.c;
                this.f = null;
                this.a = aoubVar2;
                this.b = 1;
                r0 = aoubVar2;
                if (aosv.j(j, this) == aoluVar) {
                    return aoluVar;
                }
            }
            this.d.run();
            gyb gybVar = this.e;
            java.lang.Runnable runnable = this.d;
            synchronized (gybVar.b) {
                java.util.Map map = gybVar.a;
                if (map.get(runnable) == r0) {
                    map.remove(runnable);
                }
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            gyb gybVar2 = this.e;
            java.lang.Runnable runnable2 = this.d;
            synchronized (gybVar2.b) {
                java.util.Map map2 = gybVar2.a;
                if (map2.get(runnable2) == r0) {
                    map2.remove(runnable2);
                }
                throw th;
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.gya gyaVar = new defpackage.gya(this.c, this.d, this.e, aolnVar);
        gyaVar.f = obj;
        return gyaVar;
    }
}

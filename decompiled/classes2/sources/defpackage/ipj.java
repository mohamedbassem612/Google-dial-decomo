package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ipj extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ ipo f;
    final /* synthetic */ iox g;
    final /* synthetic */ ipc h;
    final /* synthetic */ apdp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipj(ipo ipoVar, iox ioxVar, apdp apdpVar, ipc ipcVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = ipoVar;
        this.g = ioxVar;
        this.i = apdpVar;
        this.h = ipcVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [iox] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [albh] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        ?? r3;
        java.lang.Object obj3;
        ?? r1;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.d;
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                r1 = obj4;
                obj3 = obj5;
                r3 = obj6;
            } else {
                aooc.af(obj);
            }
            try {
                r1.c().c.a((ipc) obj2, (albh) r3);
                ((apdp) obj3).d();
                this.f.g.o(rmx.qW);
                return aojh.a;
            } catch (java.lang.Throwable th) {
                ((apdp) obj3).d();
                throw th;
            }
        }
        aooc.af(obj);
        this.f.g.o(rmx.qX);
        iox ioxVar = this.g;
        this.e = 1;
        obj = ioxVar.b(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        apdp apdpVar = this.i;
        iox ioxVar2 = this.g;
        ipc ipcVar = this.h;
        albh albhVar = (albh) obj;
        this.a = albhVar;
        this.b = apdpVar;
        this.c = ioxVar2;
        this.d = ipcVar;
        this.e = 2;
        if (apdpVar.b(this) == aoluVar) {
            return aoluVar;
        }
        obj2 = ipcVar;
        r3 = albhVar;
        r1 = ioxVar2;
        obj3 = apdpVar;
        r1.c().c.a((ipc) obj2, (albh) r3);
        ((apdp) obj3).d();
        this.f.g.o(rmx.qW);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ipj(this.f, this.g, this.i, this.h, aolnVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ats extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ats(aomy aomyVar, aonn aonnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aomyVar;
        this.b = aonnVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aonn, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        java.lang.Object obj2 = this.d;
        if (i != 0) {
            aoss aossVar = (aoss) obj2;
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                aoot aootVar = new aoot();
                aowy aowyVar = new aowy(new ceq((aomy) this.c, (aoln) null));
                tgo tgoVar = new tgo(aootVar, aossVar, (aonn) this.b, 1);
                this.d = null;
                this.a = 1;
                if (aowyVar.fM(tgoVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aoss aossVar2 = (aoss) obj2;
        aolu aoluVar2 = aolu.a;
        int i3 = this.a;
        aooc.af(obj);
        if (i3 != 0) {
            if (i3 == 1) {
            }
            return aojh.a;
        }
        ?? r8 = this.b;
        this.d = aossVar2;
        this.a = 1;
        if (r8.n(this) == aoluVar2) {
            return aoluVar2;
        }
        ?? r9 = this.c;
        this.d = null;
        this.a = 2;
        if (r9.a(aossVar2, this) == aoluVar2) {
            return aoluVar2;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonn, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.ats atsVar = new defpackage.ats((aomy) this.c, (aonn) this.b, aolnVar, 1);
            atsVar.d = obj;
            return atsVar;
        }
        defpackage.ats atsVar2 = new defpackage.ats((aoub) this.b, (aonn) this.c, aolnVar, 0);
        atsVar2.d = obj;
        return atsVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ats(aoub aoubVar, aonn aonnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoubVar;
        this.c = aonnVar;
    }
}

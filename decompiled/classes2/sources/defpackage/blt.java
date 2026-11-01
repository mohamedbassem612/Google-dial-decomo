package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class blt extends aomg implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blt(defpackage.aul aulVar, aoss aossVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = aulVar;
        this.c = aossVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((cwc) obj, (aoln) obj2).b(aojh.a);
        }
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aomy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        int i = this.$cid;
        java.lang.Object obj3 = this.d;
        if (i != 0) {
            cwc cwcVar = (cwc) obj3;
            aolu aoluVar = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    java.lang.Object obj4 = this.b;
                    boolean z = ((defpackage.aul) obj4).b;
                    aowi aowiVar = ((defpackage.aul) obj4).e;
                    aonj aonjVar = ((defpackage.aul) obj4).d;
                    this.d = null;
                    this.a = 1;
                    if (ru.f(cwcVar, z, aowiVar, aonjVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } catch (java.util.concurrent.CancellationException e) {
                if (!aosv.r((aoss) this.c)) {
                    throw e;
                }
            } finally {
                obj2 = this.b;
                ((defpackage.aul) obj2).e.b(defpackage.aug.c);
            }
            return aojh.a;
        }
        cwc cwcVar2 = (cwc) obj3;
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 != 0) {
            if (i2 == 1) {
            }
            if (!((java.lang.Boolean) obj).booleanValue() && !((defpackage.blw) this.b).z()) {
                this.c.a();
            }
            return aojh.a;
        }
        this.d = cwcVar2;
        this.a = 1;
        aono aonoVar = defpackage.atv.a;
        obj = defpackage.atv.b(cwcVar2, false, defpackage.cvg.b, true, this);
        if (obj == aoluVar2) {
            return aoluVar2;
        }
        defpackage.cvg cvgVar = defpackage.cvg.a;
        this.d = null;
        this.a = 2;
        obj = defpackage.ro.j(cwcVar2, (defpackage.cvm) obj, cvgVar, this);
        if (obj == aoluVar2) {
            return aoluVar2;
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            this.c.a();
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoss, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.b;
        if (i != 0) {
            defpackage.blt bltVar = new defpackage.blt((defpackage.aul) obj2, (aoss) this.c, aolnVar, 1);
            bltVar.d = obj;
            return bltVar;
        }
        defpackage.blt bltVar2 = new defpackage.blt((defpackage.blw) obj2, (aomy) this.c, aolnVar, 0);
        bltVar2.d = obj;
        return bltVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blt(defpackage.blw blwVar, aomy aomyVar, aoln aolnVar, int i) {
        super(aolnVar);
        this.$cid = i;
        this.b = blwVar;
        this.c = aomyVar;
    }
}

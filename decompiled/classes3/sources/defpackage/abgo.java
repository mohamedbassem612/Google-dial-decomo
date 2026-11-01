package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgo extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgo(defpackage.abgq abgqVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abgqVar;
        this.a = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aooc.af(obj);
            aoss aossVar = (aoss) this.c;
            ailj ailjVarK = ((aihd) ((defpackage.pzj) this.b).c.a()).k();
            aooh.e(ailjVarK, "iterator(...)");
            while (ailjVarK.hasNext()) {
                aoov.an(aossVar, (aolr) null, 0, new jbu((pzi) ailjVarK.next(), this.a, (aoln) null, 11), 3);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aoss aossVar2 = (aoss) this.c;
        aii aiiVarA = aij.a(0.0f);
        defpackage.zqs zqsVar = new defpackage.zqs(aiiVarA, (aoln) null, 16);
        defpackage.abgq abgqVar = (defpackage.abgq) this.b;
        defpackage.abgi abgiVar = abgqVar.u;
        aoov.an(abgiVar.e, (aolr) null, 0, zqsVar, 3);
        boolean z = this.a;
        abgiVar.b(ajsz.bU(defpackage.abgi.c(abgiVar.a()), z ? new defpackage.abhd(new defpackage.abgd(aiiVarA, 6), 6) : new defpackage.abhe(new defpackage.abgd(aiiVarA, 7), 6)));
        if (abgqVar.i) {
            aoov.an(aossVar2, (aolr) null, 0, new defpackage.abgk(abgqVar, (aoln) null, 14, (char[][][]) null), 3);
        }
        aoov.an(aossVar2, (aolr) null, 0, new defpackage.abgn(abgqVar, z, (aoln) null, 1), 3);
        aoov.an(aossVar2, (aolr) null, 0, new defpackage.abgn(z, abgqVar, (aoln) null, 0), 3);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.b;
        if (i != 0) {
            defpackage.abgo abgoVar = new defpackage.abgo((defpackage.pzj) obj2, this.a, aolnVar, 1);
            abgoVar.c = obj;
            return abgoVar;
        }
        defpackage.abgo abgoVar2 = new defpackage.abgo((defpackage.abgq) obj2, this.a, aolnVar, 0);
        abgoVar2.c = obj;
        return abgoVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgo(defpackage.pzj pzjVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = pzjVar;
        this.a = z;
    }
}

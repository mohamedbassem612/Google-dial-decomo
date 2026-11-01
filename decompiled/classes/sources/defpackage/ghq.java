package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghq extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghq(defpackage.aoln aolnVar, defpackage.aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.ghq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.ghq) c((defpackage.ggv) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aonn, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            defpackage.aooc.af(obj);
            defpackage.ggv ggvVar = (defpackage.ggv) this.b;
            if (ggvVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            }
            return this.a.a(ggvVar.b());
        }
        defpackage.aooc.af(obj);
        defpackage.aolp aolpVar = ((defpackage.aoss) this.b).c().get(defpackage.aolo.k);
        if (aolpVar == null) {
            defpackage.aooh.g();
        }
        defpackage.aolo aoloVar = (defpackage.aolo) aolpVar;
        defpackage.aosi aosiVar = new defpackage.aosi(null);
        defpackage.aoov.al(defpackage.aotv.a, aoloVar, 4, new defpackage.fzn(aosiVar, (defpackage.aonn) this.a, (defpackage.aoln) null, 4));
        while (!aosiVar.x()) {
            try {
                return defpackage.aoov.ah(aoloVar, new defpackage.dgz(aosiVar, (defpackage.aoln) null, 7));
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return aosiVar.D();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aonn, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.ghq ghqVar = new defpackage.ghq((defpackage.aonn) this.a, aolnVar, 1);
            ghqVar.b = obj;
            return ghqVar;
        }
        defpackage.ghq ghqVar2 = new defpackage.ghq(aolnVar, (defpackage.aonj) this.a, 0);
        ghqVar2.b = obj;
        return ghqVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghq(defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonnVar;
    }
}

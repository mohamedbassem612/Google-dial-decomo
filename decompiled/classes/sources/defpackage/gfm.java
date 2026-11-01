package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gfm extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfm(defpackage.aogc aogcVar, defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = aogcVar;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid == 0) {
            return new defpackage.gfm((defpackage.gfn) this.a, (defpackage.aoln) obj3, 0).b(defpackage.aojh.a);
        }
        new defpackage.gfm((defpackage.aogc) this.a, (defpackage.aoln) obj3, 1);
        return defpackage.anar.o(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            return defpackage.anar.o(obj);
        }
        defpackage.aooc.af(obj);
        ((defpackage.gfn) this.a).f.decrementAndGet();
        return defpackage.aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfm(defpackage.gfn gfnVar, defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.a = gfnVar;
    }
}

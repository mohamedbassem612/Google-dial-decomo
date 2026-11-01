package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgi extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.cer a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgi(defpackage.ccp ccpVar, defpackage.aogc aogcVar, android.view.View view, defpackage.zas zasVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ccpVar;
        this.d = aogcVar;
        this.b = view;
        this.c = zasVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return ((defpackage.kgi) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.kgi) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ccp, cer] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.aooc.af(obj);
            ((defpackage.kca) this.d).a.a(new defpackage.kav(((java.lang.Boolean) this.a.a()).booleanValue(), (defpackage.lpv) this.c, defpackage.kcq.a((android.content.Context) this.b)));
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        ?? r4 = this.a;
        if (((java.lang.Boolean) r4.a()).booleanValue()) {
            r4.b(java.lang.Boolean.FALSE);
            return defpackage.aojh.a;
        }
        java.lang.Object obj2 = this.d;
        defpackage.aogc aogcVar = (defpackage.aogc) obj2;
        aogcVar.aF((android.view.View) this.b, new ioi(this.c, 12));
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ccp, cer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zas] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.d;
            return new defpackage.kgi((defpackage.kca) obj2, this.a, (defpackage.lpv) this.c, (android.content.Context) this.b, aolnVar, 1);
        }
        ?? r1 = this.a;
        java.lang.Object obj3 = this.d;
        return new defpackage.kgi((defpackage.ccp) r1, (defpackage.aogc) obj3, (android.view.View) this.b, (defpackage.zas) this.c, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgi(defpackage.kca kcaVar, defpackage.cer cerVar, defpackage.lpv lpvVar, android.content.Context context, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = kcaVar;
        this.a = cerVar;
        this.c = lpvVar;
        this.b = context;
    }
}

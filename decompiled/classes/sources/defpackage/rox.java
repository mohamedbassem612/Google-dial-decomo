package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rox extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(defpackage.aonj aonjVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aonjVar;
        this.b = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.rox) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.rox) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return ((defpackage.rox) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 3) {
            return ((defpackage.rox) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.rox) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ccp, cer, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aooc.af(obj);
            defpackage.rpa rpaVar = (defpackage.rpa) this.b;
            defpackage.rol rolVar = rpaVar.j;
            java.lang.Object obj2 = this.a;
            if (!defpackage.aooh.n(obj2, rolVar)) {
                rpaVar.j = (defpackage.rol) obj2;
                rpaVar.o.s(defpackage.ajcm.a, defpackage.rpl.a);
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            defpackage.aooc.af(obj);
            if (((java.lang.Boolean) this.a.a()).booleanValue()) {
                ((defpackage.kca) this.b).d.a();
            }
            return defpackage.aojh.a;
        }
        if (i != 2) {
            if (i == 3) {
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(defpackage.dvx.c(((defpackage.zrw) this.a).c, (java.lang.String) this.b) == 0);
            }
            defpackage.aooc.af(obj);
            this.a.a(java.lang.Boolean.valueOf(!defpackage.aooh.n(this.b, defpackage.abny.a)));
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        ?? r4 = this.a;
        if (!((java.lang.Boolean) r4.a()).booleanValue()) {
            ((defpackage.uod) this.b).d.i(null).b(defpackage.mce.FAVORITES_BAR_FRAGMENT_ON_CREATE);
            r4.b(java.lang.Boolean.TRUE);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aonn, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.rox roxVar;
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.rox((defpackage.rol) this.a, (defpackage.rpa) this.b, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.rox((defpackage.cer) this.a, (defpackage.kca) this.b, aolnVar, 1);
        }
        if (i == 2) {
            roxVar = new defpackage.rox((defpackage.uod) this.b, (defpackage.ccp) this.a, aolnVar, 2);
        } else {
            if (i != 3) {
                return new defpackage.rox((defpackage.aonj) this.a, (defpackage.aonn) this.b, aolnVar, 4);
            }
            roxVar = new defpackage.rox((defpackage.zrw) this.a, (java.lang.String) this.b, aolnVar, 3);
        }
        return roxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(defpackage.cer cerVar, defpackage.kca kcaVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = cerVar;
        this.b = kcaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(defpackage.rol rolVar, defpackage.rpa rpaVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rolVar;
        this.b = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(defpackage.uod uodVar, defpackage.ccp ccpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uodVar;
        this.a = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rox(defpackage.zrw zrwVar, java.lang.String str, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zrwVar;
        this.b = str;
    }
}

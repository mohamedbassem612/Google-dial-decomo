package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbr implements defpackage.abbp {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public abbr(aazm aazmVar, defpackage.vaa vaaVar, int i) {
        this.$cid = i;
        aooh.f(aazmVar, "encryptionHelper");
        this.a = vaaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Type inference failed for: r4v7, types: [abbp, java.lang.Object] */
    @Override // defpackage.abbp
    public final java.lang.Object a(defpackage.abbm abbmVar, aoln aolnVar) throws aois {
        defpackage.abbq abbqVar;
        if (this.$cid != 0) {
            if (!(abbmVar instanceof defpackage.abbl)) {
                return this.a.a(abbmVar, aolnVar);
            }
            throw null;
        }
        if (aolnVar instanceof defpackage.abbq) {
            abbqVar = (defpackage.abbq) aolnVar;
            int i = abbqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abbqVar.c = i - Integer.MIN_VALUE;
            } else {
                abbqVar = new defpackage.abbq(this, aolnVar);
            }
        } else {
            abbqVar = new defpackage.abbq(this, aolnVar);
        }
        java.lang.Object objAi = abbqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abbqVar.c;
        if (i2 == 0) {
            aooc.af(objAi);
            java.lang.Object obj = this.a;
            abbqVar.c = 1;
            objAi = ((defpackage.vaa) obj).ai(abbmVar, abbqVar);
            if (objAi == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAi);
        }
        return new defpackage.abbs((defpackage.abbn) objAi);
    }

    public abbr(defpackage.abbp abbpVar, int i) {
        this.$cid = i;
        this.a = abbpVar;
        new j$.util.concurrent.ConcurrentHashMap();
    }
}

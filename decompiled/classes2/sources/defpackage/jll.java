package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jll implements aomy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public jll(aonj aonjVar, defpackage.jyh jyhVar, int i) {
        this.$cid = i;
        this.b = aonjVar;
        this.a = jyhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aoir, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a() {
        emn emnVar;
        eoe eoeVarR;
        eoe eoeVarR2;
        eoe eoeVarR3;
        eoe eoeVarR4;
        int i = this.$cid;
        if (i == 0) {
            eoi eoiVarJ = defpackage.zb.j(this.b);
            emnVar = eoiVarJ instanceof emn ? (emn) eoiVarJ : null;
            return (emnVar == null || (eoeVarR = emnVar.R()) == null) ? ((aw) this.a).R() : eoeVarR;
        }
        if (i == 1) {
            return new cqg(((defpackage.bwk) this.a).a(((java.lang.Number) this.b.a()).floatValue()));
        }
        if (i == 2) {
            this.b.a(this.a);
            return aojh.a;
        }
        if (i == 3) {
            this.b.a(this.a);
            return aojh.a;
        }
        if (i == 4) {
            eoi eoiVarJ2 = defpackage.zb.j(this.b);
            emnVar = eoiVarJ2 instanceof emn ? (emn) eoiVarJ2 : null;
            if (emnVar != null && (eoeVarR2 = emnVar.R()) != null) {
                return eoeVarR2;
            }
            eoe eoeVarR5 = ((aw) this.a).R();
            aooh.e(eoeVarR5, "<get-defaultViewModelProviderFactory>(...)");
            return eoeVarR5;
        }
        ?? r2 = this.b;
        if (i != 5) {
            eoi eoiVarJ3 = defpackage.zb.j(r2);
            emnVar = eoiVarJ3 instanceof emn ? (emn) eoiVarJ3 : null;
            if (emnVar != null && (eoeVarR4 = emnVar.R()) != null) {
                return eoeVarR4;
            }
            eoe eoeVarR6 = ((aw) this.a).R();
            aooh.e(eoeVarR6, "<get-defaultViewModelProviderFactory>(...)");
            return eoeVarR6;
        }
        eoi eoiVarJ4 = defpackage.zb.j(r2);
        emnVar = eoiVarJ4 instanceof emn ? (emn) eoiVarJ4 : null;
        if (emnVar != null && (eoeVarR3 = emnVar.R()) != null) {
            return eoeVarR3;
        }
        eoe eoeVarR7 = ((aw) this.a).R();
        aooh.e(eoeVarR7, "<get-defaultViewModelProviderFactory>(...)");
        return eoeVarR7;
    }

    public jll(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kkg extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkg(defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            defpackage.kkg kkgVar = new defpackage.kkg((defpackage.aoln) obj3, 1, null);
            kkgVar.c = (defpackage.aogc) obj;
            kkgVar.b = (defpackage.aogc) obj2;
            return kkgVar.b(defpackage.aojh.a);
        }
        defpackage.kkg kkgVar2 = new defpackage.kkg((defpackage.aoln) obj3, 0);
        kkgVar2.c = (defpackage.aoxi) obj;
        kkgVar2.b = (java.lang.Object[]) obj2;
        return kkgVar2.b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoxi, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i = this.a;
            defpackage.aooc.af(obj);
            if (i == 0) {
                ?? r6 = this.c;
                java.util.List listCU = defpackage.ajsz.cU((defpackage.kkh[]) this.b);
                this.a = 1;
                if (r6.a(listCU, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.b;
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i2 = this.a;
        defpackage.aooc.af(obj);
        if (i2 != 0) {
            return obj3;
        }
        this.c = null;
        this.b = obj3;
        this.a = 1;
        ((defpackage.gat) ((defpackage.aogc) obj2).b).e.s(null);
        return defpackage.aojh.a == aoluVar2 ? aoluVar2 : obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkg(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}

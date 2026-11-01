package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeur implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aeur(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [amwu, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return defpackage.ahyn.h((defpackage.aeuu) ((defpackage.ahys) this.a).a.a());
            case 1:
                return java.lang.Boolean.FALSE;
            case 2:
                return ((defpackage.aw) this.a).I();
            case 3:
                return defpackage.afsq.L((android.content.Context) this.a);
            case 4:
                defpackage.aift aiftVar = new defpackage.aift(4);
                aiftVar.i(new ahkb());
                aiftVar.k((java.lang.Iterable) ((defpackage.gou) this.a).b.a());
                aiftVar.i(new ahkh());
                return aiftVar.g();
            case 5:
                defpackage.aift aiftVar2 = new defpackage.aift(4);
                java.util.Iterator it = ((defpackage.ajyz) this.a).b.iterator();
                while (it.hasNext()) {
                    aiftVar2.i(((ajzb) it.next()).a());
                }
                defpackage.aify aifyVarG = aiftVar2.g();
                defpackage.aooh.e(aifyVarG, "build(...)");
                return aifyVarG;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.aify.p(new akbh(this.a, 0));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.aify.p(new akbh(((defpackage.ajyz) this.a).a, 1));
            default:
                return defpackage.aify.p((defpackage.aify) this.a.a());
        }
    }
}

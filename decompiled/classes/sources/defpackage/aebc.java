package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aebc extends defpackage.aomh implements defpackage.aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.adzu b;
    final /* synthetic */ defpackage.adao c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebc(defpackage.adao adaoVar, defpackage.adzu adzuVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.c = adaoVar;
        this.b = adzuVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aebc) c((defpackage.aegw) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aegu aeguVar;
        defpackage.aooc.af(obj);
        defpackage.tvn tvnVarBS = defpackage.agab.bS(((defpackage.aegw) this.a).L());
        defpackage.adzy adzyVar = defpackage.adzy.UNKNOWN;
        defpackage.adzu adzuVar = defpackage.adzu.CHIME;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            aeguVar = iOrdinal != 1 ? defpackage.aegu.NONE : defpackage.aegu.GNP;
        } else {
            aeguVar = defpackage.aegu.CHIME;
        }
        tvnVarBS.J(aeguVar);
        return tvnVarBS.z();
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aebc aebcVar = new defpackage.aebc(this.c, this.b, aolnVar);
        aebcVar.a = obj;
        return aebcVar;
    }
}

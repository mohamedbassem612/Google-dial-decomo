package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tuc implements defpackage.ttx {
    public final defpackage.gfj a = new defpackage.ttz(this);
    public final defpackage.gfi b = new defpackage.tua(this);
    public final defpackage.gfi c = new defpackage.tub(this);
    private final defpackage.gfy d;

    public tuc(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final tuf k(defpackage.gin ginVar) {
        int iQ = defpackage.dzk.Q(ginVar, "callCreatedTimestampMs");
        int iQ2 = defpackage.dzk.Q(ginVar, "callId");
        int iQ3 = defpackage.dzk.Q(ginVar, "mlVerdict");
        int iQ4 = defpackage.dzk.Q(ginVar, "userVerdict");
        int iQ5 = defpackage.dzk.Q(ginVar, "userScamAlertAction");
        long jC = iQ == -1 ? 0L : ginVar.c(iQ);
        tue tueVar = null;
        java.lang.String strE = iQ2 == -1 ? null : ginVar.e(iQ2);
        tud tudVarF = iQ3 == -1 ? null : defpackage.ttj.f(ginVar.e(iQ3));
        tud tudVarF2 = iQ4 == -1 ? null : defpackage.ttj.f(ginVar.e(iQ4));
        if (iQ5 != -1) {
            java.lang.String strE2 = ginVar.e(iQ5);
            defpackage.aooh.f(strE2, "nameInStorage");
            tue tueVar2 = tue.a;
            defpackage.aooh.f(strE2, "nameInStorage");
            defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) tue.e);
            while (aojlVar.hasNext()) {
                tueVar = (tue) aojlVar.next();
                if (defpackage.aooh.n(tueVar.f, strE2)) {
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return new tuf(jC, strE, tudVarF, tudVarF2, tueVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new defpackage.tfm(this, list, list2, list3, 2), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new slv(this, collection, 8, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new slv(rsrVarI.a, rsrVarI, 6), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new slv(this, str, 12, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new tty(this, str, str2, (j$.time.Instant) obj, aonjVar), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 20), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new slv(rsrVarI.a, rsrVarI, 9), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new slv(rsrVarI.a, rsrVarI, 10), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new slv(this, collection, 7, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new slv(this, collection, 11, (byte[]) null), aolnVar);
    }
}

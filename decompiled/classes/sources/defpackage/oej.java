package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oej implements defpackage.oef {
    public final defpackage.gfj a = new defpackage.oeg(this);
    public final defpackage.gfi b = new defpackage.oeh(this);
    public final defpackage.gfi c = new defpackage.oei(this);
    private final defpackage.gfy d;

    public oej(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final java.lang.String k(oee oeeVar) {
        if (oeeVar.ordinal() == 0) {
            return "URGENT";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(oeeVar))));
    }

    public static final defpackage.oel l(defpackage.gin ginVar) {
        oee oeeVar;
        int iQ = defpackage.dzk.Q(ginVar, "call_creation_time_millis");
        int iQ2 = defpackage.dzk.Q(ginVar, "call_type");
        long jC = iQ == -1 ? 0L : ginVar.c(iQ);
        if (iQ2 == -1) {
            oeeVar = null;
        } else {
            java.lang.String strE = ginVar.e(iQ2);
            if (strE.hashCode() != -1783576767 || !strE.equals("URGENT")) {
                throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE)));
            }
            oeeVar = oee.a;
        }
        return new defpackage.oel(jC, oeeVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 13), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 14), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 15, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new lte(this, str, 16), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (java.lang.Long) obj, aonjVar, 16), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 17), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 18, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 19, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 13), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 17), aolnVar);
    }
}

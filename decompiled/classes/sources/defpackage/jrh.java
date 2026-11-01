package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jrh implements defpackage.jrd {
    public final defpackage.gfj a = new defpackage.jre(this);
    public final defpackage.gfi b = new defpackage.jrf(this);
    public final defpackage.gfi c = new defpackage.jrg(this);
    private final defpackage.gfy d;

    public jrh(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final java.lang.String k(ztf ztfVar) {
        int iOrdinal = ztfVar.ordinal();
        if (iOrdinal == 0) {
            return "STIR_SHAKEN_UNKNOWN";
        }
        if (iOrdinal == 1) {
            return "STIR_SHAKEN_VERIFIED";
        }
        if (iOrdinal == 2) {
            return "STIR_SHAKEN_FAILED";
        }
        if (iOrdinal == 3) {
            return "UNRECOGNIZED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ztfVar))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final defpackage.jrj l(defpackage.gin ginVar) {
        ztf ztfVar;
        int iQ = defpackage.dzk.Q(ginVar, "callCreationTimeMillis");
        int iQ2 = defpackage.dzk.Q(ginVar, "stirShakenStatus");
        long jC = iQ == -1 ? 0L : ginVar.c(iQ);
        if (iQ2 != -1) {
            java.lang.String strE = ginVar.e(iQ2);
            switch (strE.hashCode()) {
                case -1226470913:
                    if (strE.equals("STIR_SHAKEN_FAILED")) {
                        ztfVar = ztf.c;
                    }
                    break;
                case -192370678:
                    if (strE.equals("STIR_SHAKEN_VERIFIED")) {
                        ztfVar = ztf.b;
                    }
                    break;
                case 573789423:
                    if (strE.equals("UNRECOGNIZED")) {
                        ztfVar = ztf.d;
                    }
                    break;
                case 1435856552:
                    if (strE.equals("STIR_SHAKEN_UNKNOWN")) {
                        ztfVar = ztf.a;
                    }
                    break;
            }
            throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE)));
        }
        ztfVar = null;
        return new defpackage.jrj(jC, ztfVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 7), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 16, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 13), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new gwo(this, str, 12, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (java.lang.Long) obj, aonjVar, 6), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 5), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 15), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 14), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 18, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 17, (byte[]) null), aolnVar);
    }
}

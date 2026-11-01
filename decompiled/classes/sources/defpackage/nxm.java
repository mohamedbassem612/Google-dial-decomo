package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxm implements defpackage.nxh {
    public final defpackage.gfj a = new defpackage.nxj(this);
    public final defpackage.gfi b = new defpackage.nxk(this);
    public final defpackage.gfi c = new defpackage.nxl(this);
    private final defpackage.gfy d;

    public nxm(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    public static final java.lang.String k(nwx nwxVar) {
        int iOrdinal = nwxVar.ordinal();
        if (iOrdinal == 0) {
            return "UNKNOWN_REACHABILITY";
        }
        if (iOrdinal == 1) {
            return "UNREACHABLE";
        }
        if (iOrdinal == 2) {
            return "REACHABLE";
        }
        if (iOrdinal == 3) {
            return "UNRECOGNIZED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(nwxVar))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final defpackage.nxp l(defpackage.gin ginVar) {
        int iQ = defpackage.dzk.Q(ginVar, "normalized_phone_number");
        int iQ2 = defpackage.dzk.Q(ginVar, "meet_reachability");
        int iQ3 = defpackage.dzk.Q(ginVar, "last_queried");
        int iQ4 = defpackage.dzk.Q(ginVar, "revision");
        nwx nwxVar = null;
        java.lang.String strE = iQ == -1 ? null : ginVar.e(iQ);
        if (iQ2 != -1) {
            java.lang.String strE2 = ginVar.e(iQ2);
            switch (strE2.hashCode()) {
                case -1097330100:
                    if (strE2.equals("UNKNOWN_REACHABILITY")) {
                        nwxVar = nwx.a;
                        break;
                    }
                    throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE2)));
                case 573789423:
                    if (strE2.equals("UNRECOGNIZED")) {
                        nwxVar = nwx.d;
                        break;
                    }
                    throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE2)));
                case 1087069876:
                    if (strE2.equals("UNREACHABLE")) {
                        nwxVar = nwx.b;
                        break;
                    }
                    throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE2)));
                case 1652264237:
                    if (strE2.equals("REACHABLE")) {
                        nwxVar = nwx.c;
                        break;
                    }
                    throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE2)));
                default:
                    throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(strE2)));
            }
        }
        return new defpackage.nxp(strE, nwxVar, iQ3 == -1 ? 0L : ginVar.c(iQ3), iQ4 != -1 ? ginVar.c(iQ4) : 0L);
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 12), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 11), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new defpackage.nxi(rsrVarI.a, rsrVarI, 1, null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new defpackage.nxi(this, str, 0), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (java.lang.String) obj, aonjVar, 14), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 15), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 10, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new lte(rsrVarI.a, rsrVarI, 8, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 9), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new lte(this, collection, 12), aolnVar);
    }
}

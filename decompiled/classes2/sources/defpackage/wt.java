package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class wt {
    public static java.lang.reflect.Method a;

    public static final java.lang.Object a(aonj aonjVar, aoln aolnVar) {
        defpackage.dfx dfxVar = (defpackage.dfx) aolnVar.u().get(defpackage.dfx.a);
        if (dfxVar == null) {
            return cdh.d(aolnVar.u()).a(aonjVar, aolnVar);
        }
        new defpackage.blq(aonjVar, (aoln) null, 1);
        return dfxVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final dji b(dij dijVar) {
        dip dipVar = din.H;
        die dieVar = dijVar.b;
        dji djiVar = (dji) dieVar.g(dipVar);
        java.util.List list = (java.util.List) dieVar.g(din.D);
        java.lang.Object obj = null;
        if (list != null) {
            obj = (dji) (list.isEmpty() ? null : list.get(0));
        }
        return djiVar == null ? obj : djiVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public static final java.lang.String c(dij dijVar, android.content.res.Resources resources) throws aois {
        java.util.Collection collection;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int iW;
        die dieVar = dijVar.b;
        java.lang.Object objG = dieVar.g(din.b);
        dja djaVar = (dja) dieVar.g(din.L);
        dib dibVar = (dib) dieVar.g(din.A);
        java.lang.Object string = null;
        if (djaVar != null) {
            int iOrdinal = djaVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    if (objG == null) {
                        objG = resources.getString(2132019118);
                    }
                } else if (dibVar == null) {
                    dibVar = null;
                } else if (dibVar.a == 2 && objG == null) {
                    objG = resources.getString(2132020272);
                }
            } else if (dibVar == null) {
                dibVar = null;
            } else if (dibVar.a == 2 && objG == null) {
                objG = resources.getString(2132020273);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) dieVar.g(din.K);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((dibVar == null || dibVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2132020065) : resources.getString(2132019487);
            }
        }
        defpackage.dia diaVar = (defpackage.dia) dieVar.g(din.c);
        if (diaVar != null) {
            if (diaVar != defpackage.dia.a) {
                if (objG == null) {
                    aopm aopmVar = diaVar.c;
                    float fFloatValue = ((java.lang.Number) aopmVar.a()).floatValue() - ((java.lang.Number) aopmVar.b()).floatValue() == 0.0f ? 0.0f : (diaVar.b - ((java.lang.Number) aopmVar.b()).floatValue()) / (((java.lang.Number) aopmVar.a()).floatValue() - ((java.lang.Number) aopmVar.b()).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iW = 0;
                    } else {
                        iW = fFloatValue == 1.0f ? 100 : aooc.w(java.lang.Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objG = resources.getString(2132020540, java.lang.Integer.valueOf(iW));
                }
            } else if (objG == null) {
                objG = resources.getString(2132019027);
            }
        }
        dip dipVar = din.H;
        if (dieVar.f(dipVar)) {
            die dieVarH = dijVar.i().h();
            java.util.Collection collection2 = (java.util.Collection) dieVarH.g(din.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (java.util.Collection) dieVarH.g(din.D)) == null || collection.isEmpty()) && (((charSequence = (java.lang.CharSequence) dieVarH.g(dipVar)) == null || charSequence.length() == 0) && ((charSequence2 = (java.lang.CharSequence) dieVarH.g(din.v)) == null || charSequence2.length() == 0)))) {
                string = resources.getString(2132020271);
            }
            objG = string;
        }
        return (java.lang.String) objG;
    }

    public static final boolean d(dij dijVar) {
        return !dijVar.h().f(din.j);
    }

    public static final boolean e(dij dijVar) {
        die dieVar = dijVar.b;
        dja djaVar = (dja) dieVar.g(din.L);
        dib dibVar = (dib) dieVar.g(din.A);
        java.lang.Boolean bool = (java.lang.Boolean) dieVar.g(din.K);
        boolean z = djaVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (dibVar == null || dibVar.a != 4) {
                return true;
            }
        }
        return z;
    }

    public static final boolean f(dij dijVar) {
        return dijVar.a.s == dpq.b;
    }

    public static final boolean g(dij dijVar, android.content.res.Resources resources, boolean z) {
        if (dil.a(dijVar) || z) {
            return false;
        }
        die dieVar = dijVar.b;
        if (!dieVar.a) {
            java.util.List list = (java.util.List) dieVar.g(din.a);
            java.lang.Object obj = null;
            if (list != null) {
                obj = (java.lang.String) (list.isEmpty() ? null : list.get(0));
            }
            if ((obj == null && b(dijVar) == null && c(dijVar, resources) == null && !e(dijVar)) || !h(dijVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public static final boolean h(dij dijVar) {
        if (dijVar.k()) {
            return false;
        }
        java.util.List listM = dij.m(dijVar, true, 4);
        int size = listM.size();
        for (int i = 0; i < size; i++) {
            if (!((dij) listM.get(i)).h().f(din.C)) {
                return false;
            }
        }
        dbk dbkVarK = dijVar.a.k();
        while (dbkVarK != null) {
            die dieVarQ = dbkVarK.q();
            if (dieVarQ != null && dieVarQ.a) {
                if (dbkVarK == null) {
                    return true;
                }
                return false;
            }
            dbkVarK = dbkVarK.k();
        }
        dbkVarK = null;
        if (dbkVarK == null) {
            return true;
        }
        return false;
    }

    public static final boolean i(defpackage.ebd ebdVar, dij dijVar) {
        java.lang.CharSequence charSequenceE = ebdVar.e();
        if (charSequenceE == null || charSequenceE.length() == 0) {
            die dieVar = dijVar.b;
            if (!dieVar.f(din.H) && !dieVar.f(did.a) && !dieVar.f(din.T)) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdl extends defpackage.cmv implements defpackage.dbd, defpackage.dao {
    public static final defpackage.bdj a = new defpackage.bdj();
    public defpackage.bdm b;
    public boolean c;
    public defpackage.aso d;
    public defpackage.kaw e;

    public bdl(defpackage.bdm bdmVar, defpackage.kaw kawVar, boolean z, defpackage.aso asoVar) {
        this.b = bdmVar;
        this.e = kawVar;
        this.c = z;
        this.d = asoVar;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.afz(czcVarV, 12));
    }

    public final boolean d(defpackage.bdh bdhVar, int i) {
        if (i == 5 || i == 6) {
            if (this.d == defpackage.aso.b) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.d == defpackage.aso.a) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (g(i)) {
            if (bdhVar.b >= this.b.b() - 1) {
                return false;
            }
        } else if (bdhVar.a <= 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.c(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.d(new dbc(this), cxfVar, cxeVar, i);
    }

    public final boolean g(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.c;
            }
            if (i == 6) {
                if (this.c) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = defpackage.cfo.A(this).s.ordinal();
                if (iOrdinal == 0) {
                    return this.c;
                }
                if (iOrdinal != 1) {
                    throw new defpackage.aois();
                }
                if (this.c) {
                    return false;
                }
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
                int iOrdinal2 = defpackage.cfo.A(this).s.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.c;
                    }
                    throw new defpackage.aois();
                }
                if (this.c) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.e(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.f(new dbc(this), cxfVar, cxeVar, i);
    }
}

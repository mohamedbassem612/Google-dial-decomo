package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbo {
    public final defpackage.dbk a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public defpackage.dbv p;
    public int q = 5;
    public final defpackage.dbx o = new defpackage.dbx(this);

    public dbo(defpackage.dbk dbkVar) {
        this.a = dbkVar;
    }

    public final defpackage.dck a() {
        return this.a.v.d;
    }

    public final defpackage.dpd b() {
        defpackage.dbx dbxVar = this.o;
        if (dbxVar.j) {
            return new defpackage.dpd(dbxVar.d);
        }
        return null;
    }

    public final defpackage.dpd c() {
        defpackage.dbv dbvVar = this.p;
        if (dbvVar != null) {
            return dbvVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.x = true;
        defpackage.dbv dbvVar = this.p;
        if (dbvVar != null) {
            dbvVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final void f() {
        int iAv = this.a.av();
        if (iAv == 3) {
            if (this.o.y) {
                j(true);
            } else {
                i(true);
            }
        } else if (iAv == 4) {
            iAv = 4;
            if (this.o.y) {
                j(true);
            } else {
                i(true);
            }
        }
        if (iAv == 4) {
            defpackage.dbv dbvVar = this.p;
            if (dbvVar == null || !dbvVar.s) {
                k(true);
            } else {
                l(true);
            }
        }
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            defpackage.dbk dbkVarK = this.a.k();
            defpackage.dbo dboVar = dbkVarK != null ? dbkVarK.w : null;
            if (dboVar != null) {
                if (i == 0) {
                    dboVar.g(dboVar.k - 1);
                } else {
                    dboVar.g(dboVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            defpackage.dbk dbkVarK = this.a.k();
            defpackage.dbo dboVar = dbkVarK != null ? dbkVarK.w : null;
            if (dboVar != null) {
                if (i == 0) {
                    dboVar.h(dboVar.n - 1);
                } else {
                    dboVar.h(dboVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            boolean z2 = this.i;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            boolean z2 = this.j;
            if (z) {
                if (z2) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (z2) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            boolean z2 = this.l;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            boolean z2 = this.m;
            if (z) {
                if (z2) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (z2) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        defpackage.dbx dbxVar = this.o;
        if ((dbxVar.r != null || dbxVar.s().g() != null) && dbxVar.q) {
            dbxVar.q = false;
            dbxVar.r = dbxVar.s().g();
            defpackage.dbk dbkVarK = this.a.k();
            if (dbkVarK != null) {
                dbkVarK.W(false, true, true);
            }
        }
        defpackage.dbv dbvVar = this.p;
        if (dbvVar != null) {
            if (dbvVar.u == null) {
                defpackage.dbu dbuVarD = dbvVar.t().D();
                if (dbuVarD == null) {
                    defpackage.aooh.g();
                }
                if (dbuVarD.g() == null) {
                    return;
                }
            }
            if (dbvVar.t) {
                dbvVar.t = false;
                defpackage.dbu dbuVarD2 = dbvVar.t().D();
                if (dbuVarD2 == null) {
                    defpackage.aooh.g();
                }
                dbvVar.u = dbuVarD2.g();
                defpackage.dbk dbkVar = this.a;
                if (defpackage.cfo.s(dbkVar)) {
                    defpackage.dbk dbkVarK2 = dbkVar.k();
                    if (dbkVarK2 != null) {
                        dbkVarK2.W(false, true, true);
                        return;
                    }
                    return;
                }
                defpackage.dbk dbkVarK3 = dbkVar.k();
                if (dbkVarK3 != null) {
                    dbkVarK3.U(false, true, true);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}

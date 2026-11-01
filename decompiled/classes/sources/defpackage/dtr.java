package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dtr implements defpackage.dti {
    public int c;
    public defpackage.dsy d;
    public int j;
    public hjx l;
    public final dtk e = new dtk(this);
    public int f = 0;
    public boolean g = false;
    public final dtj h = new dtj(this);
    public final dtj i = new dtj(this);
    protected int k = 1;

    public dtr(defpackage.dsy dsyVar) {
        this.d = dsyVar;
    }

    protected static final void j(dtj dtjVar, dtj dtjVar2, int i) {
        dtjVar.k.add(dtjVar2);
        dtjVar.e = i;
        dtjVar2.j.add(dtjVar);
    }

    protected static final dtj k(defpackage.dsx dsxVar) {
        defpackage.dsx dsxVar2 = dsxVar.e;
        if (dsxVar2 != null) {
            int i = dsxVar2.i;
            defpackage.dsy dsyVar = dsxVar2.d;
            int i2 = i - 1;
            if (i2 == 1) {
                return dsyVar.h.h;
            }
            if (i2 == 2) {
                return dsyVar.i.h;
            }
            if (i2 == 3) {
                return dsyVar.h.i;
            }
            if (i2 == 4) {
                return dsyVar.i.i;
            }
            if (i2 == 5) {
                return dsyVar.i.a;
            }
        }
        return null;
    }

    protected static final dtj l(defpackage.dsx dsxVar, int i) {
        defpackage.dsx dsxVar2 = dsxVar.e;
        if (dsxVar2 != null) {
            defpackage.dsy dsyVar = dsxVar2.d;
            dto dtoVar = i == 0 ? dsyVar.h : dsyVar.i;
            int i2 = dsxVar2.i - 1;
            if (i2 == 1 || i2 == 2) {
                return dtoVar.h;
            }
            if (i2 == 3 || i2 == 4) {
                return dtoVar.i;
            }
        }
        return null;
    }

    public long a() {
        dtk dtkVar = this.e;
        if (dtkVar.i) {
            return dtkVar.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.dti
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        int iMax;
        defpackage.dsy dsyVar = this.d;
        if (i2 == 0) {
            int i3 = dsyVar.w;
            iMax = java.lang.Math.max(dsyVar.v, i);
            if (i3 > 0) {
                iMax = java.lang.Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            int i4 = dsyVar.z;
            iMax = java.lang.Math.max(dsyVar.y, i);
            if (i4 > 0) {
                iMax = java.lang.Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    protected final void i(dtj dtjVar, dtj dtjVar2, int i, dtk dtkVar) {
        java.util.List list = dtjVar.k;
        list.add(dtjVar2);
        list.add(this.e);
        dtjVar.g = i;
        dtjVar.h = dtkVar;
        dtjVar2.j.add(dtjVar);
        dtkVar.j.add(dtjVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    protected final void m(defpackage.dsx dsxVar, defpackage.dsx dsxVar2, int i) {
        dto dtoVar;
        dtk dtkVar;
        float f;
        int i2;
        dtj dtjVarK = k(dsxVar);
        dtj dtjVarK2 = k(dsxVar2);
        if (dtjVarK.i && dtjVarK2.i) {
            int iB = dtjVarK.f + dsxVar.b();
            int iB2 = dtjVarK2.f - dsxVar2.b();
            dtk dtkVar2 = this.e;
            int i3 = iB2 - iB;
            if (!dtkVar2.i && this.j == 3) {
                int i4 = this.c;
                if (i4 != 0) {
                    int i5 = 1;
                    if (i4 != 1) {
                        int i6 = 0;
                        if (i4 == 2) {
                            defpackage.dsy dsyVar = this.d;
                            defpackage.dsy dsyVar2 = dsyVar.U;
                            if (dsyVar2 != null) {
                                if (i == 0) {
                                    dtoVar = dsyVar2.h;
                                    i5 = 0;
                                } else {
                                    dtoVar = dsyVar2.i;
                                    i6 = 1;
                                }
                                dtk dtkVar3 = dtoVar.e;
                                if (dtkVar3.i) {
                                    dtkVar2.c(h((int) ((dtkVar3.f * (i5 == 0 ? dsyVar.x : dsyVar.A)) + 0.5f), i5));
                                    i = i5;
                                } else {
                                    i = i6;
                                }
                            }
                        } else if (i4 == 3) {
                            defpackage.dsy dsyVar3 = this.d;
                            dtp dtpVar = dsyVar3.h;
                            if (((dto) dtpVar).j == 3 && ((dto) dtpVar).c == 3) {
                                dtp dtpVar2 = dsyVar3.i;
                                if (dtpVar2.j != 3 || dtpVar2.c != 3) {
                                    if (i == 0) {
                                        dtpVar = dsyVar3.i;
                                        i = 0;
                                    } else {
                                        i = 1;
                                        i6 = 1;
                                    }
                                    dtkVar = dtpVar.e;
                                    if (dtkVar.i) {
                                        f = dsyVar3.X;
                                        if (i6 == 1) {
                                            i2 = (int) ((dtkVar.f / f) + 0.5f);
                                        } else {
                                            i2 = (int) ((f * dtkVar.f) + 0.5f);
                                        }
                                        dtkVar2.c(i2);
                                    }
                                }
                            } else {
                                if (i == 0) {
                                    dtpVar = dsyVar3.i;
                                    i = 0;
                                } else {
                                    i = 1;
                                    i6 = 1;
                                }
                                dtkVar = dtpVar.e;
                                if (dtkVar.i) {
                                    f = dsyVar3.X;
                                    if (i6 == 1) {
                                        i2 = (int) ((dtkVar.f / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * dtkVar.f) + 0.5f);
                                    }
                                    dtkVar2.c(i2);
                                }
                            }
                        }
                    } else {
                        dtkVar2.c(java.lang.Math.min(h(dtkVar2.m, i), i3));
                    }
                } else {
                    dtkVar2.c(h(i3, i));
                }
            }
            if (dtkVar2.i) {
                int i7 = dtkVar2.f;
                if (i7 == i3) {
                    this.h.c(iB);
                    this.i.c(iB2);
                    return;
                }
                defpackage.dsy dsyVar4 = this.d;
                float f2 = i == 0 ? dsyVar4.ae : dsyVar4.af;
                if (dtjVarK == dtjVarK2) {
                    iB = dtjVarK.f;
                    iB2 = dtjVarK2.f;
                    f2 = 0.5f;
                }
                dtj dtjVar = this.h;
                dtjVar.c((int) (iB + 0.5f + (((iB2 - iB) - i7) * f2)));
                this.i.c(dtjVar.f + dtkVar2.f);
            }
        }
    }
}

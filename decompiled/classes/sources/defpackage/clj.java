package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class clj {
    public final defpackage.aonj a;
    public java.lang.Object b;
    public int c = -1;
    public final defpackage.ckj d;
    public boolean e;
    public int f;
    public defpackage.cbg g;
    public defpackage.ado h;
    public final defpackage.ady i;
    public final defpackage.adw j;
    public final defpackage.adw k;
    private defpackage.cfc l;
    private defpackage.adw m;
    private defpackage.adw n;
    private defpackage.ady o;
    private defpackage.adw p;
    private defpackage.adw q;

    public clj(defpackage.aonj aonjVar) {
        this.a = aonjVar;
        defpackage.ady adyVar = this.o;
        if (adyVar == null) {
            adyVar = new defpackage.ady(6);
            this.o = adyVar;
        }
        this.i = adyVar;
        this.d = new defpackage.cli(this, 0);
        defpackage.adw adwVar = this.p;
        if (adwVar == null) {
            long[] jArr = defpackage.adx.a;
            adwVar = new defpackage.adw(6);
            this.p = adwVar;
        }
        this.j = adwVar;
        defpackage.adw adwVar2 = this.q;
        if (adwVar2 == null) {
            adwVar2 = new defpackage.adw(6);
            this.q = adwVar2;
        }
        this.k = adwVar2;
    }

    public final defpackage.cfc a() {
        defpackage.cfc cfcVar = this.l;
        if (cfcVar != null) {
            return cfcVar;
        }
        defpackage.cfc cfcVar2 = new defpackage.cfc(new defpackage.ckg[16]);
        this.l = cfcVar2;
        return cfcVar2;
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cfg.c(f(), obj2, obj);
        if (!(obj2 instanceof defpackage.ckg) || defpackage.adw.f(f(), obj2)) {
            return;
        }
        defpackage.cfg.b(this.j, obj2);
        this.k.i(obj2);
    }

    public final boolean c() {
        return e().e();
    }

    public final void d(java.lang.Object obj, defpackage.cbg cbgVar) {
        int i;
        if (obj instanceof defpackage.cls) {
            ((defpackage.cls) obj).i(2);
        }
        defpackage.adw adwVar = this.j;
        defpackage.cfg.a(adwVar, obj, cbgVar);
        if (!(obj instanceof defpackage.cbk)) {
            return;
        }
        defpackage.ado adoVar = ((defpackage.cbk) obj).f().d;
        java.lang.Object[] objArr = adoVar.b;
        int[] iArr = adoVar.c;
        long[] jArr = adoVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        java.lang.Object obj2 = objArr[i5];
                        int i6 = iArr[i5];
                        defpackage.clr clrVar = (defpackage.clr) obj2;
                        if (clrVar instanceof defpackage.cls) {
                            ((defpackage.cls) clrVar).i(2);
                        }
                        defpackage.cfg.a(adwVar, clrVar, cbgVar);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final defpackage.adw e() {
        defpackage.adw adwVar = this.n;
        if (adwVar != null) {
            return adwVar;
        }
        defpackage.adw adwVar2 = new defpackage.adw(6);
        this.n = adwVar2;
        return adwVar2;
    }

    public final defpackage.adw f() {
        defpackage.adw adwVar = this.m;
        if (adwVar != null) {
            return adwVar;
        }
        long[] jArr = defpackage.adx.a;
        defpackage.adw adwVar2 = new defpackage.adw(6);
        this.m = adwVar2;
        return adwVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008b A[LOOP:0: B:14:0x0040->B:29:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[EDGE_INSN: B:43:0x009e->B:35:0x009e BREAK  A[LOOP:0: B:14:0x0040->B:29:0x008b], SYNTHETIC] */
    public final void g(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.ado adoVar) {
        int i2;
        if (this.f <= 0) {
            defpackage.cbg cbgVar = this.g;
            if (cbgVar != null) {
                d(obj, cbgVar);
                return;
            }
            int i3 = adoVar.i(obj, i);
            if ((obj instanceof defpackage.cbk) && i3 != i) {
                defpackage.cbj cbjVarF = ((defpackage.cbk) obj).f();
                this.k.n(obj, cbjVarF.e);
                defpackage.adw adwVar = this.j;
                defpackage.cfg.b(adwVar, obj);
                defpackage.ado adoVar2 = cbjVarF.d;
                java.lang.Object[] objArr = adoVar2.b;
                int[] iArr = adoVar2.c;
                long[] jArr = adoVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    java.lang.Object obj3 = objArr[i7];
                                    int i8 = iArr[i7];
                                    defpackage.clr clrVar = (defpackage.clr) obj3;
                                    if (clrVar instanceof defpackage.cls) {
                                        ((defpackage.cls) clrVar).i(2);
                                    }
                                    defpackage.cfg.a(adwVar, clrVar, obj);
                                }
                                j >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
            } else if (obj instanceof defpackage.cbg) {
                if (i3 != i) {
                    defpackage.cfg.b(this.j, obj);
                }
                this.g = (defpackage.cbg) obj;
            }
            if (i3 == -1) {
                if (obj instanceof defpackage.cls) {
                    ((defpackage.cls) obj).i(2);
                }
                defpackage.cfg.a(f(), obj, obj2);
            }
        }
    }
}

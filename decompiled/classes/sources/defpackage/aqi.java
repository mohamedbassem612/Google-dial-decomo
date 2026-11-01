package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aqi extends defpackage.cmv implements defpackage.dan, defpackage.dbz {
    public defpackage.aso a;
    public final defpackage.ato b;
    public boolean c;
    public defpackage.aqb d;
    public final defpackage.aomy e;
    public boolean f;
    public boolean h;
    public final defpackage.kaw i = new defpackage.kaw((char[]) null, (byte[]) null, (byte[]) null);
    public long g = -1;

    public aqi(defpackage.aso asoVar, defpackage.ato atoVar, boolean z, defpackage.aqb aqbVar, defpackage.aomy aomyVar) {
        this.a = asoVar;
        this.b = atoVar;
        this.c = z;
        this.d = aqbVar;
        this.e = aomyVar;
    }

    public static /* synthetic */ boolean g(defpackage.aqi aqiVar, defpackage.cpn cpnVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = aqiVar.d();
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jE = aqiVar.e(cpnVar, j, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jE >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jE & 4294967295L))) <= 0.5f;
    }

    private final defpackage.aqb i() {
        defpackage.aqb aqbVar = this.d;
        return aqbVar == null ? (defpackage.aqb) defpackage.cfo.G(this, defpackage.aqd.b) : aqbVar;
    }

    private final void j(long j) {
        defpackage.aqb aqbVarI = i();
        if (this.h) {
            avo.d("launchAnimation called when previous animation was running");
        }
        defpackage.aoov.an(M(), null, 4, new aqh(this, new auo(i().b()), aqbVarI, j, (defpackage.aoln) null), 1);
    }

    public final float b(defpackage.aqb aqbVar, long j) {
        char c;
        long j2;
        java.lang.Object obj;
        int iCompare;
        long j3 = this.g;
        defpackage.cfc cfcVar = (defpackage.cfc) this.i.a;
        int i = cfcVar.b - 1;
        java.lang.Object[] objArr = cfcVar.a;
        char c2 = ' ';
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    c = c2;
                    j2 = 4294967295L;
                    break;
                }
                java.lang.Object objA = ((defpackage.aqe) objArr[i]).a.a();
                if (objA != null) {
                    long jC = ((defpackage.cpn) objA).c();
                    long jL = defpackage.dpy.l(d());
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jC & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jL & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new defpackage.aois();
                        }
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jC >> c2)), java.lang.Float.intBitsToFloat((int) (jL >> c)));
                    }
                    if (iCompare > 0) {
                        if (obj != null) {
                            break;
                        }
                        obj = objA;
                        break;
                    }
                    obj = objA;
                } else {
                    c = c2;
                }
                i--;
                c2 = c;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            obj = null;
        }
        if (obj == null) {
            java.lang.Object objA2 = this.f ? this.e.a() : null;
            if (objA2 == null) {
                return 0.0f;
            }
            obj = objA2;
        }
        long jL2 = defpackage.dpy.l(j3);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            defpackage.cpn cpnVar = (defpackage.cpn) obj;
            float f = cpnVar.c;
            return aqbVar.a(f - ((int) (j & j2)), cpnVar.e - f, java.lang.Float.intBitsToFloat((int) (jL2 & j2)));
        }
        if (iOrdinal2 != 1) {
            throw new defpackage.aois();
        }
        defpackage.cpn cpnVar2 = (defpackage.cpn) obj;
        float f2 = cpnVar2.b;
        return aqbVar.a(f2 - ((int) (j >> c)), cpnVar2.d - f2, java.lang.Float.intBitsToFloat((int) (jL2 >> c)));
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    public final long d() {
        long j = this.g;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    public final long e(defpackage.cpn cpnVar, long j, long j2) {
        long jL = defpackage.dpy.l(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            defpackage.aqb aqbVarI = i();
            float f = cpnVar.c;
            return ((long) java.lang.Float.floatToRawIntBits(aqbVarI.a(f - ((int) (j2 & 4294967295L)), cpnVar.e - f, java.lang.Float.intBitsToFloat((int) (jL & 4294967295L))))) & 4294967295L;
        }
        if (iOrdinal != 1) {
            throw new defpackage.aois();
        }
        defpackage.aqb aqbVarI2 = i();
        float f2 = cpnVar.b;
        return ((long) java.lang.Float.floatToRawIntBits(aqbVarI2.a(f2 - ((int) (j2 >> 32)), cpnVar.d - f2, java.lang.Float.intBitsToFloat((int) (jL >> 32))))) << 32;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aomy aomyVar, defpackage.aoln aolnVar) {
        aqf aqfVar;
        if (aolnVar instanceof aqf) {
            aqfVar = (aqf) aolnVar;
            int i = aqfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqfVar.c = i - Integer.MIN_VALUE;
            } else {
                aqfVar = new aqf(this, aolnVar);
            }
        } else {
            aqfVar = new aqf(this, aolnVar);
        }
        java.lang.Object obj = aqfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aqfVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object objA = aomyVar.a();
            if (objA != null && !g(this, (defpackage.cpn) objA, 0L, 0L, 3)) {
                aqfVar.c = 1;
                defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aqfVar), 1);
                aoscVar.z();
                defpackage.aqe aqeVar = new defpackage.aqe(aomyVar, aoscVar);
                defpackage.kaw kawVar = this.i;
                java.lang.Object objA2 = aqeVar.a.a();
                defpackage.aosb aosbVar = aqeVar.b;
                if (objA2 == null) {
                    aosbVar.w(defpackage.aojh.a);
                } else {
                    aosbVar.d(new defpackage.nz(kawVar, aqeVar, 20));
                    defpackage.cfc cfcVar = (defpackage.cfc) kawVar.a;
                    defpackage.aopq aopqVarC = defpackage.aooc.C(0, cfcVar.b);
                    int i3 = aopqVarC.a;
                    int i4 = aopqVarC.b;
                    if (i3 > i4) {
                        cfcVar.f(0, aqeVar);
                        break;
                    }
                    while (true) {
                        java.lang.Object objA3 = ((defpackage.aqe) cfcVar.a[i4]).a.a();
                        if (objA3 != null) {
                            defpackage.cpn cpnVarE = ((defpackage.cpn) objA2).e((defpackage.cpn) objA3);
                            if (!defpackage.aooh.n(cpnVarE, objA2)) {
                                if (!defpackage.aooh.n(cpnVarE, objA3)) {
                                    java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i5 = cfcVar.b - 1;
                                    if (i5 <= i4) {
                                        while (true) {
                                            ((defpackage.aqe) cfcVar.a[i4]).b.g(cancellationException);
                                            if (i5 == i4) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                            } else {
                                cfcVar.f(i4 + 1, aqeVar);
                                break;
                            }
                        }
                        if (i4 == i3) {
                            cfcVar.f(0, aqeVar);
                            break;
                        }
                        i4--;
                    }
                    if (!this.h) {
                        j(0L);
                    }
                }
                if (aoscVar.k() == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.dbz
    public final void h(long j) {
        long j2;
        long j3;
        long j4;
        long jD = d();
        this.g = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = jD & 4294967295L;
            j3 = j & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new defpackage.aois();
            }
            j2 = jD >> 32;
            j3 = j >> 32;
        }
        if (defpackage.aooh.a((int) j3, (int) j2) < 0) {
            if (this.c) {
                j4 = 0;
            } else {
                j4 = this.a == defpackage.aso.a ? ((long) (((int) (jD & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jD >> 32)) - ((int) (j >> 32)))) << 32;
            }
            long j5 = j4;
            java.lang.Object objA = this.e.a();
            if (objA == null || this.h || this.f) {
                return;
            }
            defpackage.cpn cpnVar = (defpackage.cpn) objA;
            if (!g(this, cpnVar, jD, 0L, 2) || g(this, cpnVar, 0L, j5, 1)) {
                return;
            }
            this.f = true;
            j(j5);
        }
    }
}

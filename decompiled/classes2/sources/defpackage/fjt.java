package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjt implements defpackage.fkm {
    public defpackage.eqg a;
    public defpackage.fkj b;
    public java.util.concurrent.Executor c;
    final /* synthetic */ defpackage.fjw d;
    private aify e;
    private long f;
    private long g;
    private int h;

    public fjt(defpackage.fjw fjwVar, android.content.Context context) {
        j$.util.Objects.requireNonNull(fjwVar);
        this.d = fjwVar;
        eum.V(context);
        this.e = aike.a;
        this.g = -9223372036854775807L;
        this.b = defpackage.fkj.b;
        this.c = defpackage.fjw.a;
    }

    private static final void y(defpackage.eqg eqgVar) {
        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
        eqfVar.D = defpackage.fjw.b(eqgVar.F);
        new defpackage.eqg(eqfVar);
        throw null;
    }

    @Override // defpackage.fkm
    public final android.view.Surface a() {
        ahvr.bY(false);
        throw null;
    }

    @Override // defpackage.fkm
    public final void b() {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.j.a() == 0) {
            fjwVar.a();
            return;
        }
        defpackage.euj eujVar = new defpackage.euj();
        boolean z = true;
        while (fjwVar.j.a() > 0) {
            defpackage.fjv fjvVar = (defpackage.fjv) fjwVar.j.b();
            ahvr.ci(fjvVar);
            if (z) {
                int i = fjvVar.b;
                if (i == 0 || i == 1) {
                    fjvVar = new defpackage.fjv(fjvVar.a, 0, fjvVar.c);
                } else {
                    fjwVar.a();
                }
            }
            eujVar.d(fjvVar.c, fjvVar);
            z = false;
        }
        fjwVar.j = eujVar;
    }

    @Override // defpackage.fkm
    public final void c() {
        defpackage.ety etyVar = defpackage.ety.a;
        int i = etyVar.b;
        int i2 = etyVar.c;
        this.d.m = null;
    }

    @Override // defpackage.fkm
    public final void d(boolean z) {
        this.g = -9223372036854775807L;
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.o == 1) {
            fjwVar.n++;
            defpackage.fkm fkmVar = fjwVar.e;
            fkmVar.d(z);
            while (fjwVar.j.a() > 1) {
                fjwVar.j.b();
            }
            if (fjwVar.j.a() == 1) {
                defpackage.fjv fjvVar = (defpackage.fjv) fjwVar.j.b();
                ahvr.ci(fjvVar);
                fkmVar.w(fjwVar.k, fjvVar.a, fjvVar.b, aike.a);
            }
            fjwVar.p = -9223372036854775807L;
            defpackage.etk etkVar = fjwVar.l;
            ahvr.ci(etkVar);
            etkVar.d(new defpackage.fay(fjwVar, 15));
        }
    }

    @Override // defpackage.fkm
    public final void e(boolean z) {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.d) {
            fjwVar.e.e(z);
        }
    }

    @Override // defpackage.fkm
    public final void g() {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.o != 2) {
            defpackage.etk etkVar = fjwVar.l;
            if (etkVar != null) {
                etkVar.e();
            }
            fjwVar.m = null;
            fjwVar.o = 2;
        }
    }

    @Override // defpackage.fkm
    public final void h(long j, long j2) {
        this.d.e.h(j + this.f, j2);
    }

    @Override // defpackage.fkm
    public final void i(long j) {
        this.f = j;
    }

    @Override // defpackage.fkm
    public final void j(int i) {
        this.d.e.j(i);
    }

    @Override // defpackage.fkm
    public final void k(defpackage.fkj fkjVar, java.util.concurrent.Executor executor) {
        this.b = fkjVar;
        this.c = executor;
    }

    @Override // defpackage.fkm
    public final void l(android.view.Surface surface, defpackage.ety etyVar) {
        defpackage.fjw fjwVar = this.d;
        android.util.Pair pair = fjwVar.m;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((defpackage.ety) fjwVar.m.second).equals(etyVar)) {
            return;
        }
        fjwVar.m = android.util.Pair.create(surface, etyVar);
        int i = etyVar.b;
        int i2 = etyVar.c;
    }

    @Override // defpackage.fkm
    public final void m(float f) {
        defpackage.fjw fjwVar = this.d;
        fjwVar.i.d(f);
        fjwVar.e.m(f);
    }

    @Override // defpackage.fkm
    public final void n(java.util.List list) {
        if (ahvr.aP(this.e, list)) {
            return;
        }
        this.e = aify.n(list);
        defpackage.eqg eqgVar = this.a;
        if (eqgVar != null) {
            y(eqgVar);
        }
    }

    @Override // defpackage.fkm
    public final void o(defpackage.fjx fjxVar) {
        ((defpackage.fjf) this.d.e).e = fjxVar;
    }

    @Override // defpackage.fkm
    public final void p() {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.p >= this.g) {
            fjwVar.e.p();
        }
    }

    @Override // defpackage.fkm
    public final void q() {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.d) {
            fjwVar.e.q();
        }
    }

    @Override // defpackage.fkm
    public final void r() {
        defpackage.fjw fjwVar = this.d;
        if (fjwVar.d) {
            fjwVar.e.r();
        }
    }

    @Override // defpackage.fkm
    public final boolean s(long j, defpackage.fkk fkkVar) {
        int i;
        ahvr.bY(false);
        long j2 = j + this.f;
        defpackage.fjw fjwVar = this.d;
        long jA = fjwVar.i.a(j2);
        if (jA != -9223372036854775807L && jA < fjwVar.h && (i = this.h) < 2) {
            this.h = i + 1;
            fkkVar.b();
            return true;
        }
        int i2 = fjwVar.q;
        if (i2 == -1 || i2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.fkm
    public final boolean t() {
        return false;
    }

    @Override // defpackage.fkm
    public final boolean u() {
        return false;
    }

    @Override // defpackage.fkm
    public final boolean v(boolean z) {
        return this.d.e.v(false);
    }

    @Override // defpackage.fkm
    public final void w(defpackage.eqg eqgVar, long j, int i, java.util.List list) {
        ahvr.bY(false);
        this.e = aify.n(list);
        this.a = eqgVar;
        y(eqgVar);
        long j2 = this.g;
        defpackage.fjw fjwVar = this.d;
        long j3 = -4611686018427387904L;
        if (fjwVar.d) {
            if (j2 != -9223372036854775807L) {
                j3 = 1 + j2;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        fjwVar.j.d(j4, new defpackage.fjv(this.f + j, i, j4));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b A[Catch: eti -> 0x0098, TryCatch #1 {eti -> 0x0098, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:17:0x003b, B:21:0x004a, B:26:0x0067, B:19:0x0042), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: eti -> 0x0098, TryCatch #1 {eti -> 0x0098, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:17:0x003b, B:21:0x004a, B:26:0x0067, B:19:0x0042), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: eti -> 0x0098, TryCatch #1 {eti -> 0x0098, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:17:0x003b, B:21:0x004a, B:26:0x0067, B:19:0x0042), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[Catch: eti -> 0x0098, TRY_LEAVE, TryCatch #1 {eti -> 0x0098, blocks: (B:7:0x0014, B:9:0x0019, B:11:0x001f, B:13:0x0025, B:17:0x003b, B:21:0x004a, B:26:0x0067, B:19:0x0042), top: B:39:0x0014 }] */
    @Override // defpackage.fkm
    public final void x(defpackage.eqg eqgVar) throws defpackage.fkl {
        boolean zC;
        defpackage.epy epyVar;
        defpackage.fjw fjwVar = this.d;
        ahvr.bY(fjwVar.o == 0);
        defpackage.epy epyVarB = defpackage.fjw.b(eqgVar.F);
        try {
            int i = epyVarB.d;
            if (i != 7) {
                if (i == 6) {
                    zC = defpackage.esv.b();
                } else {
                    if (i == 7) {
                        zC = defpackage.esv.c("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else if (i != 2 || i == 10) {
                        epyVarB = defpackage.epy.a;
                    }
                    epyVar = epyVarB;
                }
                if (!zC) {
                    defpackage.etr.f("PlaybackVidGraphWrapper", eum.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
                    epyVarB = defpackage.epy.a;
                } else if (i != 2) {
                    epyVarB = defpackage.epy.a;
                } else {
                    epyVarB = defpackage.epy.a;
                }
                epyVar = epyVarB;
            } else if (android.os.Build.VERSION.SDK_INT >= 34 || !defpackage.esv.b()) {
                i = 7;
                if (i == 6) {
                    zC = defpackage.esv.b();
                } else {
                    if (i == 7) {
                        zC = defpackage.esv.c("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else if (i != 2) {
                        epyVarB = defpackage.epy.a;
                    } else {
                        epyVarB = defpackage.epy.a;
                    }
                    epyVar = epyVarB;
                }
                if (!zC) {
                    defpackage.etr.f("PlaybackVidGraphWrapper", eum.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
                    epyVarB = defpackage.epy.a;
                } else if (i != 2) {
                    epyVarB = defpackage.epy.a;
                } else {
                    epyVarB = defpackage.epy.a;
                }
                epyVar = epyVarB;
            } else {
                epyVar = new defpackage.epy(epyVarB.b, epyVarB.c, 6, epyVarB.e, epyVarB.f, epyVarB.g);
            }
            defpackage.etc etcVar = fjwVar.f;
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            ahvr.ci(looperMyLooper);
            fjwVar.l = etcVar.b(looperMyLooper, null);
            try {
                fjwVar.r.i(fjwVar.b, epyVar, defpackage.eqb.a, fjwVar, new defpackage.etj(fjwVar.l, new rai(fjwVar)));
                throw null;
            } catch (defpackage.eru e) {
                throw new defpackage.fkl(e, eqgVar);
            }
        } catch (defpackage.eti e2) {
            throw new defpackage.fkl(e2, eqgVar);
        }
    }

    @Override // defpackage.fkm
    public final void f() {
    }
}

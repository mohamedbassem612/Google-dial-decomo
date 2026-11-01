package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anzz implements java.io.Closeable, defpackage.anwf {
    public defpackage.anzw a;
    public int b;
    public anmx c;
    public long e;
    private final defpackage.aodj h;
    private final aodq i;
    private boolean k;
    private defpackage.anwa l;
    private int o;
    private int p = 1;
    private int j = 5;
    public defpackage.anwa d = new defpackage.anwa();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public anzz(defpackage.anzw anzwVar, anmx anmxVar, int i, defpackage.aodj aodjVar, aodq aodqVar) {
        this.a = anzwVar;
        this.c = anmxVar;
        this.b = i;
        this.h = aodjVar;
        this.i = aodqVar;
    }

    public final void a() {
        int i;
        java.io.InputStream aoaxVar;
        if (this.m) {
            return;
        }
        this.m = true;
        loop0: while (true) {
            try {
                boolean z = this.g;
                if (this.e <= 0) {
                    break;
                }
                try {
                    if (this.j > 0 && this.d.a == 0) {
                        break;
                    }
                    if (this.l == null) {
                        this.l = new defpackage.anwa();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int i2 = this.j - this.l.a;
                            if (i2 > 0) {
                                int i3 = this.d.a;
                                if (i3 == 0) {
                                    if (i <= 0) {
                                        break loop0;
                                    }
                                    this.a.a(i);
                                    if (this.p != 2) {
                                        break loop0;
                                    }
                                    this.h.b(i);
                                    this.o += i;
                                    break loop0;
                                }
                                int iMin = java.lang.Math.min(i2, i3);
                                i += iMin;
                                this.l.h(this.d.g(iMin));
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.a.a(i);
                                if (this.p == 2) {
                                    this.h.b(i);
                                    this.o += i;
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0) {
                        this.a.a(i);
                        if (this.p == 2) {
                            this.h.b(i);
                            this.o += i;
                        }
                    }
                    int i4 = this.p;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        int iE = this.l.e();
                        if ((iE & 254) != 0) {
                            throw new defpackage.anqz(anqw.k.f("gRPC frame header malformed: reserved bits not zero"), null);
                        }
                        this.k = 1 == (iE & 1);
                        defpackage.anwa anwaVar = this.l;
                        anwaVar.a(4);
                        int iE2 = (anwaVar.e() << 24) | (anwaVar.e() << 16) | (anwaVar.e() << 8) | anwaVar.e();
                        this.j = iE2;
                        if (iE2 < 0 || iE2 > this.b) {
                            throw new defpackage.anqz(anqw.h.f(java.lang.String.format(java.util.Locale.US, "gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.j))), null);
                        }
                        this.n++;
                        defpackage.aodj.g(this.h);
                        aodq aodqVar = this.i;
                        aodqVar.g.a();
                        aodqVar.h = aodqVar.a.a();
                        this.p = 2;
                    } else {
                        if (i5 != 1) {
                            throw new java.lang.AssertionError(a.bx(i4 != 1 ? "BODY" : "HEADER", "Invalid state: "));
                        }
                        defpackage.aodj aodjVar = this.h;
                        defpackage.aodj.g(aodjVar);
                        this.o = 0;
                        if (!this.k) {
                            int i6 = this.l.a;
                            defpackage.aodj.g(aodjVar);
                            defpackage.anwa anwaVar2 = this.l;
                            defpackage.aoaw aoawVar = defpackage.aoba.a;
                            aoaxVar = new defpackage.aoax(anwaVar2);
                        } else {
                            if (this.c == anmh.a) {
                                throw new defpackage.anqz(anqw.k.f("Can't decode compressed gRPC message as compression not configured"), null);
                            }
                            defpackage.anwa anwaVar3 = this.l;
                            defpackage.aoaw aoawVar2 = defpackage.aoba.a;
                            aoaxVar = new defpackage.anzv(new defpackage.aoax(anwaVar3), this.b, aodjVar, this.c);
                        }
                        this.l = null;
                        this.a.g(new defpackage.anzx(aoaxVar));
                        this.p = 1;
                        this.j = 5;
                        this.e--;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (java.lang.Throwable th3) {
                this.m = false;
                throw th3;
            }
        }
        boolean z2 = this.g;
        if (this.f && c()) {
            close();
        }
        this.m = false;
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.anwf
    public final void close() {
        if (b()) {
            return;
        }
        defpackage.anwa anwaVar = this.l;
        boolean z = false;
        if (anwaVar != null && anwaVar.a > 0) {
            z = true;
        }
        try {
            defpackage.anwa anwaVar2 = this.d;
            if (anwaVar2 != null) {
                anwaVar2.close();
            }
            defpackage.anwa anwaVar3 = this.l;
            if (anwaVar3 != null) {
                anwaVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.k(z);
        } catch (java.lang.Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}

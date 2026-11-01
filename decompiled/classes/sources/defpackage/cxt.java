package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cxt implements defpackage.cyf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.cxy a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.cyf c;
    private final /* synthetic */ defpackage.cyf d;

    public cxt(defpackage.cyf cyfVar, defpackage.cxy cxyVar, int i, defpackage.cyf cyfVar2, int i2) {
        this.$cid = i2;
        this.a = cxyVar;
        this.b = i;
        this.c = cyfVar2;
        this.d = cyfVar;
    }

    @Override // defpackage.cyf
    public final int b() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        return i != 0 ? cyfVar.b() : cyfVar.b();
    }

    @Override // defpackage.cyf
    public final int c() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        return i != 0 ? cyfVar.c() : cyfVar.c();
    }

    @Override // defpackage.cyf
    public final java.util.Map f() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        return i != 0 ? cyfVar.f() : cyfVar.f();
    }

    @Override // defpackage.cyf
    public final defpackage.aonj g() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        return i != 0 ? cyfVar.g() : cyfVar.g();
    }

    @Override // defpackage.cyf
    public final defpackage.aonn h() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        return i != 0 ? cyfVar.h() : cyfVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:7:0x001b->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[EDGE_INSN: B:33:0x0077->B:27:0x0077 BREAK  A[LOOP:0: B:7:0x001b->B:26:0x0074], SYNTHETIC] */
    @Override // defpackage.cyf
    public final void i() {
        int i;
        int i2 = this.$cid;
        int i3 = this.b;
        if (i2 == 0) {
            defpackage.cxy cxyVar = this.a;
            cxyVar.d = i3;
            this.c.i();
            if (cxyVar.a.j == null) {
                cxyVar.h(cxyVar.d);
                return;
            }
            return;
        }
        defpackage.cxy cxyVar2 = this.a;
        cxyVar2.e = i3;
        this.c.i();
        defpackage.adw adwVar = cxyVar2.o;
        long[] jArr = adwVar.a;
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
                    int i5 = i4 - length;
                    int i6 = 0;
                    while (true) {
                        i = 8 - ((~i5) >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            java.lang.Object obj = adwVar.b[i7];
                            czn cznVar = (czn) adwVar.c[i7];
                            defpackage.cfc cfcVar = cxyVar2.h;
                            int iA = cfcVar.a(obj);
                            if (iA < 0) {
                                if (defpackage.adw.f(cxyVar2.n, obj)) {
                                    cznVar.c();
                                }
                                adwVar.j(i7);
                            } else if (iA >= cxyVar2.e) {
                                cfcVar.d(iA, defpackage.czl.b);
                                if (defpackage.adw.f(cxyVar2.n, obj)) {
                                    cznVar.c();
                                }
                                adwVar.j(i7);
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i4 != length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        cxyVar2.h(cxyVar2.d);
    }

    @Override // defpackage.cyf
    public final void j() {
        int i = this.$cid;
        defpackage.cyf cyfVar = this.d;
        if (i != 0) {
            cyfVar.j();
        } else {
            cyfVar.j();
        }
    }
}

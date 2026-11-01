package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftr implements defpackage.flj {
    private final /* synthetic */ int $cid;
    private final defpackage.etx a;
    private boolean b;
    private final java.lang.Object c;

    public ftr(int i, byte[] bArr) {
        this.$cid = i;
        this.c = new defpackage.ftq(null, 0, "audio/ac3");
        this.a = new defpackage.etx(2786);
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return this.$cid != 0 ? aike.a : aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        if (this.$cid != 0) {
            ((defpackage.ftq) this.c).b(fllVar, new defpackage.fvb(Integer.MIN_VALUE, 0, 1));
            fllVar.s();
            fllVar.y(new defpackage.flz(-9223372036854775807L, 0L));
            return;
        }
        ((defpackage.fts) this.c).b(fllVar, new defpackage.fvb(Integer.MIN_VALUE, 0, 1));
        fllVar.s();
        fllVar.y(new defpackage.flz(-9223372036854775807L, 0L));
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        if (this.$cid != 0) {
            this.b = false;
            ((defpackage.ftq) this.c).f();
        } else {
            this.b = false;
            ((defpackage.fts) this.c).f();
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.flc flcVar;
        char c;
        int i;
        int i2;
        defpackage.flc flcVar2;
        int iA;
        int i3 = 8192;
        char c2 = 6;
        if (this.$cid == 0) {
            defpackage.etx etxVar = new defpackage.etx(10);
            int i4 = 0;
            while (true) {
                flcVar = (defpackage.flc) flkVar;
                flcVar.n(etxVar.b, 0, 10, false);
                etxVar.Q(0);
                if (etxVar.p() != 4801587) {
                    break;
                }
                etxVar.R(3);
                int iM = etxVar.m();
                i4 += iM + 10;
                flcVar.m(iM, false);
                i3 = 8192;
            }
            flkVar.k();
            flcVar.m(i4, false);
            int i5 = i4;
            loop3: while (true) {
                int i6 = 0;
                while (true) {
                    flcVar.n(etxVar.b, 0, 7, false);
                    etxVar.Q(0);
                    int iS = etxVar.s();
                    if (iS == 44096 || iS == 44097) {
                        i6++;
                        if (i6 >= 4) {
                            return true;
                        }
                        byte[] bArr = etxVar.b;
                        int i7 = defpackage.fkr.a;
                        if (bArr.length < 7) {
                            i2 = -1;
                            c = c2;
                        } else {
                            c = c2;
                            int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                            if (i8 == 65535) {
                                i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[c] & 255);
                                i = 7;
                            } else {
                                i = 4;
                            }
                            if (iS == 44097) {
                                i += 2;
                            }
                            i2 = i8 + i;
                        }
                        if (i2 == -1) {
                            break loop3;
                        }
                        flcVar.m(i2 - 7, false);
                        c2 = c;
                        i3 = 8192;
                    }
                }
                flkVar.k();
                i5++;
                if (i5 - i4 >= i3) {
                    break;
                }
                flcVar.m(i5, false);
            }
        } else {
            defpackage.etx etxVar2 = new defpackage.etx(10);
            int i9 = 0;
            while (true) {
                flcVar2 = (defpackage.flc) flkVar;
                flcVar2.n(etxVar2.b, 0, 10, false);
                etxVar2.Q(0);
                if (etxVar2.p() != 4801587) {
                    break;
                }
                etxVar2.R(3);
                int iM2 = etxVar2.m();
                i9 += iM2 + 10;
                flcVar2.m(iM2, false);
            }
            flkVar.k();
            flcVar2.m(i9, false);
            int i10 = 0;
            int i11 = i9;
            while (true) {
                flcVar2.n(etxVar2.b, 0, 6, false);
                etxVar2.Q(0);
                if (etxVar2.s() != 2935) {
                    flkVar.k();
                    i11++;
                    if (i11 - i9 >= 8192) {
                        break;
                    }
                    flcVar2.m(i11, false);
                    i10 = 0;
                } else {
                    i10++;
                    if (i10 >= 4) {
                        return true;
                    }
                    byte[] bArr2 = etxVar2.b;
                    int[] iArr = defpackage.fkp.a;
                    if (bArr2.length < 6) {
                        iA = -1;
                    } else if (((bArr2[5] & 248) >> 3) > 10) {
                        iA = ((((bArr2[2] & 7) << 8) | (bArr2[3] & 255)) + 1) << 1;
                    } else {
                        byte b = bArr2[4];
                        iA = defpackage.fkp.a((b & 192) >> 6, b & 63);
                    }
                    if (iA == -1) {
                        break;
                    }
                    flcVar2.m(iA - 6, false);
                }
            }
        }
        return false;
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        int i = this.$cid;
        defpackage.etx etxVar = this.a;
        if (i != 0) {
            int iA = flkVar.a(etxVar.b, 0, 2786);
            if (iA == -1) {
                return -1;
            }
            etxVar.Q(0);
            etxVar.P(iA);
            if (!this.b) {
                ((defpackage.ftq) this.c).a = 0L;
                this.b = true;
            }
            ((defpackage.ftq) this.c).a(etxVar);
        } else {
            int iA2 = flkVar.a(etxVar.b, 0, 16384);
            if (iA2 == -1) {
                return -1;
            }
            etxVar.Q(0);
            etxVar.P(iA2);
            if (!this.b) {
                ((defpackage.fts) this.c).a = 0L;
                this.b = true;
            }
            ((defpackage.fts) this.c).a(etxVar);
        }
        return 0;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }

    public ftr(int i) {
        this.$cid = i;
        this.c = new defpackage.fts(null, 0, "audio/ac4");
        this.a = new defpackage.etx(16384);
    }
}

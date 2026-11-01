package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gkv extends defpackage.gla {
    public boolean b;
    public boolean c;
    public ejz e;
    public java.lang.Runnable f;
    public final /* synthetic */ gkz g;
    public long a = -1;
    public int d = 0;
    public final akbx h = new akbx((byte[]) null);

    public gkv(gkz gkzVar) {
        this.g = gkzVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd A[SYNTHETIC] */
    private final void k() {
        long[] jArr;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr2;
        float f;
        float fE;
        int i;
        int i2;
        int i3;
        long j4;
        float[] fArr;
        float f2;
        float fE2;
        long j5;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        if (this.e == null) {
            akbx akbxVar = this.h;
            akbxVar.d(android.view.animation.AnimationUtils.currentAnimationTimeMillis(), this.a);
            this.e = new ejz(new agkk((byte[]) null, (byte[]) null));
            defpackage.eka ekaVar = new defpackage.eka();
            ekaVar.c(1.0f);
            ekaVar.e(200.0f);
            ejz ejzVar = this.e;
            ejzVar.t = ekaVar;
            ejzVar.i(this.a);
            ejz ejzVar2 = this.e;
            if (((ejx) ejzVar2).n) {
                throw new java.lang.UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            java.util.ArrayList arrayList = ((ejx) ejzVar2).s;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            ejz ejzVar3 = this.e;
            int i6 = akbxVar.b;
            long j6 = Long.MIN_VALUE;
            int i7 = 0;
            if (i6 != 0) {
                jArr = (long[]) akbxVar.a;
                j = jArr[i6];
                j2 = j;
                while (true) {
                    j3 = jArr[i6];
                    c = 20;
                    if (j3 != j6) {
                        jArr2 = jArr;
                        f = 0.0f;
                        break;
                    }
                    jArr2 = jArr;
                    f = 0.0f;
                    float fAbs = java.lang.Math.abs(j3 - j2);
                    if (j - j3 <= 100.0f && fAbs <= 40.0f) {
                        if (i6 == 0) {
                            i6 = 20;
                        }
                        i6--;
                        i7++;
                        if (i7 >= 20) {
                            break;
                        }
                        j2 = j3;
                        jArr = jArr2;
                        j6 = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i7 < 2) {
                    fE = f;
                } else if (i7 == 2) {
                    i4 = akbxVar.b;
                    if (i4 == 0) {
                        i5 = 19;
                    } else {
                        i5 = i4 - 1;
                    }
                    f5 = jArr2[i4] - jArr2[i5];
                    if (f5 == f) {
                        fE = f;
                    } else {
                        float[] fArr2 = (float[]) akbxVar.c;
                        fE = 1000.0f * ((fArr2[i4] - fArr2[i5]) / f5);
                    }
                } else {
                    int i8 = akbxVar.b;
                    int i9 = ((i8 - i7) + 21) % 20;
                    i = (i8 + 21) % 20;
                    java.lang.Object obj = akbxVar.c;
                    i2 = i9 + 1;
                    i3 = i2 % 20;
                    j4 = jArr2[i9];
                    fArr = (float[]) obj;
                    f2 = fArr[i9];
                    fE2 = f;
                    while (i3 != i) {
                        j5 = jArr2[i3];
                        char c2 = c;
                        f3 = f;
                        f4 = j5 - j4;
                        if (f4 != f3) {
                            float f6 = fArr[i3];
                            float f7 = (f6 - f2) / f4;
                            fE2 += (f7 - akbx.e(fE2)) * java.lang.Math.abs(f7);
                            if (i3 == i2) {
                                fE2 *= 0.5f;
                            }
                            f2 = f6;
                            j4 = j5;
                        }
                        i3 = (i3 + 1) % 20;
                        c = c2;
                        f = f3;
                    }
                    fE = 1000.0f * akbx.e(fE2);
                }
            } else if (((long[]) akbxVar.a)[0] == Long.MIN_VALUE) {
                fE = 0.0f;
            } else {
                i6 = 0;
                jArr = (long[]) akbxVar.a;
                j = jArr[i6];
                j2 = j;
                while (true) {
                    j3 = jArr[i6];
                    c = 20;
                    if (j3 != j6) {
                        jArr2 = jArr;
                        f = 0.0f;
                        break;
                    }
                    jArr2 = jArr;
                    f = 0.0f;
                    float fAbs2 = java.lang.Math.abs(j3 - j2);
                    if (j - j3 <= 100.0f) {
                        break;
                    }
                    break;
                    break;
                    j2 = j3;
                    jArr = jArr2;
                    j6 = Long.MIN_VALUE;
                }
                if (i7 < 2) {
                    fE = f;
                } else if (i7 == 2) {
                    i4 = akbxVar.b;
                    if (i4 == 0) {
                        i5 = 19;
                    } else {
                        i5 = i4 - 1;
                    }
                    f5 = jArr2[i4] - jArr2[i5];
                    if (f5 == f) {
                        fE = f;
                    } else {
                        float[] fArr3 = (float[]) akbxVar.c;
                        fE = 1000.0f * ((fArr3[i4] - fArr3[i5]) / f5);
                    }
                } else {
                    int i10 = akbxVar.b;
                    int i11 = ((i10 - i7) + 21) % 20;
                    i = (i10 + 21) % 20;
                    java.lang.Object obj2 = akbxVar.c;
                    i2 = i11 + 1;
                    i3 = i2 % 20;
                    j4 = jArr2[i11];
                    fArr = (float[]) obj2;
                    f2 = fArr[i11];
                    fE2 = f;
                    while (i3 != i) {
                        j5 = jArr2[i3];
                        char c3 = c;
                        f3 = f;
                        f4 = j5 - j4;
                        if (f4 != f3) {
                            float f8 = fArr[i3];
                            float f9 = (f8 - f2) / f4;
                            fE2 += (f9 - akbx.e(fE2)) * java.lang.Math.abs(f9);
                            if (i3 == i2) {
                                fE2 *= 0.5f;
                            }
                            f2 = f8;
                            j4 = j5;
                        }
                        i3 = (i3 + 1) % 20;
                        c = c3;
                        f = f3;
                    }
                    fE = 1000.0f * akbx.e(fE2);
                }
            }
            ((ejx) ejzVar3).i = fE;
            ejz ejzVar4 = this.e;
            ((ejx) ejzVar4).o = h() + 1;
            ((ejx) ejzVar4).p = -1.0f;
            ejzVar4.h(4.0f);
            this.e.g(new defpackage.afoy(this, 1));
        }
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void a(gkz gkzVar) {
        this.c = true;
    }

    public final long h() {
        return this.g.p;
    }

    public final void i() {
        if (this.b) {
            k();
            this.e.j(h() + 1);
        } else {
            this.d = 1;
            this.f = null;
        }
    }

    public final void j(java.lang.Runnable runnable) {
        this.f = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.e.j(0.0f);
        }
    }
}

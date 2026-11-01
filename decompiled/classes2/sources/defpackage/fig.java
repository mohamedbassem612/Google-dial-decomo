package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fig extends defpackage.fif {
    public final boolean e;
    public final defpackage.fib f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final boolean w;
    private final int x;
    private final java.lang.String y;

    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    public fig(int i, defpackage.ern ernVar, int i2, defpackage.fib fibVar, int i3, java.lang.String str, boolean z) {
        boolean z2;
        boolean z3;
        int i4;
        int iB;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        float f;
        int i8;
        defpackage.eqg eqgVar;
        int i9;
        int i10;
        int i11;
        super(i, ernVar, i2);
        this.f = fibVar;
        int i12 = 1;
        int i13 = true != fibVar.M ? 16 : 24;
        boolean z7 = fibVar.L;
        if (!z || (((i9 = (eqgVar = this.d).v) != -1 && i9 > fibVar.a) || ((i10 = eqgVar.w) != -1 && i10 > fibVar.b))) {
            z2 = false;
        } else {
            float f2 = eqgVar.z;
            if ((f2 == -1.0f || f2 <= fibVar.c) && ((i11 = eqgVar.j) == -1 || i11 <= fibVar.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (z) {
            defpackage.eqg eqgVar2 = this.d;
            int i14 = eqgVar2.v;
            if (i14 != -1) {
                int i15 = fibVar.e;
                if (i14 >= 0) {
                    i7 = eqgVar2.w;
                    if (i7 != -1) {
                        int i16 = fibVar.f;
                        if (i7 >= 0) {
                            f = eqgVar2.z;
                            if (f != -1.0f) {
                                int i17 = fibVar.g;
                                if (f >= 0.0f) {
                                    i8 = eqgVar2.j;
                                    if (i8 != -1) {
                                        int i18 = fibVar.h;
                                        if (i8 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i8 = eqgVar2.j;
                                if (i8 != -1) {
                                    int i19 = fibVar.h;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = eqgVar2.z;
                        if (f != -1.0f) {
                            int i110 = fibVar.g;
                            if (f >= 0.0f) {
                                i8 = eqgVar2.j;
                                if (i8 != -1) {
                                    int i111 = fibVar.h;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = eqgVar2.j;
                            if (i8 != -1) {
                                int i112 = fibVar.h;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i7 = eqgVar2.w;
                if (i7 != -1) {
                    int i113 = fibVar.f;
                    if (i7 >= 0) {
                        f = eqgVar2.z;
                        if (f != -1.0f) {
                            int i114 = fibVar.g;
                            if (f >= 0.0f) {
                                i8 = eqgVar2.j;
                                if (i8 != -1) {
                                    int i115 = fibVar.h;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = eqgVar2.j;
                            if (i8 != -1) {
                                int i116 = fibVar.h;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = eqgVar2.z;
                    if (f != -1.0f) {
                        int i117 = fibVar.g;
                        if (f >= 0.0f) {
                            i8 = eqgVar2.j;
                            if (i8 != -1) {
                                int i118 = fibVar.h;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i8 = eqgVar2.j;
                        if (i8 != -1) {
                            int i119 = fibVar.h;
                            if (i8 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.g = z3;
        this.h = defpackage.hgt.aw(i3, false);
        defpackage.eqg eqgVar3 = this.d;
        float f3 = eqgVar3.z;
        this.i = f3 != -1.0f && f3 >= 10.0f;
        this.j = eqgVar3.j;
        this.k = eqgVar3.a();
        int i20 = 0;
        while (true) {
            aike aikeVar = fibVar.o;
            int i21 = aikeVar.d;
            i4 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            if (i20 >= i21) {
                iB = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iB = defpackage.fih.b(this.d, (java.lang.String) aikeVar.get(i20), false);
                if (iB > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.m = i20;
        this.n = iB;
        int i22 = this.d.f;
        int i23 = fibVar.p;
        this.o = defpackage.fih.c(i22, 0);
        int i24 = this.d.f;
        this.q = i24 == 0 || (i24 & 1) != 0;
        this.r = defpackage.fih.b(this.d, str, defpackage.fih.d(str) == null);
        defpackage.eqg eqgVar4 = this.d;
        java.lang.String str2 = eqgVar4.p;
        int i25 = i3 & 384;
        int i26 = 256;
        if (i25 == 256) {
            java.lang.String strC = defpackage.feq.c(eqgVar4);
            str2 = strC != null ? strC : str2;
            i25 = 256;
        }
        int i27 = 0;
        while (true) {
            aike aikeVar2 = fibVar.m;
            if (i27 < aikeVar2.d) {
                if (str2 != null && str2.equals(aikeVar2.get(i27))) {
                    i4 = i27;
                    break;
                }
                i27++;
            } else {
                break;
            }
        }
        this.l = i4;
        this.p = defpackage.fih.a(this.d, fibVar.n);
        if (i25 == 128) {
            z4 = true;
            i26 = i25;
        } else if (i25 == 256) {
            z4 = true;
        } else {
            i26 = i25;
            z4 = false;
        }
        this.s = z4;
        this.t = i26 == 128;
        this.u = (i3 & 64) == 64;
        this.y = str2;
        if (str2 != null) {
            switch (str2) {
                case "video/dolby-vision":
                    i5 = 5;
                    break;
                case "video/av01":
                    i5 = 4;
                    break;
                case "video/hevc":
                    i5 = 3;
                    break;
                case "video/avc":
                    i5 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.v = i5;
        if (z4) {
            defpackage.epy epyVar = this.d.F;
            defpackage.epy epyVar2 = defpackage.epy.a;
            if (epyVar == null || !((i6 = epyVar.d) == 7 || i6 == 6)) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = false;
        }
        this.w = z5;
        defpackage.eqg eqgVar5 = this.d;
        if ((eqgVar5.f & 16384) == 0) {
            defpackage.fib fibVar2 = this.f;
            if (!defpackage.hgt.aw(i3, fibVar2.V) || (!(z6 = this.e) && !fibVar2.K)) {
                i12 = 0;
            } else if (defpackage.hgt.aw(i3, false) && this.g && z6 && eqgVar5.j != -1) {
                boolean z8 = fibVar2.G;
                boolean z9 = fibVar2.F;
                if ((i3 & i13) != 0) {
                    i12 = 2;
                }
            }
        } else {
            i12 = 0;
        }
        this.x = i12;
    }

    @Override // defpackage.fif
    public final int b() {
        return this.x;
    }

    @Override // defpackage.fif
    public final /* bridge */ /* synthetic */ boolean c(defpackage.fif fifVar) {
        defpackage.fig figVar = (defpackage.fig) fifVar;
        if (j$.util.Objects.equals(this.y, figVar.y)) {
            boolean z = this.f.N;
            if (this.s == figVar.s && this.u == figVar.u) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apcs {
    private final defpackage.aoro a = new defpackage.aoro(0, defpackage.aorr.a);
    public apct[] b;

    private final void h(int i, int i2) {
        apct[] apctVarArr = this.b;
        defpackage.aooh.c(apctVarArr);
        apct apctVar = apctVarArr[i2];
        defpackage.aooh.c(apctVar);
        apct apctVar2 = apctVarArr[i];
        defpackage.aooh.c(apctVar2);
        apctVarArr[i] = apctVar;
        apctVarArr[i2] = apctVar2;
        apctVar.e(i);
        apctVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final apct b() {
        apct[] apctVarArr = this.b;
        if (apctVarArr != null) {
            return apctVarArr[0];
        }
        return null;
    }

    public final apct c() {
        apct apctVarB;
        synchronized (this) {
            apctVarB = b();
        }
        return apctVarB;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088 A[LOOP:0: B:18:0x0042->B:42:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d A[EDGE_INSN: B:48:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:18:0x0042->B:42:0x0088], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[EDGE_INSN: B:49:0x008d->B:43:0x008d BREAK  A[LOOP:0: B:18:0x0042->B:42:0x0088], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[SYNTHETIC] */
    public final apct d(int i) {
        int i2;
        int i3;
        java.lang.Comparable[] comparableArr;
        int i4;
        java.lang.Comparable comparable;
        java.lang.Comparable comparable2;
        java.lang.Comparable comparable3;
        java.lang.Comparable comparable4;
        java.lang.Comparable comparable5;
        java.lang.Comparable comparable6;
        boolean z = defpackage.aosu.a;
        java.lang.Comparable[] comparableArr2 = this.b;
        if (comparableArr2 == null) {
            defpackage.aooh.g();
        }
        e(a() - 1);
        if (i < a()) {
            h(i, a());
            int i5 = i - 1;
            if (i > 0) {
                java.lang.Comparable comparable7 = comparableArr2[i];
                if (comparable7 == null) {
                    defpackage.aooh.g();
                }
                int i6 = i5 / 2;
                java.lang.Comparable comparable8 = comparable7;
                java.lang.Comparable comparable9 = comparableArr2[i6];
                if (comparable9 == null) {
                    defpackage.aooh.g();
                }
                if (comparable8.compareTo(comparable9) >= 0) {
                    while (true) {
                        i2 = i << 1;
                        i3 = i2 + 1;
                        if (i3 >= a()) {
                            comparableArr = this.b;
                            if (comparableArr == null) {
                                defpackage.aooh.g();
                            }
                            i4 = i2 + 2;
                            if (i4 >= a()) {
                                i4 = i3;
                            } else {
                                comparable4 = comparableArr[i4];
                                if (comparable4 == null) {
                                    defpackage.aooh.g();
                                }
                                comparable5 = comparable4;
                                comparable6 = comparableArr[i3];
                                if (comparable6 == null) {
                                    defpackage.aooh.g();
                                }
                                if (comparable5.compareTo(comparable6) >= 0) {
                                    i4 = i3;
                                }
                            }
                            comparable = comparableArr[i];
                            if (comparable == null) {
                                defpackage.aooh.g();
                            }
                            comparable2 = comparable;
                            comparable3 = comparableArr[i4];
                            if (comparable3 == null) {
                                defpackage.aooh.g();
                            }
                            if (comparable2.compareTo(comparable3) > 0) {
                                break;
                                break;
                            }
                            h(i, i4);
                            i = i4;
                        } else {
                            break;
                            break;
                        }
                    }
                } else {
                    h(i, i6);
                    f(i6);
                }
            } else {
                while (true) {
                    i2 = i << 1;
                    i3 = i2 + 1;
                    if (i3 >= a()) {
                        comparableArr = this.b;
                        if (comparableArr == null) {
                            defpackage.aooh.g();
                        }
                        i4 = i2 + 2;
                        if (i4 >= a()) {
                            i4 = i3;
                        } else {
                            comparable4 = comparableArr[i4];
                            if (comparable4 == null) {
                                defpackage.aooh.g();
                            }
                            comparable5 = comparable4;
                            comparable6 = comparableArr[i3];
                            if (comparable6 == null) {
                                defpackage.aooh.g();
                            }
                            if (comparable5.compareTo(comparable6) >= 0) {
                                i4 = i3;
                            }
                        }
                        comparable = comparableArr[i];
                        if (comparable == null) {
                            defpackage.aooh.g();
                        }
                        comparable2 = comparable;
                        comparable3 = comparableArr[i4];
                        if (comparable3 == null) {
                            defpackage.aooh.g();
                        }
                        if (comparable2.compareTo(comparable3) > 0) {
                            break;
                        }
                        h(i, i4);
                        i = i4;
                    } else {
                        break;
                    }
                }
            }
        }
        java.lang.Comparable comparable10 = comparableArr2[a()];
        if (comparable10 == null) {
            defpackage.aooh.g();
        }
        comparable10.d((defpackage.apcs) null);
        comparable10.e(-1);
        comparableArr2[a()] = null;
        return comparable10;
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            java.lang.Comparable[] comparableArr = this.b;
            if (comparableArr == null) {
                defpackage.aooh.g();
            }
            int i2 = (i - 1) >> 1;
            java.lang.Comparable comparable = comparableArr[i2];
            if (comparable == null) {
                defpackage.aooh.g();
            }
            java.lang.Comparable comparable2 = comparable;
            java.lang.Comparable comparable3 = comparableArr[i];
            if (comparable3 == null) {
                defpackage.aooh.g();
            }
            if (comparable2.compareTo(comparable3) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}

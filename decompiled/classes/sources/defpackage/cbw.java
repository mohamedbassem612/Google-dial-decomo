package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbw {
    public final java.util.List a;
    public final int b;
    public int c;
    public final java.util.List d;
    public final defpackage.aoir e;
    public final defpackage.aco f;

    public cbw(java.util.List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            defpackage.cdh.a("Invalid start index");
        }
        this.d = new java.util.ArrayList();
        defpackage.aco acoVar = new defpackage.aco(6);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.cfj cfjVar = (defpackage.cfj) this.a.get(i3);
            acoVar.g(cfjVar.c, new defpackage.aalk(i3, i2, cfjVar.d));
            i2 += cfjVar.d;
        }
        this.f = acoVar;
        this.e = defpackage.aooc.ah(1, new defpackage.kkf(this, 1));
    }

    public final int a(defpackage.cfj cfjVar) {
        defpackage.aalk aalkVar = (defpackage.aalk) this.f.a(cfjVar.c);
        if (aalkVar != null) {
            return aalkVar.b;
        }
        return -1;
    }

    public final int b(defpackage.cfj cfjVar) {
        defpackage.aalk aalkVar = (defpackage.aalk) this.f.a(cfjVar.c);
        return aalkVar != null ? aalkVar.a : cfjVar.d;
    }

    public final void c(defpackage.cfj cfjVar, int i) {
        this.f.g(cfjVar.c, new defpackage.aalk(-1, i, 0));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:0: B:9:0x0025->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[EDGE_INSN: B:30:0x006d->B:27:0x006d BREAK  A[LOOP:0: B:9:0x0025->B:26:0x006a], SYNTHETIC] */
    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        defpackage.aco acoVar = this.f;
        defpackage.aalk aalkVar = (defpackage.aalk) acoVar.a(i);
        if (aalkVar == null) {
            return false;
        }
        int i5 = aalkVar.b;
        int i6 = i2 - aalkVar.a;
        aalkVar.a = i2;
        if (i6 != 0) {
            java.lang.Object[] objArr = acoVar.c;
            long[] jArr = acoVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            i3 = 8 - ((~i8) >>> 31);
                            if (i9 >= i3) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                defpackage.aalk aalkVar2 = (defpackage.aalk) objArr[(i7 << 3) + i9];
                                if (aalkVar2.b >= i5 && !defpackage.aooh.n(aalkVar2, aalkVar) && (i4 = aalkVar2.b + i6) >= 0) {
                                    aalkVar2.b = i4;
                                }
                            }
                            j >>= 8;
                            i9++;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i7 != length) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return true;
    }

    public final void e(defpackage.cfj cfjVar) {
        this.d.add(cfjVar);
    }
}

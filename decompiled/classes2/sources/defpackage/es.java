package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class es {
    private final java.util.List a;
    private final int[] b;
    private final int[] c;
    private final defpackage.er d;
    private final int e;
    private final int f;

    public es(defpackage.er erVar, java.util.List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr2, 0);
        this.d = erVar;
        int iB = erVar.b();
        this.e = iB;
        int iA = erVar.a();
        this.f = iA;
        defpackage.ahoz ahozVar = list.isEmpty() ? null : (defpackage.ahoz) list.get(0);
        if (ahozVar == null || ahozVar.b != 0 || ahozVar.c != 0) {
            list.add(0, new defpackage.ahoz(0, 0, 0, null, null, null));
        }
        list.add(new defpackage.ahoz(iB, iA, 0, null, null, null));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ahoz ahozVar2 = (defpackage.ahoz) it.next();
            for (int i = 0; i < ahozVar2.a; i++) {
                int i2 = ahozVar2.b + i;
                int i3 = ahozVar2.c + i;
                int i4 = true != this.d.d(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int iA2 = 0;
        for (defpackage.ahoz ahozVar3 : this.a) {
            while (iA2 < ahozVar3.b) {
                if (this.b[iA2] == 0) {
                    int size = this.a.size();
                    int iB2 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        defpackage.ahoz ahozVar4 = (defpackage.ahoz) this.a.get(i5);
                        while (iB2 < ahozVar4.c) {
                            if (this.c[iB2] == 0 && this.d.e(iA2, iB2)) {
                                int i6 = true != this.d.d(iA2, iB2) ? 4 : 8;
                                this.b[iA2] = (iB2 << 4) | i6;
                                this.c[iB2] = (iA2 << 4) | i6;
                                break;
                            }
                            iB2++;
                        }
                        iB2 = ahozVar4.b();
                    }
                }
                iA2++;
            }
            iA2 = ahozVar3.a();
        }
    }

    private static defpackage.frx d(java.util.Collection collection, int i, boolean z) {
        defpackage.frx frxVar;
        java.util.Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                frxVar = null;
                break;
            }
            frxVar = (defpackage.frx) it.next();
            if (frxVar.a == i && frxVar.b == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            defpackage.frx frxVar2 = (defpackage.frx) it.next();
            if (z) {
                frxVar2.c--;
            } else {
                frxVar2.c++;
            }
        }
        return frxVar;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.e) {
            int i2 = this.b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
        throw new java.lang.IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
    }

    public final void b(defpackage.ew ewVar) {
        int i;
        defpackage.eq eqVar = ewVar instanceof defpackage.eq ? (defpackage.eq) ewVar : new defpackage.eq(ewVar);
        int i2 = this.e;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        int i3 = this.f;
        java.util.List list = this.a;
        int i4 = i3;
        int i5 = i2;
        for (int size = list.size() - 1; size >= 0; size--) {
            defpackage.ahoz ahozVar = (defpackage.ahoz) list.get(size);
            int iA = ahozVar.a();
            int iB = ahozVar.b();
            while (true) {
                if (i5 <= iA) {
                    break;
                }
                i5--;
                int i6 = this.b[i5];
                if ((i6 & 12) != 0) {
                    int i7 = i6 >> 4;
                    defpackage.frx frxVarD = d(arrayDeque, i7, false);
                    if (frxVarD != null) {
                        int i8 = (i2 - frxVarD.c) - 1;
                        eqVar.c(i5, i8);
                        if ((i6 & 4) != 0) {
                            eqVar.a(i8, 1, this.d.c(i5, i7));
                        }
                    } else {
                        arrayDeque.add(new defpackage.frx(i5, (i2 - i5) - 1, true));
                    }
                } else {
                    eqVar.d(i5, 1);
                    i2--;
                }
            }
            while (i4 > iB) {
                i4--;
                int i9 = this.c[i4];
                if ((i9 & 12) != 0) {
                    int i10 = i9 >> 4;
                    defpackage.frx frxVarD2 = d(arrayDeque, i10, true);
                    if (frxVarD2 == null) {
                        arrayDeque.add(new defpackage.frx(i4, i2 - i5, false));
                    } else {
                        eqVar.c((i2 - frxVarD2.c) - 1, i5);
                        if ((i9 & 4) != 0) {
                            eqVar.a(i5, 1, this.d.c(i10, i4));
                        }
                    }
                } else {
                    eqVar.b(i5, 1);
                    i2++;
                }
            }
            i5 = ahozVar.b;
            i4 = ahozVar.c;
            int i11 = i5;
            int i12 = i4;
            for (i = 0; i < ahozVar.a; i++) {
                if ((this.b[i11] & 15) == 2) {
                    eqVar.a(i11, 1, this.d.c(i11, i12));
                }
                i11++;
                i12++;
            }
        }
        eqVar.e();
    }

    public final void c(kh khVar) {
        b(new defpackage.ep(khVar));
    }
}

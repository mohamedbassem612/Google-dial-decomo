package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bch {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final java.util.List f;
    public int g;
    private final defpackage.bbt h;
    private java.util.List i;

    public bch(defpackage.bbt bbtVar) {
        this.h = bbtVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.ux(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.f = new java.util.ArrayList();
        this.i = aokc.a;
    }

    private final int e() {
        return ((int) java.lang.Math.sqrt(((double) b()) / ((double) this.g))) + 1;
    }

    public final int a(int i) {
        if (b() <= 0) {
            return 0;
        }
        if (i >= b()) {
            defpackage.avo.c("ItemIndex > total count");
        }
        if (!this.h.b) {
            return i / this.g;
        }
        java.util.ArrayList arrayList = this.a;
        int iBi = ajsz.bi(arrayList, arrayList.size(), new defpackage.cos(i, 1));
        if (iBi < 0) {
            iBi = (-iBi) - 2;
        }
        int iE = e() * iBi;
        int i2 = ((defpackage.ux) arrayList.get(iBi)).b;
        if (i2 > i) {
            defpackage.avo.c("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int iC = c(i2);
            i3 += iC;
            int i5 = this.g;
            if (i3 >= i5) {
                iE++;
                i3 = i3 == i5 ? 0 : iC;
            }
            if (iE % e() == 0 && iE / e() >= arrayList.size()) {
                arrayList.add(new defpackage.ux(i4 - (i3 > 0 ? 1 : 0), 0));
            }
            i2 = i4;
        }
        return i3 + c(i) > this.g ? iE + 1 : iE;
    }

    public final int b() {
        return this.h.c.b;
    }

    public final int c(int i) {
        defpackage.bcg bcgVar = defpackage.bcg.a;
        defpackage.bcg.b = this.g;
        apnb apnbVarB = this.h.c.b(i);
        return (int) ((defpackage.bbl) ((defpackage.bbr) apnbVarB.c).a.a(bcgVar, java.lang.Integer.valueOf(i - apnbVarB.b))).a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    public final amwp d(int i) {
        boolean z;
        java.util.List list;
        if (!this.h.b) {
            int i2 = this.g;
            int i3 = i * i2;
            int iB = b() - i3;
            if (i2 > iB) {
                i2 = iB;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 == this.i.size()) {
                list = this.i;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    arrayList.add(new defpackage.bbl(1L));
                }
                this.i = arrayList;
                list = arrayList;
            }
            return new amwp(i3, list, (byte[]) null);
        }
        int iE = i / e();
        java.util.ArrayList arrayList2 = this.a;
        int iMin = java.lang.Math.min(iE, arrayList2.size() - 1);
        int iE2 = e() * iMin;
        int iIntValue = ((defpackage.ux) arrayList2.get(iMin)).b;
        int iC = ((defpackage.ux) arrayList2.get(iMin)).a;
        int i5 = this.b;
        if (iE2 <= i5 && i5 <= i) {
            iIntValue = this.c;
            iC = this.d;
            iE2 = i5;
        } else if (iMin == this.e) {
            int i6 = i - iE2;
            java.util.List list2 = this.f;
            if (i6 < list2.size()) {
                iIntValue = ((java.lang.Number) list2.get(i6)).intValue();
                iE2 = i;
                iC = 0;
            }
        }
        if (iE2 % e() == 0) {
            int iE3 = e();
            int i7 = i - iE2;
            if (i7 < 2 || i7 >= iE3) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.e = iMin;
            this.f.clear();
        }
        if (iE2 > i) {
            defpackage.avo.d(a.bv((byte) 41, i, iE2, "currentLine (", ") > lineIndex ("));
        }
        while (iE2 < i && iIntValue < b()) {
            if (z) {
                this.f.add(java.lang.Integer.valueOf(iIntValue));
            }
            int i8 = 0;
            while (i8 < this.g && iIntValue < b()) {
                if (iC == 0) {
                    iC = c(iIntValue);
                }
                i8 += iC;
                if (i8 > this.g) {
                    break;
                }
                iIntValue++;
                iC = 0;
            }
            iE2++;
            if (iE2 % e() == 0 && iIntValue < b()) {
                if (arrayList2.size() != iE2 / e()) {
                    defpackage.avo.d("invalid starting point");
                }
                arrayList2.add(new defpackage.ux(iIntValue, iC));
            }
        }
        this.b = i;
        this.c = iIntValue;
        this.d = iC;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i9 = 0;
        int i10 = iIntValue;
        while (i9 < this.g && i10 < b()) {
            if (iC == 0) {
                iC = c(i10);
            }
            i9 += iC;
            if (i9 > this.g) {
                break;
            }
            arrayList3.add(new defpackage.bbl(wl.b(iC)));
            i10++;
            iC = 0;
        }
        return new amwp(iIntValue, arrayList3, (byte[]) null);
    }
}

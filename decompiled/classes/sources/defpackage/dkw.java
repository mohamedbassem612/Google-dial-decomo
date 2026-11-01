package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkw {
    public final defpackage.dkv a;
    public final defpackage.djy b;
    public final long c;
    public final float d;
    public final float e;
    public final java.util.List f;

    public dkw(defpackage.dkv dkvVar, defpackage.djy djyVar, long j) {
        this.a = dkvVar;
        this.b = djyVar;
        this.c = j;
        float fA = 0.0f;
        this.d = djyVar.h.isEmpty() ? 0.0f : ((defpackage.dka) djyVar.h.get(0)).g.b(0);
        if (!djyVar.h.isEmpty()) {
            java.util.List list = djyVar.h;
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            defpackage.dka dkaVar = (defpackage.dka) list.get(list.size() - 1);
            fA = dkaVar.a(dkaVar.g.a());
        }
        this.e = fA;
        this.f = djyVar.g;
    }

    public final float a(int i) {
        defpackage.djy djyVar = this.b;
        djyVar.e(i);
        java.util.List list = djyVar.h;
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.g(list, i));
        return dkaVar.a(dkaVar.g.c(dkaVar.f(i)));
    }

    public final float b(int i) {
        defpackage.djy djyVar = this.b;
        djyVar.e(i);
        java.util.List list = djyVar.h;
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.g(list, i));
        return dkaVar.a(dkaVar.g.d(dkaVar.f(i)));
    }

    public final int c() {
        return this.b.f;
    }

    public final int d(int i, boolean z) {
        return this.b.a(i, z);
    }

    public final int e(int i) {
        return this.b.b(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkw) {
            defpackage.dkw dkwVar = (defpackage.dkw) obj;
            if (defpackage.aooh.n(this.a, dkwVar.a) && defpackage.aooh.n(this.b, dkwVar.b) && this.c == dkwVar.c && this.d == dkwVar.d && this.e == dkwVar.e && defpackage.aooh.n(this.f, dkwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int f(float f) {
        int lineForVertical;
        java.util.List list = this.b.h;
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.h(list, f));
        if (dkaVar.b() == 0) {
            return dkaVar.c;
        }
        defpackage.djb djbVar = dkaVar.g;
        float f2 = (f - dkaVar.e) - djbVar.f;
        defpackage.dll dllVar = djbVar.b;
        int i = dllVar.g;
        if (i <= 0) {
            lineForVertical = 0;
        } else {
            int i2 = i - 1;
            lineForVertical = dllVar.f.getLineForVertical(((int) f2) - dllVar.h);
            if (lineForVertical > i2) {
                lineForVertical = i2;
            }
        }
        return dkaVar.d(lineForVertical);
    }

    public final int g(int i) {
        defpackage.djy djyVar = this.b;
        djyVar.e(i);
        java.util.List list = djyVar.h;
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.g(list, i));
        defpackage.djb djbVar = dkaVar.g;
        return dkaVar.c(djbVar.b.j(dkaVar.f(i)));
    }

    public final int h(long j) {
        java.util.List list = this.b.h;
        int i = (int) (j & 4294967295L);
        defpackage.dka dkaVar = (defpackage.dka) list.get(xa.h(list, java.lang.Float.intBitsToFloat(i)));
        if (dkaVar.b() == 0) {
            return dkaVar.a;
        }
        defpackage.djb djbVar = dkaVar.g;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - dkaVar.e)) & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - djbVar.f;
        defpackage.dll dllVar = djbVar.b;
        int i2 = dllVar.h;
        android.text.Layout layout = dllVar.f;
        int lineForVertical = layout.getLineForVertical(((int) fIntBitsToFloat) - i2);
        return dkaVar.c(lineForVertical >= djbVar.f() ? dllVar.m().length() : layout.getOffsetForHorizontal(lineForVertical, java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + (-dllVar.a(lineForVertical))));
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return (((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final long i(int i) {
        int iB;
        int iA;
        defpackage.djy djyVar = this.b;
        djyVar.d(i);
        defpackage.dka dkaVar = (defpackage.dka) djyVar.h.get(i == djyVar.c().a() ? djyVar.h.size() - 1 : xa.f(djyVar.h, i));
        defpackage.djb djbVar = dkaVar.g;
        int iE = dkaVar.e(i);
        defpackage.dll dllVar = djbVar.b;
        dln dlnVar = dllVar.e;
        if (dlnVar == null) {
            android.text.Layout layout = dllVar.f;
            dln dlnVar2 = new dln(layout.getText(), layout.getText().length(), dllVar.a.getTextLocale());
            dllVar.e = dlnVar2;
            dlnVar = dlnVar2;
        }
        if (!dlnVar.h(dlnVar.b(iE))) {
            dlnVar.c(iE);
            if (!dlnVar.g(iE)) {
                if (!dlnVar.d(iE)) {
                    iB = -1;
                    break;
                }
                iB = dlnVar.b(iE);
            } else {
                iB = (!dlnVar.f(iE) || dlnVar.d(iE)) ? dlnVar.b(iE) : iE;
            }
        } else {
            dlnVar.c(iE);
            iB = iE;
            while (true) {
                if (iB == -1) {
                    iB = -1;
                    break;
                }
                if (dlnVar.h(iB) && !dlnVar.e(iB)) {
                    break;
                }
                iB = dlnVar.b(iB);
            }
        }
        if (iB == -1) {
            iB = iE;
        }
        if (!dlnVar.e(dlnVar.a(iE))) {
            dlnVar.c(iE);
            if (!dlnVar.d(iE)) {
                if (!dlnVar.g(iE)) {
                    iA = -1;
                    break;
                }
                iA = dlnVar.a(iE);
            } else {
                iA = (!dlnVar.f(iE) || dlnVar.g(iE)) ? dlnVar.a(iE) : iE;
            }
        } else {
            dlnVar.c(iE);
            iA = iE;
            while (true) {
                if (iA == -1) {
                    iA = -1;
                    break;
                }
                if (!dlnVar.h(iA) && dlnVar.e(iA)) {
                    break;
                }
                iA = dlnVar.a(iA);
            }
        }
        if (iA != -1) {
            iE = iA;
        }
        long jE = defpackage.dfd.e(iB, iE);
        long j = defpackage.dky.a;
        return defpackage.dfd.e(dkaVar.c((int) (jE >> 32)), dkaVar.c((int) (jE & 4294967295L)));
    }

    public final defpackage.cpn j(int i) {
        float f;
        float f2;
        float fE;
        float fE2;
        defpackage.djy djyVar = this.b;
        if (i < 0 || i >= djyVar.c().c.length()) {
            dnv.b("offset(" + i + ") is out of bounds [0, " + djyVar.c().a() + ')');
        }
        java.util.List list = djyVar.h;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (i >= ((defpackage.dka) list.get(list.size() - 1)).b) {
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            defpackage.dka dkaVar = (defpackage.dka) list.get(list.size() - 1);
            return dkaVar.g(dkaVar.g.g(dkaVar.b()));
        }
        defpackage.dka dkaVar2 = (defpackage.dka) list.get(xa.f(list, i));
        defpackage.djb djbVar = dkaVar2.g;
        int iE = dkaVar2.e(i);
        if (iE < 0 || iE >= djbVar.c.length()) {
            dnv.b("offset(" + iE + ") is out of bounds [0," + djbVar.c.length() + ')');
        }
        defpackage.dll dllVar = djbVar.b;
        int i2 = iE + 1;
        int i3 = dllVar.i(iE);
        float fD = dllVar.d(i3);
        float fB = dllVar.b(i3);
        boolean z = dllVar.k(i3) == 1;
        boolean zIsRtlCharAt = dllVar.f.isRtlCharAt(iE);
        if (z) {
            if (zIsRtlCharAt) {
                fE = dllVar.f(iE, false);
                fE2 = dllVar.f(i2, true);
                float f3 = fE2;
                f2 = fE;
                f = f3;
            } else {
                f = dllVar.e(iE, false);
                f2 = dllVar.e(i2, true);
            }
        } else if (zIsRtlCharAt) {
            fE = dllVar.e(iE, false);
            fE2 = dllVar.e(i2, true);
            float f4 = fE2;
            f2 = fE;
            f = f4;
        } else {
            f = dllVar.f(iE, false);
            f2 = dllVar.f(i2, true);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(f, fD, f2, fB);
        return dkaVar2.g(djbVar.e ? new defpackage.cpn(rectF.left, 0.0f, rectF.right, djbVar.d) : new defpackage.cpn(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final defpackage.dkw k(defpackage.dkv dkvVar, long j) {
        return new defpackage.dkw(dkvVar, this.b, j);
    }

    public final boolean l() {
        defpackage.djy djyVar = this.b;
        if (!djyVar.c) {
            if (((int) (this.c & 4294967295L)) >= djyVar.e) {
                return false;
            }
        }
        return true;
    }

    public final boolean m() {
        return ((float) ((int) (this.c >> 32))) < this.b.d || l();
    }

    public final int n(int i) {
        defpackage.djy djyVar = this.b;
        djyVar.d(i);
        defpackage.dka dkaVar = (defpackage.dka) djyVar.h.get(i == djyVar.c().a() ? djyVar.h.size() - 1 : xa.f(djyVar.h, i));
        return dkaVar.g.b.o(dkaVar.e(i)) ? 2 : 1;
    }

    public final int o(int i) {
        defpackage.djy djyVar = this.b;
        djyVar.d(i);
        defpackage.dka dkaVar = (defpackage.dka) djyVar.h.get(i == djyVar.c().a() ? djyVar.h.size() - 1 : xa.f(djyVar.h, i));
        defpackage.djb djbVar = dkaVar.g;
        int iE = dkaVar.e(i);
        defpackage.dll dllVar = djbVar.b;
        return dllVar.k(dllVar.i(iE)) != 1 ? 2 : 1;
    }

    public final defpackage.cpx p(int i, int i2) {
        defpackage.djy djyVar = this.b;
        if (i < 0 || i > i2 || i2 > djyVar.c().c.length()) {
            dnv.b("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + djyVar.c().c.length() + "), or start > end!");
        }
        if (i == i2) {
            return new defpackage.cpx((byte[]) null);
        }
        defpackage.cpx cpxVar = new defpackage.cpx((byte[]) null);
        java.util.List list = djyVar.h;
        long jE = defpackage.dfd.e(i, i2);
        long j = defpackage.dky.a;
        ayc aycVar = new ayc(cpxVar, i, i2, 2);
        int i3 = (int) (jE >> 32);
        int i4 = (int) (jE & 4294967295L);
        int size = list.size();
        for (int iF = xa.f(list, java.lang.Math.min(i3, i4)); iF < size; iF++) {
            defpackage.dka dkaVar = (defpackage.dka) list.get(iF);
            int i5 = dkaVar.a;
            if (i5 >= java.lang.Math.max(i3, i4)) {
                break;
            }
            if (i5 != dkaVar.b) {
                aycVar.a(dkaVar);
            }
        }
        return cpxVar;
    }

    public final java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + defpackage.dpp.a(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

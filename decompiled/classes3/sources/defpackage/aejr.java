package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejr {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public aejr(int i, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = i4;
        this.f = f2;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    final boolean a() {
        return this.h > 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aejr) {
            defpackage.aejr aejrVar = (defpackage.aejr) obj;
            if (this.a == aejrVar.a && this.b == aejrVar.b && this.c == aejrVar.c) {
                if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(aejrVar.d) && this.e == aejrVar.e) {
                    if (java.lang.Float.floatToIntBits(this.f) == java.lang.Float.floatToIntBits(aejrVar.f) && this.g == aejrVar.g && this.h == aejrVar.h && this.i == aejrVar.i && this.j == aejrVar.j && this.k == aejrVar.k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ java.lang.Float.floatToIntBits(this.d)) * 1000003) ^ this.e) * 1000003) ^ java.lang.Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    public final java.lang.String toString() {
        return "ExpressSignInAttributes{contentContainerPaddingTop=" + this.a + ", containerExternalHorizontalSpacing=" + this.b + ", containerInternalAdditionalHorizontalSpacing=" + this.c + ", dialogCornerRadius=" + this.d + ", importantBoxBackgroundColor=" + this.e + ", importantBoxCornerRadius=" + this.f + ", importantBoxMarginTop=" + this.g + ", dialogMarginBottom=" + this.h + ", legalDisclaimerBottomPadding=" + this.i + ", legalDisclaimerTopPadding=" + this.j + ", selectedAccountViewMarginVertical=" + this.k + '}';
    }

    public aejr() {
        throw null;
    }
}

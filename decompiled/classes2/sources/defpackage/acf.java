package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acf {
    public float[] a;
    public int b;

    public acf(int i) {
        this.a = i == 0 ? defpackage.ach.a : new float[i];
    }

    public static /* synthetic */ java.lang.String d(defpackage.acf acfVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i) {
        java.lang.String str = 1 != (i & 1) ? null : ", ";
        aooh.f(str, "separator");
        if ((i & 2) != 0) {
            charSequence = "";
        }
        aooh.f(charSequence, "prefix");
        if ((i & 4) != 0) {
            charSequence2 = "";
        }
        aooh.f(charSequence2, "postfix");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence);
        float[] fArr = acfVar.a;
        int i2 = acfVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = fArr[i3];
            if (i3 != 0) {
                sb.append((java.lang.CharSequence) str);
            }
            if (i3 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append(f);
        }
        sb.append(charSequence2);
        return sb.toString();
    }

    public final float a(int i) {
        if (i < 0 || i >= this.b) {
            un.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final float b() {
        if (this.b == 0) {
            un.d("FloatList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(float f) {
        int i = this.b + 1;
        float[] fArrCopyOf = this.a;
        int length = fArrCopyOf.length;
        if (length < i) {
            fArrCopyOf = java.util.Arrays.copyOf(fArrCopyOf, java.lang.Math.max(i, (length * 3) / 2));
            aooh.e(fArrCopyOf, "copyOf(...)");
            this.a = fArrCopyOf;
        }
        int i2 = this.b;
        fArrCopyOf[i2] = f;
        this.b = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acf)) {
            return false;
        }
        defpackage.acf acfVar = (defpackage.acf) obj;
        int i = acfVar.b;
        int i2 = this.b;
        if (i != i2) {
            return false;
        }
        float[] fArr = this.a;
        float[] fArr2 = acfVar.a;
        aopq aopqVarC = aooc.C(0, i2);
        int i3 = ((aopo) aopqVarC).a;
        int i4 = ((aopo) aopqVarC).b;
        if (i3 <= i4) {
            while (fArr[i3] == fArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iFloatToIntBits = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits += java.lang.Float.floatToIntBits(fArr[i2]) * 31;
        }
        return iFloatToIntBits;
    }

    public final java.lang.String toString() {
        return d(this, "[", "]", 25);
    }
}

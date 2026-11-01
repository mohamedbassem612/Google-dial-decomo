package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aed implements java.lang.Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ java.lang.Object[] c;
    public /* synthetic */ int d;

    public aed(byte[] bArr) {
        int iC = defpackage.aei.c(40) / 4;
        this.b = new int[iC];
        this.c = new java.lang.Object[iC];
    }

    public final int a(int i) {
        if (this.a) {
            aee.b(this);
        }
        return defpackage.aei.a(this.b, this.d, i);
    }

    public final int b(int i) {
        if (this.a) {
            aee.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            aee.b(this);
        }
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.aed clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        if (objClone == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        }
        defpackage.aed aedVar = (defpackage.aed) objClone;
        aedVar.b = (int[]) this.b.clone();
        aedVar.c = (java.lang.Object[]) this.c.clone();
        return aedVar;
    }

    public final java.lang.Object e(int i) {
        if (this.a) {
            aee.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.c[i];
    }

    public final void f(int i, java.lang.Object obj) {
        int iA = defpackage.aei.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.c;
            if (objArr[i2] == aee.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            aee.b(this);
            i2 = ~defpackage.aei.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iC = defpackage.aei.c((i4 + 1) << 2) / 4;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iC);
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.b = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.c, iC);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            this.c = objArrCopyOf;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            defpackage.ajsz.db(iArr2, iArr2, i6, i2, i5);
            java.lang.Object[] objArr2 = this.c;
            defpackage.ajsz.dd(objArr2, objArr2, i6, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final java.lang.String toString() {
        if (c() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            java.lang.Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aed() {
        throw null;
    }
}

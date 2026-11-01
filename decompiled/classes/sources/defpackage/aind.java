package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aind extends defpackage.aior {
    public java.lang.Object[] a = new java.lang.Object[8];
    public int b = 0;

    public final int a(defpackage.ainp ainpVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i << 1].equals(ainpVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aior
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aior
    public final defpackage.ainp c(int i) {
        if (i < this.b) {
            return (defpackage.ainp) this.a[i << 1];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // defpackage.aior
    public final java.lang.Object d(defpackage.ainp ainpVar) {
        int iA = a(ainpVar);
        if (iA != -1) {
            return ainpVar.c(this.a[(iA << 1) + 1]);
        }
        return null;
    }

    @Override // defpackage.aior
    public final java.lang.Object e(int i) {
        if (i < this.b) {
            return this.a[(i << 1) + 1];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    final void f(defpackage.ainp ainpVar, java.lang.Object obj) {
        int iA;
        if (!ainpVar.b && (iA = a(ainpVar)) != -1) {
            defpackage.aiql.l(obj, "metadata value");
            this.a[(iA << 1) + 1] = obj;
            return;
        }
        int i = this.b + 1;
        java.lang.Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if ((i << 1) > length) {
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, length << 1);
            this.a = objArrCopyOf;
        }
        int i2 = this.b << 1;
        defpackage.aiql.l(ainpVar, "metadata key");
        objArrCopyOf[i2] = ainpVar;
        java.lang.Object[] objArr = this.a;
        int i3 = (this.b << 1) + 1;
        defpackage.aiql.l(obj, "metadata value");
        objArr[i3] = obj;
        this.b++;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}

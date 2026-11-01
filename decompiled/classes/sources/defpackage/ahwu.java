package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ahwu implements java.util.Iterator {
    final java.lang.CharSequence b;
    final defpackage.ahxn c;
    final boolean d;
    int f;
    private java.lang.Object g;
    public int a = 2;
    int e = 0;

    public ahwu(defpackage.ahzf ahzfVar, java.lang.CharSequence charSequence) {
        this.c = (defpackage.ahxn) ahzfVar.c;
        this.d = ahzfVar.a;
        this.f = ahzfVar.b;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iA;
        int i = this.a;
        if (i == 4) {
            throw new java.lang.IllegalStateException();
        }
        int i2 = i - 1;
        java.lang.String string = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.e;
            while (true) {
                int i4 = this.e;
                if (i4 == -1) {
                    this.a = 3;
                    break;
                }
                int iB = b(i4);
                if (iB == -1) {
                    iB = this.b.length();
                    this.e = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.e = iA;
                }
                if (iA == i3) {
                    int i5 = iA + 1;
                    this.e = i5;
                    if (i5 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i3 < iB && this.c.c(this.b.charAt(i3))) {
                        i3++;
                    }
                    while (iB > i3) {
                        int i6 = iB - 1;
                        if (!this.c.c(this.b.charAt(i6))) {
                            break;
                        }
                        iB = i6;
                    }
                    if (!this.d || i3 != iB) {
                        int i7 = this.f;
                        if (i7 == 1) {
                            java.lang.CharSequence charSequence = this.b;
                            int length = charSequence.length();
                            this.e = -1;
                            while (length > i3) {
                                int i8 = length - 1;
                                if (!this.c.c(charSequence.charAt(i8))) {
                                    break;
                                }
                                length = i8;
                            }
                            iB = length;
                        } else {
                            this.f = i7 - 1;
                        }
                        string = this.b.subSequence(i3, iB).toString();
                        break;
                    }
                    i3 = this.e;
                }
            }
            this.g = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = 2;
        java.lang.Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

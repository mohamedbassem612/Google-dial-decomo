package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class albv extends akzc {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int b;
    public final akzc c;
    public final akzc f;
    public final int g;
    private final int h;

    public albv(akzc akzcVar, akzc akzcVar2) {
        this.c = akzcVar;
        this.f = akzcVar2;
        int iC = akzcVar.c();
        this.h = iC;
        this.b = iC + akzcVar2.c();
        this.g = java.lang.Math.max(akzcVar.p(), akzcVar2.p()) + 1;
    }

    public static akzc I(akzc akzcVar, akzc akzcVar2) {
        int iC = akzcVar.c();
        int iC2 = akzcVar2.c();
        byte[] bArr = new byte[iC + iC2];
        akzcVar.B(bArr, 0, 0, iC);
        akzcVar2.B(bArr, 0, iC, iC2);
        return akzc.y(bArr);
    }

    public static int o(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public final byte a(int i) {
        throw null;
    }

    protected final int b(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.c.b(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.b(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.b(this.c.b(i, i2, i6), 0, i3 - i6);
    }

    public final int c() {
        return this.b;
    }

    public final defpackage.akyy d() {
        return new defpackage.albs(this);
    }

    public final akzc e(int i, int i2) {
        return f(i, i2);
    }

    public final akzc f(int i, int i2) {
        int i3 = this.b;
        int iP = anty.P(i, i2, i3);
        if (iP == 0) {
            return akzc.d;
        }
        if (iP == i3) {
            return this;
        }
        int i4 = this.h;
        if (i2 <= i4) {
            return this.c.e(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.f.e(i - i4, i5);
        }
        return new defpackage.albv(this.c.x(i), this.f.e(0, i5));
    }

    public final akzf g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.albt albtVar = new defpackage.albt(this);
        while (albtVar.hasNext()) {
            arrayList.add(albtVar.next().j());
        }
        int i = akzf.i;
        return akzf.J(new defpackage.alba(arrayList), 4096);
    }

    public final java.io.InputStream h() {
        return new defpackage.albu(this);
    }

    protected final java.lang.String i(java.nio.charset.Charset charset) {
        return new java.lang.String(D(), charset);
    }

    public final /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.albs(this);
    }

    public final java.nio.ByteBuffer j() {
        return java.nio.ByteBuffer.wrap(D()).asReadOnlyBuffer();
    }

    protected final void k(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.c.k(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.k(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.c.k(bArr, i, i2, i6);
            this.f.k(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public final void l(akyu akyuVar) {
        this.c.l(akyuVar);
        this.f.l(akyuVar);
    }

    public final void m(java.io.OutputStream outputStream) {
        this.c.m(outputStream);
        this.f.m(outputStream);
    }

    public final boolean n(akzc akzcVar) {
        defpackage.albt albtVar = new defpackage.albt(this);
        akyz next = albtVar.next();
        defpackage.albt albtVar2 = new defpackage.albt(akzcVar);
        akyz next2 = albtVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iC = next.c() - i;
            int iC2 = next2.c() - i2;
            int iMin = java.lang.Math.min(iC, iC2);
            if (!(i == 0 ? next.o(next2, i2, iMin) : next2.o(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.b;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == iC) {
                next = albtVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iC2) {
                next2 = albtVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    protected final int p() {
        return this.g;
    }

    public final boolean q() {
        return this.b >= o(this.g);
    }

    java.lang.Object writeReplace() {
        return akzc.y(D());
    }
}

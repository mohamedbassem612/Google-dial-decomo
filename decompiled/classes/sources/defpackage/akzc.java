package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akzc implements java.lang.Iterable, java.io.Serializable {
    public static final defpackage.akzc d = new defpackage.akza(defpackage.alau.a);
    public static final java.util.Comparator e = new defpackage.agl(6);
    private static final long serialVersionUID = 1;
    private int a = 0;

    public static defpackage.akzc E(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        defpackage.anty.P(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new defpackage.akza(bArr2);
    }

    public static defpackage.akzc F(java.io.InputStream inputStream) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            defpackage.akzc akzcVarH = i == 0 ? null : H(bArr, i);
            if (akzcVarH == null) {
                return s(arrayList);
            }
            arrayList.add(akzcVarH);
            iMin = java.lang.Math.min(iMin << 1, 8192);
        }
    }

    static defpackage.akzc G(byte[] bArr) {
        return bArr.length == 0 ? d : new defpackage.akza(bArr);
    }

    public static defpackage.akzc H(byte[] bArr, int i) {
        try {
            return E(bArr, 0, i);
        } catch (defpackage.alaz e2) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    private static defpackage.akzc o(java.util.Iterator it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, "length (%s) must be >= 1", java.lang.Integer.valueOf(i)));
        }
        if (i == 1) {
            return (defpackage.akzc) it.next();
        }
        int i2 = i >>> 1;
        return o(it, i2).r(o(it, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.akzc s(java.lang.Iterable iterable) {
        int size;
        if (iterable instanceof java.util.Collection) {
            size = iterable.size();
        } else {
            java.util.Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? d : o(iterable.iterator(), size);
    }

    public static defpackage.akzc t(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return d;
        }
        defpackage.anty.P(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new defpackage.akza(bArr);
    }

    public static defpackage.akzc u(byte[] bArr) {
        try {
            return E(bArr, 0, bArr.length);
        } catch (defpackage.alaz e2) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static defpackage.akzc v(java.lang.String str, java.nio.charset.Charset charset) {
        return str.isEmpty() ? d : new defpackage.akza(str.getBytes(charset));
    }

    public static defpackage.akzc w(java.lang.String str) {
        return str.isEmpty() ? d : new defpackage.akza(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    static defpackage.akzc y(byte[] bArr) {
        try {
            return G(bArr);
        } catch (defpackage.alaz e2) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public final java.lang.String A() {
        return z(java.nio.charset.StandardCharsets.UTF_8);
    }

    @java.lang.Deprecated
    public final void B(byte[] bArr, int i, int i2, int i3) {
        defpackage.anty.P(i, i + i3, c());
        defpackage.anty.P(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            k(bArr, i, i2, i3);
        }
    }

    public final boolean C() {
        return c() == 0;
    }

    public final byte[] D() {
        int iC = c();
        if (iC == 0) {
            return defpackage.alau.a;
        }
        byte[] bArr = new byte[iC];
        k(bArr, 0, 0, iC);
        return bArr;
    }

    public abstract byte a(int i);

    protected abstract int b(int i, int i2, int i3);

    public abstract int c();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public akyy iterator() {
        throw null;
    }

    public abstract defpackage.akzc e(int i, int i2);

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akzc) {
            defpackage.akzc akzcVar = (defpackage.akzc) obj;
            int iC = c();
            if (iC == akzcVar.c()) {
                if (iC == 0) {
                    return true;
                }
                int i = this.a;
                int i2 = akzcVar.a;
                if (i == 0 || i2 == 0 || i == i2) {
                    return n(akzcVar);
                }
            }
        }
        return false;
    }

    public abstract defpackage.akzc f(int i, int i2);

    public abstract defpackage.akzf g();

    public abstract java.io.InputStream h();

    public final int hashCode() {
        int iB = this.a;
        if (iB == 0) {
            int iC = c();
            iB = b(iC, 0, iC);
            if (iB == 0) {
                iB = 1;
            }
            this.a = iB;
        }
        return iB;
    }

    protected abstract java.lang.String i(java.nio.charset.Charset charset);

    public abstract java.nio.ByteBuffer j();

    protected abstract void k(byte[] bArr, int i, int i2, int i3);

    public abstract void l(defpackage.akyu akyuVar);

    public abstract void m(java.io.OutputStream outputStream);

    protected abstract boolean n(defpackage.akzc akzcVar);

    protected abstract int p();

    public abstract boolean q();

    public final defpackage.akzc r(defpackage.akzc akzcVar) {
        if (Integer.MAX_VALUE - c() < akzcVar.c()) {
            throw new java.lang.IllegalArgumentException("ByteString would be too long: " + c() + '+' + akzcVar.c());
        }
        int[] iArr = albv.a;
        if (akzcVar.c() == 0) {
            return this;
        }
        if (c() != 0) {
            int iC = c() + akzcVar.c();
            if (iC < 128) {
                return albv.I(this, akzcVar);
            }
            if (this instanceof albv) {
                albv albvVar = (albv) this;
                defpackage.akzc akzcVar2 = albvVar.f;
                if (akzcVar2.c() + akzcVar.c() < 128) {
                    akzcVar = new albv(albvVar.c, albv.I(akzcVar2, akzcVar));
                } else {
                    defpackage.akzc akzcVar3 = albvVar.c;
                    if (akzcVar3.p() > akzcVar2.p() && albvVar.g > akzcVar.p()) {
                        akzcVar = new albv(akzcVar3, new albv(akzcVar2, akzcVar));
                    }
                }
            }
            if (iC >= albv.o(java.lang.Math.max(p(), akzcVar.p()) + 1)) {
                return new albv(this, akzcVar);
            }
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            akmr.w(this, arrayDeque);
            akmr.w(akzcVar, arrayDeque);
            defpackage.akzc albvVar2 = (defpackage.akzc) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                albvVar2 = new albv((defpackage.akzc) arrayDeque.pop(), albvVar2);
            }
            return albvVar2;
        }
        return akzcVar;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(c()), c() <= 50 ? alce.a(this) : alce.a(f(0, 47)).concat("..."));
    }

    public final defpackage.akzc x(int i) {
        return e(i, c());
    }

    public final java.lang.String z(java.nio.charset.Charset charset) {
        return C() ? "" : i(charset);
    }
}

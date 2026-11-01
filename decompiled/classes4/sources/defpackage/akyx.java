package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class akyx extends akyz {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;
    public final int b;
    private final int f;

    public akyx(byte[] bArr, int i, int i2) {
        anty.P(i, i + i2, bArr.length);
        this.a = bArr;
        this.b = i;
        this.f = i2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.a[this.b + i];
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(a.bj(i, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(a.bf(i2, i, "Index > length: ", ", "));
    }

    protected final int b(int i, int i2, int i3) {
        byte[] bArr = alau.a;
        return anty.N(i, this.a, this.b + i2, i3);
    }

    public final int c() {
        return this.f;
    }

    public final defpackage.akyy d() {
        return new defpackage.akyw(this.a, this.b, this.f);
    }

    public final akzc e(int i, int i2) {
        int iP = anty.P(i, i2, this.f);
        return iP == 0 ? akzc.d : new defpackage.akyx(this.a, this.b + i, iP);
    }

    public final akzc f(int i, int i2) {
        int iP = anty.P(i, i2, this.f);
        return iP == 0 ? akzc.d : new defpackage.akyx(this.a, this.b + i, iP);
    }

    public final akzf g() {
        return akzf.O(this.a, this.b, this.f);
    }

    public final java.io.InputStream h() {
        return new java.io.ByteArrayInputStream(this.a, this.b, this.f);
    }

    protected final java.lang.String i(java.nio.charset.Charset charset) {
        return new java.lang.String(this.a, this.b, this.f, charset);
    }

    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return d();
    }

    public final java.nio.ByteBuffer j() {
        return java.nio.ByteBuffer.wrap(this.a, this.b, this.f).slice().asReadOnlyBuffer();
    }

    protected final void k(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.a, this.b + i, bArr, i2, i3);
    }

    public final void l(akyu akyuVar) {
        akyuVar.a(this.a, this.b, this.f);
    }

    public final void m(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(D());
    }

    protected final boolean n(akzc akzcVar) {
        return ((akzcVar instanceof akza) || (akzcVar instanceof defpackage.akyx)) ? o(akzcVar, 0, this.f) : akzcVar.n(this);
    }

    public final boolean o(akzc akzcVar, int i, int i2) {
        if (i2 > akzcVar.c()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i2 + this.f);
        }
        int i3 = i + i2;
        if (i3 > akzcVar.c()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + akzcVar.c());
        }
        if (akzcVar instanceof akza) {
            byte[] bArr = this.a;
            int i4 = this.b;
            int i5 = akza.b;
            return a.O(bArr, i4, ((akza) akzcVar).a, i, i2);
        }
        if (!(akzcVar instanceof defpackage.akyx)) {
            return akzcVar.f(i, i3).equals(f(0, i2));
        }
        defpackage.akyx akyxVar = (defpackage.akyx) akzcVar;
        return a.O(this.a, this.b, akyxVar.a, akyxVar.b + i, i2);
    }

    java.lang.Object writeReplace() {
        return akzc.y(D());
    }
}

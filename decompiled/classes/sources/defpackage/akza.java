package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akza extends defpackage.akyz {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 1;
    public final byte[] a;

    public akza(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.akzc
    public final byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.akzc
    protected final int b(int i, int i2, int i3) {
        byte[] bArr = defpackage.alau.a;
        return defpackage.anty.N(i, this.a, i2, i3);
    }

    @Override // defpackage.akzc
    public final int c() {
        return this.a.length;
    }

    @Override // defpackage.akzc
    /* JADX INFO: renamed from: d */
    public final akyy iterator() {
        byte[] bArr = this.a;
        return new akyw(bArr, 0, bArr.length);
    }

    @Override // defpackage.akzc
    public final defpackage.akzc e(int i, int i2) {
        int iP = defpackage.anty.P(i, i2, c());
        return iP == 0 ? defpackage.akzc.d : new akyx(this.a, i, iP);
    }

    @Override // defpackage.akzc
    public final defpackage.akzc f(int i, int i2) {
        int iP = defpackage.anty.P(i, i2, c());
        return iP == 0 ? defpackage.akzc.d : new akyx(this.a, i, iP);
    }

    @Override // defpackage.akzc
    public final defpackage.akzf g() {
        return defpackage.akzf.O(this.a, 0, c());
    }

    @Override // defpackage.akzc
    public final java.io.InputStream h() {
        return new java.io.ByteArrayInputStream(this.a, 0, c());
    }

    @Override // defpackage.akzc
    protected final java.lang.String i(java.nio.charset.Charset charset) {
        return new java.lang.String(this.a, charset);
    }

    @Override // defpackage.akzc, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.akzc
    public final java.nio.ByteBuffer j() {
        return java.nio.ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    @Override // defpackage.akzc
    protected final void k(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.akzc
    public final void l(defpackage.akyu akyuVar) {
        akyuVar.a(this.a, 0, c());
    }

    @Override // defpackage.akzc
    public final void m(java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(D());
    }

    @Override // defpackage.akzc
    protected final boolean n(defpackage.akzc akzcVar) {
        if (akzcVar instanceof defpackage.akza) {
            return java.util.Arrays.equals(this.a, ((defpackage.akza) akzcVar).a);
        }
        return akzcVar instanceof akyx ? o(akzcVar, 0, c()) : akzcVar.n(this);
    }

    @Override // defpackage.akyz
    public final boolean o(defpackage.akzc akzcVar, int i, int i2) {
        if (i2 > akzcVar.c()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i2 + c());
        }
        int i3 = i + i2;
        if (i3 <= akzcVar.c()) {
            if (akzcVar instanceof defpackage.akza) {
                return defpackage.a.O(this.a, 0, ((defpackage.akza) akzcVar).a, i, i2);
            }
            if (!(akzcVar instanceof akyx)) {
                return akzcVar.f(i, i3).equals(f(0, i2));
            }
            akyx akyxVar = (akyx) akzcVar;
            byte[] bArr = this.a;
            int i4 = akyx.c;
            return defpackage.a.O(bArr, 0, akyxVar.a, akyxVar.b + i, i2);
        }
        throw new java.lang.IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + akzcVar.c());
    }
}

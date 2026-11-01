package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aprj extends java.io.Writer implements java.io.Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    private final java.lang.StringBuilder a = new java.lang.StringBuilder();

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(char c) {
        this.a.append(c);
        return this;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            int i3 = defpackage.apqy.a;
            int length = ((char[]) j$.util.Objects.requireNonNull(cArr, "char array")).length;
            if ((i | i2 | length) < 0 || length - i2 < i) {
                throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("Range [%s, %<s + %s) out of bounds for length %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length)));
            }
            this.a.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(java.lang.String str) {
        if (str != null) {
            this.a.append(str);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aket extends java.io.Writer {
    private final java.lang.Appendable a;
    private final defpackage.akes b = new defpackage.akes();

    public aket(java.lang.Appendable appendable) {
        this.a = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence) throws java.io.IOException {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
        defpackage.akes akesVar = this.b;
        akesVar.a = cArr;
        akesVar.b = null;
        this.a.append(akesVar, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(java.lang.String str, int i, int i2) throws java.io.IOException {
        j$.util.Objects.requireNonNull(str);
        this.a.append(str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) throws java.io.IOException {
        this.a.append((char) i);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}

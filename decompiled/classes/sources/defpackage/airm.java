package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class airm implements defpackage.airs {
    public void c(char c) {
        throw null;
    }

    @Override // defpackage.airs
    public void f(java.nio.ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.airs
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.airs
    public void h(byte[] bArr) {
        g(bArr, bArr.length);
    }

    @Override // defpackage.airs
    public defpackage.airs i(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        h(charSequence.toString().getBytes(charset));
        return this;
    }

    @Override // defpackage.airs
    public final void j(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            c(charSequence.charAt(i));
        }
    }

    @Override // defpackage.airs
    public void k(int i) {
        throw null;
    }
}

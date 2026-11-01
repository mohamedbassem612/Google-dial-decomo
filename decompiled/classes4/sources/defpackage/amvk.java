package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvk {
    public final java.lang.String a;
    public final java.lang.StringBuilder b;
    public int c;
    public int d;
    public defpackage.amvm e;
    private int f;

    public amvk(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        int length = bytes.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int i2 = bytes[i] & 255;
            if (i2 == 63) {
                if (str.charAt(i) != '?') {
                    throw new java.lang.IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
                }
                i2 = 63;
            }
            sb.append((char) i2);
        }
        this.a = sb.toString();
        this.b = new java.lang.StringBuilder(str.length());
        this.d = -1;
    }

    private final int k() {
        return this.a.length() - this.f;
    }

    public final char a() {
        return this.a.charAt(this.c);
    }

    public final int b() {
        return this.b.length();
    }

    public final int c() {
        return k() - this.c;
    }

    public final void d() {
        this.e = null;
    }

    public final void e() {
        f(b());
    }

    public final void f(int i) {
        defpackage.amvm amvmVar = this.e;
        if (amvmVar == null || i > amvmVar.b) {
            this.e = defpackage.amvm.g(i);
        }
    }

    public final void g(char c) {
        this.b.append(c);
    }

    public final void h(java.lang.String str) {
        this.b.append(str);
    }

    public final boolean i() {
        return this.c < k();
    }

    public final void j() {
        this.f = 2;
    }
}

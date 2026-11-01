package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akey implements java.io.Closeable, java.io.Flushable {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final java.lang.String[] e = new java.lang.String[128];
    private static final java.lang.String[] f;
    public final java.io.Writer b;
    public akej c;
    public java.lang.String d;
    private int[] g = new int[32];
    private int h = 0;
    private final defpackage.akea i;
    private final java.lang.String j;
    private java.lang.String k;
    private final boolean l;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public akey(java.io.Writer writer) {
        boolean z = false;
        i(6);
        this.c = akej.b;
        this.b = (java.io.Writer) j$.util.Objects.requireNonNull(writer, "out == null");
        defpackage.akea akeaVar = (defpackage.akea) j$.util.Objects.requireNonNull(defpackage.akea.a);
        this.i = akeaVar;
        this.k = ",";
        if (akeaVar.d) {
            this.j = ": ";
            if (akeaVar.b.isEmpty()) {
                this.k = ", ";
            }
        } else {
            this.j = ":";
        }
        if (akeaVar.b.isEmpty() && akeaVar.c.isEmpty()) {
            z = true;
        }
        this.l = z;
    }

    private final void h() throws java.io.IOException {
        if (this.l) {
            return;
        }
        java.io.Writer writer = this.b;
        defpackage.akea akeaVar = this.i;
        writer.write(akeaVar.b);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(akeaVar.c);
        }
    }

    private final void i(int i) {
        int i2 = this.h;
        int[] iArrCopyOf = this.g;
        if (i2 == iArrCopyOf.length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i2 << 1);
            this.g = iArrCopyOf;
        }
        int i3 = this.h;
        this.h = i3 + 1;
        iArrCopyOf[i3] = i;
    }

    private final void j(int i) {
        this.g[this.h - 1] = i;
    }

    public final int a() {
        int i = this.h;
        if (i != 0) {
            return this.g[i - 1];
        }
        throw new java.lang.IllegalStateException("JsonWriter is closed.");
    }

    public final void b() throws java.io.IOException {
        int iA = a();
        if (iA == 1) {
            j(2);
            h();
            return;
        }
        if (iA == 2) {
            this.b.append((java.lang.CharSequence) this.k);
            h();
        } else {
            if (iA == 4) {
                this.b.append((java.lang.CharSequence) this.j);
                j(5);
                return;
            }
            if (iA != 6) {
                if (iA != 7) {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
                if (this.c != akej.a) {
                    throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                }
            }
            j(7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public final void c(java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        java.io.Writer writer = this.b;
        java.lang.String[] strArr = e;
        writer.write(34);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i) {
                        writer.write(str, i2, i - i2);
                    }
                    writer.write(str2);
                    i2 = i3;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b.close();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[0] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.h = 0;
    }

    public final void d() throws java.io.IOException {
        if (this.d != null) {
            int iA = a();
            if (iA == 5) {
                this.b.write(this.k);
            } else if (iA != 3) {
                throw new java.lang.IllegalStateException("Nesting problem.");
            }
            h();
            j(4);
            c(this.d);
            this.d = null;
        }
    }

    public final void e(int i, int i2, char c) throws java.io.IOException {
        int iA = a();
        if (iA != i2 && iA != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        java.lang.String str = this.d;
        if (str != null) {
            throw new java.lang.IllegalStateException("Dangling name: ".concat(str));
        }
        this.h--;
        if (iA == i2) {
            h();
        }
        this.b.write(c);
    }

    public final void f() throws java.io.IOException {
        if (this.d != null) {
            d();
        }
        b();
        this.b.write("null");
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.h == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.b.flush();
    }

    public final void g(int i, char c) throws java.io.IOException {
        b();
        i(i);
        this.b.write(c);
    }
}

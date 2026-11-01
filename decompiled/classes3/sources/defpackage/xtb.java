package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtb {
    public final java.lang.String a;
    public final long[] b;
    public boolean c;
    public defpackage.xta d;
    final /* synthetic */ defpackage.xtd e;

    public xtb(defpackage.xtd xtdVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(xtdVar);
        this.e = xtdVar;
        j$.util.Objects.requireNonNull(str, "key");
        this.a = str;
        this.b = new long[xtdVar.d];
    }

    public static final java.io.IOException e(java.lang.String[] strArr) throws java.io.IOException {
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(strArr))));
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return sb.toString();
            }
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
            i = 1;
        }
    }

    public final java.io.File c() {
        return new java.io.File(this.e.a, java.lang.String.valueOf(this.a).concat(".0"));
    }

    public final java.io.File d() {
        return new java.io.File(this.e.a, java.lang.String.valueOf(this.a).concat(".0.tmp"));
    }
}

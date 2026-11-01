package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aore implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.String a;
    private final int b;

    public aore(java.lang.String str, int i) {
        aooh.f(str, "pattern");
        this.a = str;
        this.b = i;
    }

    private final java.lang.Object readResolve() {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(this.a, this.b);
        aooh.e(patternCompile, "compile(...)");
        return new aorg(patternCompile);
    }
}

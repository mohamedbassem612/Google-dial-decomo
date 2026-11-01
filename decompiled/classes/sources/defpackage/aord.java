package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aord implements defpackage.aora {
    public final java.util.regex.Matcher a;
    public final defpackage.aorc b;
    private final java.lang.CharSequence c;
    private java.util.List d;

    public aord(java.util.regex.Matcher matcher, java.lang.CharSequence charSequence) {
        if (matcher == null) {
            defpackage.aooh.i("matcher");
        }
        if (charSequence == null) {
            defpackage.aooh.i("input");
        }
        this.a = matcher;
        this.c = charSequence;
        this.b = new defpackage.aorc(this);
    }

    @Override // defpackage.aora
    public final java.util.List a() {
        if (this.d == null) {
            this.d = new defpackage.aorb(this);
        }
        java.util.List list = this.d;
        if (list == null) {
            defpackage.aooh.g();
        }
        return list;
    }

    @Override // defpackage.aora
    public final defpackage.aopq b() {
        java.util.regex.Matcher matcher = this.a;
        return defpackage.aooc.C(matcher.start(), matcher.end());
    }

    @Override // defpackage.aora
    public final defpackage.aora c() {
        java.util.regex.Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        java.lang.CharSequence charSequence = this.c;
        if (iEnd > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        defpackage.aooh.e(matcher2, "matcher(...)");
        return defpackage.aoov.ae(matcher2, iEnd, charSequence);
    }
}

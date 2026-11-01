package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorg implements java.io.Serializable {
    public final java.util.regex.Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aorg(java.lang.String str, int i) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        defpackage.aooh.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        java.util.regex.Pattern pattern = this.a;
        java.lang.String strPattern = pattern.pattern();
        defpackage.aooh.e(strPattern, "pattern(...)");
        return new aore(strPattern, pattern.flags());
    }

    public final java.lang.String a() {
        java.lang.String strPattern = this.a.pattern();
        defpackage.aooh.e(strPattern, "pattern(...)");
        return strPattern;
    }

    public final java.lang.String b(java.lang.CharSequence charSequence, java.lang.String str) {
        if (charSequence == null) {
            defpackage.aooh.i("input");
        }
        java.lang.String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        defpackage.aooh.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final defpackage.aora c(java.lang.CharSequence charSequence, int i) {
        java.util.regex.Matcher matcherRegion = this.a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        if (matcherRegion == null) {
            defpackage.aooh.g();
        }
        return new defpackage.aord(matcherRegion, charSequence);
    }

    public final defpackage.aora d(java.lang.CharSequence charSequence) {
        defpackage.aooh.f(charSequence, "input");
        java.util.regex.Matcher matcher = this.a.matcher(charSequence);
        defpackage.aooh.e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new defpackage.aord(matcher, charSequence);
        }
        return null;
    }

    public final boolean e(java.lang.CharSequence charSequence) {
        defpackage.aooh.f(charSequence, "input");
        return this.a.matcher(charSequence).find();
    }

    public final boolean f(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            defpackage.aooh.i("input");
        }
        return this.a.matcher(charSequence).matches();
    }

    public final defpackage.aora g(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            defpackage.aooh.i("input");
        }
        java.util.regex.Matcher matcher = this.a.matcher(charSequence);
        defpackage.aooh.e(matcher, "matcher(...)");
        return defpackage.aoov.ae(matcher, 0, charSequence);
    }

    public final java.util.List h(java.lang.CharSequence charSequence) {
        defpackage.aooh.f(charSequence, "input");
        java.util.regex.Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return defpackage.ajsz.aY(charSequence.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        defpackage.aooh.e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aorg(java.lang.String str) {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
        defpackage.aooh.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public aorg(java.util.regex.Pattern pattern) {
        if (pattern == null) {
            defpackage.aooh.i("nativePattern");
        }
        this.a = pattern;
    }
}

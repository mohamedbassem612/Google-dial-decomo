package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amew {
    public static final java.util.regex.Pattern a;
    private static final java.lang.String b;
    private static final java.lang.String c;
    private static final java.lang.String d;

    static {
        java.lang.String str = (java.lang.String) j$.util.Collection.-EL.stream(defpackage.amev.c.f()).map(new defpackage.amer(4)).collect(j$.util.stream.Collectors.joining("|"));
        b = str;
        java.lang.String str2 = java.text.MessageFormat.format("(?:(?:your|the)\\s)?(?:(?<digitsLength>{0}|[0-9]'{1,2}')[- ]digit\\s)?(?<detail>zip code|.*? number)(?!.*number)", str);
        c = str2;
        java.lang.String str3 = "(?:enter\\s)?(?<isLastFour>last four digits of\\s)?" + str2 + "(?:\\sfollowed by (?:the\\s)?(?<endKey>\\*|#|pound|star)(?:\\s(?:sign|key))?)?";
        d = str3;
        a = java.util.regex.Pattern.compile(str3);
    }

    public static j$.util.Optional a(j$.util.Optional optional) {
        try {
            if (true != optional.isPresent()) {
                return optional;
            }
            java.lang.String str = (java.lang.String) optional.get();
            return j$.util.Optional.ofNullable(java.lang.Integer.valueOf((java.lang.String) defpackage.amev.l(str).orElse(str)));
        } catch (java.lang.NumberFormatException unused) {
            return j$.util.Optional.empty();
        }
    }
}

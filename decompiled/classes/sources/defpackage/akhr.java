package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akhr {
    public static final java.util.List a;

    static {
        java.util.Arrays.asList(".dc", ".dev", ".devel", ".dogfood", ".earlgrey", ".earlgreytestrig", ".enterprise", ".fishfood", ".ios.beta", ".ios.canary", ".ios.dev", ".ios.herebedragons", ".kif", ".nightly", ".prodalpha", ".prodbeta", ".qa", ".rc", ".scary.enterprise", ".scubatestrig", ".weekly");
        a = java.util.Arrays.asList(".alpha", ".beta", ".dev", ".devel", ".next", ".nightly", ".qa", ".teamfood", ".teamfood2", ".test", ".staging");
    }

    public static java.lang.String a(java.lang.String str, java.util.List list) {
        java.lang.String str2 = "";
        if (str == null) {
            return "";
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            if (str.endsWith(str3) && str3.length() > str2.length()) {
                str2 = str3;
            }
        }
        return str.substring(0, str.length() - str2.length());
    }
}

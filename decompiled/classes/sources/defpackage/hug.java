package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hug implements defpackage.huf {
    public static final /* synthetic */ int b = 0;
    private final java.util.Set d;
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl");
    static final java.util.List a = java.util.Arrays.asList("CA", "GB", "JP", "US");

    public hug(defpackage.aoin aoinVar) {
        java.util.List arrayList;
        java.lang.String str = (java.lang.String) aoinVar.a();
        if (android.text.TextUtils.isEmpty(str)) {
            ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl", "parseConfigProviderCountryCodes", 66, "CountryCodeProviderImpl.java")).v("configProviderCountryCodes was empty, returning default");
            arrayList = a;
        } else {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ",");
            if (stringTokenizer.countTokens() <= 0) {
                ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl", "parseConfigProviderCountryCodes", 73, "CountryCodeProviderImpl.java")).v("insufficient provided country codes");
                arrayList = a;
            } else {
                arrayList = new java.util.ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    java.lang.String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken == null) {
                        ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl", "parseConfigProviderCountryCodes", 81, "CountryCodeProviderImpl.java")).v("Unexpected empty value, returning default.");
                        arrayList = a;
                        break;
                    } else {
                        if (strNextToken.length() != 2) {
                            ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl", "parseConfigProviderCountryCodes", 86, "CountryCodeProviderImpl.java")).y("Unexpected locale %s, returning default", strNextToken);
                            arrayList = a;
                            break;
                        }
                        arrayList.add(strNextToken);
                    }
                }
            }
        }
        java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream(arrayList).map(new defpackage.kju(1)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(1)));
        this.d = set;
        ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/assisteddialing/availability/CountryCodeProviderImpl", "<init>", 55, "CountryCodeProviderImpl.java")).y("Using country codes: %s", set);
    }

    @Override // defpackage.huf
    public final boolean a(java.lang.String str) {
        return this.d.contains(str);
    }
}

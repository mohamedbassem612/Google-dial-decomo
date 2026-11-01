package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgf {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.akgf.class.getName());
    private final java.lang.String b;
    private final akfl c;
    private final defpackage.akgc d;
    private final java.util.Map e;

    public akgf(akfl akflVar) throws java.lang.Throwable {
        defpackage.akgc akgcVar = new defpackage.akgc();
        this.d = akgcVar;
        this.e = new java.util.HashMap();
        this.b = "";
        this.c = akflVar;
        java.io.InputStream inputStreamA = akflVar.a("".concat("config"));
        java.io.ObjectInputStream objectInputStream = null;
        try {
            try {
                java.io.ObjectInputStream objectInputStream2 = new java.io.ObjectInputStream(inputStreamA);
                try {
                    akgcVar.readExternal(objectInputStream2);
                    b(objectInputStream2);
                } catch (java.io.IOException e) {
                    e = e;
                    objectInputStream = objectInputStream2;
                    a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.internal.PrefixFileReader", "loadMappingFileProvider", e.toString());
                    b(objectInputStream);
                } catch (java.lang.Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    b(objectInputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static void b(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.internal.PrefixFileReader", "close", e.toString());
            }
        }
    }

    private final defpackage.akgd c(int i, java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.String str3 = "";
        if (str.length() != 0) {
            defpackage.akgc akgcVar = this.d;
            int iBinarySearch = java.util.Arrays.binarySearch(akgcVar.b, i);
            if (iBinarySearch >= 0) {
                java.util.Set set = (java.util.Set) akgcVar.c.get(iBinarySearch);
                if (!set.isEmpty()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                    defpackage.akgc.a("", sb);
                    defpackage.akgc.a(str2, sb);
                    java.lang.String string = sb.toString();
                    java.lang.String str4 = (java.lang.String) defpackage.akgc.a.get(string);
                    if (str4 != null && set.contains(str4)) {
                        str = str4;
                    } else if (set.contains(string)) {
                        str = string;
                    } else {
                        if (str2.length() <= 0) {
                            str2.length();
                        } else if (!set.contains(str)) {
                        }
                        str = "";
                    }
                    if (str.length() > 0) {
                        str3 = i + '_' + str;
                    }
                }
            }
        }
        java.io.ObjectInputStream objectInputStream = null;
        if (str3.length() == 0) {
            return null;
        }
        java.util.Map map = this.e;
        if (!map.containsKey(str3)) {
            try {
                try {
                    java.io.ObjectInputStream objectInputStream2 = new java.io.ObjectInputStream(this.c.a(this.b.concat(str3)));
                    try {
                        defpackage.akgd akgdVar = new defpackage.akgd();
                        akgdVar.readExternal(objectInputStream2);
                        map.put(str3, akgdVar);
                        b(objectInputStream2);
                    } catch (java.io.IOException e) {
                        e = e;
                        objectInputStream = objectInputStream2;
                        a.logp(java.util.logging.Level.WARNING, "com.google.i18n.phonenumbers.internal.PrefixFileReader", "loadPhonePrefixMapFromFile", e.toString());
                        b(objectInputStream);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        objectInputStream = objectInputStream2;
                        b(objectInputStream);
                        throw th;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        return (defpackage.akgd) this.e.get(str3);
    }

    public final java.lang.String a(defpackage.akgu akguVar, java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        int i = akguVar.c;
        if (i == 1) {
            i = ((int) (akguVar.d / 10000000)) + 1000;
        }
        defpackage.akgd akgdVarC = c(i, str, str2);
        java.lang.String strA = akgdVarC != null ? akgdVarC.a(akguVar) : null;
        if ((strA == null || strA.length() == 0) && !str.equals("zh") && !str.equals("ja") && !str.equals("ko")) {
            defpackage.akgd akgdVarC2 = c(i, "en", "");
            if (akgdVarC2 == null) {
                return "";
            }
            strA = akgdVarC2.a(akguVar);
        }
        return strA != null ? strA : "";
    }
}

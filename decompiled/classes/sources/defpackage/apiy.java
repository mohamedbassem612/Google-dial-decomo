package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apiy {
    public static final defpackage.aorg a = new defpackage.aorg("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final defpackage.aorg b = new defpackage.aorg(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String[] e;

    public apiy(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (str2 == null) {
            defpackage.aooh.i("type");
        }
        if (str3 == null) {
            defpackage.aooh.i("subtype");
        }
        if (strArr == null) {
            defpackage.aooh.i("parameterNamesAndValues");
        }
        this.c = str;
        this.d = str2;
        this.e = strArr;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.apiy) && defpackage.aooh.n(((defpackage.apiy) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dxe {
    public static final defpackage.dxe a = b(new java.util.Locale[0]);
    public final defpackage.dxf b;

    public dxe(defpackage.dxf dxfVar) {
        this.b = dxfVar;
    }

    public static defpackage.dxe b(java.util.Locale... localeArr) {
        return new defpackage.dxe(new defpackage.dxf(new android.os.LocaleList(localeArr)));
    }

    public static defpackage.dxe c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        java.lang.String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = java.util.Locale.forLanguageTag(strArrSplit[i]);
        }
        return new defpackage.dxe(new defpackage.dxf(new android.os.LocaleList(localeArr)));
    }

    public static defpackage.dxe d(android.os.LocaleList localeList) {
        return new defpackage.dxe(new defpackage.dxf(localeList));
    }

    public final int a() {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final java.lang.String e() {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dxe) && this.b.equals(((defpackage.dxe) obj).b);
    }

    public final java.util.Locale f(int i) {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.b.a, i);
    }

    public final boolean g() {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.b.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}

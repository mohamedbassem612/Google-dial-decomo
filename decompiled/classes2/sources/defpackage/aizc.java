package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizc implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    volatile transient java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private transient java.nio.charset.Charset g;

    public aizc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.nio.charset.Charset charset) {
        this.b = b(str);
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = charset;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(java.util.Locale.ENGLISH);
    }

    private static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return str == null ? "" : str2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.g = java.nio.charset.Charset.forName((java.lang.String) j$.util.Objects.requireNonNull(objectInputStream.readObject()));
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g.name());
    }

    public final defpackage.aiza a() {
        java.lang.String str = this.c;
        ahvr.cc(!ahvr.cp(str), "Uri has no authority: %s", this);
        j$.util.Objects.requireNonNull(str);
        int iIndexOf = str.indexOf("@") + 1;
        int iIndexOf2 = str.indexOf(58, iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        } else {
            int i = iIndexOf2 + 1;
            int i2 = i;
            while (i2 < str.length() && anty.ai(str.charAt(i2))) {
                i2++;
            }
            ahvr.cc(i2 == str.length() && i2 > i, "Authority doesn't match web pattern: %s", this);
        }
        java.lang.String strSubstring = str.substring(iIndexOf, iIndexOf2);
        try {
            ahvr.ci(strSubstring);
            return new defpackage.aiza(strSubstring);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalStateException("Invalid domain '" + strSubstring + "' found in URI '" + toString() + '\'', e);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.aizc aizcVar = (defpackage.aizc) obj;
        ahvr.ci(aizcVar);
        return toString().compareTo(aizcVar.toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aizc) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final java.lang.String toString() {
        if (this.a == null) {
            java.lang.String str = this.b;
            java.lang.String str2 = this.c;
            java.lang.String str3 = this.d;
            java.lang.String str4 = this.e;
            java.lang.String str5 = this.f;
            this.a = ahvr.co(str) + c(str, ":") + c(str2, "//") + ahvr.co(str2) + ahvr.co(str3) + c(str4, "?") + ahvr.co(str4) + c(str5, "#") + ahvr.co(str5);
        }
        return this.a;
    }

    public aizc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.nio.charset.Charset charset, java.lang.String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = charset;
        this.a = str6;
    }
}

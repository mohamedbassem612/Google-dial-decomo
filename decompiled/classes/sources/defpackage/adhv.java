package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhv {
    public static final defpackage.adhv a = new defpackage.ajiu((char[]) null).f();
    public final defpackage.aigf b;

    public adhv(defpackage.aigf aigfVar) {
        this.b = aigfVar;
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.ClassCastException classCastException) {
        ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(classCastException)).l("com/google/android/libraries/micore/superpacks/base/PropertyBag", "logTypeWarning", 127, "PropertyBag.java")).I("Failed to find a property for name %s with type %s, returning default value", str, str2);
    }

    public final java.lang.Object a(java.lang.String str) {
        return this.b.get(str);
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj = this.b.get(str);
        if (obj == null) {
            return str2;
        }
        try {
            return (java.lang.String) obj;
        } catch (java.lang.ClassCastException e) {
            c(str, "String", e);
            return str2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adhv) {
            return defpackage.ahvr.aJ(this.b, ((defpackage.adhv) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "PropertyBag{map=" + java.lang.String.valueOf(this.b) + '}';
    }

    public adhv() {
        throw null;
    }
}

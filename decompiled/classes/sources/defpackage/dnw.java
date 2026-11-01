package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnw {
    public final java.util.Locale a;

    public dnw(java.util.Locale locale) {
        this.a = locale;
    }

    public final java.lang.String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.dnw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return defpackage.aooh.n(a(), ((defpackage.dnw) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final java.lang.String toString() {
        return a();
    }
}

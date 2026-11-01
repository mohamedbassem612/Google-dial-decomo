package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gij {
    public static final void a(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable parcelable) {
        defpackage.aooh.f(parcelable, "value");
        bundle.putParcelable(str, parcelable);
    }

    public static final void b(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        defpackage.aooh.f(str, "key");
        bundle.putBundle(str, bundle2);
    }

    public static final void c(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        defpackage.aooh.f(list, "value");
        defpackage.aooh.f(list, "value");
        bundle.putParcelableArrayList(str, fsu.K(list));
    }

    public static final void d(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "key");
        defpackage.aooh.f(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void e(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        defpackage.aooh.f(list, "value");
        bundle.putStringArrayList(str, fsu.K(list));
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}

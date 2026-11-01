package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aguo {
    public final android.database.Cursor a;

    public static final java.lang.String a(android.database.Cursor cursor, int i) {
        java.lang.String string = cursor.getString(i);
        aooh.e(string, "getString(...)");
        return string;
    }

    public static final byte[] b(android.database.Cursor cursor, int i) {
        byte[] blob = cursor.getBlob(i);
        aooh.e(blob, "getBlob(...)");
        return blob;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aguo) && aooh.n(this.a, ((defpackage.aguo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ReadOnlyCursor(cursor=" + this.a + ')';
    }
}

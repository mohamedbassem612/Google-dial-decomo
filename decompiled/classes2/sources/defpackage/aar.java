package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aar {
    public final java.lang.Object a;
    public final java.lang.String b;

    public aar(java.lang.Object obj, java.lang.String str) {
        this.a = obj;
        this.b = str;
    }

    final java.lang.String a() {
        return "[" + this.b + ", " + defpackage.aau.e(this.a.getClass()) + ']';
    }

    public final java.lang.String toString() {
        return a();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ty {
    public final java.lang.String a;
    public final int b;

    public ty(java.lang.String str, int i) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = i;
    }

    public final java.lang.String toString() {
        return this.a + ", uid: " + this.b;
    }
}

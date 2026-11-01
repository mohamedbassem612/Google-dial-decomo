package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adkb {
    final java.io.File a;
    final java.lang.Object b = new java.lang.Object();
    int c = 0;

    public adkb(java.io.File file) {
        this.a = file;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.b) {
            str = this.a.getName() + '[' + this.c + ']';
        }
        return str;
    }
}

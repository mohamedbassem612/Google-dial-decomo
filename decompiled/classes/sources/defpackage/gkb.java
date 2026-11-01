package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gkb implements java.lang.AutoCloseable {
    public final defpackage.gjq d;
    public final boolean e = false;
    public final java.lang.Object f = new java.lang.Object();
    public volatile boolean g;

    public gkb(defpackage.gjq gjqVar) {
        this.d = gjqVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}

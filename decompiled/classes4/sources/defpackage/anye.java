package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anye {
    public java.util.List a;
    public int b;
    public int c;

    public anye(java.util.List list) {
        this.a = list;
    }

    public final defpackage.anlw a() {
        return ((defpackage.anna) this.a.get(this.b)).f;
    }

    public final java.net.SocketAddress b() {
        return (java.net.SocketAddress) ((defpackage.anna) this.a.get(this.b)).e.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}

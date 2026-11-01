package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anzk extends defpackage.anpw {
    final java.net.SocketAddress a;
    final java.lang.String b;
    final java.util.Collection c;

    public anzk(java.net.SocketAddress socketAddress, java.lang.String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = java.util.Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.anps
    public final defpackage.anpv b(java.net.URI uri, defpackage.anpq anpqVar) {
        return new defpackage.anzj(this);
    }

    @Override // defpackage.anps
    public final java.lang.String c() {
        return "directaddress";
    }

    @Override // defpackage.anpw
    protected final int d() {
        return 5;
    }

    @Override // defpackage.anpw
    public final java.util.Collection e() {
        return this.c;
    }

    @Override // defpackage.anpw
    protected final void f() {
    }
}

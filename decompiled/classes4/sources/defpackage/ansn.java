package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ansn extends java.net.SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public ansn(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ansn) && this.a == ((defpackage.ansn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "BoundClientAddress[" + this.a + ']';
    }
}

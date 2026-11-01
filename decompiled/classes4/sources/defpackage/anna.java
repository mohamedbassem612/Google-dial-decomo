package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anna {
    public static final anlv a = new anlv("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final anlv b = new anlv("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final anlv c = new anlv("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final anlv d = new anlv("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    public final java.util.List e;
    public final defpackage.anlw f;
    private final int g;

    public anna(java.util.List list, defpackage.anlw anlwVar) {
        ahvr.bN(!list.isEmpty(), "addrs is empty");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        this.e = listUnmodifiableList;
        ahvr.cj(anlwVar, "attrs");
        this.f = anlwVar;
        this.g = listUnmodifiableList.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.anna) {
            defpackage.anna annaVar = (defpackage.anna) obj;
            java.util.List list = this.e;
            int size = list.size();
            java.util.List list2 = annaVar.e;
            if (size == list2.size()) {
                for (int i = 0; i < list.size(); i++) {
                    if (((java.net.SocketAddress) list.get(i)).equals(list2.get(i))) {
                    }
                }
                if (this.f.equals(annaVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    public final java.lang.String toString() {
        defpackage.anlw anlwVar = this.f;
        return "[" + java.lang.String.valueOf(this.e) + '/' + anlwVar.toString() + ']';
    }

    public anna(java.net.SocketAddress socketAddress, defpackage.anlw anlwVar) {
        this(java.util.Collections.singletonList(socketAddress), anlwVar);
    }

    public anna(java.net.SocketAddress socketAddress) {
        this(socketAddress, defpackage.anlw.a);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoic {
    final java.util.Collection a;
    final int b;

    public aoic(defpackage.anna annaVar) {
        ahvr.cj(annaVar, "eag");
        if (annaVar.e.size() < 10) {
            this.a = annaVar.e;
        } else {
            this.a = new java.util.HashSet(annaVar.e);
        }
        java.util.Iterator it = annaVar.e.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((java.net.SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aoic) {
            defpackage.aoic aoicVar = (defpackage.aoic) obj;
            if (aoicVar.b == this.b) {
                java.util.Collection collection = aoicVar.a;
                int size = collection.size();
                java.util.Collection<?> collection2 = this.a;
                if (size == collection2.size()) {
                    return collection.containsAll(collection2);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoig extends defpackage.anol {
    private final java.util.List a;
    private final java.util.concurrent.atomic.AtomicInteger b;
    private final int c;

    public aoig(java.util.List list, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        ahvr.bN(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        java.util.Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((defpackage.anol) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.anol
    public final defpackage.anoh a(defpackage.anoi anoiVar) {
        int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
        java.util.List list = this.a;
        return ((defpackage.anol) list.get(andIncrement % list.size())).a(anoiVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aoig)) {
            return false;
        }
        defpackage.aoig aoigVar = (defpackage.aoig) obj;
        if (aoigVar != this) {
            if (this.c != aoigVar.c || this.b != aoigVar.b) {
                return false;
            }
            java.util.List list = this.a;
            int size = list.size();
            java.util.List list2 = aoigVar.a;
            if (size != list2.size() || !new java.util.HashSet(list).containsAll(list2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.c;
    }

    public final java.lang.String toString() {
        ahym ahymVarK = ahvr.k(defpackage.aoig.class);
        ahymVarK.b("subchannelPickers", this.a);
        return ahymVarK.toString();
    }
}

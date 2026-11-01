package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afor extends defpackage.afot {
    public final java.util.List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afor(java.util.List list) {
        super(2132019654, "clustersGridSection", "moreClusters", 258950);
        aooh.f(list, "clusters");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.afor) && aooh.n(this.a, ((defpackage.afor) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Clusters(clusters=" + this.a + ')';
    }
}

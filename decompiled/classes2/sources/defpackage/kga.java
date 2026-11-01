package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kga implements ahth {
    public final kgc a;

    public kga(kgc kgcVar) {
        aooh.f(kgcVar, "filterKey");
        this.a = kgcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kga) && this.a == ((defpackage.kga) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogFilterClickEvent(filterKey=" + this.a + ')';
    }
}

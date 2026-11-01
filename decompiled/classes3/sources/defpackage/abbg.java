package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbg extends aazc {
    public final java.util.List a;

    public abbg(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abbg) && aooh.n(this.a, ((defpackage.abbg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public abbg() {
        this(aokc.a);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zbz implements defpackage.zcc {
    public final mce a;

    public zbz(mce mceVar) {
        this.a = mceVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zbz) && aooh.n(this.a, ((defpackage.zbz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Event(event=" + this.a + ')';
    }
}

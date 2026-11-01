package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yua {
    public final java.util.UUID a;
    public boolean b;

    public yua(java.util.UUID uuid) {
        aooh.f(uuid, "requestId");
        this.a = uuid;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yua) && aooh.n(this.a, ((defpackage.yua) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "JobInfo(requestId=" + this.a + ')';
    }
}

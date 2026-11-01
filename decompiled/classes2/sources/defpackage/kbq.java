package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbq implements defpackage.kbu {
    public final kcy a;

    public kbq(kcy kcyVar) {
        this.a = kcyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kbq) && aooh.n(this.a, ((defpackage.kbq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MarkCallAsRead(selection=" + this.a + ')';
    }
}

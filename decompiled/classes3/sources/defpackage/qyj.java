package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyj extends pez {
    public final int a;

    public qyj(int i) {
        super((short[]) null);
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.qyj) && this.a == ((defpackage.qyj) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "Lottie(id=" + this.a + ')';
    }
}

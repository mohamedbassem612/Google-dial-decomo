package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sg extends defpackage.rm {
    public final int a;

    public sg(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.sg) && this.a == ((defpackage.sg) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Integer.valueOf(this.a).hashCode();
    }

    public final java.lang.String toString() {
        return "{indexingType: " + this.a + '}';
    }
}

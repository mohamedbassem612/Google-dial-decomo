package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvb {
    public final long a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cvb) && this.a == ((defpackage.cvb) obj).a;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ')';
    }
}

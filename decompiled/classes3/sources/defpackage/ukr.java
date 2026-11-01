package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukr implements defpackage.uks {
    public final boolean a;

    public ukr(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukr) && this.a == ((defpackage.ukr) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "ShowSpamPromoOnCompleteToast(success=" + this.a + ')';
    }
}

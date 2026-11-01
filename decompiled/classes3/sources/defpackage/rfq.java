package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfq extends defpackage.rfw {
    private final defpackage.rea a;

    public rfq(defpackage.rea reaVar) {
        this.a = reaVar;
    }

    @Override // defpackage.rfw
    public final defpackage.rea a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rfw) {
            return this.a.equals(((defpackage.rfw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "FixFeatureActivationErrorEvent{featureControllerKey=" + this.a.toString() + '}';
    }
}

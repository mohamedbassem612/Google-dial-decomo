package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final androidx.car.app.hardware.common.CarValue mCardState;

    TollCard(defpackage.ve veVar) {
        java.lang.Object obj = veVar.a;
        this.mCardState = (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.TollCard) {
            return j$.util.Objects.equals(this.mCardState, ((androidx.car.app.hardware.info.TollCard) obj).mCardState);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getCardState() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mCardState);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mCardState});
    }

    public java.lang.String toString() {
        return "[ tollcard state: " + this.mCardState + ']';
    }

    private TollCard() {
        this.mCardState = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}

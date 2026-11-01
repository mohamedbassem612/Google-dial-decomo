package androidx.car.app.hardware.info;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class EvStatus {
    private final androidx.car.app.hardware.common.CarValue mEvChargePortConnected;
    private final androidx.car.app.hardware.common.CarValue mEvChargePortOpen;

    EvStatus(defpackage.va vaVar) {
        androidx.car.app.hardware.common.CarValue carValue = vaVar.b;
        this.mEvChargePortConnected = null;
        androidx.car.app.hardware.common.CarValue carValue2 = vaVar.a;
        this.mEvChargePortOpen = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.EvStatus) {
            androidx.car.app.hardware.info.EvStatus evStatus = (androidx.car.app.hardware.info.EvStatus) obj;
            if (j$.util.Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && j$.util.Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue getEvChargePortConnected() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mEvChargePortConnected);
    }

    public androidx.car.app.hardware.common.CarValue getEvChargePortOpen() {
        return (androidx.car.app.hardware.common.CarValue) j$.util.Objects.requireNonNull(this.mEvChargePortOpen);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mEvChargePortOpen, this.mEvChargePortConnected});
    }

    public java.lang.String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + ']';
    }

    private EvStatus() {
        androidx.car.app.hardware.common.CarValue carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}

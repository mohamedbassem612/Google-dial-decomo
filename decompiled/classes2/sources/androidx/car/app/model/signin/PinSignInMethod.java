package androidx.car.app.model.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class PinSignInMethod implements defpackage.zs {
    private static final int MAX_PIN_LENGTH = 12;
    private final androidx.car.app.model.CarText mPinCode;

    public PinSignInMethod(java.lang.CharSequence charSequence) {
        int length = ((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence)).length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("PIN must not be empty");
        }
        if (length > 12) {
            throw new java.lang.IllegalArgumentException("PIN must not be longer than 12 characters");
        }
        this.mPinCode = androidx.car.app.model.CarText.create(charSequence);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.PinSignInMethod) {
            return j$.util.Objects.equals(this.mPinCode, ((androidx.car.app.model.signin.PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    public androidx.car.app.model.CarText getPinCode() {
        return (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(this.mPinCode);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mPinCode});
    }

    private PinSignInMethod() {
        this.mPinCode = null;
    }
}

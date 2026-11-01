package androidx.car.app.model.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class InputSignInMethod implements defpackage.zs {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;
    private final androidx.car.app.model.CarText mDefaultValue;
    private final androidx.car.app.model.CarText mErrorMessage;
    private final androidx.car.app.model.CarText mHint;
    private final defpackage.xe mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    InputSignInMethod(defpackage.zq zqVar) {
        androidx.car.app.model.CarText carText = zqVar.b;
        this.mHint = null;
        androidx.car.app.model.CarText carText2 = zqVar.c;
        this.mDefaultValue = null;
        int i = zqVar.d;
        this.mInputType = 0;
        androidx.car.app.model.CarText carText3 = zqVar.e;
        this.mErrorMessage = null;
        int i2 = zqVar.f;
        this.mKeyboardType = 0;
        defpackage.xe xeVar = zqVar.a;
        this.mInputCallbackDelegate = null;
        boolean z = zqVar.g;
        this.mShowKeyboardByDefault = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.InputSignInMethod) {
            androidx.car.app.model.signin.InputSignInMethod inputSignInMethod = (androidx.car.app.model.signin.InputSignInMethod) obj;
            if (this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && j$.util.Objects.equals(this.mHint, inputSignInMethod.mHint) && j$.util.Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && j$.util.Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    public androidx.car.app.model.CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    public androidx.car.app.model.CarText getHint() {
        return this.mHint;
    }

    public defpackage.xe getInputCallbackDelegate() {
        return (defpackage.xe) j$.util.Objects.requireNonNull(this.mInputCallbackDelegate);
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHint, this.mDefaultValue, java.lang.Integer.valueOf(this.mInputType), this.mErrorMessage, java.lang.Integer.valueOf(this.mKeyboardType), java.lang.Boolean.valueOf(this.mShowKeyboardByDefault)});
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public java.lang.String toString() {
        return "[inputType:" + this.mInputType + ", keyboardType: " + this.mKeyboardType + ']';
    }

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }
}

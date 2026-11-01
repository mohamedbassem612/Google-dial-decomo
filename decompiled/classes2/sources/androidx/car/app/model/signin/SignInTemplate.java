package androidx.car.app.model.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SignInTemplate implements defpackage.ze {
    private final java.util.List mActionList;
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.CarText mAdditionalText;
    private final androidx.car.app.model.Action mHeaderAction;
    private final androidx.car.app.model.CarText mInstructions;
    private final boolean mIsLoading;
    private final defpackage.zs mSignInMethod;
    private final androidx.car.app.model.CarText mTitle;

    SignInTemplate(defpackage.zr zrVar) {
        boolean z = zrVar.a;
        this.mIsLoading = false;
        androidx.car.app.model.Action action = zrVar.c;
        this.mHeaderAction = null;
        androidx.car.app.model.CarText carText = zrVar.d;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = zrVar.e;
        this.mInstructions = null;
        androidx.car.app.model.CarText carText3 = zrVar.f;
        this.mAdditionalText = null;
        androidx.car.app.model.ActionStrip actionStrip = zrVar.g;
        this.mActionStrip = null;
        java.util.List list = zrVar.h;
        this.mActionList = defpackage.rv.d(null);
        defpackage.zs zsVar = zrVar.b;
        this.mSignInMethod = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.SignInTemplate) {
            androidx.car.app.model.signin.SignInTemplate signInTemplate = (androidx.car.app.model.signin.SignInTemplate) obj;
            if (this.mIsLoading == signInTemplate.mIsLoading && j$.util.Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && j$.util.Objects.equals(this.mTitle, signInTemplate.mTitle) && j$.util.Objects.equals(this.mInstructions, signInTemplate.mInstructions) && j$.util.Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && j$.util.Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && j$.util.Objects.equals(this.mActionList, signInTemplate.mActionList) && j$.util.Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public java.util.List getActions() {
        return defpackage.rv.c(this.mActionList);
    }

    public androidx.car.app.model.CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public androidx.car.app.model.CarText getInstructions() {
        return this.mInstructions;
    }

    public defpackage.zs getSignInMethod() {
        return (defpackage.zs) j$.util.Objects.requireNonNull(this.mSignInMethod);
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "SignInTemplate";
    }

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = java.util.Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }
}

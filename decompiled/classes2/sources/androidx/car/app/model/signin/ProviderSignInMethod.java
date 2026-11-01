package androidx.car.app.model.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ProviderSignInMethod implements defpackage.zs {
    private final androidx.car.app.model.Action mAction;

    public ProviderSignInMethod(androidx.car.app.model.Action action) {
        if (((androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action)).getType() != 1) {
            throw new java.lang.IllegalArgumentException("The action must not be a standard action");
        }
        if (!((defpackage.xs) j$.util.Objects.requireNonNull(action.getOnClickDelegate())).isParkedOnly()) {
            throw new java.lang.IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.ProviderSignInMethod) {
            return j$.util.Objects.equals(this.mAction, ((androidx.car.app.model.signin.ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public androidx.car.app.model.Action getAction() {
        return (androidx.car.app.model.Action) j$.util.Objects.requireNonNull(this.mAction);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mAction});
    }

    public java.lang.String toString() {
        return "[action:" + this.mAction + ']';
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}

package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final defpackage.xq mOnCheckedChangeDelegate;

    Toggle(defpackage.zf zfVar) {
        boolean z = zfVar.b;
        this.mIsChecked = false;
        boolean z2 = zfVar.c;
        this.mIsEnabled = false;
        defpackage.xq xqVar = zfVar.a;
        this.mOnCheckedChangeDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Toggle) {
            androidx.car.app.model.Toggle toggle = (androidx.car.app.model.Toggle) obj;
            if (this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public defpackage.xq getOnCheckedChangeDelegate() {
        return (defpackage.xq) j$.util.Objects.requireNonNull(this.mOnCheckedChangeDelegate);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsChecked), java.lang.Boolean.valueOf(this.mIsEnabled)});
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public java.lang.String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + ']';
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}

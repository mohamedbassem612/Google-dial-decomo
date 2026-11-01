package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ClickableSpan extends androidx.car.app.model.CarSpan {
    private final defpackage.xs mOnClickDelegate;

    private ClickableSpan(defpackage.xu xuVar) {
        this.mOnClickDelegate = androidx.car.app.model.OnClickDelegateImpl.create(xuVar);
    }

    public static androidx.car.app.model.ClickableSpan create(defpackage.xu xuVar) {
        return new androidx.car.app.model.ClickableSpan((defpackage.xu) j$.util.Objects.requireNonNull(xuVar));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.ClickableSpan)) {
            return false;
        }
        return j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(((androidx.car.app.model.ClickableSpan) obj).mOnClickDelegate == null));
    }

    public defpackage.xs getOnClickDelegate() {
        return (defpackage.xs) j$.util.Objects.requireNonNull(this.mOnClickDelegate);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mOnClickDelegate == null)});
    }

    public java.lang.String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}

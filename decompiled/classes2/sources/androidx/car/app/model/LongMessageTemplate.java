package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class LongMessageTemplate implements defpackage.ze {
    private final java.util.List mActionList;
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Action mHeaderAction;
    private final androidx.car.app.model.CarText mMessage;
    private final androidx.car.app.model.CarText mTitle;

    LongMessageTemplate(defpackage.xn xnVar) {
        androidx.car.app.model.CarText carText = xnVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = xnVar.b;
        this.mMessage = null;
        androidx.car.app.model.ActionStrip actionStrip = xnVar.c;
        this.mActionStrip = null;
        androidx.car.app.model.Action action = xnVar.d;
        this.mHeaderAction = null;
        java.util.List list = xnVar.e;
        this.mActionList = defpackage.rv.d(null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.LongMessageTemplate) {
            androidx.car.app.model.LongMessageTemplate longMessageTemplate = (androidx.car.app.model.LongMessageTemplate) obj;
            if (j$.util.Objects.equals(this.mTitle, longMessageTemplate.mTitle) && j$.util.Objects.equals(this.mMessage, longMessageTemplate.mMessage) && j$.util.Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionList, longMessageTemplate.mActionList) && j$.util.Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip)) {
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

    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public androidx.car.app.model.CarText getMessage() {
        return (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(this.mMessage);
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mMessage, this.mHeaderAction, this.mActionList, this.mActionStrip});
    }

    public java.lang.String toString() {
        return "LongMessageTemplate";
    }

    private LongMessageTemplate() {
        this.mTitle = null;
        this.mMessage = null;
        this.mActionStrip = null;
        this.mHeaderAction = null;
        this.mActionList = java.util.Collections.EMPTY_LIST;
    }
}

package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MessageTemplate implements defpackage.ze {
    private final java.util.List mActionList;

    @java.lang.Deprecated
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.CarText mDebugMessage;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final androidx.car.app.model.CarIcon mIcon;
    private final boolean mIsLoading;
    private final androidx.car.app.model.CarText mMessage;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    public MessageTemplate(defpackage.xo xoVar) {
        boolean z = xoVar.a;
        this.mIsLoading = false;
        this.mTitle = xoVar.b;
        this.mMessage = xoVar.c;
        this.mDebugMessage = xoVar.d;
        this.mIcon = xoVar.e;
        this.mHeaderAction = xoVar.f;
        this.mActionStrip = xoVar.g;
        this.mActionList = defpackage.rv.d(xoVar.h);
        this.mHeader = xoVar.i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.MessageTemplate) {
            androidx.car.app.model.MessageTemplate messageTemplate = (androidx.car.app.model.MessageTemplate) obj;
            if (this.mIsLoading == messageTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, messageTemplate.mTitle) && j$.util.Objects.equals(this.mMessage, messageTemplate.mMessage) && j$.util.Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && j$.util.Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionList, messageTemplate.mActionList) && j$.util.Objects.equals(this.mIcon, messageTemplate.mIcon) && j$.util.Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && j$.util.Objects.equals(this.mHeader, messageTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public java.util.List getActions() {
        return defpackage.rv.c(this.mActionList);
    }

    public androidx.car.app.model.CarText getDebugMessage() {
        return this.mDebugMessage;
    }

    public androidx.car.app.model.Header getHeader() {
        androidx.car.app.model.Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        defpackage.xc xcVar = new defpackage.xc();
        androidx.car.app.model.CarText carText = this.mTitle;
        if (carText != null) {
            xcVar.d(carText);
        }
        androidx.car.app.model.Action action = this.mHeaderAction;
        if (action != null) {
            xcVar.c(action);
        }
        androidx.car.app.model.ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            java.util.Iterator it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                xcVar.b((androidx.car.app.model.Action) it.next());
            }
        }
        return xcVar.a();
    }

    @java.lang.Deprecated
    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarText getMessage() {
        return (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(this.mMessage);
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "MessageTemplate";
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = java.util.Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}

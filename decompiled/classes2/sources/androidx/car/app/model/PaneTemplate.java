package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class PaneTemplate implements defpackage.ze {

    @java.lang.Deprecated
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final androidx.car.app.model.Banner mBanner;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final androidx.car.app.model.Pane mPane;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    PaneTemplate(defpackage.yd ydVar) {
        androidx.car.app.model.CarText carText = ydVar.a;
        this.mTitle = null;
        androidx.car.app.model.Pane pane = ydVar.b;
        this.mPane = null;
        androidx.car.app.model.Action action = ydVar.c;
        this.mHeaderAction = null;
        androidx.car.app.model.ActionStrip actionStrip = ydVar.d;
        this.mActionStrip = null;
        androidx.car.app.model.Header header = ydVar.e;
        this.mHeader = null;
        androidx.car.app.model.Banner banner = ydVar.f;
        this.mBanner = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.PaneTemplate) {
            androidx.car.app.model.PaneTemplate paneTemplate = (androidx.car.app.model.PaneTemplate) obj;
            if (j$.util.Objects.equals(this.mTitle, paneTemplate.mTitle) && j$.util.Objects.equals(this.mPane, paneTemplate.mPane) && j$.util.Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && j$.util.Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && j$.util.Objects.equals(this.mHeader, paneTemplate.mHeader) && j$.util.Objects.equals(this.mBanner, paneTemplate.mBanner)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public androidx.car.app.model.Banner getBanner() {
        return this.mBanner;
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

    public androidx.car.app.model.Pane getPane() {
        return (androidx.car.app.model.Pane) j$.util.Objects.requireNonNull(this.mPane);
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader, this.mBanner});
    }

    public java.lang.String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
        this.mBanner = null;
    }
}

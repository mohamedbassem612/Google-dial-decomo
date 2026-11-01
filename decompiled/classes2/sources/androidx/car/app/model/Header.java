package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Header {
    private final androidx.car.app.model.Background mBackground;
    private final java.util.List mEndHeaderActions;
    private final androidx.car.app.model.Action mStartHeaderAction;
    private final androidx.car.app.model.CarIcon mStartHeaderImage;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    public Header(defpackage.xc xcVar) {
        this.mTitle = xcVar.c;
        androidx.car.app.model.CarText carText = xcVar.d;
        this.mSubtitle = null;
        this.mStartHeaderAction = xcVar.b;
        this.mEndHeaderActions = defpackage.rv.d(xcVar.a);
        androidx.car.app.model.Background background = xcVar.e;
        this.mBackground = null;
        androidx.car.app.model.CarIcon carIcon = xcVar.f;
        this.mStartHeaderImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Header) {
            androidx.car.app.model.Header header = (androidx.car.app.model.Header) obj;
            if (j$.util.Objects.equals(this.mTitle, header.mTitle) && j$.util.Objects.equals(this.mSubtitle, header.mSubtitle) && j$.util.Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && j$.util.Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && j$.util.Objects.equals(this.mBackground, header.mBackground) && j$.util.Objects.equals(this.mStartHeaderImage, header.mStartHeaderImage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Background getBackground() {
        return this.mBackground;
    }

    public java.util.List getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public androidx.car.app.model.Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public androidx.car.app.model.CarIcon getStartHeaderImage() {
        return this.mStartHeaderImage;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground, this.mStartHeaderImage});
    }

    public java.lang.String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground + ", StartHeaderImage: " + this.mStartHeaderImage;
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new java.util.ArrayList();
        this.mBackground = null;
        this.mStartHeaderImage = null;
    }
}

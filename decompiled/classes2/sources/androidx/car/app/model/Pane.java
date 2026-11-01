package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Pane {
    private final java.util.List mActionList;
    private final androidx.car.app.model.CarIcon mImage;
    private final boolean mIsLoading;
    private final java.util.List mRows;

    Pane(defpackage.yc ycVar) {
        java.util.List list = ycVar.a;
        this.mRows = defpackage.rv.d(null);
        java.util.List list2 = ycVar.b;
        this.mActionList = defpackage.rv.d(null);
        androidx.car.app.model.CarIcon carIcon = ycVar.d;
        this.mImage = null;
        boolean z = ycVar.c;
        this.mIsLoading = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Pane) {
            androidx.car.app.model.Pane pane = (androidx.car.app.model.Pane) obj;
            if (this.mIsLoading == pane.mIsLoading && j$.util.Objects.equals(this.mActionList, pane.mActionList) && j$.util.Objects.equals(this.mRows, pane.mRows) && j$.util.Objects.equals(this.mImage, pane.mImage)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getActions() {
        return defpackage.rv.c(this.mActionList);
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public java.util.List getRows() {
        return defpackage.rv.c(this.mRows);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mRows, this.mActionList, java.lang.Boolean.valueOf(this.mIsLoading), this.mImage});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ rows: ");
        java.util.List list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append(']');
        return sb.toString();
    }

    private Pane() {
        this.mRows = java.util.Collections.EMPTY_LIST;
        this.mActionList = java.util.Collections.EMPTY_LIST;
        this.mIsLoading = false;
        this.mImage = null;
    }
}

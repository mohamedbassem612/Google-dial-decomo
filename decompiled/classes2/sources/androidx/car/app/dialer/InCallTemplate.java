package androidx.car.app.dialer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class InCallTemplate implements defpackage.ze {
    private static final int MAX_TEXTS_SIZE = 2;
    private final java.util.List mActions;
    private final androidx.car.app.model.Header mHeader;
    private final androidx.car.app.model.CarIcon mIcon;
    private final boolean mIsLoading;
    private final java.util.List mTexts;
    private final androidx.car.app.model.CarText mTitle;

    private InCallTemplate(defpackage.um umVar) {
        androidx.car.app.model.Header header = umVar.c;
        this.mHeader = null;
        androidx.car.app.model.CarIcon carIcon = umVar.d;
        this.mIcon = null;
        androidx.car.app.model.CarText carText = umVar.e;
        this.mTitle = null;
        java.util.List list = umVar.a;
        this.mTexts = null;
        java.util.List list2 = umVar.b;
        this.mActions = defpackage.rv.d(null);
        boolean z = umVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.dialer.InCallTemplate) {
            androidx.car.app.dialer.InCallTemplate inCallTemplate = (androidx.car.app.dialer.InCallTemplate) obj;
            if (j$.util.Objects.equals(this.mHeader, inCallTemplate.mHeader) && j$.util.Objects.equals(this.mIcon, inCallTemplate.mIcon) && j$.util.Objects.equals(this.mTitle, inCallTemplate.mTitle) && j$.util.Objects.equals(this.mTexts, inCallTemplate.mTexts) && j$.util.Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading) {
                return true;
            }
        }
        return false;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.util.List getTexts() {
        return this.mTexts;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, java.lang.Boolean.valueOf(this.mIsLoading)});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "InCallTemplate";
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        this.mTexts = java.util.Collections.EMPTY_LIST;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mIsLoading = false;
    }

    /* synthetic */ InCallTemplate(defpackage.um umVar, un unVar) {
        this(umVar);
    }
}

package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final java.util.List mActions;
    private final defpackage.wa mCallbackDelegate;
    private final long mDuration;
    private final androidx.car.app.model.CarIcon mIcon;
    private final int mId;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    Alert(defpackage.vy vyVar) {
        int i = vyVar.a;
        this.mId = 0;
        androidx.car.app.model.CarText carText = vyVar.b;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = vyVar.c;
        this.mSubtitle = null;
        androidx.car.app.model.CarIcon carIcon = vyVar.d;
        this.mIcon = null;
        java.util.List list = vyVar.e;
        this.mActions = defpackage.rv.d(null);
        long j = vyVar.f;
        this.mDuration = 0L;
        defpackage.wa waVar = vyVar.g;
        this.mCallbackDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof androidx.car.app.model.Alert) && this.mId == ((androidx.car.app.model.Alert) obj).mId;
        }
        return true;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public defpackage.wa getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mId)});
    }

    public java.lang.String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + ']';
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new java.util.ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}

package androidx.car.app.suggestion.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Suggestion {
    private final android.app.PendingIntent mAction;
    private final androidx.car.app.model.CarIcon mIcon;
    private final java.lang.String mIdentifier;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    Suggestion(defpackage.aaz aazVar) {
        java.lang.String str = aazVar.a;
        this.mIdentifier = (java.lang.String) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.model.CarText carText = aazVar.b;
        this.mTitle = (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull((java.lang.Object) null);
        androidx.car.app.model.CarText carText2 = aazVar.c;
        this.mSubtitle = null;
        androidx.car.app.model.CarIcon carIcon = aazVar.d;
        this.mIcon = null;
        android.app.PendingIntent pendingIntent = aazVar.e;
        this.mAction = (android.app.PendingIntent) j$.util.Objects.requireNonNull((java.lang.Object) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.suggestion.model.Suggestion) {
            androidx.car.app.suggestion.model.Suggestion suggestion = (androidx.car.app.suggestion.model.Suggestion) obj;
            if (j$.util.Objects.equals(this.mIdentifier, suggestion.mIdentifier) && j$.util.Objects.equals(this.mTitle, suggestion.mTitle) && j$.util.Objects.equals(this.mSubtitle, suggestion.mSubtitle) && j$.util.Objects.equals(this.mAction, suggestion.mAction) && j$.util.Objects.equals(this.mIcon, suggestion.mIcon)) {
                return true;
            }
        }
        return false;
    }

    public android.app.PendingIntent getAction() {
        return this.mAction;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public java.lang.String getIdentifier() {
        return this.mIdentifier;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction});
    }

    public java.lang.String toString() {
        return "[id: " + this.mIdentifier + ", title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", subtitle: " + androidx.car.app.model.CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + ']';
    }

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }
}

package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MessageInfo implements defpackage.aad {
    private final androidx.car.app.model.CarIcon mImage;
    private final androidx.car.app.model.CarText mText;
    private final androidx.car.app.model.CarText mTitle;

    MessageInfo(defpackage.aab aabVar) {
        androidx.car.app.model.CarText carText = aabVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarText carText2 = aabVar.b;
        this.mText = null;
        androidx.car.app.model.CarIcon carIcon = aabVar.c;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.MessageInfo) {
            androidx.car.app.navigation.model.MessageInfo messageInfo = (androidx.car.app.navigation.model.MessageInfo) obj;
            if (j$.util.Objects.equals(this.mTitle, messageInfo.mTitle) && j$.util.Objects.equals(this.mText, messageInfo.mText) && j$.util.Objects.equals(this.mImage, messageInfo.mImage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public androidx.car.app.model.CarText getText() {
        return this.mText;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mText, this.mImage});
    }

    public java.lang.String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}

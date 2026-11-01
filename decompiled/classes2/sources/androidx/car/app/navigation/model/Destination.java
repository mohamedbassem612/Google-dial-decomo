package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Destination {
    private final androidx.car.app.model.CarText mAddress;
    private final androidx.car.app.model.CarIcon mImage;
    private final androidx.car.app.model.CarText mName;

    Destination(defpackage.zw zwVar) {
        androidx.car.app.model.CarText carText = zwVar.a;
        this.mName = null;
        androidx.car.app.model.CarText carText2 = zwVar.b;
        this.mAddress = null;
        androidx.car.app.model.CarIcon carIcon = zwVar.c;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.Destination) {
            androidx.car.app.navigation.model.Destination destination = (androidx.car.app.navigation.model.Destination) obj;
            if (j$.util.Objects.equals(this.mName, destination.mName) && j$.util.Objects.equals(this.mAddress, destination.mAddress) && j$.util.Objects.equals(this.mImage, destination.mImage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarText getAddress() {
        return this.mAddress;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public androidx.car.app.model.CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mName, this.mAddress, this.mImage});
    }

    public java.lang.String toString() {
        return "[name: " + androidx.car.app.model.CarText.toShortString(this.mName) + ", address: " + androidx.car.app.model.CarText.toShortString(this.mAddress) + ", image: " + this.mImage + ']';
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}

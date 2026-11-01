package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Place {
    private final androidx.car.app.model.CarLocation mLocation;
    private final androidx.car.app.model.PlaceMarker mMarker;

    Place(defpackage.ye yeVar) {
        androidx.car.app.model.CarLocation carLocation = yeVar.a;
        this.mLocation = null;
        androidx.car.app.model.PlaceMarker placeMarker = yeVar.b;
        this.mMarker = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Place) {
            androidx.car.app.model.Place place = (androidx.car.app.model.Place) obj;
            if (j$.util.Objects.equals(this.mLocation, place.mLocation) && j$.util.Objects.equals(this.mMarker, place.mMarker)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarLocation getLocation() {
        return (androidx.car.app.model.CarLocation) j$.util.Objects.requireNonNull(this.mLocation);
    }

    public androidx.car.app.model.PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mLocation, this.mMarker});
    }

    public java.lang.String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + ']';
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}

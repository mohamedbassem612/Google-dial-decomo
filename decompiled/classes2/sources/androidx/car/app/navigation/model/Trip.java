package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Trip {
    private final androidx.car.app.model.CarText mCurrentRoad;
    private final java.util.List mDestinationTravelEstimates;
    private final java.util.List mDestinations;
    private final boolean mIsLoading;
    private final java.util.List mStepTravelEstimates;
    private final java.util.List mSteps;

    Trip(defpackage.aan aanVar) {
        java.util.List list = aanVar.a;
        this.mDestinations = defpackage.rv.d(null);
        java.util.List list2 = aanVar.b;
        this.mSteps = defpackage.rv.d(null);
        java.util.List list3 = aanVar.c;
        this.mDestinationTravelEstimates = defpackage.rv.d(null);
        java.util.List list4 = aanVar.d;
        this.mStepTravelEstimates = defpackage.rv.d(null);
        androidx.car.app.model.CarText carText = aanVar.e;
        this.mCurrentRoad = null;
        boolean z = aanVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.Trip) {
            androidx.car.app.navigation.model.Trip trip = (androidx.car.app.navigation.model.Trip) obj;
            if (j$.util.Objects.equals(this.mDestinations, trip.mDestinations) && j$.util.Objects.equals(this.mSteps, trip.mSteps) && j$.util.Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && j$.util.Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && j$.util.Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mIsLoading), java.lang.Boolean.valueOf(trip.mIsLoading))) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarText getCurrentRoad() {
        return this.mCurrentRoad;
    }

    public java.util.List getDestinationTravelEstimates() {
        return defpackage.rv.c(this.mDestinationTravelEstimates);
    }

    public java.util.List getDestinations() {
        return defpackage.rv.c(this.mDestinations);
    }

    public java.util.List getStepTravelEstimates() {
        return defpackage.rv.c(this.mStepTravelEstimates);
    }

    public java.util.List getSteps() {
        return defpackage.rv.c(this.mSteps);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mDestinations, this.mSteps, this.mDestinationTravelEstimates, this.mStepTravelEstimates, this.mCurrentRoad});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "[ destinations : " + this.mDestinations.toString() + ", steps: " + this.mSteps.toString() + ", dest estimates: " + this.mDestinationTravelEstimates.toString() + ", step estimates: " + this.mStepTravelEstimates.toString() + ", road: " + androidx.car.app.model.CarText.toShortString(this.mCurrentRoad) + ", isLoading: " + this.mIsLoading + ']';
    }

    private Trip() {
        this.mDestinations = java.util.Collections.EMPTY_LIST;
        this.mSteps = java.util.Collections.EMPTY_LIST;
        this.mDestinationTravelEstimates = java.util.Collections.EMPTY_LIST;
        this.mStepTravelEstimates = java.util.Collections.EMPTY_LIST;
        this.mCurrentRoad = null;
        this.mIsLoading = false;
    }
}

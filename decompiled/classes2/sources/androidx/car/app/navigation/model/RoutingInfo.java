package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class RoutingInfo implements defpackage.aad {
    private final androidx.car.app.model.Distance mCurrentDistance;
    private final androidx.car.app.navigation.model.Step mCurrentStep;
    private final boolean mIsLoading;
    private final androidx.car.app.model.CarIcon mJunctionImage;
    private final androidx.car.app.navigation.model.Step mNextStep;

    RoutingInfo(aal aalVar) {
        java.lang.Object obj = aalVar.b;
        this.mCurrentStep = null;
        java.lang.Object obj2 = aalVar.c;
        this.mCurrentDistance = null;
        java.lang.Object obj3 = aalVar.d;
        this.mNextStep = null;
        java.lang.Object obj4 = aalVar.e;
        this.mJunctionImage = null;
        boolean z = aalVar.a;
        this.mIsLoading = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.RoutingInfo) {
            androidx.car.app.navigation.model.RoutingInfo routingInfo = (androidx.car.app.navigation.model.RoutingInfo) obj;
            if (this.mIsLoading == routingInfo.mIsLoading && j$.util.Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && j$.util.Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && j$.util.Objects.equals(this.mNextStep, routingInfo.mNextStep) && j$.util.Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    public androidx.car.app.navigation.model.Step getCurrentStep() {
        return this.mCurrentStep;
    }

    public androidx.car.app.model.CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    public androidx.car.app.navigation.model.Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, java.lang.Boolean.valueOf(this.mIsLoading)});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "RoutingInfo";
    }

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }
}

package com.google.android.libraries.onboarding.contracts.restore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SuggestedActionsApiContract$SuggestedActionItemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(7);
    private final java.lang.String category;
    private final android.content.ComponentName componentName;
    private final boolean isCompleted;
    private final boolean isDisabled;
    private final boolean isSetupSuccess;
    private final android.os.Bundle precalculationData;

    public SuggestedActionsApiContract$SuggestedActionItemInfo(java.lang.String str, android.content.ComponentName componentName, boolean z, boolean z2, boolean z3, android.os.Bundle bundle) {
        aooh.f(str, "category");
        aooh.f(componentName, "componentName");
        this.category = str;
        this.componentName = componentName;
        this.isCompleted = z;
        this.isSetupSuccess = z2;
        this.isDisabled = z3;
        this.precalculationData = bundle;
    }

    public static /* synthetic */ com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo copy$default(com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo suggestedActionsApiContract$SuggestedActionItemInfo, java.lang.String str, android.content.ComponentName componentName, boolean z, boolean z2, boolean z3, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = suggestedActionsApiContract$SuggestedActionItemInfo.category;
        }
        if ((i & 2) != 0) {
            componentName = suggestedActionsApiContract$SuggestedActionItemInfo.componentName;
        }
        if ((i & 4) != 0) {
            z = suggestedActionsApiContract$SuggestedActionItemInfo.isCompleted;
        }
        if ((i & 8) != 0) {
            z2 = suggestedActionsApiContract$SuggestedActionItemInfo.isSetupSuccess;
        }
        if ((i & 16) != 0) {
            z3 = suggestedActionsApiContract$SuggestedActionItemInfo.isDisabled;
        }
        if ((i & 32) != 0) {
            bundle = suggestedActionsApiContract$SuggestedActionItemInfo.precalculationData;
        }
        return suggestedActionsApiContract$SuggestedActionItemInfo.copy(str, componentName, z, z2, z3, bundle);
    }

    public final java.lang.String component1() {
        return this.category;
    }

    public final android.content.ComponentName component2() {
        return this.componentName;
    }

    public final boolean component3() {
        return this.isCompleted;
    }

    public final boolean component4() {
        return this.isSetupSuccess;
    }

    public final boolean component5() {
        return this.isDisabled;
    }

    public final android.os.Bundle component6() {
        return this.precalculationData;
    }

    public final com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo copy(java.lang.String str, android.content.ComponentName componentName, boolean z, boolean z2, boolean z3, android.os.Bundle bundle) {
        aooh.f(str, "category");
        aooh.f(componentName, "componentName");
        return new com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo(str, componentName, z, z2, z3, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo) {
            com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo suggestedActionsApiContract$SuggestedActionItemInfo = (com.google.android.libraries.onboarding.contracts.restore.SuggestedActionsApiContract$SuggestedActionItemInfo) obj;
            if (aooh.n(this.category, suggestedActionsApiContract$SuggestedActionItemInfo.category) && aooh.n(this.componentName, suggestedActionsApiContract$SuggestedActionItemInfo.componentName) && this.isCompleted == suggestedActionsApiContract$SuggestedActionItemInfo.isCompleted && this.isSetupSuccess == suggestedActionsApiContract$SuggestedActionItemInfo.isSetupSuccess && this.isDisabled == suggestedActionsApiContract$SuggestedActionItemInfo.isDisabled && aooh.n(this.precalculationData, suggestedActionsApiContract$SuggestedActionItemInfo.precalculationData)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final android.content.ComponentName getComponentName() {
        return this.componentName;
    }

    public final android.os.Bundle getPrecalculationData() {
        return this.precalculationData;
    }

    public int hashCode() {
        int iHashCode = (this.category.hashCode() * 31) + this.componentName.hashCode();
        android.os.Bundle bundle = this.precalculationData;
        return (((((((iHashCode * 31) + anty.L(this.isCompleted)) * 31) + anty.L(this.isSetupSuccess)) * 31) + anty.L(this.isDisabled)) * 31) + (bundle == null ? 0 : bundle.hashCode());
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isSetupSuccess() {
        return this.isSetupSuccess;
    }

    public java.lang.String toString() {
        return "SuggestedActionItemInfo(category=" + this.category + ", componentName=" + this.componentName + ", isCompleted=" + this.isCompleted + ", isSetupSuccess=" + this.isSetupSuccess + ", isDisabled=" + this.isDisabled + ", precalculationData=" + this.precalculationData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeString(this.category);
        parcel.writeParcelable(this.componentName, i);
        parcel.writeInt(this.isCompleted ? 1 : 0);
        parcel.writeInt(this.isSetupSuccess ? 1 : 0);
        parcel.writeInt(this.isDisabled ? 1 : 0);
        parcel.writeBundle(this.precalculationData);
    }

    public /* synthetic */ SuggestedActionsApiContract$SuggestedActionItemInfo(java.lang.String str, android.content.ComponentName componentName, boolean z, boolean z2, boolean z3, android.os.Bundle bundle, int i, aooc aoocVar) {
        this(str, componentName, z, z2, z3, (i & 32) != 0 ? null : bundle);
    }
}

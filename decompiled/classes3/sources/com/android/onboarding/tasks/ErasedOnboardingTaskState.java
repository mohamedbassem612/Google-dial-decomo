package com.android.onboarding.tasks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ErasedOnboardingTaskState implements android.os.Parcelable, defpackage.xnh {
    public static final defpackage.xlq CREATOR = new defpackage.xlq();
    public final android.os.PersistableBundle a;

    public ErasedOnboardingTaskState(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "bundle");
        this.a = persistableBundle;
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final android.os.PersistableBundle a() {
        return toPersistableBundle().getPersistableBundle("com.android.onboarding.task.RESULT");
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xnh
    public final defpackage.xhn b() {
        return (defpackage.xhn) defpackage.xfh.g(this.a, "com.android.onboarding.task.LAST_METADATA", defpackage.xhn.a);
    }

    @Override // defpackage.xhx
    public final long d() {
        return defpackage.xhp.d(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @Override // defpackage.xnh
    public final defpackage.xmq e(defpackage.xhi xhiVar) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.android.onboarding.tasks.ErasedOnboardingTaskState) && defpackage.xff.l(this.a, ((com.android.onboarding.tasks.ErasedOnboardingTaskState) obj).a);
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    public final java.lang.String g() {
        java.lang.String string = this.a.getString("com.android.onboarding.task.TYPE");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        java.lang.String string = this.a.getString("com.android.onboarding.task.COMPONENT");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        java.lang.String string = this.a.getString("com.android.onboarding.task.NODE");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xnh
    public final boolean h() {
        return aooh.n(g(), "Success") || aooh.n(g(), "Failed");
    }

    public final int hashCode() {
        return defpackage.xff.m(this.a);
    }

    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final boolean i() {
        android.os.PersistableBundle persistableBundleA = a();
        if (persistableBundleA != null) {
            return defpackage.xff.i(persistableBundleA);
        }
        return false;
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xnh, defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public final android.os.PersistableBundle toPersistableBundle() {
        return new android.os.PersistableBundle(this.a);
    }

    public final java.lang.String toString() {
        return "ErasedOnboardingTaskState(type=" + g() + " identity=" + defpackage.xfh.a(this) + " lastMetadata=" + b() + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "p0");
        this.a.writeToParcel(parcel, i);
    }

    @Override // defpackage.xnh
    public final com.android.onboarding.tasks.ErasedOnboardingTaskState c() {
        return this;
    }
}

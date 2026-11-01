package com.android.onboarding.tasks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ErasedOnboardingTaskToken implements android.os.Parcelable, defpackage.xni {
    public static final defpackage.xlr CREATOR = new defpackage.xlr();
    private final android.os.PersistableBundle a;

    public ErasedOnboardingTaskToken(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "bundle");
        this.a = persistableBundle;
    }

    @Override // defpackage.xni
    public final int a() {
        return this.a.getInt("com.android.onboarding.task.TARGET_USER", -1);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xni
    public final long b() {
        return this.a.getLong("com.android.onboarding.task.TASK_MANAGER_ID", -1L);
    }

    @Override // defpackage.xni
    public final j$.time.Duration c() {
        java.lang.Long lO = defpackage.xfh.o(this.a, "com.android.onboarding.task.TIMEOUT_IN_SECONDS");
        if (lO != null) {
            return j$.time.Duration.ofSeconds(lO.longValue());
        }
        return null;
    }

    @Override // defpackage.xni, defpackage.xhx
    public final long d() {
        return defpackage.xhp.d(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @Override // defpackage.xni
    public final java.lang.String e() {
        java.lang.String string = this.a.getString("com.android.onboarding.task.TARGET_PACKAGE_NAME");
        return string == null ? "unknown_target_package_name" : string;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.android.onboarding.tasks.ErasedOnboardingTaskToken) && defpackage.xff.l(this.a, ((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj).a);
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
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

    public final int hashCode() {
        return defpackage.xff.m(this.a);
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return new android.os.PersistableBundle(this.a);
    }

    public final java.lang.String toString() {
        return "ErasedOnboardingTaskToken(" + defpackage.xfh.a(this) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "p0");
        this.a.writeToParcel(parcel, i);
    }
}

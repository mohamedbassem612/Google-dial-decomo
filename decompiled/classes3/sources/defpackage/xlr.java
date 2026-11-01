package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xlr implements android.os.Parcelable.Creator, defpackage.xpb {
    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        return new com.android.onboarding.tasks.ErasedOnboardingTaskToken(persistableBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        aooh.f(parcel, "parcel");
        java.lang.Object objCreateFromParcel = android.os.PersistableBundle.CREATOR.createFromParcel(parcel);
        aooh.e(objCreateFromParcel, "createFromParcel(...)");
        return new com.android.onboarding.tasks.ErasedOnboardingTaskToken((android.os.PersistableBundle) objCreateFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.android.onboarding.tasks.ErasedOnboardingTaskToken[i];
    }
}

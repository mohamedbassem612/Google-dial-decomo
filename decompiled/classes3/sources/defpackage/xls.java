package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xls extends ylb implements android.os.IInterface {
    public xls(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.IGetTaskStateListener");
    }

    public final void a(com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskState) {
        android.os.Parcel parcelEP = eP();
        yld.d(parcelEP, erasedOnboardingTaskState);
        eR(1, parcelEP);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xlv extends ylb implements defpackage.xlw {
    public xlv(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
    }

    @Override // defpackage.xlw
    public final void a(com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskState, android.os.PersistableBundle persistableBundle) {
        android.os.Parcel parcelEP = eP();
        yld.d(parcelEP, erasedOnboardingTaskState);
        yld.d(parcelEP, persistableBundle);
        eR(1, parcelEP);
    }

    @Override // defpackage.xlw
    public final void b(android.os.PersistableBundle persistableBundle) {
        android.os.Parcel parcelEP = eP();
        yld.d(parcelEP, persistableBundle);
        eR(2, parcelEP);
    }
}

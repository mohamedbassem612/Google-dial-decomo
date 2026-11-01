package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xod extends ylb implements android.os.IInterface {
    public xod(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.service.IResultCallback");
    }

    public final void a(defpackage.xoc xocVar) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, xocVar);
        eS(3, parcelEP);
    }

    public final void b(defpackage.xoc xocVar) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, xocVar);
        eS(2, parcelEP);
    }
}

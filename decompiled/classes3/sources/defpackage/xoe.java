package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xoe extends ylb implements android.os.IInterface {
    public xoe(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.service.IUnitCallback");
    }

    public final void a(defpackage.xoc xocVar) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, xocVar);
        eS(3, parcelEP);
    }

    public final void b() {
        eS(2, eP());
    }
}

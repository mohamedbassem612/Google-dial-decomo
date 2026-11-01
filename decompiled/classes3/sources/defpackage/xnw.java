package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnw extends ylb implements defpackage.xnx {
    public xnw(android.os.IBinder iBinder) {
        super(iBinder, "com.android.onboarding.tasks.service.IObserver");
    }

    @Override // defpackage.xnx
    public final void a(defpackage.xoc xocVar) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, xocVar);
        eS(2, parcelEP);
    }

    @Override // defpackage.xnx
    public final void b() {
        eS(4, eP());
    }

    @Override // defpackage.xnx
    public final void c(defpackage.xoc xocVar) {
        android.os.Parcel parcelEP = eP();
        yld.f(parcelEP, xocVar);
        eS(3, parcelEP);
    }
}

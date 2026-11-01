package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akvq extends ylb implements defpackage.akvs {
    public akvq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.oslo.service.serviceinterface.aidl.IOsloService");
    }

    @Override // defpackage.akvs
    public final void a(android.os.IBinder iBinder, android.os.IBinder iBinder2, int i, android.os.Bundle bundle) {
        android.os.Parcel parcelEP = eP();
        parcelEP.writeStrongBinder(iBinder);
        parcelEP.writeStrongBinder(iBinder2);
        parcelEP.writeInt(i);
        yld.d(parcelEP, bundle);
        eR(1, parcelEP);
    }

    @Override // defpackage.akvs
    public final void b(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        android.os.Parcel parcelEP = eP();
        parcelEP.writeStrongBinder(iBinder);
        parcelEP.writeStrongBinder(iBinder2);
        eR(2, parcelEP);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aahf extends defpackage.ylc implements android.os.IInterface {
    private defpackage.aagf a;
    private final int b;

    public aahf(defpackage.aagf aagfVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = aagfVar;
        this.b = i;
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) defpackage.yld.a(parcel, android.os.Bundle.CREATOR);
            defpackage.yld.c(parcel);
            a(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            defpackage.yld.c(parcel);
            android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.ConnectionInfo connectionInfo = (com.google.android.gms.common.internal.ConnectionInfo) defpackage.yld.a(parcel, com.google.android.gms.common.internal.ConnectionInfo.CREATOR);
            defpackage.yld.c(parcel);
            defpackage.aagf aagfVar = this.a;
            if (aagfVar == null) {
                throw new java.lang.NullPointerException("onPostInitCompleteWithConnectionInfo can be called only once per call to getRemoteService");
            }
            if (connectionInfo == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            aagfVar.m = connectionInfo;
            if (aagfVar.e()) {
                com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                defpackage.aaho.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            a(i3, strongBinder2, connectionInfo.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void a(int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        defpackage.aagf aagfVar = this.a;
        if (aagfVar == null) {
            throw new java.lang.NullPointerException("onPostInitComplete can be called only once per call to getRemoteService");
        }
        aagfVar.D(i, iBinder, bundle, this.b);
        this.a = null;
    }
}

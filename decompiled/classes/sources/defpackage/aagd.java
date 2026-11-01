package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagd extends defpackage.aafy {
    public final android.os.IBinder h;
    final /* synthetic */ defpackage.aagf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagd(defpackage.aagf aagfVar, int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        super(aagfVar, i, bundle, i2);
        j$.util.Objects.requireNonNull(aagfVar);
        this.i = aagfVar;
        this.h = iBinder;
    }

    @Override // defpackage.aafy
    protected final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.apnt apntVar = this.i.r;
        if (apntVar != null) {
            apntVar.l(connectionResult);
        }
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aaei, java.lang.Object] */
    @Override // defpackage.aafy
    protected final boolean b() {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo;
        try {
            android.os.IBinder iBinder = this.h;
            if (iBinder == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            defpackage.aagf aagfVar = this.i;
            if (!aagfVar.c().equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", "service descriptor mismatch: " + aagfVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            android.os.IInterface iInterfaceB = aagfVar.b(iBinder);
            if (iInterfaceB == null) {
                return false;
            }
            int i = this.c;
            if (!aagfVar.G(2, 4, iInterfaceB, i) && !aagfVar.G(3, 4, iInterfaceB, i)) {
                return false;
            }
            android.os.Bundle bundle = null;
            aagfVar.l = null;
            com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig = (!aagfVar.K() || (connectionInfo = aagfVar.m) == null) ? null : connectionInfo.e;
            if (connectionThrottlingConfig != null) {
                bundle = new android.os.Bundle();
                bundle.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", defpackage.aehj.bT(connectionThrottlingConfig));
            }
            defpackage.apnt apntVar = aagfVar.s;
            if (apntVar != null) {
                apntVar.a.a(bundle);
            }
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

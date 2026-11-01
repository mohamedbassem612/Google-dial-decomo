package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adsq implements android.content.ServiceConnection {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public adsq(defpackage.adsr adsrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(adsrVar);
        this.a = adsrVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) throws android.os.RemoteException {
        int i = this.$cid;
        defpackage.yrk yrkVar = null;
        android.os.Messenger messenger = null;
        if (i == 0) {
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.motionsense.api.IMotionSenseBridge");
                yrkVar = iInterfaceQueryLocalInterface instanceof defpackage.yrk ? (defpackage.yrk) iInterfaceQueryLocalInterface : new defpackage.yrk(iBinder);
            }
            java.lang.Object obj = this.a;
            ((defpackage.adsr) obj).d = yrkVar;
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("client_package_name", ((defpackage.adsr) obj).b.getPackageName());
                bundle.putInt("client_version", 2);
                bundle.putInt("min_bridge_version", 2);
                defpackage.yrk yrkVar2 = ((defpackage.adsr) obj).d;
                defpackage.ylo yloVar = ((defpackage.adsr) obj).e;
                android.os.Parcel parcelEP = yrkVar2.eP();
                yld.d(parcelEP, bundle);
                yld.f(parcelEP, yloVar);
                yrkVar2.eR(1, parcelEP);
                return;
            } catch (android.os.RemoteException e) {
                android.util.Log.e("MotionSenseConnector", "Unable to connect.", e);
                defpackage.sns.n("Unable to connect to bridge.");
                return;
            }
        }
        if (i != 1) {
            java.lang.Object[] objArr = {componentName};
            defpackage.agfc agfcVar = (defpackage.agfc) this.a;
            agfcVar.m.E("ServiceConnectionImpl.onServiceConnected(%s)", objArr);
            agfcVar.c(new defpackage.agfa(this, iBinder));
            return;
        }
        aooh.f(componentName, "className");
        aooh.f(iBinder, "service");
        boolean zIsEmpty = defpackage.xkp.a.isEmpty();
        java.lang.Object obj2 = this.a;
        if (zIsEmpty) {
            defpackage.xkp xkpVar = (defpackage.xkp) obj2;
            defpackage.xox.e("KeepAliveManager", "[KeepAlive] Race condition: " + xkpVar.a().getPackageName() + " is connected to: " + componentName + " after requesting unbind. Unbinding.");
            defpackage.xff.k(this, xkpVar.a());
            return;
        }
        defpackage.xkp xkpVar2 = (defpackage.xkp) obj2;
        defpackage.xox.b("KeepAliveManager", "[KeepAlive] Client " + xkpVar2.a().getPackageName() + " is connected to: " + componentName + '.');
        xkpVar2.c = new android.os.Messenger(iBinder);
        android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, 1);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("package", xkpVar2.a().getPackageName());
        bundle2.putString("component", xkpVar2.b);
        bundle2.putInt("android.intent.extra.UID", android.os.Process.myUid());
        messageObtain.setData(bundle2);
        defpackage.xox.b("KeepAliveManager", "[KeepAlive] Client " + xkpVar2.a().getPackageName() + " with UID " + android.os.Process.myUid() + " requesting bind from controller.");
        android.os.Messenger messenger2 = xkpVar2.c;
        if (messenger2 == null) {
            aooh.j("messenger");
        } else {
            messenger = messenger2;
        }
        messenger.send(messageObtain);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.adsr adsrVar = (defpackage.adsr) this.a;
            adsrVar.c.c();
            adsrVar.d = null;
        } else {
            if (i != 1) {
                java.lang.Object[] objArr = {componentName};
                defpackage.agfc agfcVar = (defpackage.agfc) this.a;
                agfcVar.m.E("ServiceConnectionImpl.onServiceDisconnected(%s)", objArr);
                agfcVar.c(new defpackage.agfb(this));
                return;
            }
            aooh.f(componentName, "className");
            defpackage.xox.e("KeepAliveManager", "[KeepAlive] Client " + ((defpackage.xkp) this.a).a().getPackageName() + " is unexpectedly disconnected from: " + componentName);
        }
    }

    public adsq(defpackage.xkp xkpVar, int i) {
        this.$cid = i;
        this.a = xkpVar;
    }

    public adsq(defpackage.agfc agfcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agfcVar);
        this.a = agfcVar;
    }
}

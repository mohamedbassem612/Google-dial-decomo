package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nye implements android.content.ServiceConnection {
    public static final aimz a = aimz.i("com/android/dialer/duo/impl/DuoFallbackServiceConnection");
    public final android.telecom.Call b;
    public defpackage.yrs c;
    private final android.content.Context d;
    private final android.os.Bundle e;
    private boolean f = false;
    private boolean g = false;

    public nye(android.content.Context context, android.telecom.Call call, android.os.Bundle bundle) {
        ahvr.ci(context);
        this.d = context;
        ahvr.ci(call);
        this.b = call;
        this.e = bundle;
    }

    private final void b(mcd mcdVar) {
        android.content.Context context = this.d;
        if (context.getApplicationContext() != null) {
            mni.ae(context).nJ().i(mni.ae(context).jv().d(this.b)).a(mcdVar);
        }
    }

    private final void c() {
        mni.ae(this.d).dP().h(mgv.eO, aike.a, gus.aw("Failed"), 4);
    }

    private final void d(rmx rmxVar) {
        mni.ae(this.d).bt().o(rmxVar);
    }

    public final void a() {
        a.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection", "onDuoFinished", 118, "DuoFallbackServiceConnection.java").v("onDuoFinished");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.yrt yrtVar;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection", "onServiceConnected", 61, "DuoFallbackServiceConnection.java").v("connected");
        if (this.f) {
            d(rmx.hz);
        }
        this.f = true;
        ahok ahokVarF = mni.ae(this.d).fi().f(389, "DuoFallbackServiceConnection_onServiceConnected");
        defpackage.yrs yrsVar = null;
        if (iBinder == null) {
            yrtVar = null;
        } else {
            try {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
                yrtVar = iInterfaceQueryLocalInterface instanceof defpackage.yrt ? (defpackage.yrt) iInterfaceQueryLocalInterface : new defpackage.yrt(iBinder);
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        try {
            zyp zypVar = new zyp(this, 1);
            android.net.Uri handle = this.b.getDetails().getHandle();
            android.os.Bundle bundle = this.e;
            android.os.Parcel parcelEP = yrtVar.eP();
            yld.f(parcelEP, zypVar);
            yld.d(parcelEP, handle);
            yld.d(parcelEP, bundle);
            android.os.Parcel parcelEQ = yrtVar.eQ(1, parcelEP);
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget");
                yrsVar = iInterfaceQueryLocalInterface2 instanceof defpackage.yrs ? (defpackage.yrs) iInterfaceQueryLocalInterface2 : new defpackage.yrs(strongBinder);
            }
            parcelEQ.recycle();
            this.c = yrsVar;
            if (yrsVar == null) {
                d(rmx.hy);
                b(mcd.at);
                aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/duo/impl/DuoFallbackServiceConnection", "onServiceConnected", 90, "DuoFallbackServiceConnection.java").v("null result from handover request");
                if (!this.g) {
                    this.g = true;
                    this.d.unbindService(this);
                }
                c();
            } else {
                d(rmx.hx);
                mce mceVar = mce.ef;
                android.content.Context context = this.d;
                if (context.getApplicationContext() != null) {
                    mni.ae(context).nJ().i(mni.ae(context).jv().d(this.b)).b(mceVar);
                }
                mni.ae(context).dP().h(mgv.eO, aike.a, gus.aw("Succeed"), 4);
            }
        } catch (android.os.RemoteException e) {
            a.c().i(zct.b).k(e).l("com/android/dialer/duo/impl/DuoFallbackServiceConnection", "onServiceConnected", 76, "DuoFallbackServiceConnection.java").v("failed to request handover");
            d(rmx.hy);
            b(mcd.at);
            c();
        }
        ahokVarF.close();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        a.b().l("com/android/dialer/duo/impl/DuoFallbackServiceConnection", "onServiceDisconnected", 107, "DuoFallbackServiceConnection.java").v("onServiceDisconnected");
        this.c = null;
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.unbindService(this);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aagf {
    private static final com.google.android.gms.common.Feature[] a = new com.google.android.gms.common.Feature[0];
    public final android.content.Context b;
    public final android.os.Looper c;
    public final defpackage.aaby d;
    public final android.os.Handler e;
    protected defpackage.aagb g;
    public final int i;
    public volatile java.lang.String j;
    public volatile defpackage.aaix k;
    public defpackage.aahg p;
    defpackage.ahzf q;
    public final defpackage.apnt r;
    public final defpackage.apnt s;
    private final defpackage.aagv u;
    private android.os.IInterface w;
    private com.google.android.gms.common.internal.BaseGmsClient$GmsServiceConnection x;
    private final java.lang.String z;
    private volatile java.lang.String t = null;
    private final java.lang.Object v = new java.lang.Object();
    public final java.lang.Object f = new java.lang.Object();
    public final java.util.ArrayList h = new java.util.ArrayList();
    private int y = 1;
    public com.google.android.gms.common.ConnectionResult l = null;
    public volatile com.google.android.gms.common.internal.ConnectionInfo m = null;
    public final java.util.concurrent.atomic.AtomicInteger n = new java.util.concurrent.atomic.AtomicInteger(0);
    public volatile int o = -1;

    protected aagf(android.content.Context context, android.os.Looper looper, defpackage.aagv aagvVar, defpackage.aaby aabyVar, int i, defpackage.apnt apntVar, defpackage.apnt apntVar2, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("Context must not be null");
        }
        this.b = context;
        if (looper == null) {
            throw new java.lang.NullPointerException("Looper must not be null");
        }
        this.c = looper;
        if (aagvVar == null) {
            throw new java.lang.NullPointerException("Supervisor must not be null");
        }
        this.u = aagvVar;
        if (aabyVar == null) {
            throw new java.lang.NullPointerException("API availability must not be null");
        }
        this.d = aabyVar;
        this.e = new defpackage.aafz(this, looper);
        this.i = i;
        this.s = apntVar;
        this.r = apntVar2;
        this.z = str;
    }

    protected java.util.concurrent.Executor A() {
        throw null;
    }

    protected final void B() {
        if (!o()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void C() {
        android.os.Handler handler = this.e;
        if (handler instanceof defpackage.aafz) {
            handler.removeCallbacksAndMessages(null);
        }
        this.n.incrementAndGet();
        java.util.ArrayList arrayList = this.h;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.aaga) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.f) {
            this.p = null;
        }
        J(1, null, -1);
    }

    protected void D(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        defpackage.aagd aagdVar = new defpackage.aagd(this, i, iBinder, bundle, i2);
        android.os.Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, aagdVar));
    }

    public final void E(int i, android.os.Bundle bundle, int i2) {
        defpackage.aage aageVar = new defpackage.aage(this, i, bundle, i2);
        android.os.Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, aageVar));
    }

    public final void F(defpackage.aagb aagbVar, int i, android.app.PendingIntent pendingIntent) {
        this.g = aagbVar;
        android.os.Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.n.get(), i, pendingIntent));
    }

    public final boolean G(int i, int i2, android.os.IInterface iInterface, int i3) {
        synchronized (this.v) {
            if (this.y != i) {
                return false;
            }
            return J(i2, iInterface, i3);
        }
    }

    public final boolean H() {
        return this.m != null;
    }

    public boolean I() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient$GmsServiceConnection] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean J(int i, android.os.IInterface iInterface, int i2) {
        defpackage.ahzf ahzfVar;
        if ((i == 4) != (iInterface != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        synchronized (this.v) {
            if (i2 != -1) {
                if (i2 != this.n.get()) {
                    return false;
                }
            }
            if (i == 2) {
                this.o = -1;
                i = 2;
            }
            this.y = i;
            this.w = iInterface;
            android.os.Bundle bundle = null;
            if (i == 1) {
                com.google.android.gms.common.internal.BaseGmsClient$GmsServiceConnection baseGmsClient$GmsServiceConnection = this.x;
                if (baseGmsClient$GmsServiceConnection != null) {
                    defpackage.aagv aagvVar = this.u;
                    defpackage.ahzf ahzfVar2 = this.q;
                    java.lang.Object obj = ahzfVar2.d;
                    java.lang.Object obj2 = ahzfVar2.c;
                    int i3 = ahzfVar2.b;
                    w();
                    aagvVar.f(new defpackage.aagu((java.lang.String) obj, (java.lang.String) obj2, this.q.a), baseGmsClient$GmsServiceConnection);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                com.google.android.gms.common.internal.BaseGmsClient$GmsServiceConnection baseGmsClient$GmsServiceConnection2 = this.x;
                if (baseGmsClient$GmsServiceConnection2 != null && (ahzfVar = this.q) != null) {
                    android.util.Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((java.lang.String) ahzfVar.d) + " on " + ((java.lang.String) ahzfVar.c));
                    defpackage.aagv aagvVar2 = this.u;
                    defpackage.ahzf ahzfVar3 = this.q;
                    java.lang.Object obj3 = ahzfVar3.d;
                    java.lang.Object obj4 = ahzfVar3.c;
                    int i4 = ahzfVar3.b;
                    w();
                    aagvVar2.f(new defpackage.aagu((java.lang.String) obj3, (java.lang.String) obj4, this.q.a), baseGmsClient$GmsServiceConnection2);
                    this.n.incrementAndGet();
                }
                final boolean z = this.y == 3;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = this.n;
                final int i5 = atomicInteger.get();
                ?? r12 = new android.content.ServiceConnection(this, i5, z) { // from class: com.google.android.gms.common.internal.BaseGmsClient$GmsServiceConnection
                    final /* synthetic */ defpackage.aagf a;
                    private final int b;
                    private final boolean c;

                    {
                        j$.util.Objects.requireNonNull(this);
                        this.a = this;
                        this.b = i5;
                        this.c = z;
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
                        int i6;
                        defpackage.aagf aagfVar = this.a;
                        if (iBinder == null) {
                            int i7 = this.b;
                            if (this.c) {
                                aagfVar.o = i7;
                                i6 = 5;
                            } else {
                                i6 = 4;
                            }
                            android.os.Handler handler = aagfVar.e;
                            handler.sendMessage(handler.obtainMessage(i6, i7, 16));
                            return;
                        }
                        synchronized (aagfVar.f) {
                            int i8 = this.b;
                            if (i8 == aagfVar.n.get()) {
                                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                                aagfVar.p = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.aahg)) ? new defpackage.aahg(iBinder) : (defpackage.aahg) iInterfaceQueryLocalInterface;
                                aagfVar.E(0, null, i8);
                            }
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(android.content.ComponentName componentName) {
                        defpackage.aagf aagfVar = this.a;
                        synchronized (aagfVar.f) {
                            aagfVar.p = null;
                        }
                        defpackage.aagf aagfVar2 = this.a;
                        int i6 = this.b;
                        android.os.Handler handler = aagfVar2.e;
                        handler.sendMessage(handler.obtainMessage(6, i6, 1));
                    }
                };
                this.x = r12;
                defpackage.ahzf ahzfVar4 = new defpackage.ahzf(x(), d(), f());
                this.q = ahzfVar4;
                if (ahzfVar4.a && a() < 17895000) {
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat((java.lang.String) ahzfVar4.d));
                }
                defpackage.aagv aagvVar3 = this.u;
                java.lang.Object obj5 = ahzfVar4.d;
                java.lang.Object obj6 = ahzfVar4.c;
                int i6 = ahzfVar4.b;
                com.google.android.gms.common.ConnectionResult connectionResultC = aagvVar3.c(new defpackage.aagu((java.lang.String) obj5, (java.lang.String) obj6, this.q.a), r12, w(), A());
                if (!connectionResultC.d()) {
                    defpackage.ahzf ahzfVar5 = this.q;
                    android.util.Log.w("GmsClient", "unable to connect to service: " + ((java.lang.String) ahzfVar5.d) + " on " + ((java.lang.String) ahzfVar5.c));
                    int i7 = connectionResultC.c;
                    if (i7 == -1) {
                        i7 = 16;
                    }
                    if (connectionResultC.a() != null) {
                        bundle = new android.os.Bundle();
                        bundle.putParcelable("pendingIntent", connectionResultC.a());
                    }
                    E(i7, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                if (iInterface == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                java.lang.System.currentTimeMillis();
            }
            return true;
        }
    }

    public boolean K() {
        return true;
    }

    public com.google.android.gms.common.Feature[] L() {
        throw null;
    }

    protected void M() {
        java.lang.System.currentTimeMillis();
    }

    public int a() {
        throw null;
    }

    protected abstract android.os.IInterface b(android.os.IBinder iBinder);

    protected abstract java.lang.String c();

    protected abstract java.lang.String d();

    public boolean e() {
        return false;
    }

    protected boolean f() {
        return a() >= 211700000;
    }

    public com.google.android.gms.common.Feature[] g() {
        return a;
    }

    protected android.os.Bundle h() {
        return new android.os.Bundle();
    }

    public boolean i() {
        return false;
    }

    public final java.lang.String j() {
        defpackage.ahzf ahzfVar;
        if (!o() || (ahzfVar = this.q) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return (java.lang.String) ahzfVar.c;
    }

    public final java.lang.String k() {
        return this.t;
    }

    public void m(defpackage.aagb aagbVar) {
        this.g = aagbVar;
        J(2, null, -1);
    }

    public final void n(java.lang.String str) {
        this.t = str;
        C();
    }

    public final boolean o() {
        boolean z;
        synchronized (this.v) {
            z = this.y == 4;
        }
        return z;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.v) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean q() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] r() {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo = this.m;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void s(aahb aahbVar, java.util.Set set) {
        android.content.AttributionSource attributionSource;
        android.os.Bundle bundleH = h();
        java.lang.String strM = (android.os.Build.VERSION.SDK_INT < 31 || this.k == null || (attributionSource = this.k.a) == null || ac$.ExternalSyntheticApiModelOutline0.m(attributionSource) == null) ? this.j : ac$.ExternalSyntheticApiModelOutline0.m(attributionSource);
        java.lang.String str = strM;
        int i = this.i;
        int i2 = defpackage.aaby.c;
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.a;
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.b;
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f = this.b.getPackageName();
        getServiceRequest.i = bundleH;
        if (set != null) {
            getServiceRequest.h = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (i()) {
            android.accounts.Account accountU = u();
            if (accountU == null) {
                accountU = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.j = accountU;
            if (aahbVar != null) {
                getServiceRequest.g = aahbVar.a;
            }
        } else if (I()) {
            getServiceRequest.j = u();
        }
        getServiceRequest.k = L();
        getServiceRequest.l = g();
        if (e()) {
            getServiceRequest.o = true;
        }
        try {
            synchronized (this.f) {
                try {
                    defpackage.aahg aahgVar = this.p;
                    if (aahgVar != null) {
                        defpackage.aahf aahfVar = new defpackage.aahf(this, this.n.get());
                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                            parcelObtain.writeStrongBinder(aahfVar);
                            parcelObtain.writeInt(1);
                            defpackage.ccu.a(getServiceRequest, parcelObtain, 0);
                            aahgVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (java.lang.Throwable th) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    } else {
                        android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            android.os.Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            D(8, null, null, this.n.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            D(8, null, null, this.n.get());
        }
    }

    public final void t(aprf aprfVar) {
        ((defpackage.aaeo) aprfVar.a).l.r.post(new yne(aprfVar, 7));
    }

    public android.accounts.Account u() {
        throw null;
    }

    public final android.os.IInterface v() {
        android.os.IInterface iInterface;
        synchronized (this.v) {
            if (this.y == 5) {
                throw new android.os.DeadObjectException();
            }
            B();
            iInterface = this.w;
            if (iInterface == null) {
                throw new java.lang.NullPointerException("Client is connected but service is null");
            }
        }
        return iInterface;
    }

    protected final java.lang.String w() {
        java.lang.String str = this.z;
        return str == null ? this.b.getClass().getName() : str;
    }

    protected java.lang.String x() {
        return "com.google.android.gms";
    }

    public final java.lang.String y() {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo = this.m;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.f;
    }

    protected java.util.Set z() {
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akvr extends ylc implements defpackage.akvs {
    public defpackage.akvs a;
    public final java.lang.Object b;
    private final java.util.List c;
    private android.os.Handler d;

    public akvr() {
        super("com.google.oslo.service.serviceinterface.aidl.IOsloService");
        this.c = new java.util.ArrayList();
        this.b = new java.lang.Object();
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            int i2 = parcel.readInt();
            android.os.Bundle bundle = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
            yld.c(parcel);
            a(strongBinder, strongBinder2, i2, bundle);
        } else {
            if (i != 2) {
                return false;
            }
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            android.os.IBinder strongBinder4 = parcel.readStrongBinder();
            yld.c(parcel);
            b(strongBinder3, strongBinder4);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.akvs
    public final void a(android.os.IBinder iBinder, android.os.IBinder iBinder2, int i, android.os.Bundle bundle) {
        synchronized (this.b) {
            if (this.a != null) {
                try {
                    android.util.Log.i("OsloRegistrationProxy", java.lang.String.format("registerListener: listener=%s, type=%d", iBinder2, java.lang.Integer.valueOf(i)));
                    this.a.a(iBinder, iBinder2, i, bundle);
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("OsloRegistrationProxy", "registerListener failed.", e);
                }
            } else {
                this.c.add(new adss(iBinder, iBinder2, i, bundle));
            }
        }
    }

    @Override // defpackage.akvs
    public final void b(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        synchronized (this.b) {
            if (this.a != null) {
                try {
                    android.util.Log.i("OsloRegistrationProxy", java.lang.String.format("unregisterListener: listener=%s", iBinder2));
                    this.a.b(iBinder, iBinder2);
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("OsloRegistrationProxy", "unregisterListener failed.", e);
                }
            } else {
                java.util.Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    if (((adss) it.next()).c == iBinder2) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void c() {
        android.util.Log.i("OsloRegistrationProxy", "onServiceDisconnected");
        synchronized (this.b) {
            this.a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, java.lang.Object] */
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
    public final void d(int i) {
        android.util.Log.i("OsloRegistrationProxy", a.bj(i, "registerPendingListeners: maxRetryCount="));
        synchronized (this.b) {
            try {
                if (this.a == null) {
                    android.util.Log.w("OsloRegistrationProxy", "registerPendingListeners: not connected.");
                    return;
                }
                for (adss adssVar : this.c) {
                    try {
                        ?? r7 = adssVar.c;
                        int i2 = adssVar.a;
                        android.util.Log.i("OsloRegistrationProxy", java.lang.String.format("registerPendingListeners: registering listener=%s, type=%d", r7, java.lang.Integer.valueOf(i2)));
                        this.a.a(adssVar.b, r7, i2, (android.os.Bundle) adssVar.d);
                    } catch (android.os.RemoteException e) {
                        android.util.Log.e("OsloRegistrationProxy", "registerListener failed.", e);
                    } catch (java.lang.NullPointerException e2) {
                        android.util.Log.e("OsloRegistrationProxy", "NPE from registerListener.", e2);
                        if (i > 0) {
                            android.util.Log.w("OsloRegistrationProxy", "Scheduling a retry.");
                            java.lang.Runnable eydVar = new eyd(this, i, 14);
                            synchronized (this.b) {
                                try {
                                    android.os.Handler handler = this.d;
                                    if (handler == null) {
                                        handler = new android.os.Handler(android.os.Looper.getMainLooper());
                                        this.d = handler;
                                    }
                                    handler.postDelayed(eydVar, 1000L);
                                    return;
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        android.util.Log.e("OsloRegistrationProxy", "No more retries. Giving up.");
                    }
                }
                java.util.List list = this.c;
                android.util.Log.i("OsloRegistrationProxy", java.lang.String.format("registerPendingListeners: clearing %d pending listeners", java.lang.Integer.valueOf(list.size())));
                list.clear();
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}

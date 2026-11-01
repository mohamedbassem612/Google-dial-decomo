package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ants implements android.content.ServiceConnection, defpackage.anrw {
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.ants.class.getName());
    public final android.content.Intent a;
    public final android.os.UserHandle b;
    private final int d;
    private final java.util.concurrent.Executor e;
    private android.content.Context f;
    private int g;
    private int h;
    private final defpackage.anrx i;

    public ants(java.util.concurrent.Executor executor, android.content.Context context, android.content.Intent intent, android.os.UserHandle userHandle, int i, defpackage.anrx anrxVar) {
        synchronized (this) {
            this.a = intent;
            this.d = i;
            this.i = anrxVar;
            this.f = context;
            this.e = executor;
            this.b = userHandle;
            this.g = 1;
            this.h = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d A[Catch: RuntimeException -> 0x0077, SecurityException -> 0x0091, all -> 0x00d8, TRY_LEAVE, TryCatch #6 {all -> 0x00d8, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x0015, B:14:0x0021, B:19:0x002d), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003d A[Catch: RuntimeException -> 0x0073, SecurityException -> 0x0075, all -> 0x00dc, TryCatch #8 {all -> 0x00dc, blocks: (B:26:0x004d, B:40:0x00aa, B:42:0x00b0, B:43:0x00b2, B:48:0x00c5, B:47:0x00b8, B:21:0x0038, B:25:0x004a, B:35:0x007a, B:39:0x0094, B:56:0x00da, B:22:0x003d, B:23:0x0043), top: B:64:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[Catch: RuntimeException -> 0x0073, SecurityException -> 0x0075, all -> 0x00dc, TryCatch #8 {all -> 0x00dc, blocks: (B:26:0x004d, B:40:0x00aa, B:42:0x00b0, B:43:0x00b2, B:48:0x00c5, B:47:0x00b8, B:21:0x0038, B:25:0x004a, B:35:0x007a, B:39:0x0094, B:56:0x00da, B:22:0x003d, B:23:0x0043), top: B:64:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: RuntimeException -> 0x0073, SecurityException -> 0x0075, all -> 0x00dc, TryCatch #8 {all -> 0x00dc, blocks: (B:26:0x004d, B:40:0x00aa, B:42:0x00b0, B:43:0x00b2, B:48:0x00c5, B:47:0x00b8, B:21:0x0038, B:25:0x004a, B:35:0x007a, B:39:0x0094, B:56:0x00da, B:22:0x003d, B:23:0x0043), top: B:64:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[Catch: RuntimeException -> 0x0073, SecurityException -> 0x0075, all -> 0x00dc, PHI: r6
      0x004d: PHI (r6v16 'this' ants) = (r6v15 'this' ants), (r6v19 'this' ants) binds: [B:24:0x0048, B:18:0x002b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x00dc, blocks: (B:26:0x004d, B:40:0x00aa, B:42:0x00b0, B:43:0x00b2, B:48:0x00c5, B:47:0x00b8, B:21:0x0038, B:25:0x004a, B:35:0x007a, B:39:0x0094, B:56:0x00da, B:22:0x003d, B:23:0x0043), top: B:64:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #8 {all -> 0x00dc, blocks: (B:26:0x004d, B:40:0x00aa, B:42:0x00b0, B:43:0x00b2, B:48:0x00c5, B:47:0x00b8, B:21:0x0038, B:25:0x004a, B:35:0x007a, B:39:0x0094, B:56:0x00da, B:22:0x003d, B:23:0x0043), top: B:64:0x0001, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x004d, please report this as an issue */
    @Override // defpackage.anrw
    public final synchronized void a() throws java.lang.Throwable {
        anqw anqwVarF;
        defpackage.antr antrVar;
        int iOrdinal;
        boolean zBindService;
        try {
            try {
                if (this.g == 1) {
                    this.g = 2;
                    android.content.Context context = this.f;
                    android.content.Intent intent = this.a;
                    int i = this.d;
                    android.os.UserHandle userHandle = this.b;
                    defpackage.antr antrVar2 = defpackage.antr.BIND_SERVICE;
                    if (userHandle != null) {
                        try {
                            antrVar2 = defpackage.antr.BIND_SERVICE_AS_USER;
                            antrVar = antrVar2;
                            try {
                                iOrdinal = antrVar.ordinal();
                                try {
                                    if (iOrdinal != 0) {
                                        this = this;
                                        zBindService = context.bindService(intent, this, i);
                                    } else if (iOrdinal != 1) {
                                        if (iOrdinal != 2) {
                                            this = this;
                                        } else {
                                            this = this;
                                            zBindService = aa$.ExternalSyntheticApiModelOutline0.m((android.app.admin.DevicePolicyManager) context.getSystemService("device_policy"), (android.content.ComponentName) null, intent, this, i, userHandle);
                                        }
                                        anqwVarF = anqw.j.f(antrVar.d + '(' + java.lang.String.valueOf(intent) + ") returned false");
                                    } else {
                                        this = this;
                                        zBindService = context.bindServiceAsUser(intent, this, i, userHandle);
                                    }
                                    if (zBindService) {
                                        anqwVarF = anqw.b;
                                    } else {
                                        anqwVarF = anqw.j.f(antrVar.d + '(' + java.lang.String.valueOf(intent) + ") returned false");
                                    }
                                } catch (java.lang.SecurityException e) {
                                    e = e;
                                    antrVar2 = antrVar;
                                    anqwVarF = anqw.f.e(e).f("SecurityException from ".concat(java.lang.String.valueOf(antrVar2.d)));
                                } catch (java.lang.RuntimeException e2) {
                                    e = e2;
                                    antrVar2 = antrVar;
                                    anqwVarF = anqw.k.e(e).f("RuntimeException from ".concat(java.lang.String.valueOf(antrVar2.d)));
                                }
                            } catch (java.lang.SecurityException e3) {
                                e = e3;
                            } catch (java.lang.RuntimeException e4) {
                                e = e4;
                            }
                        } catch (java.lang.SecurityException e5) {
                            e = e5;
                            anqwVarF = anqw.f.e(e).f("SecurityException from ".concat(java.lang.String.valueOf(antrVar2.d)));
                            if (!anqwVarF.h()) {
                                try {
                                    this.f.unbindService(this);
                                } catch (java.lang.RuntimeException e6) {
                                    c.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", (java.lang.Throwable) e6);
                                }
                                this.g = 4;
                                this.e.execute(new defpackage.alvh(this, anqwVarF, 5));
                                return;
                            }
                        } catch (java.lang.RuntimeException e7) {
                            e = e7;
                            anqwVarF = anqw.k.e(e).f("RuntimeException from ".concat(java.lang.String.valueOf(antrVar2.d)));
                            if (!anqwVarF.h()) {
                                this.f.unbindService(this);
                                this.g = 4;
                                this.e.execute(new defpackage.alvh(this, anqwVarF, 5));
                                return;
                            }
                        }
                    } else {
                        antrVar = antrVar2;
                        iOrdinal = antrVar.ordinal();
                        if (iOrdinal != 0) {
                            this = this;
                            zBindService = context.bindService(intent, this, i);
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                this = this;
                            } else {
                                this = this;
                                zBindService = aa$.ExternalSyntheticApiModelOutline0.m((android.app.admin.DevicePolicyManager) context.getSystemService("device_policy"), (android.content.ComponentName) null, intent, this, i, userHandle);
                            }
                            anqwVarF = anqw.j.f(antrVar.d + '(' + java.lang.String.valueOf(intent) + ") returned false");
                        } else {
                            this = this;
                            zBindService = context.bindServiceAsUser(intent, this, i, userHandle);
                        }
                        if (zBindService) {
                            anqwVarF = anqw.b;
                        } else {
                            anqwVarF = anqw.j.f(antrVar.d + '(' + java.lang.String.valueOf(intent) + ") returned false");
                        }
                    }
                    if (!anqwVarF.h()) {
                        this.f.unbindService(this);
                        this.g = 4;
                        this.e.execute(new defpackage.alvh(this, anqwVarF, 5));
                        return;
                    }
                } else {
                    this = this;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                this = this;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void b(anqw anqwVar) {
        java.util.logging.Logger logger = c;
        logger.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", anqwVar);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.i.n(anqwVar);
        }
    }

    final void c(anqw anqwVar) {
        android.content.Context context;
        synchronized (this) {
            int i = this.g;
            context = (i == 2 || i == 3) ? this.f : null;
            this.g = 4;
        }
        this.e.execute(new defpackage.alvh(this, anqwVar, 6));
        if (context != null) {
            context.unbindService(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    public final android.content.Context d() throws anqx {
        ahvr.bZ(this.f != null, "Already unbound!");
        try {
            android.os.UserHandle userHandle = this.b;
            android.content.Context context = this.f;
            return userHandle != null ? defpackage.antw.j(context, userHandle) : context;
        } catch (java.lang.ReflectiveOperationException unused) {
            throw new anqx(anqw.k.f("Cross-user pre-auth requires SDK_INT >= R and @SystemApi visibility"), (anph) null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        c(anqw.l.f("Remote Service component " + componentName.getClassName() + " was disabled, or its package " + componentName.getPackageName() + " was disabled, force-stopped, replaced or uninstalled (onBindingDied)."));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        android.content.Intent intent = this.a;
        c(anqw.j.f("Remote Service returned null from onBind() for " + java.lang.String.valueOf(intent) + " (onNullBinding): " + java.lang.String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            c.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.i.l(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        c(anqw.l.f("Server process crashed, exited or was killed (onServiceDisconnected): ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName)))));
    }
}

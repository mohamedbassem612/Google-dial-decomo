package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yna implements android.os.IBinder.DeathRecipient, defpackage.ymd {
    public static final java.lang.String a = "yna";
    public static final android.content.ComponentName b;
    public static final android.content.ComponentName c;
    protected final android.content.Context d;
    public final java.util.concurrent.Executor e;
    public final boolean f;
    public final ahzp g;
    public final defpackage.xhp h;
    private final ajct i;
    private final long j;
    private final java.util.concurrent.ScheduledExecutorService k;
    private final android.os.UserManager l;
    private final boolean m;
    private final java.lang.Object n;
    private defpackage.ymx o;
    private java.util.concurrent.ScheduledFuture p;

    static {
        android.content.ComponentName componentName = new android.content.ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
        b = componentName;
        c = new android.content.ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
    }

    public yna(defpackage.ymh ymhVar) {
        defpackage.xhp xhpVar = new defpackage.xhp(null);
        this.n = new java.lang.Object();
        android.content.Context context = ymhVar.a;
        this.d = context;
        this.i = aiql.r(ymhVar.b);
        this.e = ymhVar.c;
        this.f = ymhVar.d;
        this.j = ymhVar.e.toMillis();
        this.k = ymhVar.f;
        this.l = (android.os.UserManager) context.getSystemService("user");
        this.m = ((java.lang.Boolean) ymhVar.g.orElse(java.lang.Boolean.TRUE)).booleanValue();
        this.g = ahwr.a;
        this.h = (defpackage.xhp) j$.util.Objects.requireNonNull(xhpVar);
    }

    private final void p() {
        long j = this.j;
        if (j > 0) {
            synchronized (this.n) {
                java.util.concurrent.ScheduledFuture scheduledFuture = this.p;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.p = this.k.schedule(new defpackage.vet(this, 20), j, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private final ajcq q(int i, int i2, defpackage.ymz ymzVar, java.lang.String str) {
        defpackage.ync yncVar = new defpackage.ync(new defpackage.ypf(this.g), m());
        p();
        return ajan.g(ajck.w(d()).x(new defpackage.ymu(0), ajbm.a), new defpackage.aczt(this, ymzVar, i, i2, yncVar, str, 1), this.i);
    }

    @Override // defpackage.ymd
    public final ajcq a(final int i) {
        return q(4, i, new defpackage.ymz() { // from class: yms
            @Override // defpackage.ymz
            public final java.lang.Object a(java.lang.Object obj) {
                java.lang.String str = defpackage.yna.a;
                ylb ylbVar = (ylb) obj;
                android.os.Parcel parcelEP = ylbVar.eP();
                parcelEP.writeInt(i);
                android.os.Parcel parcelEQ = ylbVar.eQ(14, parcelEP);
                com.google.android.apps.aicore.aidl.AIFeature aIFeature = (com.google.android.apps.aicore.aidl.AIFeature) yld.a(parcelEQ, com.google.android.apps.aicore.aidl.AIFeature.CREATOR);
                parcelEQ.recycle();
                if (aIFeature == null) {
                    return null;
                }
                return defpackage.ymk.b(aIFeature);
            }
        }, "AiCore service failed to get feature.");
    }

    @Override // defpackage.ymd
    public final ajcq b(final int i, final int i2) {
        return q(4, i, new defpackage.ymz() { // from class: ymt
            @Override // defpackage.ymz
            public final java.lang.Object a(java.lang.Object obj) throws defpackage.ymi {
                java.lang.String str = defpackage.yna.a;
                ylb ylbVar = (ylb) obj;
                android.os.Parcel parcelEQ = ylbVar.eQ(11, ylbVar.eP());
                int i3 = parcelEQ.readInt();
                parcelEQ.recycle();
                if (i3 < 6) {
                    throw new defpackage.ymi(3, 8, "getFeatureOrControl is not supported before AICoreVersion V7", null);
                }
                int i4 = i2;
                int i5 = i;
                android.os.Parcel parcelEP = ylbVar.eP();
                parcelEP.writeInt(i5);
                parcelEP.writeInt(i4);
                android.os.Parcel parcelEQ2 = ylbVar.eQ(32, parcelEP);
                com.google.android.apps.aicore.aidl.AIFeature aIFeature = (com.google.android.apps.aicore.aidl.AIFeature) yld.a(parcelEQ2, com.google.android.apps.aicore.aidl.AIFeature.CREATOR);
                parcelEQ2.recycle();
                if (aIFeature != null) {
                    return defpackage.ymk.b(aIFeature);
                }
                throw new defpackage.ymi(3, 606, java.lang.String.format(java.util.Locale.ENGLISH, "Feature %d is not available.", java.lang.Integer.valueOf(i5)), null);
            }
        }, "AiCore service failed to get feature.");
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied(android.os.IBinder iBinder) {
        android.util.Log.i(a, "Binder died for component: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(iBinder))));
        l();
    }

    @Override // defpackage.ymd
    public final ajcq c(final defpackage.ymk ymkVar) {
        return q(6, ymkVar.e, new defpackage.ymz() { // from class: ymv
            @Override // defpackage.ymz
            public final java.lang.Object a(java.lang.Object obj) {
                java.lang.String str = defpackage.yna.a;
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = ymkVar.a();
                ylb ylbVar = (ylb) obj;
                android.os.Parcel parcelEP = ylbVar.eP();
                yld.d(parcelEP, abstractSafeParcelableA);
                android.os.Parcel parcelEQ = ylbVar.eQ(3, parcelEP);
                int i = parcelEQ.readInt();
                parcelEQ.recycle();
                return java.lang.Integer.valueOf(i);
            }
        }, "AiCore service failed to get feature status for ".concat(ymkVar.a));
    }

    @Override // defpackage.ymd, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    @Override // defpackage.ymd
    public final ajcq d() {
        defpackage.ymx ymyVar;
        android.os.UserManager userManager = this.l;
        if (userManager == null || !aa$.ExternalSyntheticApiModelOutline1.m(userManager)) {
            return aiql.y(new defpackage.ymi(4, 601, "User is not unlocked.", null));
        }
        synchronized (this.n) {
            p();
            ymyVar = this.o;
            if (ymyVar == null) {
                ymyVar = new defpackage.ymy(this);
                this.o = ymyVar;
                ymyVar.b();
            }
        }
        return ymyVar.a();
    }

    @Override // defpackage.ymd
    public final ajcq e() {
        return q(3, 0, new defpackage.ymw(), "AiCore service failed to list features.");
    }

    @Override // defpackage.ymd
    public final ajcq f(defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        return ajan.g(d(), new jsc(this, ymkVar, ymlVar, defpackage.ync.a(this), 15), this.i);
    }

    @Override // defpackage.ymd
    public final ajct g() {
        return this.i;
    }

    @Override // defpackage.ymd
    public final java.util.concurrent.Executor h() {
        return this.e;
    }

    @Override // defpackage.ymd
    public final boolean i() {
        return this.m;
    }

    @Override // defpackage.ymd
    public final void k(defpackage.ync yncVar, ajcq ajcqVar, int i, int i2) {
        aiql.I(ajcqVar, new defpackage.ynb(this.g, i, i2, yncVar), ajbm.a);
    }

    public final void l() {
        synchronized (this.n) {
            defpackage.ymx ymxVar = this.o;
            if (ymxVar != null) {
                ymxVar.e();
                this.o = null;
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = this.p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.p = null;
            }
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.n) {
            defpackage.ymx ymxVar = this.o;
            z = false;
            if (ymxVar != null && ymxVar.a().isDone()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean n() {
        android.os.UserManager userManager = this.l;
        return userManager != null && userManager.isSystemUser();
    }

    public final void o(int i, int i2, defpackage.ync yncVar, int i3, int i4) {
        defpackage.xhp.r(this.g, i, i2, yncVar, i3, i4);
    }

    @Override // defpackage.ymd
    public final void j() {
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}

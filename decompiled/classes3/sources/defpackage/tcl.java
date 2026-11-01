package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tcl {
    public static final android.net.Uri a = android.provider.Settings.System.DEFAULT_RINGTONE_URI;
    public static final aimz b = aimz.i("com/android/dialer/ringing/RingingManager");
    public static final android.media.AudioAttributes c = new android.media.AudioAttributes.Builder().setContentType(4).setUsage(6).build();
    public final android.content.Context d;
    public android.media.VolumeShaper.Configuration e;
    public final aoin f;
    public final aoin g;
    public defpackage.zmw i;
    public android.os.Vibrator k;
    public final defpackage.tck l;
    public final rlv m;
    public final ajct n;
    public final zmq o;
    public final zms p;
    public final rwi q;
    public final oju r;
    public final ogj u;
    public final heq v;
    public j$.util.Optional h = j$.util.Optional.empty();
    public final defpackage.znp s = new ler(this, 13);
    public final defpackage.znt t = new defpackage.qkn(this, 2);
    public boolean j = false;

    public tcl(android.content.Context context, aoin aoinVar, aoin aoinVar2, defpackage.tck tckVar, rlv rlvVar, heq heqVar, ajct ajctVar, zmq zmqVar, zms zmsVar, rwi rwiVar, oju ojuVar, ogj ogjVar) {
        this.d = context;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.l = tckVar;
        this.m = rlvVar;
        this.v = heqVar;
        this.n = ajctVar;
        this.o = zmqVar;
        this.p = zmsVar;
        this.q = rwiVar;
        this.r = ojuVar;
        this.u = ogjVar;
    }

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
    public final void a() {
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/ringing/RingingManager", "stopRinging", 273, "RingingManager.java").v("enter");
        android.os.Vibrator vibrator = this.k;
        if (vibrator != null && this.j) {
            vibrator.cancel();
            this.j = false;
        }
        defpackage.zmw zmwVar = this.i;
        if (zmwVar != null) {
            this.o.e(zmwVar);
        }
        if (!this.h.isPresent()) {
            a.bI(aimzVar.d(), "Null ringtone. Was stopRinging called without calling startRinging?", "com/android/dialer/ringing/RingingManager", "stopRinging", (char) 287, "RingingManager.java", zct.b);
            return;
        }
        aimzVar.b().l("com/android/dialer/ringing/RingingManager", "stopRinging", 291, "RingingManager.java").v("stop");
        aimzVar.b().l("com/android/dialer/ringing/RingingManager", "toggleOsloOff", 319, "RingingManager.java").v("Toggle Oslo Off");
        defpackage.tck tckVar = this.l;
        defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction", "disconnect", 83, "OsloAction.java").v("Oslo try to disconnect");
        if (tckVar.a() && tckVar.d) {
            defpackage.adsr adsrVar = tckVar.c;
            adsrVar.a(tckVar.f);
            adsrVar.a(tckVar.g);
            if (adsrVar.f == null) {
                throw new java.lang.IllegalStateException("Not connecting/connected.");
            }
            if (adsrVar.d != null) {
                try {
                    defpackage.yrk yrkVar = adsrVar.d;
                    defpackage.ylo yloVar = adsrVar.e;
                    android.os.Parcel parcelEP = yrkVar.eP();
                    yld.f(parcelEP, yloVar);
                    yrkVar.eR(2, parcelEP);
                } catch (android.os.RemoteException e) {
                    android.util.Log.e("MotionSenseConnector", "Error while disconnecting.", e);
                }
                adsrVar.d = null;
            }
            adsrVar.c.c();
            adsrVar.b.unbindService(adsrVar.a);
            adsrVar.f = null;
            tckVar.d = false;
            defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction", "disconnect", 89, "OsloAction.java").v("Oslo disconnected.");
        }
        ((onz) this.v.a).b();
        ((ogj) this.h.orElseThrow()).f();
    }

    public final boolean b() {
        return android.provider.Settings.Global.getInt(this.d.getContentResolver(), "apply_ramping_ringer", 0) == 1;
    }
}

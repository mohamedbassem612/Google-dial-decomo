package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqi implements java.util.function.Consumer {
    /* JADX WARN: Type inference failed for: r10v10, types: [aonj, java.lang.Object] */
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
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        aimp aimpVar;
        int i;
        int i2;
        java.lang.String str;
        android.media.Ringtone ringtoneA;
        aimp aimpVar2 = defpackage.tcl.b;
        java.lang.String str2 = "RingingManager.java";
        aimpVar2.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 139, "RingingManager.java").v("enter");
        java.lang.Object obj2 = ((defpackage.aprf) obj).a;
        defpackage.tcl tclVar = (defpackage.tcl) obj2;
        if (tclVar.b()) {
            tclVar.m.n(rmw.kc);
            aimpVar2.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 142, "RingingManager.java").v("ramping ringer is on, get ringtone with volumeShaper");
            if (tclVar.e == null) {
                aoin aoinVar = tclVar.g;
                i = 2;
                i2 = 0;
                float fLongValue = ((java.lang.Long) aoinVar.a()).longValue();
                long jLongValue = ((java.lang.Long) aoinVar.a()).longValue();
                aoin aoinVar2 = tclVar.f;
                tclVar.e = rs$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(new android.media.VolumeShaper.Configuration.Builder(), ((java.lang.Long) aoinVar.a()).longValue() + ((java.lang.Long) aoinVar2.a()).longValue()), new float[]{0.0f, (fLongValue / (jLongValue + ((java.lang.Long) aoinVar2.a()).longValue())) + 1.0E-6f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f}), 1));
            } else {
                i = 2;
                i2 = 0;
            }
            ogj ogjVar = tclVar.u;
            android.net.Uri uri = defpackage.tcl.a;
            android.media.VolumeShaper.Configuration configuration = tclVar.e;
            aooh.f(uri, "uri");
            aooh.f(configuration, "volumeShaperConfig");
            java.lang.Object obj3 = ogjVar.a;
            try {
                java.lang.Class clsM = rs$.ExternalSyntheticApiModelOutline0.m();
                java.lang.Class[] clsArr = new java.lang.Class[4];
                clsArr[i2] = android.content.Context.class;
                aimpVar = aimpVar2;
                try {
                    clsArr[1] = android.net.Uri.class;
                    clsArr[i] = java.lang.Integer.TYPE;
                    clsArr[3] = clsM;
                    java.lang.reflect.Method declaredMethod = android.media.RingtoneManager.class.getDeclaredMethod("getRingtone", clsArr);
                    declaredMethod.setAccessible(true);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[i2] = ((ojz) obj3).b;
                    objArr[1] = uri;
                    objArr[i] = -1;
                    objArr[3] = configuration;
                    ringtoneA = (android.media.Ringtone) declaredMethod.invoke(null, objArr);
                } catch (java.lang.Exception e) {
                    e = e;
                    a.bq(ojz.a.d(), "Failed to get ringtone with volume shaper", "com/android/dialer/externals/androidapis/media/impl/RingtoneProviderMixinImpl", "getRingtone", 'A', "RingtoneProviderMixinImpl.java", e, zct.b);
                    ringtoneA = ((ojz) obj3).a(uri);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                aimpVar = aimpVar2;
            }
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(ringtoneA);
            nzu nzuVar = new nzu(new npi(ogjVar, 17), 11);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(nzuVar.a.a(optionalOfNullable.get()));
            }
            zjv.i((zjv) ogjVar.c, mgv.ex, ajsz.aY(gus.aw(uri.toString())), (mhc) null, 0, 28);
            aooh.e(optionalOfNullable, "also(...)");
            tclVar.h = optionalOfNullable;
            str2 = "RingingManager.java";
        } else {
            aimpVar = aimpVar2;
            i = 2;
            i2 = 0;
            aimpVar.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 162, "RingingManager.java").v("ramping ringer is off, use normal ringtone");
            tclVar.h = tclVar.u.c(defpackage.tcl.a);
        }
        if (!tclVar.h.isPresent()) {
            a.bI(aimpVar.c().m(aioa.b), "Missing Ringtone", "com/android/dialer/ringing/RingingManager", "startRinging", (char) 170, str2, zct.b);
            return;
        }
        ogj ogjVar2 = (ogj) tclVar.h.orElseThrow();
        java.lang.Object objF = new mgf((mgu) ogjVar2.a, ((android.media.Ringtone) ogjVar2.b).isPlaying()).a(mgv.eC).f();
        aooh.e(objF, "ifTrue(...)");
        if (((java.lang.Boolean) objF).booleanValue()) {
            a.bI(aimpVar.d(), "Ringtone is already playing", "com/android/dialer/ringing/RingingManager", "startRinging", (char) 176, str2, zct.b);
            return;
        }
        tclVar.i = tclVar.p.a();
        if (tclVar.i.equals(defpackage.zmw.ROUTE_EARPIECE)) {
            tclVar.o.e(defpackage.zmw.ROUTE_SPEAKER);
        }
        rwi rwiVar = tclVar.q;
        int iA = rwiVar.a();
        if (iA != 1) {
            if (iA != i) {
                defpackage.tcl.b.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 192, str2).w("Ringing cancelled. Interruption filter: %d", iA);
                return;
            }
            android.app.NotificationManager.Policy policyB = rwiVar.b();
            if (policyB.priorityCallSenders != 0 || (policyB.priorityCategories & 8) == 0) {
                defpackage.tcl.b.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 208, str2).z("Ringing cancelled because of DND. priorityCategories: %d; priorityCallSenders: %d", policyB.priorityCategories, policyB.priorityCallSenders);
                return;
            }
        }
        aimpVar.b().l("com/android/dialer/ringing/RingingManager", "startRinging", 215, str2).v("play");
        ogjVar2.d();
        if ((tclVar.b() || android.provider.Settings.System.getInt(tclVar.d.getContentResolver(), "vibrate_when_ringing", i2) == 1 || tclVar.r.c() == 1) && !tclVar.j) {
            if (tclVar.k == null) {
                tclVar.k = (android.os.Vibrator) tclVar.d.getSystemService("vibrator");
            }
            aimpVar.b().l("com/android/dialer/ringing/RingingManager", "startVibration", 239, "RingingManager.java").v("Start vibration");
            rs$.ExternalSyntheticApiModelOutline0.m(tclVar.k, defpackage.tcm.a, defpackage.tcl.c);
            tclVar.j = true;
        }
        aimpVar.b().l("com/android/dialer/ringing/RingingManager", "toggleOsloOn", 314, "RingingManager.java").v("Toggle Oslo On");
        defpackage.tck tckVar = tclVar.l;
        aimw aimwVarL = defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction", "connect", 68, "OsloAction.java");
        aoin aoinVar3 = tckVar.e;
        aimwVarL.M("Oslo try to connect: enabled: %b supported: %b isConnected: %b", aoinVar3.a(), java.lang.Boolean.valueOf(tckVar.a()), java.lang.Boolean.valueOf(tckVar.d));
        if (((java.lang.Boolean) aoinVar3.a()).booleanValue() && tckVar.a() && !tckVar.d) {
            tckVar.b = j$.util.Optional.of(ogjVar2);
            defpackage.adsr adsrVar = tckVar.c;
            defpackage.sns snsVar = tckVar.i;
            if (adsrVar.f != null) {
                throw new java.lang.IllegalStateException("Already connecting/connected.");
            }
            adsrVar.f = snsVar;
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(new android.content.ComponentName("com.google.android.apps.motionsense.bridge", "com.google.android.apps.motionsense.bridge.MotionSenseBridgeService"));
                if (!adsrVar.b.bindService(intent, adsrVar.a, 1)) {
                    try {
                        str = adsrVar.b.getPackageManager().getPackageInfo("com.google.android.apps.motionsense.bridge", 0).versionName;
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        android.util.Log.e("MotionSenseConnector", "MotionSenseBridgeService not installed", e3);
                        str = null;
                    }
                    if (str == null || !str.endsWith(".stub")) {
                        defpackage.sns.n("Unable to bind to MotionSenseBridgeService");
                    } else {
                        defpackage.sns.o("Stub MotionSenseBridgeService.", "com.google.android.apps.motionsense.bridge");
                    }
                }
            } catch (java.lang.SecurityException e4) {
                android.util.Log.e("MotionSenseConnector", "Error binding to MotionSenseBridgeService", e4);
            }
            defpackage.amwp amwpVar = defpackage.tck.h;
            defpackage.adsr adsrVar2 = tckVar.c;
            adsrVar2.b(tckVar.f, 4, amwpVar);
            adsrVar2.b(tckVar.g, 7, amwpVar);
            tckVar.d = true;
            defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction", "connect", 78, "OsloAction.java").y("Oslo connected with config=%s", amwpVar.d());
        }
        ((onz) tclVar.v.a).a(new defpackage.sxq(obj2, 8));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

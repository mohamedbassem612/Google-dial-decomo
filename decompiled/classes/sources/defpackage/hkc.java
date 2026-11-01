package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class hkc extends defpackage.ahfu {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/DialerBaseApplication");

    /* JADX WARN: Code duplicated, block: B:115:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x010d A[Catch: all -> 0x03a1, PHI: r12
      0x010d: PHI (r12v4 java.lang.Object) = (r12v13 java.lang.Object), (r12v14 java.lang.Object) binds: [B:17:0x0101, B:19:0x010b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x03a1, blocks: (B:6:0x007f, B:8:0x00c3, B:9:0x00ca, B:11:0x00da, B:13:0x00e0, B:30:0x0175, B:32:0x0199, B:34:0x019f, B:37:0x01b6, B:39:0x01c8, B:40:0x01cc, B:41:0x01d5, B:43:0x01d9, B:45:0x01e0, B:49:0x0202, B:53:0x0222, B:55:0x023b, B:56:0x023f, B:59:0x0249, B:52:0x0209, B:48:0x01e9, B:60:0x0262, B:62:0x0270, B:64:0x0276, B:66:0x02c6, B:68:0x02ce, B:70:0x035d, B:72:0x0387, B:73:0x038d, B:69:0x0330, B:65:0x02b1, B:14:0x00f7, B:16:0x00fd, B:18:0x0103, B:20:0x010d, B:21:0x0129, B:23:0x012f, B:25:0x013c, B:28:0x0141, B:29:0x015d), top: B:98:0x007f, outer: #6, inners: #2, #3, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x012f A[Catch: all -> 0x03a1, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:6:0x007f, B:8:0x00c3, B:9:0x00ca, B:11:0x00da, B:13:0x00e0, B:30:0x0175, B:32:0x0199, B:34:0x019f, B:37:0x01b6, B:39:0x01c8, B:40:0x01cc, B:41:0x01d5, B:43:0x01d9, B:45:0x01e0, B:49:0x0202, B:53:0x0222, B:55:0x023b, B:56:0x023f, B:59:0x0249, B:52:0x0209, B:48:0x01e9, B:60:0x0262, B:62:0x0270, B:64:0x0276, B:66:0x02c6, B:68:0x02ce, B:70:0x035d, B:72:0x0387, B:73:0x038d, B:69:0x0330, B:65:0x02b1, B:14:0x00f7, B:16:0x00fd, B:18:0x0103, B:20:0x010d, B:21:0x0129, B:23:0x012f, B:25:0x013c, B:28:0x0141, B:29:0x015d), top: B:98:0x007f, outer: #6, inners: #2, #3, #4, #9 }] */
    @Override // defpackage.ahfu, android.app.Application
    public void onCreate() {
        java.lang.Object obj;
        defpackage.acb acbVar;
        java.lang.String str;
        java.lang.Object objA;
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1, "DialerBaseApplication_onCreate", ahouVar, true);
        try {
            ((defpackage.aimw) ((defpackage.aimw) c.b()).l("com/android/dialer/DialerBaseApplication", "onCreate", 22, "DialerBaseApplication.java")).v("onCreate");
            defpackage.uqe uqeVarCG = ((defpackage.hkb) defpackage.agab.aH(this, defpackage.hkb.class)).cG();
            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(928, "DialerStartup_executePreOnCreateTasks", ahouVar, true);
            try {
                ((defpackage.son) uqeVarCG.c.a()).a();
                defpackage.aewq.d(uqeVarCG.a);
                ((defpackage.ruc) uqeVarCG.b.a()).j(defpackage.ruc.b);
                defpackage.den.g = true;
                java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.odr(uqeVarCG.j));
                ahoqVarX2.close();
                super.onCreate();
                defpackage.uqe uqeVarCG2 = ((defpackage.hkb) defpackage.agab.aH(this, defpackage.hkb.class)).cG();
                defpackage.ahoq ahoqVarX3 = defpackage.ahvr.X(926, "DialerStartup_executePostOnCreateTasks", defpackage.ahot.a, true);
                try {
                    android.content.Context context = uqeVarCG2.a;
                    android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                    int i = 0;
                    defpackage.acc accVar = new defpackage.acc(0);
                    accVar.add("phone_incoming_call");
                    accVar.add("phone_ongoing_call");
                    accVar.add("phone_missed_call");
                    accVar.add("phone_emergency_call");
                    accVar.add("phone_low_priority");
                    accVar.add("phone_feedback");
                    accVar.add("phone_default");
                    if (!((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).ir()) {
                        accVar.addAll(defpackage.rwu.c(context));
                    }
                    java.util.Set setA = defpackage.rwn.a(context);
                    if (((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).ir()) {
                        if (!setA.containsAll(accVar)) {
                            defpackage.rwn.e(context);
                            defpackage.rwn.g(context);
                            defpackage.rwn.f(context);
                            defpackage.rwn.c(context);
                            defpackage.rwn.d(context);
                            defpackage.rwn.b(context);
                            defpackage.rwn.h(context);
                        }
                    } else if (!accVar.equals(setA)) {
                        if (defpackage.rwu.h(context, accVar, setA)) {
                            objA = defpackage.rwn.a(context);
                            if (!accVar.equals(objA)) {
                                obj = setA;
                                obj = objA;
                                obj = setA;
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.rwn.a.b()).l("com/android/dialer/notification/channel/NotificationChannelManager", "initChannels", 97, "NotificationChannelManager.java")).I("doing an expensive initialization of all notification channels, desired channel IDs: %s, existing channel IDs: %s", accVar, obj);
                                acbVar = new defpackage.acb((defpackage.acc) obj);
                                while (acbVar.hasNext()) {
                                    str = (java.lang.String) acbVar.next();
                                    if (!accVar.contains(str)) {
                                        try {
                                            da$.ExternalSyntheticApiModelOutline1.m(notificationManager, str);
                                        } catch (java.lang.SecurityException e) {
                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.rwn.a.d()).k(e)).l("com/android/dialer/notification/channel/NotificationChannelManager", "initChannels", 111, "NotificationChannelManager.java")).y("deleteObsoleteChannels failed for channel %s", str);
                                        }
                                    }
                                }
                                defpackage.rwn.e(context);
                                defpackage.rwn.g(context);
                                defpackage.rwn.f(context);
                                defpackage.rwn.c(context);
                                defpackage.rwn.d(context);
                                defpackage.rwn.b(context);
                                defpackage.rwu.d(context);
                                defpackage.rwn.h(context);
                            }
                        } else {
                            obj = setA;
                            obj = objA;
                            obj = setA;
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.rwn.a.b()).l("com/android/dialer/notification/channel/NotificationChannelManager", "initChannels", 97, "NotificationChannelManager.java")).I("doing an expensive initialization of all notification channels, desired channel IDs: %s, existing channel IDs: %s", accVar, obj);
                            acbVar = new defpackage.acb((defpackage.acc) obj);
                            while (acbVar.hasNext()) {
                                str = (java.lang.String) acbVar.next();
                                if (!accVar.contains(str)) {
                                    da$.ExternalSyntheticApiModelOutline1.m(notificationManager, str);
                                }
                            }
                            defpackage.rwn.e(context);
                            defpackage.rwn.g(context);
                            defpackage.rwn.f(context);
                            defpackage.rwn.c(context);
                            defpackage.rwn.d(context);
                            defpackage.rwn.b(context);
                            defpackage.rwu.d(context);
                            defpackage.rwn.h(context);
                        }
                    }
                    obj = setA;
                    obj = objA;
                    ((defpackage.son) ((defpackage.apnt) uqeVarCG2.d.a()).a).b();
                    defpackage.rtx rtxVar = uqeVarCG2.n;
                    if (((java.lang.Boolean) rtxVar.c.a()).booleanValue() && defpackage.ttj.P()) {
                        java.lang.Long l = (java.lang.Long) rtxVar.d.a();
                        if (l.longValue() <= 0) {
                            defpackage.aimw aimwVar = (defpackage.aimw) defpackage.rtx.a.d().l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "initialize", 78, "DialerMemoryBudgetInitializer.kt");
                            if (l == null) {
                                defpackage.aooh.g();
                                l = null;
                            }
                            aimwVar.x("Invalid Terrarium memory budget MB value: %d", l.longValue());
                        } else if (!rtxVar.e) {
                            rtxVar.e = true;
                            long jLongValue = l.longValue() << 20;
                            try {
                                rtxVar.b.a(rtxVar.f);
                            } catch (java.lang.RuntimeException e2) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.rtx.a.d()).k(e2).l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "initialize", 93, "DialerMemoryBudgetInitializer.kt")).v("Failed to register Terrarium process over-budget listener");
                            }
                            try {
                                rtxVar.b.b(jLongValue);
                            } catch (java.lang.RuntimeException e3) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.rtx.a.d()).k(e3).l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "initialize", 98, "DialerMemoryBudgetInitializer.kt")).v("Failed to apply Terrarium package memory budget");
                            }
                            try {
                                rtxVar.b.c(jLongValue);
                                defpackage.aimw aimwVar2 = (defpackage.aimw) defpackage.rtx.a.b().l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "initialize", 104, "DialerMemoryBudgetInitializer.kt");
                                if (l == null) {
                                    defpackage.aooh.g();
                                    l = null;
                                }
                                aimwVar2.D("Initialized Terrarium memory budget: %d MB (%d bytes) for package and process", l.longValue(), jLongValue);
                            } catch (java.lang.RuntimeException e4) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.rtx.a.d()).k(e4).l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "initialize", 110, "DialerMemoryBudgetInitializer.kt")).v("Failed to apply Terrarium process memory budget");
                            }
                        }
                    }
                    if (!((java.lang.Boolean) uqeVarCG2.m.a()).booleanValue() || android.os.Build.VERSION.SDK_INT < 35) {
                        uqeVarCG2.o.i(null).b(defpackage.mce.APP_ON_CREATE);
                        defpackage.mni.cx(new sxq(uqeVarCG2.k, 20));
                    } else {
                        defpackage.uqh uqhVar = uqeVarCG2.l;
                        defpackage.ajcq ajcqVarF = defpackage.aosv.F(uqhVar.c, 0, new defpackage.unj(uqhVar, (defpackage.aoln) null, 4), 3);
                        defpackage.jyx jyxVar = new defpackage.jyx(uqeVarCG2, 12);
                        defpackage.ajct ajctVar = uqeVarCG2.i;
                        long j = defpackage.ahqx.a;
                        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
                        int i2 = defpackage.ajan.c;
                        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarF, ahqvVar);
                        ajcqVarF.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
                        defpackage.agsm.i(927, ajamVar, "Failed to process start reason", new java.lang.Object[0]);
                    }
                    android.content.Context context2 = uqeVarCG2.a;
                    if (defpackage.abyl.h(context2)) {
                        defpackage.ddv ddvVar = new defpackage.ddv(uqeVarCG2, 16);
                        defpackage.ajct ajctVar2 = uqeVarCG2.i;
                        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(ddvVar), null));
                        ajctVar2.execute(ajdkVar);
                        defpackage.agsm.i(931, ajdkVar, "Failed to log impression CALL_SCREEN_INIT_AT_STARTUP", new java.lang.Object[0]);
                        defpackage.aoin aoinVar = uqeVarCG2.g;
                        j$.util.Objects.requireNonNull(aoinVar);
                        defpackage.guy guyVar = new defpackage.guy(aoinVar, 18);
                        defpackage.ajct ajctVar3 = uqeVarCG2.h;
                        defpackage.ajdk ajdkVar2 = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
                        ajctVar3.execute(ajdkVar2);
                        defpackage.agsm.d("com/android/dialer/startup/DialerStartup", "kickOffBackgroundTasks", 218, defpackage.ahrv.g(ajdkVar2).i(new defpackage.uqd(i), defpackage.ajbm.INSTANCE), defpackage.zct.b, "could not initialize CallScreenCoordinator", new java.lang.Object[0]);
                    } else {
                        ((defpackage.lpe) uqeVarCG2.f.a()).a();
                        sxq sxqVar = new sxq(uqeVarCG2, 19);
                        defpackage.ajct ajctVar4 = uqeVarCG2.i;
                        defpackage.ajdk ajdkVar3 = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(sxqVar), null));
                        ajctVar4.execute(ajdkVar3);
                        defpackage.agsm.i(929, ajdkVar3, "Failed to log impression CALL_SCREEN_INIT_AT_STARTUP_SKIPPED_FOR_DIRECT_BOOT", new java.lang.Object[0]);
                    }
                    defpackage.ddv ddvVar2 = new defpackage.ddv(uqeVarCG2, 17);
                    defpackage.ajct ajctVar5 = uqeVarCG2.i;
                    defpackage.ajdk ajdkVar4 = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(ddvVar2), null));
                    ajctVar5.execute(ajdkVar4);
                    defpackage.agsm.i(930, ajdkVar4, "Failed to log impression APP_LAUNCHED", new java.lang.Object[0]);
                    if (!uqeVarCG2.p.m()) {
                        defpackage.ufa.d(context2);
                        defpackage.tvm.a(context2);
                    }
                    ((defpackage.ruc) uqeVarCG2.b.a()).m(defpackage.ruc.b);
                    ahoqVarX3.close();
                    ahoqVarX.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX3.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarX2.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (java.lang.Throwable th5) {
            try {
                ahoqVarX.close();
                throw th5;
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }
}

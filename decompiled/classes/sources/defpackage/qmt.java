package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qmt implements defpackage.zpu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier");
    static final defpackage.aenj b = new defpackage.aenj("StatusBarNotifier.incomingCallFirstModelProduction");
    static final defpackage.aenj c = new defpackage.aenj("StatusBarNotifier.outgoingCallFirstModelProduction");
    static final defpackage.aenj d = new defpackage.aenj("StatusBarNotifier.screeningCallFirstModelProduction");
    public final defpackage.gpd B;
    public final defpackage.ipc C;
    private final java.util.concurrent.Executor D;
    private final defpackage.ajct E;
    private final defpackage.aoin F;
    private final qkj G;
    private final defpackage.zzx H;
    public final android.content.Context e;
    public final defpackage.ajcu f;
    public final qmm j;
    public final defpackage.ruc k;
    public final defpackage.aoin m;
    public final defpackage.rlv n;
    public final defpackage.aoin s;
    public final defpackage.aoin t;
    public final defpackage.qkl u;
    public final defpackage.zpm w;
    public final defpackage.zpy x;
    public final defpackage.zpz y;
    public final defpackage.zjm z;
    public final defpackage.ahda A = new defpackage.ahda();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicReference l = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.concurrent.atomic.AtomicReference o = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public j$.util.Optional p = j$.util.Optional.empty();
    public j$.util.Optional q = j$.util.Optional.empty();
    public long r = 0;
    public final java.util.concurrent.atomic.AtomicInteger v = new java.util.concurrent.atomic.AtomicInteger(0);

    public qmt(android.content.Context context, defpackage.zpm zpmVar, defpackage.zpy zpyVar, defpackage.ajcu ajcuVar, defpackage.ajct ajctVar, defpackage.zzx zzxVar, qkj qkjVar, defpackage.ipc ipcVar, qmm qmmVar, defpackage.ruc rucVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zpz zpzVar, defpackage.rlv rlvVar, defpackage.gpd gpdVar, defpackage.zjm zjmVar, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.qkl qklVar) {
        this.e = context;
        this.w = zpmVar;
        this.x = zpyVar;
        this.D = new defpackage.ajdc(ajcuVar);
        this.f = ajcuVar;
        this.E = ajctVar;
        this.H = zzxVar;
        this.G = qkjVar;
        this.C = ipcVar;
        this.j = qmmVar;
        this.k = rucVar;
        this.m = aoinVar;
        this.F = aoinVar2;
        this.y = zpzVar;
        this.n = rlvVar;
        this.B = gpdVar;
        this.z = zjmVar;
        this.s = aoinVar3;
        this.t = aoinVar4;
        this.u = qklVar;
    }

    public static final boolean j(qjd qjdVar) {
        return qjdVar.u instanceof qip;
    }

    public static final boolean k(qjd qjdVar) {
        qip qipVar = qjdVar.u;
        j$.util.Objects.requireNonNull(qipVar);
        j$.util.Objects.checkIndex(0, 2);
        return qipVar != null && (qipVar instanceof qip);
    }

    public static final boolean l(qjd qjdVar) {
        return qjdVar.u instanceof qja;
    }

    private final defpackage.ajcq m() {
        defpackage.ajcq ajcqVarBI;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(622, "StatusBarNotifier_getModel");
        try {
            hkl hklVar = (hkl) this.x.a().orElse((java.lang.Object) null);
            qjd qjdVar = (qjd) this.p.orElse((java.lang.Object) null);
            this.r = android.os.SystemClock.elapsedRealtime();
            if (hklVar == null) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getModel", 462, "StatusBarNotifier.java")).y("PrimaryCallGraph present: false; model already present: %b", java.lang.Boolean.valueOf(qjdVar != null));
                ajcqVarBI = defpackage.aiql.z(j$.util.Optional.empty());
                ahoqVarW.a(ajcqVarBI);
            } else {
                defpackage.aimz aimzVar = a;
                if (qjdVar == null) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getModel", 468, "StatusBarNotifier.java")).v("Retrieving StatusBarNotificationModel when the existing model is not present.");
                    this.l.set(this.k.a());
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getModel", 475, "StatusBarNotifier.java")).v("PrimaryCallGraph present: true; model already present: true");
                }
                ajcqVarBI = ((qms) defpackage.aooc.ar(hklVar, qms.class)).bI();
                ahoqVarW.a(ajcqVarBI);
            }
            ahoqVarW.close();
            return defpackage.ahvr.I(ajcqVarBI, new qmq(this), this.D);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zpu
    public final void a() {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(623, "StatusBarNotifier_onCallGraphUpdated");
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.o;
            j$.util.Optional optional = (j$.util.Optional) atomicReference.get();
            j$.util.Optional optionalH = this.w.h();
            qmp qmpVar = new qmp(this, 1);
            if (true == optionalH.isPresent()) {
                ((defpackage.qmt) qmpVar.a).o.set(j$.util.Optional.of(((apqr) optionalH.get()).b));
            }
            j$.util.Optional optional2 = (j$.util.Optional) atomicReference.get();
            if (!optional2.equals(optional)) {
                qmp qmpVar2 = new qmp(this, 2);
                if (true == optional2.isPresent()) {
                    j$.util.Optional optionalH2 = ((defpackage.qmt) qmpVar2.a).h((java.lang.String) optional2.get());
                    if (true == optionalH2.isPresent()) {
                        qko qkoVar = (qko) optionalH2.get();
                        java.util.concurrent.atomic.AtomicReference atomicReference2 = qkoVar.h;
                        if (!((j$.util.Optional) atomicReference2.get()).isPresent()) {
                            atomicReference2.set(j$.util.Optional.of(qkoVar.l.schedule(new qfe(qkoVar, 7), ((java.lang.Long) qkoVar.j.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS)));
                        }
                    }
                }
            }
            defpackage.aimz aimzVar = a;
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "onCallGraphUpdated", 228, "StatusBarNotifier.java");
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.g;
            aimwVar.y("updateInProgress: %b", java.lang.Boolean.valueOf(atomicBoolean.get()));
            if (atomicBoolean.getAndSet(true)) {
                this.h.set(true);
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "onCallGraphUpdated", 232, "StatusBarNotifier.java")).v("Setting updatedQueued to true");
            } else {
                defpackage.aoin aoinVar = this.m;
                defpackage.ajcq ajcqVarG = ((java.lang.Long) aoinVar.a()).longValue() > 0 ? defpackage.aiql.G(m(), ((java.lang.Long) aoinVar.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f) : m();
                ahoqVarW.a(ajcqVarG);
                defpackage.ahvr.J(ajcqVarG, new kxt(this, 15), this.f);
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b6  */
    public final android.app.Notification.Action b(qib qibVar) {
        j$.util.Optional optionalA;
        android.graphics.drawable.Icon iconCreateWithResource = android.graphics.drawable.Icon.createWithResource(this.e, qibVar.e);
        android.text.SpannableString spannableString = new android.text.SpannableString(qibVar.c);
        qjd qjdVar = (qjd) this.p.orElseThrow();
        boolean z = !(qjdVar.u instanceof qjf) && android.os.Build.VERSION.SDK_INT >= 31;
        boolean zIsPresent = qjdVar.c().isPresent();
        if (z || zIsPresent) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getActionButtonSpanColor", 864, "StatusBarNotifier.java")).I("Button-style actions should be shown in the call notification because either usingCallStyle or hasFullScreenIntent is true.\nFor action button %s, using 'background color' %s", qibVar.a, qibVar.a());
            optionalA = qibVar.a();
        } else {
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qibVar.d);
            defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
            java.lang.Integer num = (java.lang.Integer) optionalOfNullable.orElse((java.lang.Object) null);
            if (num == null) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getActionButtonSpanColor", 897, "StatusBarNotifier.java")).y("Not using action button text color for action %s because no color was specified.", qibVar.a);
                optionalA = j$.util.Optional.empty();
            } else if (qjdVar.l) {
                int iIntValue = num.intValue();
                int i = qjdVar.k;
                double dA = defpackage.dwm.a(iIntValue, i);
                defpackage.aimz aimzVar = a;
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "hasMinimumContrast", 905, "StatusBarNotifier.java");
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                java.lang.Double dValueOf = java.lang.Double.valueOf(dA);
                defpackage.aoin aoinVar = this.F;
                aimwVar.N("Contrast ratio between foreground (%s) and background (%s): %s. Minimum contrast: %s", num, numValueOf, dValueOf, aoinVar.a());
                if (defpackage.dwm.a(iIntValue, i) < ((java.lang.Double) aoinVar.a()).doubleValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getActionButtonSpanColor", 884, "StatusBarNotifier.java")).y("Not using action button text color for action %s because notification background is colorized and there is not enough contrast between the text color and the background.", qibVar.a);
                    optionalA = j$.util.Optional.empty();
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getActionButtonSpanColor", 891, "StatusBarNotifier.java")).I("For action button %s, using 'text color' %s", qibVar.a, j$.util.Optional.of(num));
                    optionalA = j$.util.Optional.of(num);
                }
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "getActionButtonSpanColor", 891, "StatusBarNotifier.java")).I("For action button %s, using 'text color' %s", qibVar.a, j$.util.Optional.of(num));
                optionalA = j$.util.Optional.of(num);
            }
        }
        java.lang.Integer num2 = (java.lang.Integer) optionalA.orElse((java.lang.Object) null);
        if (num2 != null) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 0);
        }
        boolean z2 = qibVar.f;
        qkj qkjVar = this.G;
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCreateWithResource, spannableString, z2 ? qkjVar.b(qibVar.a, ((qjd) this.p.orElseThrow()).b) : qkjVar.a(qibVar.a, ((qjd) this.p.orElseThrow()).b));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("priority", qibVar.a.I);
        builder.addExtras(bundle);
        if (((qjd) this.p.orElseThrow()).y) {
            j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(qibVar.g);
            defpackage.aooh.e(optionalOfNullable2, "ofNullable(...)");
            j$.util.Objects.requireNonNull(builder);
            qbf qbfVar = new qbf(builder, 18);
            if (true == optionalOfNullable2.isPresent()) {
                ft$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Action.Builder) qbfVar.a, ((java.lang.Integer) optionalOfNullable2.get()).intValue());
            }
        }
        return builder.build();
    }

    public final qib c(qid qidVar) {
        android.content.Context context = this.e;
        int iC = defpackage.urg.c(context, 2130969017);
        qif qifVar = new qif();
        qifVar.e(qidVar);
        qifVar.d(qic.a);
        qifVar.c(context.getString(2132019490));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
        qifVar.h(j$.util.Optional.of(numValueOf));
        qifVar.g(j$.util.Optional.of(numValueOf));
        qifVar.b(2131232042);
        qifVar.f(true);
        return qifVar.a();
    }

    public final qib d(qid qidVar) {
        android.content.Context context = this.e;
        int iC = defpackage.urg.c(context, 2130969021);
        qif qifVar = new qif();
        qifVar.e(qidVar);
        qifVar.d(qic.a);
        qifVar.c(context.getString(2132019494));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
        qifVar.h(j$.util.Optional.of(numValueOf));
        qifVar.g(j$.util.Optional.of(numValueOf));
        qifVar.b(2131232016);
        qifVar.f(false);
        return qifVar.a();
    }

    public final defpackage.zas e() {
        return this.B.i((java.lang.String) ((j$.util.Optional) this.o.get()).orElse((java.lang.Object) null));
    }

    public final defpackage.ajcq f(android.app.Notification.Builder builder) {
        defpackage.ajcq ajcqVarI;
        defpackage.aimz aimzVar;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(624, "StatusBarNotifier.startNotification");
        try {
            android.telecom.InCallService inCallService = (android.telecom.InCallService) this.H.d().orElse((java.lang.Object) null);
            if (inCallService == null) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "startNotification", 696, "StatusBarNotifier.java")).v("inCallService is empty when starting notification");
                ajcqVarI = defpackage.ajcm.a;
            } else {
                qjd qjdVar = (qjd) this.p.orElseThrow();
                j$.util.Optional optional = this.p;
                qmp qmpVar = new qmp(this, 8);
                if (true == optional.isPresent()) {
                    java.lang.Object obj = optional.get();
                    java.lang.Object obj2 = qmpVar.a;
                    qjd qjdVar2 = (qjd) obj;
                    if (j(qjdVar2)) {
                        j$.util.Optional optionalE = ((defpackage.qmt) obj2).w.e(qjdVar2.b);
                        if (true == optionalE.isPresent()) {
                            qax qaxVarAh = ((qmr) ((apqr) optionalE.get()).a(qmr.class)).ah();
                            qaxVarAh.d.isPresent();
                            if (qaxVarAh.r == -1) {
                                defpackage.aazc aazcVar = qaxVarAh.A;
                                qaxVarAh.r = android.os.SystemClock.elapsedRealtime();
                            }
                        }
                    }
                }
                j$.util.Optional optionalBj = this.C.bj(qjdVar);
                qbf qbfVar = new qbf(qjdVar, 19);
                if (true == optionalBj.isPresent()) {
                    qko qkoVar = (qko) optionalBj.get();
                    qit qitVar = ((qjd) qbfVar.a).a;
                    defpackage.aimz aimzVar2 = qko.a;
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onNotificationModelShown", 177, "StatusBarNotificationController.java")).y("Notification model shown: %s", qitVar.name());
                    if (qkoVar.f.getAndSet(true)) {
                        aimzVar = aimzVar2;
                    } else {
                        qkoVar.r.a(defpackage.qbc.STATUS_BAR_NOTIFICATION_SHOWED);
                        qax qaxVar = qkoVar.m;
                        aimzVar = aimzVar2;
                        if (qaxVar.m == -1) {
                            defpackage.aazc aazcVar2 = qaxVar.A;
                            qaxVar.m = android.os.SystemClock.elapsedRealtime();
                        }
                    }
                    defpackage.aoin aoinVar = (defpackage.aoin) qkoVar.d.get(qitVar);
                    if (aoinVar == null) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onNotificationModelShown", 188, "StatusBarNotificationController.java")).y("Notification model shown listener for %s is not provided", qitVar.name());
                    } else {
                        ((qjc) aoinVar.a()).a();
                    }
                }
                if (k(qjdVar) && this.w.a().size() == 1) {
                    this.k.m(defpackage.ruc.aG);
                } else {
                    this.k.b(defpackage.ruc.aG);
                }
                defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(621, "StatusBarNotifier.buildNotification");
                try {
                    j$.util.Objects.requireNonNull(builder);
                    defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new qfe(builder, 8), this.E);
                    ahoqVarW2.a(ajcqVarF);
                    ahoqVarW2.close();
                    ajcqVarI = defpackage.ahvr.I(ajcqVarF, new phd(this, inCallService, 10, (byte[]) null), this.f);
                    ahoqVarW.a(ajcqVarI);
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW2.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            ahoqVarW.close();
            return ajcqVarI;
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarW.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final defpackage.ajcq g() {
        defpackage.ajcq ajcqVarG;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(625, "StatusBarNotifier.stopNotification");
        try {
            android.telecom.InCallService inCallService = (android.telecom.InCallService) this.H.d().orElse((java.lang.Object) null);
            defpackage.aimz aimzVar = a;
            if (inCallService == null) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "stopNotification", 752, "StatusBarNotifier.java")).v("inCallService is empty when stopping notification");
                ajcqVarG = defpackage.ajcm.a;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "stopNotification", 756, "StatusBarNotifier.java")).v("notification stopped");
                ajcqVarG = this.A.g(new qfb(this, inCallService, 3, (byte[]) null), this.f);
                ahoqVarW.a(ajcqVarG);
            }
            ahoqVarW.close();
            return ajcqVarG;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final j$.util.Optional h(java.lang.String str) {
        j$.util.Optional optionalE = this.w.e(str);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((qmr) ((apqr) optionalE.get()).a(qmr.class)).al()) : optionalE;
    }

    public final void i(android.app.Notification.Builder builder) {
        qiy qiyVar = ((qjd) this.p.orElseThrow()).h;
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qiyVar.b);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        j$.util.Objects.requireNonNull(builder);
        qmp qmpVar = new qmp(builder, 0);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            ((android.app.Notification.Builder) qmpVar.a).setWhen(((java.lang.Long) obj).longValue());
        }
        builder.setUsesChronometer(qiyVar.a);
    }
}

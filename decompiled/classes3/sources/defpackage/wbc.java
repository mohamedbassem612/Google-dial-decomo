package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbc {
    public static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver");
    public final aoss b;
    public final defpackage.znj c;
    public final defpackage.znq d;
    public final apdp e;
    private final defpackage.wbn f;
    private final defpackage.way g;
    private defpackage.wbd h;
    private final apni i;

    public wbc(defpackage.wbn wbnVar, aoss aossVar, apni apniVar, defpackage.way wayVar) {
        aooh.f(wbnVar, "echoPhoneRingingController");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        this.f = wbnVar;
        this.b = aossVar;
        this.i = apniVar;
        this.g = wayVar;
        this.e = new apdp();
        this.c = new nbx(this, 4);
        this.d = new defpackage.rez(this, 3);
        this.h = defpackage.wbd.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(defpackage.wbe wbeVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.waz wazVar;
        defpackage.wbe wbeVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.waz) {
            wazVar = (defpackage.waz) aolnVar;
            int i = wazVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wazVar.d = i - Integer.MIN_VALUE;
            } else {
                wazVar = new defpackage.waz(this, aolnVar);
            }
        } else {
            wazVar = new defpackage.waz(this, aolnVar);
        }
        java.lang.Object obj = wazVar.b;
        aolu aoluVar = aolu.a;
        int i2 = wazVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                a.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "onReceiveEchoPhoneEvent", 46, "EchoPhoneLifecycleDriver.kt").y("Received EchoPhoneEvent: %s", wbeVar);
                apdp apdpVar3 = this.e;
                wazVar.a = wbeVar;
                wazVar.e = apdpVar3;
                wazVar.d = 1;
                if (apdpVar3.b(wazVar) == aoluVar) {
                    return aoluVar;
                }
                wbeVar2 = wbeVar;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (apdp) wazVar.a;
                    try {
                        aooc.af(obj);
                        apdpVar2.d();
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = wazVar.e;
                wbeVar2 = (defpackage.wbe) wazVar.a;
                aooc.af(obj);
            }
            aimz aimzVar = a;
            aimzVar.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "onReceiveEchoPhoneEvent$<anonymous>", 50, "EchoPhoneLifecycleDriver.kt").y("Processing Echo Phone event. Current lifecycle state: %s", this.h);
            int iOrdinal = wbeVar2.ordinal();
            if (iOrdinal == 0) {
                d(defpackage.wbd.b);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw new aois();
                            }
                            if (this.g.b() && this.h == defpackage.wbd.c) {
                                apni apniVar = this.i;
                                aimz aimzVar2 = zih.a;
                                apniVar.i(aoov.al(this.b, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, this, 9, (byte[]) null)));
                            } else {
                                aimzVar.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "onReceiveEchoPhoneEvent$<anonymous>", 79, "EchoPhoneLifecycleDriver.kt").v("Echo is not ringing and cannot be stopped.");
                            }
                        } else if (this.g.b()) {
                            d(defpackage.wbd.e);
                        }
                    } else if (this.g.b() && this.h == defpackage.wbd.c) {
                        d(defpackage.wbd.b);
                    }
                } else if (this.g.b() && this.h == defpackage.wbd.b) {
                    d(defpackage.wbd.c);
                }
            } else if (this.h != defpackage.wbd.b) {
                aimzVar.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "onReceiveEchoPhoneEvent$<anonymous>", 57, "EchoPhoneLifecycleDriver.kt").v("Echo is not eligible on Phone yet; Echo should not be initiated.");
            } else {
                if (this.g.b()) {
                    aimzVar.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "onReceiveEchoPhoneEvent$<anonymous>", 62, "EchoPhoneLifecycleDriver.kt").v("Initiating Echo ringing.");
                    apni apniVar2 = this.i;
                    aimz aimzVar3 = zih.a;
                    apniVar2.i(aoov.al(this.b, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, this, 8)));
                    aojh aojhVar = aojh.a;
                    apdpVar.d();
                    return aojhVar;
                }
                d(defpackage.wbd.c);
                wazVar.a = apdpVar;
                wazVar.e = null;
                wazVar.d = 2;
                if (b(wazVar) == aoluVar) {
                    return aoluVar;
                }
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.wba wbaVar;
        if (aolnVar instanceof defpackage.wba) {
            wbaVar = (defpackage.wba) aolnVar;
            int i = wbaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbaVar.c = i - Integer.MIN_VALUE;
            } else {
                wbaVar = new defpackage.wba(this, aolnVar);
            }
        } else {
            wbaVar = new defpackage.wba(this, aolnVar);
        }
        java.lang.Object objB = wbaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aojh.a;
        }
        aooc.af(objB);
        defpackage.wbn wbnVar = this.f;
        wbaVar.c = 1;
        objB = wbnVar.b(wbaVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objB).booleanValue()) {
            defpackage.wbn wbnVar2 = this.f;
            wbaVar.c = 2;
            if (wbnVar2.c(wbaVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.wbb wbbVar;
        if (aolnVar instanceof defpackage.wbb) {
            wbbVar = (defpackage.wbb) aolnVar;
            int i = wbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbbVar.c = i - Integer.MIN_VALUE;
            } else {
                wbbVar = new defpackage.wbb(this, aolnVar);
            }
        } else {
            wbbVar = new defpackage.wbb(this, aolnVar);
        }
        java.lang.Object objB = wbbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aojh.a;
        }
        aooc.af(objB);
        defpackage.wbn wbnVar = this.f;
        wbbVar.c = 1;
        objB = wbnVar.b(wbbVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objB).booleanValue()) {
            defpackage.wbn wbnVar2 = this.f;
            wbbVar.c = 2;
            if (wbnVar2.d(wbbVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final void d(defpackage.wbd wbdVar) {
        a.b().l("com/android/dialer/wear/echo/impl/lifecycledriver/EchoPhoneLifecycleDriver", "updateLifecycleState", 133, "EchoPhoneLifecycleDriver.kt").I("Updating Echo lifecycle state from: %s, to: %s", this.h, wbdVar);
        this.h = wbdVar;
    }
}

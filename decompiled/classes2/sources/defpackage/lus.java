package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lus implements zno, zoi, defpackage.luc {
    private static final aimz d = aimz.i("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController");
    public final defpackage.lug a;
    public final aoin b;
    public boolean c;
    private final aoss e;
    private final aoin f;
    private final ahda g;
    private final afpl h;

    public lus(aoss aossVar, defpackage.lug lugVar, afpl afplVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(lugVar, "remote");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aoinVar, "enableCallForwardDebug");
        this.e = aossVar;
        this.a = lugVar;
        this.h = afplVar;
        this.f = aoinVar;
        this.b = aoinVar2;
        this.g = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.luo luoVar;
        if (aolnVar instanceof defpackage.luo) {
            luoVar = (defpackage.luo) aolnVar;
            int i = luoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                luoVar.c = i - Integer.MIN_VALUE;
            } else {
                luoVar = new defpackage.luo(this, aolnVar);
            }
        } else {
            luoVar = new defpackage.luo(this, aolnVar);
        }
        java.lang.Object objD = luoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = luoVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.h.X();
        luoVar.c = 1;
        objD = aosv.D(ajcqVarX, luoVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAj = ((defpackage.lun) aooc.ar(objD, defpackage.lun.class)).aj();
        luoVar.c = 2;
        objD = aosv.D(ajcqVarAj, luoVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.lup lupVar;
        if (aolnVar instanceof defpackage.lup) {
            lupVar = (defpackage.lup) aolnVar;
            int i = lupVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lupVar.c = i - Integer.MIN_VALUE;
            } else {
                lupVar = new defpackage.lup(this, aolnVar);
            }
        } else {
            lupVar = new defpackage.lup(this, aolnVar);
        }
        java.lang.Object objD = lupVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lupVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.h.X();
        lupVar.c = 1;
        objD = aosv.D(ajcqVarX, lupVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAW = ((defpackage.lun) aooc.ar(objD, defpackage.lun.class)).aW();
        lupVar.c = 2;
        objD = aosv.D(ajcqVarAW, lupVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.luq luqVar;
        if (aolnVar instanceof defpackage.luq) {
            luqVar = (defpackage.luq) aolnVar;
            int i = luqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                luqVar.c = i - Integer.MIN_VALUE;
            } else {
                luqVar = new defpackage.luq(this, aolnVar);
            }
        } else {
            luqVar = new defpackage.luq(this, aolnVar);
        }
        java.lang.Object objB = luqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = luqVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            d.b().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onChallengeEvent", 103, "ContactCheckerSenderController.kt").v("Send the verification message to the callee");
            defpackage.lug lugVar = this.a;
            defpackage.oq oqVarCO = mni.cO(defpackage.ltu.a.m());
            defpackage.oq oqVarCN = mni.cN(defpackage.luj.a.m());
            oqVarCN.n(defpackage.lui.VERIFIED);
            oqVarCO.p(oqVarCN.m());
            defpackage.ltu ltuVarO = oqVarCO.o();
            luqVar.c = 1;
            objB = lugVar.b(ltuVarO, luqVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        if (((zfm) objB) == zfm.a) {
            d.b().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onChallengeEvent", 111, "ContactCheckerSenderController.kt").v("the verification message is successfully delivered");
        }
        return aojh.a;
    }

    public final void eh() {
        ahvr.ag(this.e, this.g, new defpackage.lve(this, (aoln) null, 1));
    }

    public final ajcq em() {
        return aosv.C(ahvr.ag(this.e, this.g, new defpackage.ksy(this, (aoln) null, 20)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.luc
    public final java.lang.Object k(defpackage.ltu ltuVar, aoln aolnVar) throws aois {
        defpackage.lur lurVar;
        defpackage.ltu ltuVar2;
        java.lang.String str;
        int iBW;
        int i;
        if (aolnVar instanceof defpackage.lur) {
            lurVar = (defpackage.lur) aolnVar;
            int i2 = lurVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lurVar.c = i2 - Integer.MIN_VALUE;
            } else {
                lurVar = new defpackage.lur(this, aolnVar);
            }
        } else {
            lurVar = new defpackage.lur(this, aolnVar);
        }
        java.lang.Object objB = lurVar.a;
        aolu aoluVar = aolu.a;
        int i3 = lurVar.c;
        if (i3 == 0) {
            aooc.af(objB);
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                lurVar.d = ltuVar;
                lurVar.c = 1;
                objB = b(lurVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            } else {
                iBW = mni.bW(ltuVar.b);
                if (iBW == 0) {
                    throw null;
                }
                i = iBW - 1;
                if (i == 0) {
                    d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 95, "ContactCheckerSenderController.kt").v("Ignore the verification message in the sender side");
                } else if (i == 1) {
                    lurVar.d = null;
                    lurVar.e = null;
                    lurVar.c = 3;
                    if (e(lurVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i != 2) {
                        throw new aois();
                    }
                    d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 98, "ContactCheckerSenderController.kt").v("can't identify the type of an incoming message");
                }
            }
            return aojh.a;
        }
        if (i3 == 1) {
            ltuVar = lurVar.d;
            aooc.af(objB);
        } else if (i3 == 2) {
            str = lurVar.e;
            ltuVar2 = lurVar.d;
            aooc.af(objB);
            d.b().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 84, "ContactCheckerSenderController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str, (java.lang.String) objB);
            ltuVar = ltuVar2;
            iBW = mni.bW(ltuVar.b);
            if (iBW == 0) {
                throw null;
            }
            i = iBW - 1;
            if (i == 0) {
                d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 95, "ContactCheckerSenderController.kt").v("Ignore the verification message in the sender side");
            } else if (i == 1) {
                lurVar.d = null;
                lurVar.e = null;
                lurVar.c = 3;
                if (e(lurVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 2) {
                    throw new aois();
                }
                d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 98, "ContactCheckerSenderController.kt").v("can't identify the type of an incoming message");
            }
        } else {
            if (i3 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        return aojh.a;
        java.lang.String str2 = (java.lang.String) objB;
        lurVar.d = ltuVar;
        lurVar.e = str2;
        lurVar.c = 2;
        java.lang.Object objD = d(lurVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ltuVar2 = ltuVar;
        str = str2;
        objB = objD;
        d.b().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 84, "ContactCheckerSenderController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str, (java.lang.String) objB);
        ltuVar = ltuVar2;
        iBW = mni.bW(ltuVar.b);
        if (iBW == 0) {
            throw null;
        }
        i = iBW - 1;
        if (i == 0) {
            d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 95, "ContactCheckerSenderController.kt").v("Ignore the verification message in the sender side");
        } else if (i == 1) {
            lurVar.d = null;
            lurVar.e = null;
            lurVar.c = 3;
            if (e(lurVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i != 2) {
                throw new aois();
            }
            d.d().l("com/android/dialer/contactchecker/sender/impl/service/ContactCheckerSenderController", "onRemoteEvent", 98, "ContactCheckerSenderController.kt").v("can't identify the type of an incoming message");
        }
        return aojh.a;
    }
}

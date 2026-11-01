package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oga implements znv, znu, defpackage.ogq, znr {
    private static final aimz m = aimz.i("com/android/dialer/expresso/receiver/impl/service/SmsReceiver");
    public final defpackage.ofq a;
    public final defpackage.ogu b;
    public final defpackage.oft c;
    public final long d;
    public boolean e;
    public final qbe f;
    public final zpm g;
    public final defpackage.lyo h;
    public final zjm i;
    public final pgi j;
    public final defpackage.heq k;
    public final rsr l;
    private final aoss n;
    private final ahda o;
    private final ahda p;
    private final apni q;
    private final afpl r;

    public oga(android.content.Context context, defpackage.ofq ofqVar, aoss aossVar, aoss aossVar2, apni apniVar, defpackage.lyo lyoVar, qbe qbeVar, defpackage.ogu oguVar, afpl afplVar, defpackage.oft oftVar, pgi pgiVar, long j, rsr rsrVar, zjm zjmVar, java.lang.String str, zpz zpzVar, zpm zpmVar, pez pezVar, defpackage.heq heqVar) {
        aooh.f(context, "appContext");
        aooh.f(ofqVar, "expressoReceiverPreconditions");
        aooh.f(aossVar, "blockingScope");
        aooh.f(aossVar2, "lwScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(lyoVar, "simpleSmsDecodeResultCache");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(oguVar, "remote");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(oftVar, "ringtoneController");
        aooh.f(str, "uniqueCallId");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(zpmVar, "callScopes");
        aooh.f(pezVar, "missedCallNotifier");
        aooh.f(heqVar, "lastCallsCache");
        this.a = ofqVar;
        this.n = aossVar2;
        this.q = apniVar;
        this.h = lyoVar;
        this.f = qbeVar;
        this.b = oguVar;
        this.r = afplVar;
        this.c = oftVar;
        this.j = pgiVar;
        this.d = j;
        this.l = rsrVar;
        this.i = zjmVar;
        this.g = zpmVar;
        this.k = heqVar;
        this.o = new ahda((byte[]) null);
        this.p = new ahda((byte[]) null);
    }

    public final ajcq a() {
        return aiql.z(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ofx ofxVar;
        if (aolnVar instanceof defpackage.ofx) {
            ofxVar = (defpackage.ofx) aolnVar;
            int i = ofxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofxVar.c = i - Integer.MIN_VALUE;
            } else {
                ofxVar = new defpackage.ofx(this, aolnVar);
            }
        } else {
            ofxVar = new defpackage.ofx(this, aolnVar);
        }
        java.lang.Object objD = ofxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ofxVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.r.X();
            ofxVar.c = 1;
            objD = aosv.D(ajcqVarX, ofxVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarR = ((defpackage.ofw) aooc.ar(objD, defpackage.ofw.class)).R();
        ofxVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarR, ofxVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final ajcq c() {
        return aosv.C(ahvr.ag(this.n, this.o, new nto(this, (aoln) null, 20)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.ofy ofyVar;
        if (aolnVar instanceof defpackage.ofy) {
            ofyVar = (defpackage.ofy) aolnVar;
            int i = ofyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofyVar.c = i - Integer.MIN_VALUE;
            } else {
                ofyVar = new defpackage.ofy(this, aolnVar);
            }
        } else {
            ofyVar = new defpackage.ofy(this, aolnVar);
        }
        java.lang.Object objD = ofyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ofyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.r.X();
            ofyVar.c = 1;
            objD = aosv.D(ajcqVarX, ofyVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAO = ((defpackage.ofw) aooc.ar(objD, defpackage.ofw.class)).aO();
        ofyVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAO, ofyVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final ajcq ej() {
        return aosv.C(ahvr.ag(this.n, this.o, new defpackage.ogf(this, (aoln) null, 1)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.ogq
    public final void f(defpackage.ogp ogpVar) throws aois {
        int i;
        aooh.f(ogpVar, "message");
        this.f.a(qbc.jp);
        int i2 = ogpVar.b;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = i2 != 2 ? 0 : 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            this.q.i(ahvr.ag(this.n, this.p, new defpackage.ofz(this, null)));
        } else if (i3 == 1) {
            m.b().l("com/android/dialer/expresso/receiver/impl/service/SmsReceiver", "onRemoteEvent", 121, "SmsReceiver.kt").v("Ignore the message due to handshake");
        } else {
            if (i3 != 2) {
                throw new aois();
            }
            m.b().l("com/android/dialer/expresso/receiver/impl/service/SmsReceiver", "onRemoteEvent", 124, "SmsReceiver.kt").v("can't identify the type of an incoming message");
        }
    }
}

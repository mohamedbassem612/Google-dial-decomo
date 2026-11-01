package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class txc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/SodaSpeechTranscriberImpl");
    public final defpackage.aoss b;
    public final defpackage.txy c;
    public final defpackage.rlv d;
    public final java.util.Queue e;
    public final java.util.Set f;
    public final defpackage.ahda g;
    public final rai h;
    public final rai i;
    private final defpackage.ruc j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;

    public txc(defpackage.aoss aossVar, defpackage.txy txyVar, rai raiVar, rai raiVar2, defpackage.ruc rucVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (raiVar == null) {
            defpackage.aooh.i("sodaAndroidSpeechSessionFactory");
        }
        if (raiVar2 == null) {
            defpackage.aooh.i("sodaOnDeviceGrpcSessionFactory");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("assumedSodaRecognizerCountWhenNoSessionStarted");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("maxSodaRecognizerCount");
        }
        this.b = aossVar;
        this.c = txyVar;
        this.h = raiVar;
        this.i = raiVar2;
        this.j = rucVar;
        this.d = rlvVar;
        this.k = aoinVar;
        this.l = aoinVar2;
        this.g = new defpackage.ahda((byte[]) null);
        this.e = new java.util.LinkedList();
        this.f = new java.util.LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(twc twcVar, defpackage.aoln aolnVar) {
        twy twyVar;
        twx twxVar;
        int i;
        twx twxVar2;
        if (aolnVar instanceof twy) {
            twyVar = (twy) aolnVar;
            int i2 = twyVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                twyVar.d = i2 - Integer.MIN_VALUE;
            } else {
                twyVar = new twy(this, aolnVar);
            }
        } else {
            twyVar = new twy(this, aolnVar);
        }
        java.lang.Object objB = twyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = twyVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                i = twyVar.a;
                twxVar = twyVar.e;
                defpackage.aooc.af(objB);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                twx twxVar3 = twyVar.e;
                defpackage.aooc.af(objB);
                twxVar2 = twxVar3;
            }
            if (((java.lang.Number) objB).longValue() <= 0) {
                return twxVar2;
            }
            return twx.a;
        }
        defpackage.aooc.af(objB);
        java.util.Queue queue = this.e;
        int size = this.f.size() + queue.size();
        long j = size;
        if (j >= ((java.lang.Number) this.k.a()).longValue()) {
            twx twxVar4 = (twcVar != twc.b || queue.isEmpty()) ? twx.c : twx.b;
            if (j >= ((java.lang.Number) this.l.a()).longValue()) {
                return twxVar4;
            }
            defpackage.txy txyVar = this.c;
            twyVar.e = twxVar4;
            twyVar.a = size;
            twyVar.d = 1;
            objB = txyVar.b(twyVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            twxVar = twxVar4;
            i = size;
        }
        return twx.a;
        if (((java.lang.Boolean) objB).booleanValue()) {
            defpackage.txy txyVar2 = this.c;
            twyVar.e = twxVar;
            twyVar.d = 2;
            objB = txyVar2.a(twyVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            twxVar2 = twxVar;
            if (((java.lang.Number) objB).longValue() <= 0) {
                return twxVar2;
            }
        } else if (i > 0) {
            return twxVar;
        }
        return twx.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(twd twdVar, twh twhVar, boolean z, defpackage.aoln aolnVar) {
        twz twzVar;
        defpackage.txc txcVar;
        defpackage.aeun aeunVar;
        if (aolnVar instanceof twz) {
            twzVar = (twz) aolnVar;
            int i = twzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                twzVar.c = i - Integer.MIN_VALUE;
            } else {
                twzVar = new twz(this, aolnVar);
            }
        } else {
            twzVar = new twz(this, aolnVar);
        }
        java.lang.Object obj = twzVar.a;
        twi twiVar = defpackage.aolu.a;
        int i2 = twzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            j$.util.Optional optionalA = this.j.a();
            defpackage.aooh.e(optionalA, "startLocalTimer(...)");
            defpackage.aeun aeunVar2 = (defpackage.aeun) defpackage.aooh.q(optionalA);
            txcVar = this;
            defpackage.aosy aosyVarAg = defpackage.ahvr.ag(this.b, this.g, new txb(txcVar, twdVar, twhVar, z, (defpackage.aoln) null));
            twzVar.d = aeunVar2;
            twzVar.c = 1;
            java.lang.Object objA = aosyVarAg.a(twzVar);
            if (objA != twiVar) {
                aeunVar = aeunVar2;
                obj = objA;
            }
            return twiVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aeunVar = twzVar.d;
        defpackage.aooc.af(obj);
        txcVar = this;
        twiVar = (twi) obj;
        if (aeunVar != null) {
            txcVar.j.q(aeunVar, defpackage.ruc.bT, twiVar != null ? defpackage.rub.b : defpackage.rub.c);
        }
        return twiVar;
    }
}

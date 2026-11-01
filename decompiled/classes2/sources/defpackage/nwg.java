package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwg implements qbb {
    public final aoss a;
    public final java.lang.String b;
    public final defpackage.nwb c;
    public final znv d;
    public final zno e;
    public final znp f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public final java.util.concurrent.atomic.AtomicBoolean i;
    public final zpm j;
    private final okj k;

    public nwg(aoss aossVar, java.lang.String str, defpackage.nwb nwbVar, zpm zpmVar, okj okjVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callId");
        aooh.f(zpmVar, "callScopes");
        this.a = aossVar;
        this.b = str;
        this.c = nwbVar;
        this.j = zpmVar;
        this.k = okjVar;
        this.d = new defpackage.ooa(this, 1);
        this.e = new otk(this, 1);
        this.f = new defpackage.ler(this, 3);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final apqr e(java.util.Set set) {
        java.lang.Object obj;
        java.util.Iterator it = set.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long j = ((apqr) next).a;
                do {
                    java.lang.Object next2 = it.next();
                    long j2 = ((apqr) next2).a;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (apqr) obj;
    }

    public final ajcq a() {
        int i;
        if (this.g.get()) {
            i = 1;
        } else {
            i = this.h.get() ? 3 : 2;
        }
        akzx akzxVarM = amqj.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        amqj amqjVar = akzxVarM.b;
        amqjVar.c = i - 1;
        amqjVar.b |= 1;
        amqj amqjVarP = akzxVarM.p();
        aooh.e(amqjVarP, "build(...)");
        return aiql.z(amqjVarP);
    }

    public final /* bridge */ /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        amqj amqjVar = (amqj) obj;
        aooh.f(akzxVar, "callEventBuilder");
        aooh.f(amqjVar, "data");
        if (this.i.get()) {
            akzxVar.u();
            amow amowVar = akzxVar.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(amqjVar);
            amowVar.al = amqjVar;
            amowVar.d |= 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(apqr apqrVar, aoln aolnVar) {
        defpackage.nwd nwdVar;
        if (aolnVar instanceof defpackage.nwd) {
            nwdVar = (defpackage.nwd) aolnVar;
            int i = nwdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwdVar.c = i - Integer.MIN_VALUE;
            } else {
                nwdVar = new defpackage.nwd(this, aolnVar);
            }
        } else {
            nwdVar = new defpackage.nwd(this, aolnVar);
        }
        java.lang.Object objD = nwdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nwdVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarK = this.j.k(apqrVar, defpackage.nwc.class, new defpackage.iry(7));
            aooh.e(ajcqVarK, "fromCallProductionComponent(...)");
            nwdVar.c = 1;
            objD = aosv.D(ajcqVarK, nwdVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(apqr apqrVar, aoln aolnVar) {
        defpackage.nwe nweVar;
        if (aolnVar instanceof defpackage.nwe) {
            nweVar = (defpackage.nwe) aolnVar;
            int i = nweVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nweVar.c = i - Integer.MIN_VALUE;
            } else {
                nweVar = new defpackage.nwe(this, aolnVar);
            }
        } else {
            nweVar = new defpackage.nwe(this, aolnVar);
        }
        java.lang.Object objC = nweVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nweVar.c;
        int iIntValue = -1;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            iIntValue = ((java.lang.Number) objC).intValue();
            return new java.lang.Integer(iIntValue);
        }
        aooc.af(objC);
        if (apqrVar != null) {
            nweVar.c = 1;
            objC = c(apqrVar, nweVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        }
        return new java.lang.Integer(iIntValue);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) objC;
        if (phoneAccountHandle != null) {
            okj okjVar = this.k;
            nweVar.c = 2;
            objC = okjVar.k(phoneAccountHandle, nweVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            iIntValue = ((java.lang.Number) objC).intValue();
        }
        return new java.lang.Integer(iIntValue);
    }
}

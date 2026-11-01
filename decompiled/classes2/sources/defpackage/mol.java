package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mol implements qbb {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public mol(aoss aossVar, defpackage.mqt mqtVar, pqo pqoVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(pqoVar, "direction");
        this.a = aossVar;
        this.b = mqtVar;
        this.c = pqoVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            return aosv.F((aoss) this.a, 0, new defpackage.lve(this, (aoln) null, 16), 3);
        }
        if (i == 1) {
            return ahvr.F(new defpackage.hkx(this, 2), (java.util.concurrent.Executor) this.a);
        }
        java.lang.Object obj = this.b;
        return ahvr.I(ahvr.G(new vfm(obj, this.a, 11, (byte[]) null), ((whs) obj).c), new vuu(this, 13), (java.util.concurrent.Executor) this.c);
    }

    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            amqi amqiVar = (amqi) obj;
            aooh.f(akzxVar, "callEventBuilder");
            if (amqiVar != null) {
                akzxVar.u();
                amow amowVar = akzxVar.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(amqiVar);
                amowVar.ai = amqiVar;
                amowVar.d |= 1;
                return;
            }
            return;
        }
        if (i != 1) {
            amto amtoVar = (amto) obj;
            akzxVar.u();
            amow amowVar3 = akzxVar.b;
            amow amowVar4 = amow.a;
            j$.util.Objects.requireNonNull(amtoVar);
            amowVar3.ab = amtoVar;
            amowVar3.c |= 16777216;
            return;
        }
        j$.util.Optional optional = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(akzxVar);
        defpackage.hrx hrxVar = new defpackage.hrx(akzxVar, 5);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            java.lang.Object obj3 = hrxVar.a;
            boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
            akzx akzxVar2 = (akzx) obj3;
            akzxVar2.u();
            amow amowVar5 = akzxVar2.b;
            amow amowVar6 = amow.a;
            amowVar5.b |= 268435456;
            amowVar5.A = zBooleanValue;
        }
    }

    public mol(android.content.Context context, ajct ajctVar, zzx zzxVar, int i) {
        this.$cid = i;
        this.b = context;
        this.a = ajctVar;
        this.c = zzxVar;
    }

    public mol(ajct ajctVar, java.lang.String str, whs whsVar, int i) {
        this.$cid = i;
        this.c = ajctVar;
        this.a = str;
        this.b = whsVar;
    }
}

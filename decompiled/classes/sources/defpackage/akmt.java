package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akmt extends defpackage.aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmt(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        super(anmcVar, anmbVar);
        if (anmbVar == null) {
            defpackage.aooh.i("callOptions");
        }
    }

    @Override // defpackage.aohh
    public final /* synthetic */ defpackage.aohh a(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        return new defpackage.akmt(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(akmy akmyVar, defpackage.anph anphVar, defpackage.aoln aolnVar) {
        akms akmsVar;
        if (aolnVar instanceof akms) {
            akmsVar = (akms) aolnVar;
            int i = akmsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akmsVar.c = i - Integer.MIN_VALUE;
            } else {
                akmsVar = new akms(this, aolnVar);
            }
        } else {
            akmsVar = new akms(this, aolnVar);
        }
        akms akmsVar2 = akmsVar;
        java.lang.Object objV = akmsVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = akmsVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objV);
            defpackage.anmc anmcVar = this.a;
            defpackage.anmb anmbVar = this.b;
            anpk anpkVarA = akmr.a();
            akmsVar2.c = 1;
            objV = defpackage.anty.v(anmcVar, anpkVarA, akmyVar, anmbVar, anphVar, akmsVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objV);
        }
        defpackage.aooh.e(objV, "unaryRpc(...)");
        return objV;
    }
}

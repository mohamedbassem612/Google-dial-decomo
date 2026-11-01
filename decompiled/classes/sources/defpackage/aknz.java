package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aknz extends defpackage.aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aknz(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        super(anmcVar, anmbVar);
        if (anmbVar == null) {
            defpackage.aooh.i("callOptions");
        }
    }

    @Override // defpackage.aohh
    public final /* synthetic */ defpackage.aohh a(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        return new defpackage.aknz(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aknv aknvVar, defpackage.anph anphVar, defpackage.aoln aolnVar) {
        akny aknyVar;
        if (aolnVar instanceof akny) {
            aknyVar = (akny) aolnVar;
            int i = aknyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aknyVar.c = i - Integer.MIN_VALUE;
            } else {
                aknyVar = new akny(this, aolnVar);
            }
        } else {
            aknyVar = new akny(this, aolnVar);
        }
        akny aknyVar2 = aknyVar;
        java.lang.Object objV = aknyVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aknyVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objV);
            defpackage.anmc anmcVar = this.a;
            anpk anpkVarA = aknx.a;
            if (anpkVarA == null) {
                synchronized (aknx.class) {
                    anpkVarA = aknx.a;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("google.internal.myphonenumbers.v1.MyPhoneNumbers", "ListPhoneNumbers");
                        aalVarD.b();
                        aknv aknvVar2 = aknv.a;
                        defpackage.akzq akzqVar = defpackage.aohd.a;
                        aalVarD.e = new aohc(aknvVar2);
                        aalVarD.c = new aohc(aknw.a);
                        anpkVarA = aalVarD.a();
                        aknx.a = anpkVarA;
                    }
                }
            }
            defpackage.anmb anmbVar = this.b;
            aknyVar2.c = 1;
            objV = defpackage.anty.v(anmcVar, anpkVarA, aknvVar, anmbVar, anphVar, aknyVar2);
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

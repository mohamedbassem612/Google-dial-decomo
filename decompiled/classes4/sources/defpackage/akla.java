package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akla extends aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akla(anmc anmcVar, anmb anmbVar) {
        super(anmcVar, anmbVar);
        aooh.f(anmcVar, "channel");
        aooh.f(anmbVar, "callOptions");
    }

    public final /* synthetic */ aohh a(anmc anmcVar, anmb anmbVar) {
        return new defpackage.akla(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.akks akksVar, anph anphVar, aoln aolnVar) {
        defpackage.akkz akkzVar;
        if (aolnVar instanceof defpackage.akkz) {
            akkzVar = (defpackage.akkz) aolnVar;
            int i = akkzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akkzVar.c = i - Integer.MIN_VALUE;
            } else {
                akkzVar = new defpackage.akkz(this, aolnVar);
            }
        } else {
            akkzVar = new defpackage.akkz(this, aolnVar);
        }
        defpackage.akkz akkzVar2 = akkzVar;
        java.lang.Object objV = akkzVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = akkzVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            defpackage.anpk anpkVarA = defpackage.akky.a;
            if (anpkVarA == null) {
                synchronized (defpackage.akky.class) {
                    anpkVarA = defpackage.akky.a;
                    if (anpkVarA == null) {
                        defpackage.aal aalVarD = defpackage.anpk.d();
                        aalVarD.b = defpackage.anpj.a;
                        aalVarD.d = defpackage.anpk.c("google.internal.abuse.ondevicesafety.v2.ProtectedDownloadService", "GetManifestConfig");
                        aalVarD.b();
                        defpackage.akks akksVar2 = defpackage.akks.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new defpackage.aohc(akksVar2);
                        aalVarD.c = new defpackage.aohc(defpackage.akkt.a);
                        anpkVarA = aalVarD.a();
                        defpackage.akky.a = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            akkzVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, akksVar, anmbVar, anphVar, akkzVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }
}

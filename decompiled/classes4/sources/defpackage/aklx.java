package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aklx extends aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aklx(anmc anmcVar, anmb anmbVar) {
        super(anmcVar, anmbVar);
        aooh.f(anmcVar, "channel");
        aooh.f(anmbVar, "callOptions");
    }

    public final /* synthetic */ aohh a(anmc anmcVar, anmb anmbVar) {
        return new defpackage.aklx(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(akly aklyVar, anph anphVar, aoln aolnVar) {
        defpackage.aklv aklvVar;
        if (aolnVar instanceof defpackage.aklv) {
            aklvVar = (defpackage.aklv) aolnVar;
            int i = aklvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aklvVar.c = i - Integer.MIN_VALUE;
            } else {
                aklvVar = new defpackage.aklv(this, aolnVar);
            }
        } else {
            aklvVar = new defpackage.aklv(this, aolnVar);
        }
        defpackage.aklv aklvVar2 = aklvVar;
        java.lang.Object objV = aklvVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = aklvVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            defpackage.anpk anpkVarA = defpackage.aklu.b;
            if (anpkVarA == null) {
                synchronized (defpackage.aklu.class) {
                    anpkVarA = defpackage.aklu.b;
                    if (anpkVarA == null) {
                        defpackage.aal aalVarD = defpackage.anpk.d();
                        aalVarD.b = defpackage.anpj.a;
                        aalVarD.d = defpackage.anpk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosClusterSuggestions");
                        aalVarD.b();
                        akly aklyVar2 = akly.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new defpackage.aohc(aklyVar2);
                        aalVarD.c = new defpackage.aohc(aklz.a);
                        anpkVarA = aalVarD.a();
                        defpackage.aklu.b = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            aklvVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, aklyVar, anmbVar, anphVar, aklvVar2);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(akma akmaVar, anph anphVar, aoln aolnVar) {
        defpackage.aklw aklwVar;
        if (aolnVar instanceof defpackage.aklw) {
            aklwVar = (defpackage.aklw) aolnVar;
            int i = aklwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aklwVar.c = i - Integer.MIN_VALUE;
            } else {
                aklwVar = new defpackage.aklw(this, aolnVar);
            }
        } else {
            aklwVar = new defpackage.aklw(this, aolnVar);
        }
        defpackage.aklw aklwVar2 = aklwVar;
        java.lang.Object objV = aklwVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = aklwVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            defpackage.anpk anpkVarA = defpackage.aklu.a;
            if (anpkVarA == null) {
                synchronized (defpackage.aklu.class) {
                    anpkVarA = defpackage.aklu.a;
                    if (anpkVarA == null) {
                        defpackage.aal aalVarD = defpackage.anpk.d();
                        aalVarD.b = defpackage.anpj.a;
                        aalVarD.d = defpackage.anpk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosPhotoSuggestions");
                        aalVarD.b();
                        akma akmaVar2 = akma.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new defpackage.aohc(akmaVar2);
                        aalVarD.c = new defpackage.aohc(akmb.a);
                        anpkVarA = aalVarD.a();
                        defpackage.aklu.a = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            aklwVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, akmaVar, anmbVar, anphVar, aklwVar2);
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

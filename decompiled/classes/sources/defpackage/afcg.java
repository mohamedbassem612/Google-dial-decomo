package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afcg extends defpackage.aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afcg(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        super(anmcVar, anmbVar);
        if (anmcVar == null) {
            defpackage.aooh.i("channel");
        }
        if (anmbVar == null) {
            defpackage.aooh.i("callOptions");
        }
    }

    public static /* synthetic */ defpackage.aoxh e(defpackage.afcg afcgVar, afcp afcpVar) {
        defpackage.anph anphVar = new defpackage.anph();
        defpackage.aooh.f(afcpVar, "request");
        anpk anpkVarA = afcd.c;
        if (anpkVarA == null) {
            synchronized (afcd.class) {
                anpkVarA = afcd.c;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.c;
                    aalVarD.d = anpk.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "DownloadModel");
                    aalVarD.b();
                    afcp afcpVar2 = afcp.a;
                    defpackage.akzq akzqVar = defpackage.aohd.a;
                    aalVarD.e = new aohc(afcpVar2);
                    aalVarD.c = new aohc(afcs.a);
                    anpkVarA = aalVarD.a();
                    afcd.c = anpkVarA;
                }
            }
        }
        defpackage.anmb anmbVar = afcgVar.b;
        if (anpkVarA.a == anpj.c) {
            return defpackage.anty.aU(afcgVar.a, anpkVarA, anmbVar, anphVar, new vqf(afcpVar));
        }
        java.util.Objects.toString(anpkVarA);
        throw new java.lang.IllegalArgumentException("Expected a server streaming RPC method, but got ".concat(anpkVarA.toString()));
    }

    @Override // defpackage.aohh
    public final /* synthetic */ defpackage.aohh a(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        return new defpackage.afcg(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(afcm afcmVar, defpackage.anph anphVar, defpackage.aoln aolnVar) {
        afce afceVar;
        if (aolnVar instanceof afce) {
            afceVar = (afce) aolnVar;
            int i = afceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afceVar.c = i - Integer.MIN_VALUE;
            } else {
                afceVar = new afce(this, aolnVar);
            }
        } else {
            afceVar = new afce(this, aolnVar);
        }
        afce afceVar2 = afceVar;
        java.lang.Object objV = afceVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = afceVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objV);
            defpackage.anmc anmcVar = this.a;
            anpk anpkVarA = afcd.b;
            if (anpkVarA == null) {
                synchronized (afcd.class) {
                    anpkVarA = afcd.b;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "CheckModelAvailability");
                        aalVarD.b();
                        afcm afcmVar2 = afcm.a;
                        defpackage.akzq akzqVar = defpackage.aohd.a;
                        aalVarD.e = new aohc(afcmVar2);
                        aalVarD.c = new aohc(afco.a);
                        anpkVarA = aalVarD.a();
                        afcd.b = anpkVarA;
                    }
                }
            }
            defpackage.anmb anmbVar = this.b;
            afceVar2.c = 1;
            objV = defpackage.anty.v(anmcVar, anpkVarA, afcmVar, anmbVar, anphVar, afceVar2);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(afdf afdfVar, defpackage.anph anphVar, defpackage.aoln aolnVar) {
        afcf afcfVar;
        if (aolnVar instanceof afcf) {
            afcfVar = (afcf) aolnVar;
            int i = afcfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afcfVar.c = i - Integer.MIN_VALUE;
            } else {
                afcfVar = new afcf(this, aolnVar);
            }
        } else {
            afcfVar = new afcf(this, aolnVar);
        }
        afcf afcfVar2 = afcfVar;
        java.lang.Object objV = afcfVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = afcfVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objV);
            defpackage.anmc anmcVar = this.a;
            anpk anpkVarA = afcd.a;
            if (anpkVarA == null) {
                synchronized (afcd.class) {
                    anpkVarA = afcd.a;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.libraries.speech.transcription.recognition.grpc.GoogleAsrService", "QueryServiceStatus");
                        aalVarD.b();
                        afdf afdfVar2 = afdf.a;
                        defpackage.akzq akzqVar = defpackage.aohd.a;
                        aalVarD.e = new aohc(afdfVar2);
                        aalVarD.c = new aohc(afdg.a);
                        anpkVarA = aalVarD.a();
                        afcd.a = anpkVarA;
                    }
                }
            }
            defpackage.anmb anmbVar = this.b;
            afcfVar2.c = 1;
            objV = defpackage.anty.v(anmcVar, anpkVarA, afdfVar, anmbVar, anphVar, afcfVar2);
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

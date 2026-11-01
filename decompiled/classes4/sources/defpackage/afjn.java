package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class afjn implements java.lang.Runnable {
    public final /* synthetic */ amhi a;
    public final /* synthetic */ defpackage.afjq b;
    public final /* synthetic */ apdh c;

    public /* synthetic */ afjn(defpackage.afjq afjqVar, amhi amhiVar, apdh apdhVar) {
        this.b = afjqVar;
        this.a = amhiVar;
        this.c = apdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajcq ajcqVarA;
        ajcq ajcqVarA2;
        defpackage.afjq afjqVar = this.b;
        ahwd ahwdVarC = afjqVar.c();
        anmc anmcVarD = afjqVar.d(ahwdVarC);
        if (anmcVarD == null) {
            android.util.Log.e("NetworkCallerGrpc", "Could not get channel for recordEvent.");
            return;
        }
        apdh apdhVar = this.c;
        amhi amhiVar = this.a;
        if (!afjg.a.b) {
            if (ahwdVarC != null) {
                defpackage.amjj amjjVar = (defpackage.amjj) defpackage.amjk.a(anmcVarD).l(new defpackage.anrj(ahwdVarC));
                anmc anmcVar = ((aohh) amjjVar).a;
                defpackage.anpk anpkVarA = defpackage.amjk.c;
                if (anpkVarA == null) {
                    synchronized (defpackage.amjk.class) {
                        anpkVarA = defpackage.amjk.c;
                        if (anpkVarA == null) {
                            defpackage.aal aalVarD = defpackage.anpk.d();
                            aalVarD.b = defpackage.anpj.a;
                            aalVarD.d = defpackage.anpk.c("scone.v1.SurveyService", "RecordEvent");
                            aalVarD.b();
                            amhi amhiVar2 = amhi.a;
                            akzq akzqVar = aohd.a;
                            aalVarD.e = new defpackage.aohc(amhiVar2);
                            aalVarD.c = new defpackage.aohc(amhj.a);
                            anpkVarA = aalVarD.a();
                            defpackage.amjk.c = anpkVarA;
                        }
                    }
                }
                ajcqVarA2 = defpackage.aohp.a(anmcVar.b(anpkVarA, ((aohh) amjjVar).b), amhiVar);
            } else {
                defpackage.amjj amjjVarA = defpackage.amjk.a(anmcVarD);
                anmc anmcVar2 = ((aohh) amjjVarA).a;
                defpackage.anpk anpkVarA2 = defpackage.amjk.d;
                if (anpkVarA2 == null) {
                    synchronized (defpackage.amjk.class) {
                        anpkVarA2 = defpackage.amjk.d;
                        if (anpkVarA2 == null) {
                            defpackage.aal aalVarD2 = defpackage.anpk.d();
                            aalVarD2.b = defpackage.anpj.a;
                            aalVarD2.d = defpackage.anpk.c("scone.v1.SurveyService", "RecordEventAnonymous");
                            aalVarD2.b();
                            amhi amhiVar3 = amhi.a;
                            akzq akzqVar2 = aohd.a;
                            aalVarD2.e = new defpackage.aohc(amhiVar3);
                            aalVarD2.c = new defpackage.aohc(amhj.a);
                            anpkVarA2 = aalVarD2.a();
                            defpackage.amjk.d = anpkVarA2;
                        }
                    }
                }
                ajcqVarA2 = defpackage.aohp.a(anmcVar2.b(anpkVarA2, ((aohh) amjjVarA).b), amhiVar);
            }
            aiql.I(ajcqVarA2, new afjo(afjqVar, amhiVar, apdhVar, 0), afjm.a());
            return;
        }
        try {
            anal analVarZ = alad.z(anal.a, amhiVar.f(), akzq.a());
            if (ahwdVarC != null) {
                defpackage.anaq anaqVar = (defpackage.anaq) anar.d(anmcVarD).l(new defpackage.anrj(ahwdVarC));
                anmc anmcVar3 = ((aohh) anaqVar).a;
                defpackage.anpk anpkVarA3 = anar.i;
                if (anpkVarA3 == null) {
                    synchronized (anar.class) {
                        anpkVarA3 = anar.i;
                        if (anpkVarA3 == null) {
                            defpackage.aal aalVarD3 = defpackage.anpk.d();
                            aalVarD3.b = defpackage.anpj.a;
                            aalVarD3.d = defpackage.anpk.c("google.internal.feedback.v1.SurveyService", "RecordEvent");
                            aalVarD3.b();
                            anal analVar = anal.a;
                            akzq akzqVar3 = aohd.a;
                            aalVarD3.e = new defpackage.aohc(analVar);
                            aalVarD3.c = new defpackage.aohc(anam.a);
                            anpkVarA3 = aalVarD3.a();
                            anar.i = anpkVarA3;
                        }
                    }
                }
                ajcqVarA = defpackage.aohp.a(anmcVar3.b(anpkVarA3, ((aohh) anaqVar).b), analVarZ);
            } else {
                defpackage.anaq anaqVarD = anar.d(anmcVarD);
                anmc anmcVar4 = ((aohh) anaqVarD).a;
                defpackage.anpk anpkVarA4 = anar.j;
                if (anpkVarA4 == null) {
                    synchronized (anar.class) {
                        anpkVarA4 = anar.j;
                        if (anpkVarA4 == null) {
                            defpackage.aal aalVarD4 = defpackage.anpk.d();
                            aalVarD4.b = defpackage.anpj.a;
                            aalVarD4.d = defpackage.anpk.c("google.internal.feedback.v1.SurveyService", "RecordEventAnonymous");
                            aalVarD4.b();
                            anal analVar2 = anal.a;
                            akzq akzqVar4 = aohd.a;
                            aalVarD4.e = new defpackage.aohc(analVar2);
                            aalVarD4.c = new defpackage.aohc(anam.a);
                            anpkVarA4 = aalVarD4.a();
                            anar.j = anpkVarA4;
                        }
                    }
                }
                ajcqVarA = defpackage.aohp.a(anmcVar4.b(anpkVarA4, ((aohh) anaqVarD).b), analVarZ);
            }
            aiql.I(ajcqVarA, new afjo(afjqVar, amhiVar, apdhVar, 2, (byte[]) null), afjm.a());
        } catch (alaz e) {
            android.util.Log.e("NetworkCallerGrpc", "Failed to convert scone record event request to feedback1p.", e);
        }
    }
}

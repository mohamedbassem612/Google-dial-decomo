package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wyw {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public wyw(aoin aoinVar, aoin aoinVar2) {
        this.b = aoinVar;
        this.c = aoinVar2;
        this.a = new java.util.concurrent.ArrayBlockingQueue(java.lang.Math.max(((java.lang.Long) aoinVar.a()).intValue(), ((java.lang.Long) aoinVar2.a()).intValue()) << 3);
    }

    public final void a(defpackage.wyz wyzVar) {
        dez.m((gfy) this.a, false, true, new uph(this, wyzVar, 6, (byte[]) null));
    }

    public final ajcq b(aify aifyVar) {
        if (aifyVar.isEmpty()) {
            return aiql.z((java.lang.Object) null);
        }
        return ahrv.g(((wzd) this.b).c((aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.wyd(9)).collect(aido.a))).h(new defpackage.wrn(this, 12), ajbm.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.afof c(java.lang.String str) {
        ?? r0 = this.b;
        java.lang.Object objM = r0.get(str);
        if (objM == null) {
            java.lang.Object obj = this.c;
            java.lang.Object obj2 = this.a;
            aooh.f(str, "clusterId");
            objM = ((defpackage.aprf) obj).m((android.accounts.Account) obj2, 3, str, 12, 13);
            r0.put(str, objM);
        }
        return (defpackage.afof) objM;
    }

    public final void d(akos akosVar) {
        akzx akzxVarG = g();
        akzx akzxVarM = defpackage.akok.a.m();
        akzx akzxVarM2 = defpackage.akor.a.m();
        akzxVarM2.u();
        defpackage.akor akorVar = (defpackage.akor) akzxVarM2.b;
        akorVar.c = 2;
        akorVar.b |= 1;
        akzxVarM2.u();
        defpackage.akor akorVar2 = (defpackage.akor) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akosVar);
        akorVar2.f = akosVar;
        akorVar2.b |= 8;
        akzxVarM.u();
        defpackage.akok akokVar = (defpackage.akok) akzxVarM.b;
        defpackage.akor akorVar3 = (defpackage.akor) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akorVar3);
        akokVar.c = akorVar3;
        akokVar.b |= 1;
        akzxVarG.u();
        defpackage.akoi akoiVar = (defpackage.akoi) akzxVarG.b;
        defpackage.akok akokVar2 = (defpackage.akok) akzxVarM.p();
        defpackage.akoi akoiVar2 = defpackage.akoi.a;
        j$.util.Objects.requireNonNull(akokVar2);
        akoiVar.d = akokVar2;
        akoiVar.b |= 2;
        f((defpackage.akoi) akzxVarG.p());
    }

    public final void e(akou akouVar) {
        akzx akzxVarG = g();
        akzx akzxVarM = defpackage.akok.a.m();
        akzx akzxVarM2 = defpackage.akor.a.m();
        akzxVarM2.u();
        defpackage.akor akorVar = (defpackage.akor) akzxVarM2.b;
        akorVar.c = 3;
        akorVar.b |= 1;
        akzxVarM2.u();
        defpackage.akor akorVar2 = (defpackage.akor) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akouVar);
        akorVar2.g = akouVar;
        akorVar2.b |= 16;
        akzxVarM.u();
        defpackage.akok akokVar = (defpackage.akok) akzxVarM.b;
        defpackage.akor akorVar3 = (defpackage.akor) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akorVar3);
        akokVar.c = akorVar3;
        akokVar.b |= 1;
        akzxVarG.u();
        defpackage.akoi akoiVar = (defpackage.akoi) akzxVarG.b;
        defpackage.akok akokVar2 = (defpackage.akok) akzxVarM.p();
        defpackage.akoi akoiVar2 = defpackage.akoi.a;
        j$.util.Objects.requireNonNull(akokVar2);
        akoiVar.d = akokVar2;
        akoiVar.b |= 2;
        f((defpackage.akoi) akzxVarG.p());
    }

    public final void f(defpackage.akoi akoiVar) {
        ((zzd) this.c).h(akoiVar, abtl.b((android.content.Context) this.a, new defpackage.akoj())).d();
    }

    public final akzx g() {
        akzx akzxVarM = defpackage.akoi.a.m();
        akzxVarM.u();
        defpackage.akoi akoiVar = (defpackage.akoi) akzxVarM.b;
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        akoiVar.c = (defpackage.akoh) obj;
        akoiVar.b |= 1;
        return akzxVarM;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01cc  */
    public final void h(com.google.android.libraries.surveys.internal.model.Answer answer, boolean z) {
        defpackage.amij amijVar;
        java.lang.String strCo = ahvr.co(answer.f);
        afjq afjqVarF = afjg.a.c.F((android.content.Context) this.a, (java.lang.String) this.b, answer.b, strCo);
        akzx akzxVarM = defpackage.amik.a.m();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - answer.d;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = epochMilli / 1000;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
        long nanos = timeUnit2.toNanos(epochMilli - (1000 * j));
        akzx akzxVarM2 = akzm.a.m();
        akzxVarM2.u();
        akzxVarM2.b.b = j;
        akzxVarM2.u();
        akzxVarM2.b.c = (int) nanos;
        akzm akzmVarP = akzxVarM2.p();
        akzxVarM.u();
        defpackage.amik amikVar = (defpackage.amik) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarP);
        amikVar.e = akzmVarP;
        amikVar.b |= 1;
        int i = answer.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            java.lang.Object obj = this.c;
            if (((defpackage.afjk) afji.a.e.get(((amje) obj).b)) == defpackage.afjk.a) {
                akzx akzxVarM3 = defpackage.amij.a.m();
                akzxVarM3.u();
                defpackage.amij amijVar2 = (defpackage.amij) akzxVarM3.b;
                amijVar2.c = a.Q(3);
                amijVar2.b |= 1;
                amijVar = (defpackage.amij) akzxVarM3.p();
            } else {
                amijVar = defpackage.amij.a;
            }
            akzxVarM.u();
            defpackage.amik amikVar2 = (defpackage.amik) akzxVarM.b;
            j$.util.Objects.requireNonNull(amijVar);
            amikVar2.d = amijVar;
            amikVar2.c = 2;
        } else if (i2 == 2) {
            akzx akzxVarM4 = amih.a.m();
            amit amitVar = answer.c;
            if (amitVar != null) {
                if (!z) {
                    akzx akzxVarP = amitVar.p();
                    akzxVarP.u();
                    amit amitVar2 = akzxVarP.b;
                    amitVar2.c = null;
                    amitVar2.b &= -2;
                    amitVar = (amit) akzxVarP.p();
                }
                akzxVarM4.u();
                amih amihVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(amitVar);
                amihVar.c = amitVar;
                amihVar.b |= 2;
            }
            amih amihVarP = akzxVarM4.p();
            akzxVarM.u();
            defpackage.amik amikVar3 = (defpackage.amik) akzxVarM.b;
            j$.util.Objects.requireNonNull(amihVarP);
            amikVar3.d = amihVarP;
            amikVar3.c = 3;
        } else if (i2 == 3) {
            akzx akzxVarM5 = amia.a.m();
            boolean z2 = answer.e;
            akzxVarM5.u();
            akzxVarM5.b.b = z2;
            amia amiaVarP = akzxVarM5.p();
            akzxVarM.u();
            defpackage.amik amikVar4 = (defpackage.amik) akzxVarM.b;
            j$.util.Objects.requireNonNull(amiaVarP);
            amikVar4.d = amiaVarP;
            amikVar4.c = 4;
        } else if (i2 == 4) {
            amig amigVar = answer.a;
            akzxVarM.u();
            defpackage.amik amikVar5 = (defpackage.amik) akzxVarM.b;
            j$.util.Objects.requireNonNull(amigVar);
            amikVar5.d = amigVar;
            amikVar5.c = 5;
        } else if (i2 != 5) {
            android.util.Log.e("SurveyAnswerTransmitter", "Invalid survey answer type specified.");
        } else {
            defpackage.amii amiiVar = defpackage.amii.a;
            akzxVarM.u();
            defpackage.amik amikVar6 = (defpackage.amik) akzxVarM.b;
            j$.util.Objects.requireNonNull(amiiVar);
            amikVar6.d = amiiVar;
            amikVar6.c = 6;
        }
        java.lang.Object obj2 = this.c;
        long j2 = afjz.a;
        if (obj2 != null) {
            amje amjeVar = (amje) obj2;
            if (amjeVar.b.isEmpty() || amjeVar.c.C()) {
                android.util.Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
            } else {
                akzx akzxVarM6 = defpackage.amhi.a.m();
                akzxVarM6.u();
                defpackage.amhi amhiVar = (defpackage.amhi) akzxVarM6.b;
                j$.util.Objects.requireNonNull(obj2);
                amhiVar.d = amjeVar;
                amhiVar.b |= 2;
                defpackage.amik amikVar7 = (defpackage.amik) akzxVarM.p();
                akzxVarM6.u();
                defpackage.amhi amhiVar2 = (defpackage.amhi) akzxVarM6.b;
                j$.util.Objects.requireNonNull(amikVar7);
                amhiVar2.c = amikVar7;
                amhiVar2.b |= 1;
                defpackage.amhi amhiVar3 = (defpackage.amhi) akzxVarM6.p();
                apdh apdhVar = new apdh();
                if (amhiVar3 == null) {
                    android.util.Log.e("NetworkCallerGrpc", "Survey record event request was null");
                } else {
                    defpackage.afjm.a().execute(new afjn(afjqVarF, amhiVar3, apdhVar));
                }
            }
        } else {
            android.util.Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
        }
        answer.a = amig.a;
        answer.g = 1;
    }

    public wyw(ajct ajctVar, kjr kjrVar, wzd wzdVar) {
        this.a = ajctVar;
        this.c = kjrVar;
        this.b = wzdVar;
    }

    public wyw(ajct ajctVar, defpackage.wvq wvqVar, aoin aoinVar) {
        this.b = ajctVar;
        this.a = wvqVar;
        this.c = aoinVar;
    }

    public wyw(android.content.Context context, java.lang.String str, amje amjeVar) {
        this.a = context;
        this.b = str;
        this.c = amjeVar;
    }

    public wyw(android.content.Context context, zzd zzdVar, defpackage.akoh akohVar) {
        this.a = context;
        this.c = zzdVar;
        this.b = akohVar;
    }

    public wyw(android.accounts.Account account, defpackage.aprf aprfVar) {
        aooh.f(aprfVar, "factory");
        this.a = account;
        this.c = aprfVar;
        this.b = new java.util.HashMap();
    }

    public wyw() {
        throw null;
    }

    public wyw(gfy gfyVar) {
        this.a = gfyVar;
        this.b = new defpackage.wyx(this);
        this.c = new defpackage.wyy(this);
    }
}

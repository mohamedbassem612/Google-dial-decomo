package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class kqt extends aomh implements aonn {
    int a;
    final /* synthetic */ kpd b;
    final /* synthetic */ klt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqt(klt kltVar, kpd kpdVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = kltVar;
        this.b = kpdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajcu, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object b(java.lang.Object obj) throws defpackage.alio {
        java.lang.Object objA;
        defpackage.ambh ambhVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            klt kltVar = this.c;
            this.a = 1;
            objA = kltVar.f.a(this);
            if (objA != ambhVar) {
            }
            return ambhVar;
        }
        objA = obj;
        java.io.File file = (java.io.File) objA;
        ambhVar = new defpackage.ambh();
        klt kltVar2 = this.c;
        kpd kpdVar = this.b;
        defpackage.alqh alqhVarAC = defpackage.alpv.r(defpackage.alqh.a.m()).aC();
        aooh.f(kpdVar, "summaryRequest");
        vqu vquVarH = ahus.H(defpackage.alqk.a.m());
        apdi apdiVar = defpackage.ambk.k;
        aooh.e(apdiVar, "smartNotesConversationContext");
        vaa vaaVarN = defpackage.amjk.n(defpackage.ambk.b.m());
        kpa kpaVar = (kpa) kltVar2.e;
        java.lang.String str = kpaVar.c;
        aooh.f(str, "<this>");
        if (kpa.a.contains(str)) {
            akzx akzxVar = (akzx) vaaVarN.a;
            akzxVar.u();
            defpackage.ambk ambkVar = (defpackage.ambk) akzxVar.b;
            ambkVar.d = 3;
            ambkVar.c |= 8;
        }
        akzx akzxVar2 = (akzx) vaaVarN.a;
        akzxVar2.u();
        defpackage.ambk ambkVar2 = (defpackage.ambk) akzxVar2.b;
        ambkVar2.c |= 256;
        ambkVar2.h = true;
        new alct(new alam(ambkVar2.e, defpackage.ambk.a));
        defpackage.ambp ambpVar = defpackage.ambp.SUMMARY_SAFETY_CHECK_GEMINI;
        akzxVar2.u();
        defpackage.ambk ambkVar3 = (defpackage.ambk) akzxVar2.b;
        j$.util.Objects.requireNonNull(ambpVar);
        alak alakVar = ambkVar3.e;
        if (!alakVar.c()) {
            ambkVar3.e = alad.H(alakVar);
        }
        ambkVar3.e.g(ambpVar.c);
        aoin aoinVar = kpaVar.b;
        if (((java.lang.Number) aoinVar.a()).longValue() >= 0) {
            akzx akzxVarM = defpackage.ambq.a.m();
            aooh.f(akzxVarM, "builder");
            int iLongValue = (int) ((java.lang.Number) aoinVar.a()).longValue();
            akzxVarM.u();
            defpackage.ambq ambqVar = (defpackage.ambq) akzxVarM.b;
            ambqVar.b |= 1;
            ambqVar.c = iLongValue;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.ambq ambqVar2 = (defpackage.ambq) aladVarP;
            aooh.f(ambqVar2, "value");
            akzxVar2.u();
            defpackage.ambk ambkVar4 = (defpackage.ambk) akzxVar2.b;
            j$.util.Objects.requireNonNull(ambqVar2);
            ambkVar4.g = ambqVar2;
            ambkVar4.c |= 128;
        }
        vquVarH.aY(apdiVar, vaaVarN.au());
        defpackage.alqk alqkVarAQ = vquVarH.aQ();
        int i2 = kpdVar.d;
        aooh.f(alqkVarAQ, "<this>");
        alqkVarAQ.c(apdiVar);
        akzs akzsVar = ((alaa) alqkVarAQ).n;
        alac alacVar = (alac) apdiVar.a;
        java.lang.Object objJ = akzsVar.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        aooh.e(objJ, "getExtension(...)");
        vaa vaaVarN2 = defpackage.amjk.n(((defpackage.ambk) objJ).p());
        akzx akzxVar3 = (akzx) vaaVarN2.a;
        akzxVar3.u();
        defpackage.ambk ambkVar5 = (defpackage.ambk) akzxVar3.b;
        ambkVar5.f = 1;
        ambkVar5.c |= 64;
        defpackage.ambk ambkVarAu = vaaVarN2.au();
        vqu vquVarH2 = ahus.H(alqkVarAQ.p());
        aooh.e(apdiVar, "smartNotesConversationContext");
        vquVarH2.aY(apdiVar, ambkVarAu);
        defpackage.alqk alqkVarAQ2 = vquVarH2.aQ();
        long j = kpdVar.a;
        aooh.f(alqkVarAQ2, "<this>");
        alqkVarAQ2.c(apdiVar);
        java.lang.Object objJ2 = ((alaa) alqkVarAQ2).n.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar.b;
        } else {
            apdiVar.c(objJ2);
        }
        aooh.e(objJ2, "getExtension(...)");
        vaa vaaVarN3 = defpackage.amjk.n(((defpackage.ambk) objJ2).p());
        alcf alcfVarE = aldi.e(j);
        aooh.e(alcfVarE, "fromMillis(...)");
        aooh.f(alcfVarE, "value");
        akzx akzxVar4 = (akzx) vaaVarN3.a;
        akzxVar4.u();
        defpackage.ambk ambkVar6 = (defpackage.ambk) akzxVar4.b;
        j$.util.Objects.requireNonNull(alcfVarE);
        ambkVar6.i = alcfVarE;
        ambkVar6.c |= 512;
        defpackage.ambk ambkVarAu2 = vaaVarN3.au();
        vqu vquVarH3 = ahus.H(alqkVarAQ2.p());
        aooh.e(apdiVar, "smartNotesConversationContext");
        vquVarH3.aY(apdiVar, ambkVarAu2);
        defpackage.alqk alqkVarAQ3 = vquVarH3.aQ();
        java.util.TimeZone timeZone = kpdVar.b;
        aooh.f(alqkVarAQ3, "<this>");
        aooh.f(timeZone, "timezone");
        alqkVarAQ3.c(apdiVar);
        java.lang.Object objJ3 = ((alaa) alqkVarAQ3).n.j(alacVar);
        if (objJ3 == null) {
            objJ3 = apdiVar.b;
        } else {
            apdiVar.c(objJ3);
        }
        aooh.e(objJ3, "getExtension(...)");
        vaa vaaVarN4 = defpackage.amjk.n(((defpackage.ambk) objJ3).p());
        java.lang.String id = timeZone.getID();
        aooh.e(id, "getID(...)");
        aooh.f(id, "value");
        akzx akzxVar5 = (akzx) vaaVarN4.a;
        akzxVar5.u();
        defpackage.ambk ambkVar7 = (defpackage.ambk) akzxVar5.b;
        j$.util.Objects.requireNonNull(id);
        ambkVar7.c |= 1024;
        ambkVar7.j = id;
        defpackage.ambk ambkVarAu3 = vaaVarN4.au();
        vqu vquVarH4 = ahus.H(alqkVarAQ3.p());
        aooh.e(apdiVar, "smartNotesConversationContext");
        vquVarH4.aY(apdiVar, ambkVarAu3);
        defpackage.alqk alqkVarAQ4 = vquVarH4.aQ();
        java.lang.String absolutePath = file.getAbsolutePath();
        java.lang.Object obj2 = kltVar2.c;
        ?? r4 = kltVar2.d;
        defpackage.ambg ambgVar = ambhVar.d;
        ambhVar.g = ((aljf) obj2).a(alqhVarAC, amba.e, ambgVar, absolutePath);
        ambhVar.g.a(defpackage.ambh.b, alqkVarAQ4, ambgVar, r4);
        return ambhVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.kqt(this.c, this.b, aolnVar);
    }
}

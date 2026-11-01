package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgv {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/service/EndSession");
    public static final aenj b = new aenj("TIDEPODS_CALLSCREEN_BATTERY_SNAPSHOT");
    public static final aenj c = new aenj("TIDEPODS_CALLSCREEN_MEMORY_SNAPSHOT");
    public final java.lang.String d;
    public final java.lang.String e;
    public final android.content.Context f;
    public final defpackage.lgg g;
    public final ajct h;
    public final defpackage.lha i;
    public final defpackage.lgi j;
    public final defpackage.lem k;
    public final defpackage.lju l;
    public final defpackage.lle m;
    public final aoin n;
    public final aoin o;
    public final rwi p;
    public final ruc q;
    public final defpackage.ldn r;
    public final long s;
    public final zjs t;
    public final pqm u;
    public final qbe v;
    public final afpl w;
    private final java.util.concurrent.Executor x;
    private boolean y;
    private boolean z;

    public lgv(java.lang.String str, java.lang.String str2, android.content.Context context, defpackage.lgg lggVar, ajct ajctVar, defpackage.lha lhaVar, defpackage.lgi lgiVar, pqm pqmVar, defpackage.lem lemVar, defpackage.lju ljuVar, afpl afplVar, defpackage.lle lleVar, aoin aoinVar, aoin aoinVar2, rwi rwiVar, ruc rucVar, defpackage.ldn ldnVar, qbe qbeVar, long j, zjs zjsVar) {
        this.d = str;
        this.e = str2;
        this.f = context;
        this.g = lggVar;
        this.h = ajctVar;
        this.x = new ajdc(ajctVar);
        this.i = lhaVar;
        this.j = lgiVar;
        this.u = pqmVar;
        this.k = lemVar;
        this.l = ljuVar;
        this.w = afplVar;
        this.m = lleVar;
        this.n = aoinVar;
        this.o = aoinVar2;
        this.p = rwiVar;
        this.q = rucVar;
        this.r = ldnVar;
        this.v = qbeVar;
        this.s = j;
        this.t = zjsVar;
    }

    public final ajcq a() {
        if (this.z) {
            return ajcm.a;
        }
        this.z = true;
        f();
        e();
        a.b().l("com/android/dialer/callscreen/impl/service/EndSession", "acceptCall", 241, "EndSession.java").v("attempting to stop listening");
        ajcq ajcqVarC = this.j.c();
        int i = 11;
        defpackage.lef lefVar = new defpackage.lef(i);
        java.util.concurrent.Executor executor = this.x;
        ahrv ahrvVarG = ahrv.g(ahvr.H(ajcqVarC, lefVar, executor));
        defpackage.lgg lggVar = this.g;
        j$.util.Objects.requireNonNull(lggVar);
        return ahrvVarG.i(new defpackage.lgr(lggVar, 3), executor).i(new defpackage.lgr(this, 4), executor).i(new defpackage.lgr(this, 5), executor).i(new defpackage.lgr(this, 6), executor).i(new defpackage.lgr(this, 7), executor).i(new defpackage.lgr(this, 8), executor).i(new defpackage.lgr(this, 9), executor).i(new defpackage.lgr(this, 10), executor).i(new defpackage.lgr(this, i), executor);
    }

    public final ajcq b() {
        return ahvr.H(this.j.c(), new defpackage.lef(12), this.h);
    }

    public final ajcq c(defpackage.lgq lgqVar) {
        if (this.y) {
            return ajcm.a;
        }
        this.y = true;
        ahrv ahrvVarG = ahrv.g(this.j.c());
        byte[] bArr = null;
        defpackage.iau iauVar = new defpackage.iau(this, lgqVar, 17, bArr);
        java.util.concurrent.Executor executor = this.x;
        ahrv ahrvVarH = ahrvVarG.h(iauVar, executor);
        defpackage.lgg lggVar = this.g;
        j$.util.Objects.requireNonNull(lggVar);
        return ahrvVarH.i(new defpackage.lgr(lggVar, 3), executor).i(new defpackage.ldp(this, 18), executor).i(new defpackage.ldp(this, 19), executor).i(new defpackage.ldp(this, 20), executor).i(new defpackage.lgr(this, 1), executor).i(new defpackage.kwa(this, lgqVar, 14, bArr), executor).i(new defpackage.lgr(this, 0), executor).i(new defpackage.lgr(this, 2), executor);
    }

    public final ajcq d() {
        final defpackage.ldn ldnVar = this.r;
        defpackage.ldm ldmVar = (defpackage.ldm) aooc.ar(ldnVar.q.Y(), defpackage.ldm.class);
        final ajcq ajcqVarE = ldmVar.E();
        final ajcq ajcqVarBl = ldmVar.bl();
        rwi rwiVar = ldnVar.h;
        final ajcq ajcqVarF = ahvr.F(new raj(rwiVar, 11), rwiVar.c);
        final ajcq ajcqVarBf = ldmVar.bf();
        ajcq ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarE, ajcqVarBl, ajcqVarF, ajcqVarBf}).o(new java.util.concurrent.Callable() { // from class: ldl
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i;
                spn spnVar = (spn) aiql.H(ajcqVarBf);
                akzx akzxVarM = defpackage.lkm.a.m();
                spk spkVar = spnVar.e;
                if (spkVar == null) {
                    spkVar = spk.a;
                }
                udj udjVarB = udj.b(spkVar.c);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                akzxVarM.u();
                defpackage.lkm lkmVar = (defpackage.lkm) akzxVarM.b;
                lkmVar.c = udjVarB.f;
                int i2 = 1;
                lkmVar.b |= 1;
                sql sqlVar = new sql(spnVar);
                java.lang.String strH = (sqlVar.b() == rmt.d || sqlVar.b() == rmt.m) ? sqlVar.h() : "";
                defpackage.ldn ldnVar2 = ldnVar;
                if (!strH.isEmpty()) {
                    akzx akzxVar = ldnVar2.p;
                    akzxVar.u();
                    defpackage.lkb lkbVar = (defpackage.lkb) akzxVar.b;
                    defpackage.lkb lkbVar2 = defpackage.lkb.a;
                    j$.util.Objects.requireNonNull(strH);
                    alat alatVar = lkbVar.g;
                    if (!alatVar.c()) {
                        lkbVar.g = alad.J(alatVar);
                    }
                    lkbVar.g.add(strH);
                }
                zai zaiVar = sqlVar.u().c;
                if (zaiVar == null) {
                    zaiVar = zai.a;
                }
                java.lang.String str = zaiVar.b;
                if (!str.isEmpty()) {
                    akzx akzxVar2 = ldnVar2.p;
                    akzxVar2.u();
                    defpackage.lkb lkbVar3 = (defpackage.lkb) akzxVar2.b;
                    defpackage.lkb lkbVar4 = defpackage.lkb.a;
                    j$.util.Objects.requireNonNull(str);
                    alat alatVar2 = lkbVar3.h;
                    if (!alatVar2.c()) {
                        lkbVar3.h = alad.J(alatVar2);
                    }
                    lkbVar3.h.add(str);
                }
                j$.util.Optional optional = (j$.util.Optional) aiql.H(ajcqVarBl);
                akzx akzxVar3 = ldnVar2.p;
                j$.util.Objects.requireNonNull(akzxVar3);
                defpackage.kwv kwvVar = new defpackage.kwv(akzxVar3, 8);
                if (true == optional.isPresent()) {
                    java.lang.String str2 = (java.lang.String) optional.get();
                    akzx akzxVar4 = (akzx) kwvVar.a;
                    akzxVar4.u();
                    defpackage.lkb lkbVar5 = (defpackage.lkb) akzxVar4.b;
                    defpackage.lkb lkbVar6 = defpackage.lkb.a;
                    j$.util.Objects.requireNonNull(str2);
                    lkbVar5.b |= 4;
                    lkbVar5.e = str2;
                }
                ajcq ajcqVar = ajcqVarF;
                defpackage.lll lllVar = (defpackage.lll) aiql.H(ajcqVarE);
                akzxVar3.u();
                defpackage.lkb lkbVar7 = (defpackage.lkb) akzxVar3.b;
                defpackage.lkb lkbVar8 = defpackage.lkb.a;
                lkbVar7.d = lllVar.h;
                lkbVar7.b |= 2;
                akzx akzxVarM2 = defpackage.ljv.a.m();
                long j = ldnVar2.n;
                akzxVarM2.u();
                defpackage.ljv ljvVar = (defpackage.ljv) akzxVarM2.b;
                ljvVar.b |= 1;
                ljvVar.c = j;
                long j2 = ldnVar2.o;
                akzxVarM2.u();
                defpackage.ljv ljvVar2 = (defpackage.ljv) akzxVarM2.b;
                ljvVar2.b |= 2;
                ljvVar2.d = j2;
                akzxVar3.u();
                defpackage.lkb lkbVar9 = (defpackage.lkb) akzxVar3.b;
                defpackage.ljv ljvVar3 = (defpackage.ljv) akzxVarM2.p();
                j$.util.Objects.requireNonNull(ljvVar3);
                lkbVar9.c = ljvVar3;
                lkbVar9.b |= 1;
                akzx akzxVarM3 = defpackage.lkp.a.m();
                int iIntValue = ((java.lang.Integer) aiql.H(ajcqVar)).intValue();
                if (iIntValue == 1) {
                    i = 5;
                } else if (iIntValue == 2) {
                    i = 3;
                } else if (iIntValue != 3) {
                    i = iIntValue != 4 ? 1 : 4;
                } else {
                    i = 2;
                }
                akzxVarM3.u();
                defpackage.lkp lkpVar = (defpackage.lkp) akzxVarM3.b;
                lkpVar.c = i - 1;
                lkpVar.b |= 1;
                int iC = ldnVar2.j.c();
                if (iC == 0) {
                    i2 = 3;
                } else if (iC == 1) {
                    i2 = 4;
                } else if (iC == 2) {
                    i2 = 2;
                }
                akzxVarM3.u();
                defpackage.lkp lkpVar2 = (defpackage.lkp) akzxVarM3.b;
                lkpVar2.d = i2 - 1;
                lkpVar2.b |= 2;
                int streamVolume = ldnVar2.i.getStreamVolume(2);
                akzxVarM3.u();
                defpackage.lkp lkpVar3 = (defpackage.lkp) akzxVarM3.b;
                lkpVar3.b |= 4;
                lkpVar3.e = streamVolume;
                akzxVar3.u();
                defpackage.lkb lkbVar10 = (defpackage.lkb) akzxVar3.b;
                defpackage.lkp lkpVar4 = (defpackage.lkp) akzxVarM3.p();
                j$.util.Objects.requireNonNull(lkpVar4);
                lkbVar10.i = lkpVar4;
                lkbVar10.b |= 16;
                akzxVar3.u();
                defpackage.lkb lkbVar11 = (defpackage.lkb) akzxVar3.b;
                defpackage.lkm lkmVar2 = (defpackage.lkm) akzxVarM.p();
                j$.util.Objects.requireNonNull(lkmVar2);
                lkbVar11.f = lkmVar2;
                lkbVar11.b |= 8;
                return (defpackage.lkb) akzxVar3.p();
            }
        }, ldnVar.g);
        ajcq ajcqVarA = this.j.a();
        return ahvr.ak(new ajcq[]{ajcqVarO, ajcqVarA}).p(new defpackage.jsr(this, ajcqVarA, ajcqVarO, 8), this.x);
    }

    public final void e() {
        defpackage.lgg lggVar = this.g;
        final ajcq ajcqVarB = b();
        final ajcq ajcqVarH = ahvr.H(lggVar.b(), new defpackage.lef(10), lggVar.e);
        agsm.i(287, ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarH}).p(new ajas() { // from class: lgs
            public final ajcq a() {
                java.lang.Boolean bool = (java.lang.Boolean) aiql.H(ajcqVarB);
                defpackage.lgv lgvVar = this.a;
                if (!((java.lang.Boolean) lgvVar.o.a()).booleanValue() && bool.booleanValue()) {
                    defpackage.lgv.a.b().l("com/android/dialer/callscreen/impl/service/EndSession", "performPostCallSurveyAction", 310, "EndSession.java").v("not showing survey for a Revelio call");
                    return ajcm.a;
                }
                ypm ypmVar = (ypm) aiql.H(ajcqVarH);
                defpackage.lle lleVar = lgvVar.m;
                java.lang.String str = lgvVar.d;
                double dRandom = java.lang.Math.random();
                java.lang.Double dValueOf = (java.lang.Double) lleVar.c.a();
                if (dValueOf.doubleValue() < 0.0d || dValueOf.doubleValue() > 1.0d) {
                    a.bt(defpackage.lle.a.c().m(aioa.b), "Invalid survey chance (should be 0-1): %s", dValueOf, "com/android/dialer/callscreen/impl/survey/CallScreenSurveyChooser", "retrieveAndValidateFlag", 'G', "CallScreenSurveyChooser.java", zct.b);
                    dValueOf = java.lang.Double.valueOf(0.0d);
                }
                if (dRandom < dValueOf.doubleValue()) {
                    akzx akzxVarM = defpackage.lld.b.m();
                    akzxVarM.u();
                    defpackage.lld lldVar = (defpackage.lld) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    lldVar.c |= 1;
                    lldVar.d = str;
                    akzxVarM.u();
                    defpackage.lld lldVar2 = (defpackage.lld) akzxVarM.b;
                    lldVar2.e = ypmVar.a();
                    lldVar2.c |= 2;
                    akzxVarM.J(ampc.c);
                    akzxVarM.J(ampc.d);
                    akzxVarM.J(ampc.b);
                    defpackage.lld lldVar3 = (defpackage.lld) akzxVarM.p();
                    defpackage.oq oqVar = lleVar.d;
                    android.content.Context context = lleVar.b;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.callscreen.impl.survey.CallScreenSurveyActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra("call_screen_survey_activity_intent_extra_call_screen_survey_args", lldVar3.i());
                    android.app.PendingIntent pendingIntentB = afap.b(context, 0, intent, 201326592);
                    defpackage.dva dvaVar = new defpackage.dva(context, "phone_feedback");
                    dvaVar.n(2131231609);
                    dvaVar.h(context.getString(2132017854));
                    dvaVar.g(context.getString(2132017853));
                    dvaVar.o = "feedback_group";
                    dvaVar.g = pendingIntentB;
                    dvaVar.d(16, true);
                    dvaVar.q();
                    ((rwj) oqVar.a).a("feedback_notification_tag", dvaVar.a());
                } else if (((java.lang.Boolean) lgvVar.n.a()).booleanValue()) {
                    defpackage.lgu lguVar = (defpackage.lgu) aooc.ar(lgvVar.w.Y(), defpackage.lgu.class);
                    ajcq ajcqVarAN = lguVar.aN();
                    ajcq ajcqVarBl = lguVar.bl();
                    ajcq ajcqVarO = lguVar.O();
                    ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarAN, ajcqVarBl, ajcqVarO});
                    joq joqVar = new joq(lgvVar, ajcqVarBl, ajcqVarAN, ajcqVarO, 3);
                    ajct ajctVar = lgvVar.h;
                    ajcq ajcqVarO2 = ahdaVarAk.o(joqVar, ajctVar);
                    defpackage.lgi lgiVar = lgvVar.j;
                    android.content.Context context2 = lgvVar.f;
                    ajcq ajcqVarC = lgiVar.c();
                    ((lgt) agab.aH(context2, lgt.class)).fR().isPresent();
                    ajcq ajcqVarZ = aiql.z(j$.util.Optional.empty());
                    return ahvr.ak(new ajcq[]{ajcqVarO2, ajcqVarC, ajcqVarZ}).p(new defpackage.kff((java.lang.Object) lgvVar, (java.lang.Object) ajcqVarZ, ajcqVarC, ajcqVarO2, 5), ajctVar);
                }
                return ajcm.a;
            }
        }, this.h), "failed to perform post call survey.", new java.lang.Object[0]);
    }

    public final void f() {
        j$.util.Optional optional = this.j.h;
        defpackage.kwv kwvVar = new defpackage.kwv(this, 12);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = kwvVar.a;
            ((vwb) obj).b();
            defpackage.ldn ldnVar = ((defpackage.lgv) obj2).r;
            agsm.i(286, ahvr.E(new defpackage.ldf(ldnVar, 3), ldnVar.g), "failed to log stop recording time", new java.lang.Object[0]);
        }
    }

    public final ajcq g() {
        return ahvr.E(new defpackage.ldf(this, 10), this.h);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzv {
    public static final aimz a = aimz.i("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader");
    public static final aify b = aify.o(new java.lang.String[]{"_id", "call_type", "features", "timestamp", "duration", "data_usage", "phone_account_component_name", "call_mapping_id", "number_attributes", "is_read", "phone_account_id", "calling_networks_attributes", "spam_status"});
    public static final aify c = aify.o(new java.lang.String[]{"_id", "call_type", "features", "timestamp", "duration", "data_usage", "phone_account_component_name", "call_mapping_id", "number_attributes", "is_read", "phone_account_id", "calling_networks_attributes", "spam_status", "raw_number", "presentation"});
    public final ajct d;
    public final aoin e;
    public final aoin f;
    public final aoin g;
    public final zjm h;
    public final defpackage.ifb i;
    final rai j = new rai(this);
    private final android.content.Context k;
    private final j$.util.Optional l;
    private final teb m;
    private final defpackage.kfg n;
    private final aoin o;
    private final zjm p;
    private final zjm q;
    private final zjm r;
    private final zjm s;
    private final zjm t;
    private final defpackage.jyn u;
    private final rsr v;

    public lzv(android.content.Context context, ajct ajctVar, j$.util.Optional optional, zjm zjmVar, zjm zjmVar2, zjm zjmVar3, zjm zjmVar4, aoin aoinVar, aoin aoinVar2, rsr rsrVar, zjm zjmVar5, teb tebVar, defpackage.kfg kfgVar, defpackage.ifb ifbVar, defpackage.jyn jynVar, aoin aoinVar3, zjm zjmVar6, aoin aoinVar4) {
        this.k = context;
        this.d = ajctVar;
        this.l = optional;
        this.p = zjmVar;
        this.q = zjmVar2;
        this.r = zjmVar3;
        this.s = zjmVar4;
        this.o = aoinVar;
        this.e = aoinVar2;
        this.v = rsrVar;
        this.t = zjmVar5;
        this.m = tebVar;
        this.n = kfgVar;
        this.i = ifbVar;
        this.u = jynVar;
        this.f = aoinVar3;
        this.h = zjmVar6;
        this.g = aoinVar4;
    }

    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v22, types: [aoss, java.lang.Object] */
    public final ajcq a(defpackage.kis kisVar) {
        final ajcq ajcqVarG;
        ajcq ajcqVarZ;
        ajcq ajcqVarH;
        ajcq ajcqVarH2;
        ajcq ajcqVarJ;
        ajcq ajcqVarH3;
        char c2;
        ajcq ajcqVarF;
        java.lang.Object objZ;
        boolean zBooleanValue = ((java.lang.Boolean) this.g.a()).booleanValue();
        aihd aihdVarO = zBooleanValue ? (aihd) j$.util.Collection.-EL.stream(kisVar.d).map(new defpackage.kle(18)).collect(aido.b) : aihd.o(kisVar.c);
        aify aifyVarN = (!zBooleanValue && kisVar.d.isEmpty()) ? (aify) j$.util.Collection.-EL.stream(kisVar.c).map(new defpackage.kle(19)).collect(aido.a) : aify.n(kisVar.d);
        aify aifyVar = aifyVarN;
        int i = 0;
        if (((java.lang.Boolean) this.e.a()).booleanValue()) {
            ajcqVarG = aiql.z(aike.a);
            ajcqVarZ = this.v.ab(aihd.o(kisVar.b));
        } else {
            alan alanVar = kisVar.b;
            defpackage.kfg kfgVar = this.n;
            ajcqVarG = ahvr.G(new defpackage.kff(kfgVar, alanVar, this.j, i), kfgVar.b);
            ajcqVarZ = aiql.z(aikj.b);
        }
        final ajcq ajcqVarF2 = ahvr.F(new syg(this.k, aihdVarO, 6), this.m.b);
        if (((java.lang.Boolean) this.o.a()).booleanValue()) {
            j$.util.Optional optional = this.l;
            if (optional.isPresent()) {
                ldb ldbVar = (ldb) optional.orElseThrow();
                ajcqVarH = ahvr.H(ldbVar.d.b(aihdVarO.g()), new defpackage.lbs(17), ldbVar.b);
            } else {
                a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getCallScreenTranscriptIds", 539, "ConversationHistoryCallDetailsLoader.java").v("callScreenDataLoader not present");
                ajcqVarH = aiql.z(aikn.a);
            }
        } else {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getCallScreenTranscriptIds", 534, "ConversationHistoryCallDetailsLoader.java").v("Call Screen details disabled");
            ajcqVarH = aiql.z(aikn.a);
        }
        zjm zjmVar = this.p;
        if (zjmVar.g().isPresent()) {
            defpackage.wye wyeVar = (defpackage.wye) zjmVar.g().orElseThrow();
            ajcqVarH2 = ahrv.g(wyeVar.b.d(aifyVar)).h(new wro(6), wyeVar.a);
        } else {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getAtlasCallDetailsMapFuture", 549, "ConversationHistoryCallDetailsLoader.java").v("Atlas feature not found");
            ajcqVarH2 = aiql.z(aikj.b);
        }
        final ajcq ajcqVar = ajcqVarH2;
        zjm zjmVar2 = this.s;
        if (zjmVar2.g().isPresent()) {
            ajcqVarJ = ((lbi) ((kva) zjmVar2.g().orElseThrow()).c.a()).j(aifyVar);
        } else {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getCallRecordingDetailsMapFuture", 563, "ConversationHistoryCallDetailsLoader.java").v("Call recording feature not found");
            ajcqVarJ = aiql.z(aikj.b);
        }
        final ajcq ajcqVar2 = ajcqVarJ;
        zjm zjmVar3 = this.t;
        if (zjmVar3.g().isPresent()) {
            vqy vqyVar = (vqy) zjmVar3.g().orElseThrow();
            ajcqVarH3 = ahrv.g(((wqr) vqyVar.b).b(aifyVar)).h(new vrx(12), (java.util.concurrent.Executor) vqyVar.a);
        } else {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getXatuCallDetailsMapFuture", 576, "ConversationHistoryCallDetailsLoader.java").v("Xatu feature not found");
            ajcqVarH3 = aiql.z(aikj.b);
        }
        final ajcq ajcqVar3 = ajcqVarH3;
        zjm zjmVar4 = this.q;
        if (zjmVar4.g().isPresent()) {
            aogc aogcVar = ((mnp) zjmVar4.g().orElseThrow()).f;
            aooh.f(aifyVar, "callCreationTimeMillisList");
            c2 = 3;
            ajcqVarF = aosv.F((aoss) aogcVar.a, 0, new defpackage.nrw(aogcVar, (java.util.List) aifyVar, (aoln) null, 2, (byte[]) null), 3);
        } else {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getDobbyCallDetailsMapFuture", 586, "ConversationHistoryCallDetailsLoader.java").v("Dobby feature not found");
            ajcqVarF = aiql.z(aikj.b);
            c2 = 3;
        }
        final ajcq ajcqVar4 = ajcqVarF;
        j$.util.Optional optionalG = this.r.g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.oms) optionalG.get()).a());
        }
        if (true != optionalG.isPresent()) {
            a.b().l("com/android/dialer/conversationhistorycalldetails/dataservice/ConversationHistoryCallDetailsLoader", "getFermatCallDetailsMapFuture", 604, "ConversationHistoryCallDetailsLoader.java").v("Fermat call details retriever not found");
            objZ = aiql.z(aikj.b);
        } else {
            objZ = optionalG.get();
        }
        final ajcq ajcqVar5 = (ajcq) objZ;
        ajcq[] ajcqVarArr = new ajcq[9];
        ajcqVarArr[0] = ajcqVarG;
        ajcqVarArr[1] = ajcqVarZ;
        ajcqVarArr[2] = ajcqVarF2;
        ajcqVarArr[c2] = ajcqVarH;
        ajcqVarArr[4] = ajcqVar;
        ajcqVarArr[5] = ajcqVar2;
        ajcqVarArr[6] = ajcqVar3;
        ajcqVarArr[7] = ajcqVar4;
        ajcqVarArr[8] = ajcqVar5;
        ahda ahdaVarAk = ahvr.ak(ajcqVarArr);
        final ajcq ajcqVar6 = ajcqVarH;
        final ajcq ajcqVar7 = ajcqVarZ;
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: lzu
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                aify aifyVar2 = (aify) aiql.H(ajcqVarG);
                java.util.Map map = (java.util.Map) aiql.H(ajcqVar7);
                aihd aihdVar = (aihd) aiql.H(ajcqVarF2);
                aihd aihdVar2 = (aihd) aiql.H(ajcqVar6);
                aigf aigfVar = (aigf) aiql.H(ajcqVar);
                aigf aigfVar2 = (aigf) aiql.H(ajcqVar2);
                aigf aigfVar3 = (aigf) aiql.H(ajcqVar3);
                aigf aigfVar4 = (aigf) aiql.H(ajcqVar4);
                aigf aigfVar5 = (aigf) aiql.H(ajcqVar5);
                akzx akzxVarM = defpackage.kiq.a.m();
                defpackage.lzv lzvVar = this.a;
                if (((java.lang.Boolean) lzvVar.e.a()).booleanValue()) {
                    java.util.Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        defpackage.kdy kdyVar = (defpackage.kdy) it.next();
                        akzx akzxVarM2 = defpackage.kip.a.m();
                        long j = kdyVar.a;
                        akzxVarM2.u();
                        defpackage.kip kipVar = (defpackage.kip) akzxVarM2.b;
                        kipVar.b |= 1;
                        kipVar.c = j;
                        int i2 = kdyVar.p;
                        akzxVarM2.u();
                        defpackage.kip kipVar2 = (defpackage.kip) akzxVarM2.b;
                        kipVar2.b |= 4;
                        kipVar2.e = i2;
                        int i3 = kdyVar.l;
                        akzxVarM2.u();
                        defpackage.kip kipVar3 = (defpackage.kip) akzxVarM2.b;
                        kipVar3.b |= 8;
                        kipVar3.f = i3;
                        long j2 = kdyVar.b;
                        akzxVarM2.u();
                        defpackage.kip kipVar4 = (defpackage.kip) akzxVarM2.b;
                        kipVar4.b |= 2;
                        kipVar4.d = j2;
                        long j3 = kdyVar.r;
                        akzxVarM2.u();
                        java.util.Iterator it2 = it;
                        defpackage.kip kipVar5 = (defpackage.kip) akzxVarM2.b;
                        kipVar5.b |= 16;
                        kipVar5.g = j3;
                        long j4 = kdyVar.q;
                        akzxVarM2.u();
                        defpackage.kip kipVar6 = (defpackage.kip) akzxVarM2.b;
                        kipVar6.b |= 32;
                        kipVar6.h = j4;
                        java.lang.String strValueOf = ((java.lang.Boolean) lzvVar.g.a()).booleanValue() ? java.lang.String.valueOf(j2) : ahvr.co(kdyVar.s);
                        akzxVarM2.u();
                        defpackage.kip kipVar7 = (defpackage.kip) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(strValueOf);
                        kipVar7.b |= 512;
                        kipVar7.l = strValueOf;
                        boolean z = kdyVar.g;
                        akzxVarM2.u();
                        defpackage.kip kipVar8 = (defpackage.kip) akzxVarM2.b;
                        kipVar8.b |= 64;
                        kipVar8.i = z;
                        java.lang.String strCo = ahvr.co(kdyVar.j);
                        akzxVarM2.u();
                        defpackage.kip kipVar9 = (defpackage.kip) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(strCo);
                        kipVar9.b |= 128;
                        kipVar9.j = strCo;
                        java.lang.String strCo2 = ahvr.co(kdyVar.k);
                        akzxVarM2.u();
                        defpackage.kip kipVar10 = (defpackage.kip) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(strCo2);
                        kipVar10.b |= 256;
                        kipVar10.k = strCo2;
                        if (((java.lang.Boolean) lzvVar.f.a()).booleanValue()) {
                            java.lang.String strCo3 = ahvr.co(kdyVar.d);
                            akzxVarM2.u();
                            defpackage.kip kipVar11 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(strCo3);
                            kipVar11.b |= 2097152;
                            kipVar11.w = strCo3;
                            int i4 = kdyVar.f;
                            akzxVarM2.u();
                            defpackage.kip kipVar12 = (defpackage.kip) akzxVarM2.b;
                            kipVar12.b |= 4194304;
                            kipVar12.x = i4;
                        }
                        defpackage.jvx jvxVarC = kdyVar.c();
                        if (jvxVarC != null) {
                            akzxVarM2.u();
                            defpackage.kip kipVar13 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(jvxVarC);
                            kipVar13.q = jvxVarC;
                            kipVar13.b |= 16384;
                        }
                        ucu ucuVarI = kdyVar.i();
                        if (ucuVarI != null) {
                            akzxVarM2.u();
                            defpackage.kip kipVar14 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(ucuVarI);
                            kipVar14.r = ucuVarI;
                            kipVar14.b |= 32768;
                        }
                        boolean zContains = aihdVar.contains(((defpackage.kip) akzxVarM2.b).l);
                        akzxVarM2.u();
                        defpackage.kip kipVar15 = (defpackage.kip) akzxVarM2.b;
                        kipVar15.b |= 2048;
                        kipVar15.n = zContains;
                        boolean zContains2 = aihdVar2.contains(kipVar15.l);
                        akzxVarM2.u();
                        defpackage.kip kipVar16 = (defpackage.kip) akzxVarM2.b;
                        kipVar16.b |= 1024;
                        kipVar16.m = zContains2;
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j2);
                        if (aigfVar.containsKey(lValueOf)) {
                            wxp wxpVar = (wxp) aigfVar.get(lValueOf);
                            akzxVarM2.u();
                            defpackage.kip kipVar17 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(wxpVar);
                            kipVar17.o = wxpVar;
                            kipVar17.b |= 4096;
                        }
                        if (aigfVar2.containsKey(lValueOf)) {
                            kui kuiVar = (kui) aigfVar2.get(lValueOf);
                            akzxVarM2.u();
                            defpackage.kip kipVar18 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(kuiVar);
                            kipVar18.p = kuiVar;
                            kipVar18.b |= 8192;
                        }
                        if (aigfVar3.containsKey(lValueOf)) {
                            wgu wguVar = (wgu) aigfVar3.get(lValueOf);
                            akzxVarM2.u();
                            defpackage.kip kipVar19 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(wguVar);
                            kipVar19.s = wguVar;
                            kipVar19.b |= 65536;
                        }
                        if (aigfVar4.containsKey(lValueOf)) {
                            defpackage.mmw mmwVar = (defpackage.mmw) aigfVar4.get(lValueOf);
                            akzxVarM2.u();
                            defpackage.kip kipVar20 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(mmwVar);
                            kipVar20.t = mmwVar;
                            kipVar20.b |= 262144;
                        }
                        if (aigfVar5.containsKey(lValueOf)) {
                            defpackage.omr omrVar = (defpackage.omr) aigfVar5.get(lValueOf);
                            akzxVarM2.u();
                            defpackage.kip kipVar21 = (defpackage.kip) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(omrVar);
                            kipVar21.u = omrVar;
                            kipVar21.b |= 524288;
                        }
                        akzxVarM.D((defpackage.kip) akzxVarM2.p());
                        it = it2;
                    }
                } else {
                    int size = aifyVar2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        defpackage.kip kipVar22 = (defpackage.kip) aifyVar2.get(i5);
                        akzx akzxVarM3 = defpackage.kip.a.m();
                        akzxVarM3.z(kipVar22);
                        boolean zContains3 = aihdVar.contains(kipVar22.l);
                        akzxVarM3.u();
                        defpackage.kip kipVar23 = (defpackage.kip) akzxVarM3.b;
                        kipVar23.b |= 2048;
                        kipVar23.n = zContains3;
                        boolean zContains4 = aihdVar2.contains(kipVar22.l);
                        akzxVarM3.u();
                        defpackage.kip kipVar24 = (defpackage.kip) akzxVarM3.b;
                        kipVar24.b |= 1024;
                        kipVar24.m = zContains4;
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(kipVar22.d);
                        if (aigfVar.containsKey(lValueOf2)) {
                            wxp wxpVar2 = (wxp) aigfVar.get(lValueOf2);
                            akzxVarM3.u();
                            defpackage.kip kipVar25 = (defpackage.kip) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(wxpVar2);
                            kipVar25.o = wxpVar2;
                            kipVar25.b |= 4096;
                        }
                        if (aigfVar2.containsKey(lValueOf2)) {
                            kui kuiVar2 = (kui) aigfVar2.get(lValueOf2);
                            akzxVarM3.u();
                            defpackage.kip kipVar26 = (defpackage.kip) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(kuiVar2);
                            kipVar26.p = kuiVar2;
                            kipVar26.b |= 8192;
                        }
                        if (aigfVar3.containsKey(lValueOf2)) {
                            wgu wguVar2 = (wgu) aigfVar3.get(lValueOf2);
                            akzxVarM3.u();
                            defpackage.kip kipVar27 = (defpackage.kip) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(wguVar2);
                            kipVar27.s = wguVar2;
                            kipVar27.b |= 65536;
                        }
                        if (aigfVar4.containsKey(lValueOf2)) {
                            defpackage.mmw mmwVar2 = (defpackage.mmw) aigfVar4.get(lValueOf2);
                            akzxVarM3.u();
                            defpackage.kip kipVar28 = (defpackage.kip) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(mmwVar2);
                            kipVar28.t = mmwVar2;
                            kipVar28.b |= 262144;
                        }
                        if (aigfVar5.containsKey(lValueOf2)) {
                            defpackage.omr omrVar2 = (defpackage.omr) aigfVar5.get(lValueOf2);
                            akzxVarM3.u();
                            defpackage.kip kipVar29 = (defpackage.kip) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(omrVar2);
                            kipVar29.u = omrVar2;
                            kipVar29.b |= 524288;
                        }
                        akzxVarM.D((defpackage.kip) akzxVarM3.p());
                    }
                }
                return (defpackage.kiq) akzxVarM.p();
            }
        };
        ajct ajctVar = this.d;
        ajcq ajcqVarO = ahdaVarAk.o(callable, ajctVar);
        defpackage.jyn jynVar = this.u;
        j$.util.Objects.requireNonNull(jynVar);
        return ahvr.I(ajcqVarO, new defpackage.lhy(jynVar, 16), ajctVar);
    }
}

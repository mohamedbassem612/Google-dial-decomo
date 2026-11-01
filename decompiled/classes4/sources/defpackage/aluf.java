package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluf implements defpackage.alud, defpackage.alle {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/CallAssistantResultHandler");
    private static final aihd b = aihd.r(defpackage.alsy.END_CALL, defpackage.alsy.START_RINGING);
    private defpackage.aluc c;
    private defpackage.aljv d;
    private defpackage.aljw e;
    private defpackage.alul f;
    private final defpackage.aluk g;
    private java.lang.Boolean h;
    private defpackage.aljp i;
    private final hgw j;
    private final her k;
    private final her l;
    private final her m;
    private final heq n;

    public aluf(her herVar, her herVar2, hgw hgwVar, heq heqVar, her herVar3, aizr aizrVar) {
        this.l = herVar;
        this.m = herVar2;
        this.j = hgwVar;
        this.n = heqVar;
        this.k = herVar3;
        this.g = new defpackage.aluk(aizrVar);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Type inference failed for: r0v43, types: [ajcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.alle
    public final /* synthetic */ void a(java.lang.Object obj) {
        boolean z;
        java.lang.String strA;
        apdi apdiVar = defpackage.alta.g;
        alaa alaaVar = (alaa) obj;
        alaaVar.c(apdiVar);
        akzs akzsVar = alaaVar.n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            alaaVar.c(apdiVar);
            java.lang.Object objJ = alaaVar.n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alta altaVar = (defpackage.alta) objJ;
            defpackage.alsw alswVar = altaVar.d;
            if (alswVar == null) {
                alswVar = defpackage.alsw.a;
            }
            int iOrdinal = defpackage.alsv.a(alswVar.b).ordinal();
            if (iOrdinal == 0) {
                defpackage.alsm alsmVar = (alswVar.b == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a).d;
                if (alsmVar == null) {
                    alsmVar = defpackage.alsm.a;
                }
                strA = alsmVar.c;
            } else if (iOrdinal == 1) {
                strA = (alswVar.b == 2 ? (defpackage.altf) alswVar.c : defpackage.altf.a).c;
            } else if (iOrdinal != 2) {
                strA = "";
            } else {
                strA = defpackage.alpq.a(alswVar.b == 3 ? (defpackage.alrg) alswVar.c : defpackage.alrg.b);
            }
            if (!strA.isEmpty()) {
                this.c.b(strA);
            }
            aihd aihdVar = b;
            defpackage.alsy alsyVarB = defpackage.alsy.b(altaVar.e);
            if (alsyVarB == null) {
                alsyVarB = defpackage.alsy.NO_ACTION;
            }
            if (aihdVar.contains(alsyVarB)) {
                this.c.a(this.g.c());
            }
        }
        this.c.a((defpackage.alsi) obj);
        defpackage.aluk alukVar = this.g;
        alukVar.c.lock();
        try {
            alukVar.t.b((defpackage.alsi) obj);
            java.util.concurrent.locks.ReentrantLock reentrantLock = alukVar.c;
            reentrantLock.unlock();
            apdi apdiVar2 = defpackage.alwp.b;
            alaaVar.c(apdiVar2);
            akzs akzsVar2 = alaaVar.n;
            alac alacVar2 = (alac) apdiVar2.a;
            if (akzsVar2.l(alacVar2)) {
                alaaVar.c(apdiVar2);
                java.lang.Object objJ2 = alaaVar.n.j(alacVar2);
                if (objJ2 == null) {
                    objJ2 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ2);
                }
                defpackage.alwp alwpVar = (defpackage.alwp) objJ2;
                apdi apdiVar3 = defpackage.alyf.e;
                alwpVar.c(apdiVar3);
                akzs akzsVar3 = ((alaa) alwpVar).n;
                alac alacVar3 = (alac) apdiVar3.a;
                if (akzsVar3.l(alacVar3)) {
                    alwpVar.c(apdiVar3);
                    java.lang.Object objJ3 = ((alaa) alwpVar).n.j(alacVar3);
                    if (objJ3 == null) {
                        objJ3 = apdiVar3.b;
                    } else {
                        apdiVar3.c(objJ3);
                    }
                    defpackage.alyf alyfVar = (defpackage.alyf) objJ3;
                    if (alukVar.i()) {
                        aify aifyVar = (aify) j$.util.Collection.-EL.stream(alyfVar.c).map(new defpackage.alyy(alukVar, 1)).collect(aido.a);
                        reentrantLock.lock();
                        try {
                            if (alukVar.i.isEmpty()) {
                                reentrantLock.unlock();
                            } else {
                                if (aifyVar.size() == alukVar.i.size()) {
                                    if (new aitr(aitt.n(aifyVar, alukVar.i)).b(false, new defpackage.aluj(alukVar, 0))) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                alukVar.c.unlock();
                                if (!z) {
                                }
                            }
                            alukVar.e(aike.a);
                            if (alukVar.b.isEmpty()) {
                                alukVar.e(aifyVar);
                                alukVar.r.a(alukVar.b(true));
                            } else {
                                j$.util.Optional optional = alukVar.b;
                                whq whqVar = new whq(alukVar, aifyVar, 8, (byte[]) null);
                                if (true == optional.isPresent()) {
                                    ?? r0 = optional.get();
                                    java.lang.Object obj2 = whqVar.b;
                                    r0.b(new defpackage.akbr(obj2, whqVar.a, 18), ((defpackage.aluk) obj2).g.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            alukVar.c.unlock();
                            throw th;
                        }
                    }
                    alukVar.r.a(alukVar.b(false));
                } else {
                    apdi apdiVar4 = defpackage.alxg.b;
                    alwpVar.c(apdiVar4);
                    if (((alaa) alwpVar).n.l((alac) apdiVar4.a)) {
                        alukVar.c.lock();
                        try {
                            alukVar.o = true;
                            alukVar.c.unlock();
                        } catch (java.lang.Throwable th2) {
                            alukVar.c.unlock();
                            throw th2;
                        }
                    }
                }
                apdi apdiVar5 = defpackage.alwu.e;
                alwpVar.c(apdiVar5);
                akzs akzsVar4 = ((alaa) alwpVar).n;
                java.lang.Object obj3 = apdiVar5.a;
                if (akzsVar4.l((alac) obj3)) {
                    alukVar.c.lock();
                    try {
                        if (alukVar.k) {
                            alwpVar.c(apdiVar5);
                            java.lang.Object objJ4 = ((alaa) alwpVar).n.j((alac) obj3);
                            if (objJ4 == null) {
                                objJ4 = apdiVar5.b;
                            } else {
                                apdiVar5.c(objJ4);
                            }
                            akzm akzmVar = ((defpackage.alwu) objJ4).c;
                            if (akzmVar == null) {
                                akzmVar = akzm.a;
                            }
                            alukVar.n = j$.util.Optional.of(j$.time.Instant.ofEpochMilli(aldf.a(akzmVar)));
                        }
                        alukVar.k = false;
                        return;
                    } finally {
                        alukVar.c.unlock();
                    }
                }
                return;
            }
            apdi apdiVar6 = defpackage.alql.c;
            alaaVar.c(apdiVar6);
            akzs akzsVar5 = alaaVar.n;
            java.lang.Object obj4 = apdiVar6.a;
            if (!akzsVar5.l((alac) obj4)) {
                apdi apdiVar7 = defpackage.alsh.e;
                alaaVar.c(apdiVar7);
                akzs akzsVar6 = alaaVar.n;
                java.lang.Object obj5 = apdiVar7.a;
                if (akzsVar6.l((alac) obj5)) {
                    alukVar.c.lock();
                    try {
                        ((alaa) obj).c(apdiVar7);
                        java.lang.Object objJ5 = ((alaa) obj).n.j((alac) obj5);
                        if (objJ5 == null) {
                            objJ5 = apdiVar7.b;
                        } else {
                            apdiVar7.c(objJ5);
                        }
                        alukVar.q = ((defpackage.alsh) objJ5).c;
                        return;
                    } finally {
                        alukVar.c.unlock();
                    }
                }
                apdi apdiVar8 = defpackage.alta.g;
                alaaVar.c(apdiVar8);
                akzs akzsVar7 = alaaVar.n;
                alac alacVar4 = (alac) apdiVar8.a;
                if (akzsVar7.l(alacVar4)) {
                    alaaVar.c(apdiVar8);
                    java.lang.Object objJ6 = alaaVar.n.j(alacVar4);
                    if (objJ6 == null) {
                        objJ6 = apdiVar8.b;
                    } else {
                        apdiVar8.c(objJ6);
                    }
                    defpackage.alta altaVar2 = (defpackage.alta) objJ6;
                    if (alukVar.f) {
                        defpackage.alsy alsyVarB2 = defpackage.alsy.b(altaVar2.e);
                        if (alsyVarB2 == null) {
                            alsyVarB2 = defpackage.alsy.NO_ACTION;
                        }
                        if (alsyVarB2 == defpackage.alsy.START_RINGING) {
                            alukVar.c.lock();
                            try {
                                alukVar.k = true;
                                boolean z2 = !alukVar.o && alukVar.j.isPresent();
                                if (z2) {
                                    alukVar.j = j$.util.Optional.empty();
                                }
                                alukVar.c.unlock();
                                if (z2) {
                                    alukVar.r.a(alukVar.b(false));
                                    alukVar.r.a(alukVar.c());
                                    return;
                                }
                                return;
                            } catch (java.lang.Throwable th3) {
                                alukVar.c.unlock();
                                throw th3;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = alukVar.c;
            reentrantLock2.lock();
            try {
                ((alaa) obj).c(apdiVar6);
                java.lang.Object objJ7 = ((alaa) obj).n.j((alac) obj4);
                if (objJ7 == null) {
                    objJ7 = apdiVar6.b;
                } else {
                    apdiVar6.c(objJ7);
                }
                alat<defpackage.alqw> alatVar = ((defpackage.alql) objJ7).b;
                java.lang.String str = (java.lang.String) j$.util.Collection.-EL.stream(alatVar).map(new defpackage.alpp(10)).collect(j$.util.stream.Collectors.joining(" "));
                if (str.isEmpty()) {
                    alukVar.c.unlock();
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = 0;
                int length = 0;
                for (defpackage.alqw alqwVar : alatVar) {
                    int length2 = i + (alqwVar.c.length() - 1);
                    j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(alqwVar.d).filter(new defpackage.altw(3)).findFirst();
                    alue alueVar = new alue(length, length2, 0);
                    if (true == optionalFindFirst.isPresent()) {
                        java.lang.Object obj6 = optionalFindFirst.get();
                        int i2 = alueVar.a;
                        int i3 = alueVar.b;
                        akzx akzxVarM = defpackage.alwe.a.m();
                        akzxVarM.u();
                        defpackage.alwe alweVar = (defpackage.alwe) akzxVarM.b;
                        alweVar.b |= 1;
                        alweVar.c = i2;
                        akzxVarM.u();
                        defpackage.alwe alweVar2 = (defpackage.alwe) akzxVarM.b;
                        alweVar2.b |= 2;
                        alweVar2.d = i3;
                        akzxVarM.u();
                        defpackage.alwe alweVar3 = (defpackage.alwe) akzxVarM.b;
                        alweVar3.e = 2;
                        alweVar3.b |= 4;
                        optionalFindFirst = j$.util.Optional.of((defpackage.alwe) akzxVarM.p());
                        optionalFindFirst.getClass();
                    }
                    j$.util.Objects.requireNonNull(arrayList);
                    defpackage.alju aljuVar = new defpackage.alju(arrayList, 19);
                    if (true == optionalFindFirst.isPresent()) {
                        aljuVar.a.add(optionalFindFirst.get());
                    }
                    length += alqwVar.c.length() + 1;
                    i = length;
                }
                java.util.ArrayList arrayList2 = alukVar.p;
                akzx akzxVarM2 = defpackage.alwf.a.m();
                akzxVarM2.u();
                defpackage.alwf alwfVar = (defpackage.alwf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                alwfVar.b |= 1;
                alwfVar.c = str;
                akzxVarM2.aR(arrayList);
                arrayList2.add((defpackage.alwf) akzxVarM2.p());
                reentrantLock2.unlock();
            } catch (java.lang.Throwable th4) {
                alukVar.c.unlock();
                throw th4;
            }
        } catch (java.lang.Throwable th5) {
            alukVar.c.unlock();
            throw th5;
        }
    }

    @Override // defpackage.alud
    public final defpackage.alub b(defpackage.amaz amazVar) {
        return defpackage.alzx.f;
    }

    @Override // defpackage.alud
    public final void d(java.lang.String str, defpackage.alqh alqhVar, defpackage.alqk alqkVar, ajcu ajcuVar, defpackage.amgv amgvVar) throws defpackage.alio {
        defpackage.hjn hjnVar;
        try {
            apdi apdiVar = defpackage.alwn.r;
            alqkVar.c(apdiVar);
            akzs akzsVar = ((alaa) alqkVar).n;
            java.lang.Object obj = apdiVar.a;
            java.lang.Object objJ = akzsVar.j((alac) obj);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            this.h = java.lang.Boolean.valueOf(((defpackage.alwn) objJ).q);
            alqkVar.c(apdiVar);
            java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) obj);
            if (objJ2 == null) {
                objJ2 = apdiVar.b;
            } else {
                apdiVar.c(objJ2);
            }
            defpackage.alyo alyoVarB = defpackage.alyo.b(((defpackage.alwn) objJ2).c);
            if (alyoVarB == null) {
                alyoVarB = defpackage.alyo.USE_CASE_UNKNOWN;
            }
            int iOrdinal = alyoVarB.ordinal();
            if (iOrdinal == 1) {
                hjnVar = new defpackage.hjn((him) this.l.a, 0);
            } else if (iOrdinal == 2) {
                hjnVar = new hjl((him) this.m.a);
            } else if (iOrdinal == 6) {
                hjnVar = new hjw((him) this.n.a);
            } else if (iOrdinal == 7) {
                hjnVar = new hie((him) this.j.a);
            } else {
                if (iOrdinal != 8) {
                    throw new defpackage.aljs(java.lang.String.format("Failed to initialize use case of type %s.", alyoVarB.name()), defpackage.aljr.i);
                }
                hjnVar = new defpackage.hjn((him) this.k.a, 1, null);
            }
            this.f = hjnVar;
            this.i = hjnVar.d();
            this.d = this.f.a();
            this.e = this.f.b();
            this.d.j(this);
            this.d.i(str);
            this.i.c(j$.util.Optional.of(str), ajcuVar, alqhVar, alqkVar, j$.util.Optional.of(this.f.c()), amgvVar);
            defpackage.aluk alukVar = this.g;
            alqkVar.c(apdiVar);
            java.lang.Object objJ3 = ((alaa) alqkVar).n.j((alac) obj);
            if (objJ3 == null) {
                objJ3 = apdiVar.b;
            } else {
                apdiVar.c(objJ3);
            }
            defpackage.alwn alwnVar = (defpackage.alwn) objJ3;
            defpackage.alvy alvyVar = new defpackage.alvy(ajcuVar, java.util.Locale.forLanguageTag(alwnVar.m));
            alukVar.s = this;
            alukVar.b = j$.util.Optional.of(ajcuVar);
            alukVar.v = alvyVar;
            alukVar.d = alwnVar;
            if ((alwnVar.b & 2048) != 0) {
                alukVar.m = alwnVar.l;
            }
            defpackage.alxj alxjVar = alwnVar.e;
            if (alxjVar == null) {
                alxjVar = defpackage.alxj.a;
            }
            int iQ = airh.q(alxjVar.c);
            if (iQ == 0) {
                iQ = 1;
            }
            alukVar.y = iQ;
            alukVar.e = alwnVar.p;
            defpackage.alyo alyoVarB2 = defpackage.alyo.b(alwnVar.c);
            if (alyoVarB2 == null) {
                alyoVarB2 = defpackage.alyo.USE_CASE_UNKNOWN;
            }
            alukVar.f = alyoVarB2 == defpackage.alyo.USE_CASE_AGENTIC_CALL_SCREEN;
            alukVar.g = j$.time.Duration.ofMillis(400L);
            alukVar.t = alukVar.g() ? new defpackage.aluh(1, null) : new defpackage.aluh(0);
            alukVar.u = new j$.util.concurrent.ConcurrentHashMap();
        } catch (java.lang.Exception e) {
            throw new defpackage.alio("Initializing bot conversation failed. ", defpackage.alti.CORE_INFRA_FATAL_FAILURE, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x031a A[Catch: all -> 0x03bd, TRY_LEAVE, TryCatch #11 {all -> 0x03bd, blocks: (B:130:0x02de, B:132:0x02fd, B:134:0x031a, B:148:0x03b7, B:149:0x03bc, B:131:0x02e1), top: B:223:0x02de, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0364  */
    /* JADX WARN: Code duplicated, block: B:140:0x0382  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf A[Catch: all -> 0x00f5, TryCatch #4 {all -> 0x00f5, blocks: (B:31:0x00ae, B:33:0x00bf, B:34:0x00d1, B:36:0x00dc, B:37:0x00e9), top: B:209:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc A[Catch: all -> 0x00f5, TryCatch #4 {all -> 0x00f5, blocks: (B:31:0x00ae, B:33:0x00bf, B:34:0x00d1, B:36:0x00dc, B:37:0x00e9), top: B:209:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    @Override // defpackage.alud
    public final void e(defpackage.alro alroVar) {
        apdi apdiVar;
        java.lang.Object objJ;
        j$.util.Optional optionalOfNullable;
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        defpackage.alui aluiVar;
        java.lang.String strA;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        defpackage.alqm alqmVar;
        defpackage.alqr alqrVar;
        j$.util.Optional optionalJ;
        defpackage.xbz xbzVar;
        j$.util.Optional optionalJ2;
        defpackage.xbz xbzVar2;
        defpackage.alui aluiVar2;
        this.d.g(alroVar);
        final defpackage.aluk alukVar = this.g;
        alukVar.c.lock();
        try {
            alukVar.t.a(alroVar);
            java.util.concurrent.locks.ReentrantLock reentrantLock3 = alukVar.c;
            reentrantLock3.unlock();
            apdi apdiVar2 = defpackage.alqv.f;
            alroVar.c(apdiVar2);
            akzs akzsVar = ((alaa) alroVar).n;
            alac alacVar = (alac) apdiVar2.a;
            final int i = 3;
            if (akzsVar.l(alacVar)) {
                alroVar.c(apdiVar2);
                java.lang.Object objJ2 = ((alaa) alroVar).n.j(alacVar);
                if (objJ2 == null) {
                    objJ2 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ2);
                }
                alqu alquVar = ((defpackage.alqv) objJ2).c;
                if (alquVar == null) {
                    alquVar = alqu.a;
                }
                reentrantLock3.lock();
                try {
                    if (alukVar.o) {
                        reentrantLock2 = alukVar.c;
                        reentrantLock2.unlock();
                        if (alquVar.c == 1) {
                            alqmVar = (defpackage.alqm) alquVar.d;
                        } else {
                            alqmVar = defpackage.alqm.a;
                        }
                        if (alqmVar.b.isEmpty()) {
                            if (alquVar.c == 2) {
                                alqrVar = (defpackage.alqr) alquVar.d;
                            } else {
                                alqrVar = defpackage.alqr.a;
                            }
                            if (!alqrVar.b.isEmpty()) {
                                optionalJ = alukVar.j(alquVar, alroVar.c, 2);
                                xbzVar = new defpackage.xbz(alukVar, 16);
                                if (true == optionalJ.isPresent()) {
                                    optionalJ = j$.util.Optional.ofNullable(((defpackage.aluk) xbzVar.a).d((defpackage.alyp) optionalJ.get()));
                                }
                                reentrantLock2.lock();
                                try {
                                    alukVar.j = optionalJ;
                                    alukVar.c.unlock();
                                } catch (java.lang.Throwable th) {
                                    alukVar.c.unlock();
                                    throw th;
                                }
                            }
                        } else {
                            alukVar.c.lock();
                            try {
                                optionalJ2 = alukVar.j(alquVar, alroVar.c, 3);
                                xbzVar2 = new defpackage.xbz(alukVar, 16);
                                if (true == optionalJ2.isPresent()) {
                                    optionalJ2 = j$.util.Optional.ofNullable(((defpackage.aluk) xbzVar2.a).d((defpackage.alyp) optionalJ2.get()));
                                }
                                aluiVar2 = new defpackage.alui(alukVar, 0);
                                if (true == optionalJ2.isPresent()) {
                                    ((defpackage.aluk) aluiVar2.a).a((defpackage.alww) optionalJ2.get());
                                }
                                alukVar.j = j$.util.Optional.empty();
                                alukVar.c.unlock();
                            } catch (java.lang.Throwable th2) {
                                alukVar.c.unlock();
                                throw th2;
                            }
                        }
                    } else {
                        if (!alukVar.k) {
                            j$.util.Optional optionalOfNullable2 = alukVar.n;
                            defpackage.xbz xbzVar3 = new defpackage.xbz(alquVar, 15);
                            if (true == optionalOfNullable2.isPresent()) {
                                optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(aizp.a(((alqu) xbzVar3.a).e).isBefore((j$.time.Instant) optionalOfNullable2.get())));
                            }
                            if (!((java.lang.Boolean) optionalOfNullable2.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                reentrantLock2 = alukVar.c;
                                reentrantLock2.unlock();
                                if (alquVar.c == 1) {
                                    alqmVar = (defpackage.alqm) alquVar.d;
                                } else {
                                    alqmVar = defpackage.alqm.a;
                                }
                                if (alqmVar.b.isEmpty()) {
                                    alukVar.c.lock();
                                    optionalJ2 = alukVar.j(alquVar, alroVar.c, 3);
                                    xbzVar2 = new defpackage.xbz(alukVar, 16);
                                    if (true == optionalJ2.isPresent()) {
                                        optionalJ2 = j$.util.Optional.ofNullable(((defpackage.aluk) xbzVar2.a).d((defpackage.alyp) optionalJ2.get()));
                                    }
                                    aluiVar2 = new defpackage.alui(alukVar, 0);
                                    if (true == optionalJ2.isPresent()) {
                                        ((defpackage.aluk) aluiVar2.a).a((defpackage.alww) optionalJ2.get());
                                    }
                                    alukVar.j = j$.util.Optional.empty();
                                    alukVar.c.unlock();
                                } else {
                                    if (alquVar.c == 2) {
                                        alqrVar = (defpackage.alqr) alquVar.d;
                                    } else {
                                        alqrVar = defpackage.alqr.a;
                                    }
                                    if (!alqrVar.b.isEmpty()) {
                                        optionalJ = alukVar.j(alquVar, alroVar.c, 2);
                                        xbzVar = new defpackage.xbz(alukVar, 16);
                                        if (true == optionalJ.isPresent()) {
                                            optionalJ = j$.util.Optional.ofNullable(((defpackage.aluk) xbzVar.a).d((defpackage.alyp) optionalJ.get()));
                                        }
                                        reentrantLock2.lock();
                                        alukVar.j = optionalJ;
                                        alukVar.c.unlock();
                                    }
                                }
                            }
                        }
                        alukVar.c.unlock();
                    }
                    alukVar.r.a(alukVar.b(false));
                    alukVar.r.a(alukVar.c());
                } catch (java.lang.Throwable th3) {
                    alukVar.c.unlock();
                    throw th3;
                }
            }
            apdi apdiVar3 = defpackage.alqy.f;
            alroVar.c(apdiVar3);
            akzs akzsVar2 = ((alaa) alroVar).n;
            alac alacVar2 = (alac) apdiVar3.a;
            if (akzsVar2.l(alacVar2)) {
                alroVar.c(apdiVar3);
                java.lang.Object objJ3 = ((alaa) alroVar).n.j(alacVar2);
                if (objJ3 == null) {
                    objJ3 = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ3);
                }
                defpackage.alqy alqyVar = (defpackage.alqy) objJ3;
                defpackage.alsw alswVar = alqyVar.d;
                if (alswVar == null) {
                    alswVar = defpackage.alsw.a;
                }
                int iOrdinal = defpackage.alsv.a(alswVar.b).ordinal();
                if (iOrdinal == 0) {
                    defpackage.alsw alswVar2 = alqyVar.d;
                    if (alswVar2 == null) {
                        alswVar2 = defpackage.alsw.a;
                    }
                    defpackage.alsm alsmVar = (alswVar2.b == 1 ? (defpackage.alsn) alswVar2.c : defpackage.alsn.a).d;
                    if (alsmVar == null) {
                        alsmVar = defpackage.alsm.a;
                    }
                    strA = alsmVar.d;
                } else if (iOrdinal == 1) {
                    defpackage.alsw alswVar3 = alqyVar.d;
                    if (alswVar3 == null) {
                        alswVar3 = defpackage.alsw.a;
                    }
                    strA = (alswVar3.b == 2 ? (defpackage.altf) alswVar3.c : defpackage.altf.a).c;
                } else if (iOrdinal != 2) {
                    strA = "";
                } else {
                    defpackage.alsw alswVar4 = alqyVar.d;
                    if (alswVar4 == null) {
                        alswVar4 = defpackage.alsw.a;
                    }
                    strA = defpackage.alpq.a(alswVar4.b == 3 ? (defpackage.alrg) alswVar4.c : defpackage.alrg.b);
                }
                if (!alukVar.e || !strA.isEmpty()) {
                    akzx akzxVarM = defpackage.alyp.a.m();
                    akzxVarM.u();
                    defpackage.alyp alypVar = (defpackage.alyp) akzxVarM.b;
                    alypVar.c = 1;
                    alypVar.b |= 1;
                    long j = alroVar.c;
                    akzxVarM.u();
                    defpackage.alyp alypVar2 = (defpackage.alyp) akzxVarM.b;
                    alypVar2.b |= 4;
                    alypVar2.e = j;
                    akzxVarM.u();
                    defpackage.alyp alypVar3 = (defpackage.alyp) akzxVarM.b;
                    alypVar3.f = 1;
                    alypVar3.b |= 8;
                    akzx akzxVarM2 = defpackage.alwf.a.m();
                    akzxVarM2.u();
                    defpackage.alwf alwfVar = (defpackage.alwf) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strA);
                    alwfVar.b |= 1;
                    alwfVar.c = strA;
                    defpackage.alwf alwfVar2 = (defpackage.alwf) akzxVarM2.p();
                    akzxVarM.u();
                    defpackage.alyp alypVar4 = (defpackage.alyp) akzxVarM.b;
                    j$.util.Objects.requireNonNull(alwfVar2);
                    alypVar4.d = alwfVar2;
                    alypVar4.b |= 2;
                    defpackage.alww alwwVarD = alukVar.d((defpackage.alyp) akzxVarM.p());
                    alukVar.c.lock();
                    try {
                        final int iA = alukVar.a(alwwVarD);
                        alukVar.c.unlock();
                        alukVar.v.a(strA, j$.time.Duration.ofMillis(alqyVar.e), new java.util.function.Consumer() { // from class: qss
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                int i2 = i;
                                if (i2 == 0) {
                                    aihd aihdVar = qtd.a;
                                    ((android.view.View) alukVar).setVisibility(iA);
                                    return;
                                }
                                if (i2 == 1) {
                                    agsm.i(509, ahvr.G(new pth((rai) obj, iA, 0), ((pti) alukVar).a), "failed sending onRttInitiationFailed", new java.lang.Object[0]);
                                    return;
                                }
                                if (i2 == 2) {
                                    ((rwi) alukVar).j((java.lang.String) obj, iA);
                                    return;
                                }
                                int iIntValue = ((java.lang.Integer) obj).intValue();
                                akzx akzxVarM3 = defpackage.alwe.a.m();
                                akzxVarM3.u();
                                defpackage.alwe alweVar = (defpackage.alwe) akzxVarM3.b;
                                alweVar.b |= 1;
                                alweVar.c = 0;
                                akzxVarM3.u();
                                defpackage.alwe alweVar2 = (defpackage.alwe) akzxVarM3.b;
                                alweVar2.b |= 2;
                                alweVar2.d = iIntValue;
                                akzxVarM3.u();
                                defpackage.alwe alweVar3 = (defpackage.alwe) akzxVarM3.b;
                                alweVar3.e = 1;
                                alweVar3.b |= 4;
                                defpackage.alwe alweVar4 = (defpackage.alwe) akzxVarM3.p();
                                java.lang.Object obj2 = alukVar;
                                defpackage.aluk alukVar2 = (defpackage.aluk) obj2;
                                alukVar2.c.lock();
                                int i3 = iA;
                                try {
                                    defpackage.alww alwwVar = (defpackage.alww) ((defpackage.aluk) obj2).h.get(i3);
                                    defpackage.alyp alypVar5 = alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a;
                                    akzx akzxVarP = alypVar5.p();
                                    defpackage.alwf alwfVar3 = alypVar5.d;
                                    if (alwfVar3 == null) {
                                        alwfVar3 = defpackage.alwf.a;
                                    }
                                    akzx akzxVarP2 = alwfVar3.p();
                                    akzxVarP2.u();
                                    ((defpackage.alwf) akzxVarP2.b).d = albq.a;
                                    akzxVarP2.u();
                                    defpackage.alwf alwfVar4 = (defpackage.alwf) akzxVarP2.b;
                                    j$.util.Objects.requireNonNull(alweVar4);
                                    alwfVar4.b();
                                    alwfVar4.d.add(alweVar4);
                                    defpackage.alwf alwfVar5 = (defpackage.alwf) akzxVarP2.p();
                                    akzxVarP.u();
                                    defpackage.alyp alypVar6 = (defpackage.alyp) akzxVarP.b;
                                    j$.util.Objects.requireNonNull(alwfVar5);
                                    alypVar6.d = alwfVar5;
                                    alypVar6.b |= 2;
                                    defpackage.alyp alypVar7 = (defpackage.alyp) akzxVarP.p();
                                    akzx akzxVarP3 = alwwVar.p();
                                    akzxVarP3.u();
                                    defpackage.alww alwwVar2 = (defpackage.alww) akzxVarP3.b;
                                    j$.util.Objects.requireNonNull(alypVar7);
                                    alwwVar2.d = alypVar7;
                                    alwwVar2.c = 3;
                                    ((defpackage.aluk) obj2).h.set(i3, (defpackage.alww) akzxVarP3.p());
                                    alukVar2.c.unlock();
                                    alukVar2.r.a(alukVar2.b(false));
                                } catch (java.lang.Throwable th4) {
                                    alukVar2.c.unlock();
                                    throw th4;
                                }
                            }

                            @Override // java.util.function.Consumer
                            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                                int i2 = i;
                                if (i2 == 0) {
                                    return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                                }
                                if (i2 != 1) {
                                    return i2 != 2 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                                }
                                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                            }
                        });
                    } catch (java.lang.Throwable th4) {
                        alukVar.c.unlock();
                        throw th4;
                    }
                }
                alukVar.r.a(alukVar.b(false));
            }
            apdi apdiVar4 = defpackage.altd.d;
            alroVar.c(apdiVar4);
            if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
                if (alukVar.h()) {
                    alukVar.c.lock();
                    try {
                        boolean zAnyMatch = j$.util.Collection.-EL.stream(alukVar.i).anyMatch(new defpackage.altw(7));
                        alukVar.c.unlock();
                        if (!zAnyMatch) {
                            apdiVar = defpackage.altd.d;
                            alroVar.c(apdiVar);
                            objJ = ((alaa) alroVar).n.j((alac) apdiVar.a);
                            if (objJ == null) {
                                objJ = apdiVar.b;
                            } else {
                                apdiVar.c(objJ);
                            }
                            java.util.concurrent.locks.ReentrantLock reentrantLock4 = alukVar.c;
                            defpackage.altd altdVar = (defpackage.altd) objJ;
                            reentrantLock4.lock();
                            try {
                                reentrantLock4.lock();
                                try {
                                    alukVar.e((aify) j$.util.Collection.-EL.stream(alukVar.i).map(new defpackage.aite(altdVar, 20)).collect(aido.a));
                                    alukVar.c.unlock();
                                    optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alxf) alukVar.u.get(java.lang.Long.valueOf(altdVar.c)));
                                    if (true == optionalOfNullable.isPresent()) {
                                        defpackage.alxf alxfVar = (defpackage.alxf) optionalOfNullable.get();
                                        akzz akzzVarM = defpackage.alro.a.m();
                                        apdi apdiVar5 = defpackage.aloo.f;
                                        akzx akzxVarM3 = defpackage.aloo.a.m();
                                        akzxVarM3.u();
                                        defpackage.aloo alooVar = (defpackage.aloo) akzxVarM3.b;
                                        j$.util.Objects.requireNonNull(alxfVar);
                                        alooVar.c = alxfVar;
                                        alooVar.b |= 1;
                                        akzzVarM.bV(apdiVar5, (defpackage.aloo) akzxVarM3.p());
                                        optionalOfNullable = j$.util.Optional.ofNullable(akzzVarM.p());
                                    }
                                    reentrantLock = alukVar.c;
                                    reentrantLock.unlock();
                                    aluiVar = new defpackage.alui(alukVar, 2);
                                    if (true == optionalOfNullable.isPresent()) {
                                        ((defpackage.aluk) aluiVar.a).s.e((defpackage.alro) optionalOfNullable.get());
                                    }
                                    alukVar.r.a(alukVar.b(false));
                                    if (alukVar.g()) {
                                        reentrantLock.lock();
                                        try {
                                            alukVar.e((aify) j$.util.Collection.-EL.stream(alukVar.i).filter(new defpackage.altw(8)).collect(aido.a));
                                            alukVar.c.unlock();
                                        } catch (java.lang.Throwable th5) {
                                            alukVar.c.unlock();
                                            throw th5;
                                        }
                                    }
                                    alukVar.r.a(alukVar.b(false));
                                } catch (java.lang.Throwable th6) {
                                    alukVar.c.unlock();
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                alukVar.c.unlock();
                                throw th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        alukVar.c.unlock();
                        throw th8;
                    }
                } else {
                    apdiVar = defpackage.altd.d;
                    alroVar.c(apdiVar);
                    objJ = ((alaa) alroVar).n.j((alac) apdiVar.a);
                    if (objJ == null) {
                        objJ = apdiVar.b;
                    } else {
                        apdiVar.c(objJ);
                    }
                    java.util.concurrent.locks.ReentrantLock reentrantLock5 = alukVar.c;
                    defpackage.altd altdVar2 = (defpackage.altd) objJ;
                    reentrantLock5.lock();
                    reentrantLock5.lock();
                    alukVar.e((aify) j$.util.Collection.-EL.stream(alukVar.i).map(new defpackage.aite(altdVar2, 20)).collect(aido.a));
                    alukVar.c.unlock();
                    optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alxf) alukVar.u.get(java.lang.Long.valueOf(altdVar2.c)));
                    if (true == optionalOfNullable.isPresent()) {
                        defpackage.alxf alxfVar2 = (defpackage.alxf) optionalOfNullable.get();
                        akzz akzzVarM2 = defpackage.alro.a.m();
                        apdi apdiVar6 = defpackage.aloo.f;
                        akzx akzxVarM4 = defpackage.aloo.a.m();
                        akzxVarM4.u();
                        defpackage.aloo alooVar2 = (defpackage.aloo) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(alxfVar2);
                        alooVar2.c = alxfVar2;
                        alooVar2.b |= 1;
                        akzzVarM2.bV(apdiVar6, (defpackage.aloo) akzxVarM4.p());
                        optionalOfNullable = j$.util.Optional.ofNullable(akzzVarM2.p());
                    }
                    reentrantLock = alukVar.c;
                    reentrantLock.unlock();
                    aluiVar = new defpackage.alui(alukVar, 2);
                    if (true == optionalOfNullable.isPresent()) {
                        ((defpackage.aluk) aluiVar.a).s.e((defpackage.alro) optionalOfNullable.get());
                    }
                    alukVar.r.a(alukVar.b(false));
                    if (alukVar.g()) {
                        reentrantLock.lock();
                        alukVar.e((aify) j$.util.Collection.-EL.stream(alukVar.i).filter(new defpackage.altw(8)).collect(aido.a));
                        alukVar.c.unlock();
                    }
                    alukVar.r.a(alukVar.b(false));
                }
            }
            apdi apdiVar7 = defpackage.alqx.d;
            alroVar.c(apdiVar7);
            if (((alaa) alroVar).n.l((alac) apdiVar7.a)) {
                if (alukVar.i() && (!alukVar.h() || !alukVar.g())) {
                    alukVar.k(3);
                }
                alukVar.c.lock();
                try {
                    alukVar.w = 3;
                    alukVar.x = 3;
                    java.util.concurrent.locks.ReentrantLock reentrantLock6 = alukVar.c;
                    reentrantLock6.unlock();
                    alukVar.v.b();
                    reentrantLock6.lock();
                    try {
                        alukVar.h = (java.util.List) j$.util.Collection.-EL.stream(alukVar.h).map(new defpackage.alpp(9)).collect(j$.util.stream.Collectors.toCollection(new defpackage.ahuq(8)));
                        alukVar.c.unlock();
                        alukVar.r.a(alukVar.b(false));
                        alukVar.r.a(alukVar.c());
                    } catch (java.lang.Throwable th9) {
                        alukVar.c.unlock();
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    alukVar.c.unlock();
                    throw th10;
                }
            }
            apdi apdiVar8 = defpackage.alsd.b;
            alroVar.c(apdiVar8);
            if (((alaa) alroVar).n.l((alac) apdiVar8.a)) {
                alukVar.c.lock();
                try {
                    alukVar.w = 2;
                    alukVar.x = 4;
                    alukVar.k(4);
                    alukVar.f();
                    alukVar.c.unlock();
                    alukVar.r.a(alukVar.b(false));
                } catch (java.lang.Throwable th11) {
                    alukVar.c.unlock();
                    throw th11;
                }
            }
            apdi apdiVar9 = defpackage.alsc.b;
            alroVar.c(apdiVar9);
            if (((alaa) alroVar).n.l((alac) apdiVar9.a)) {
                alukVar.c.lock();
                try {
                    alukVar.x = 2;
                    alukVar.w = 4;
                    alukVar.k(4);
                    alukVar.f();
                    alukVar.c.unlock();
                    alukVar.r.a(alukVar.b(false));
                } catch (java.lang.Throwable th12) {
                    alukVar.c.unlock();
                    throw th12;
                }
            }
            apdi apdiVar10 = defpackage.alsr.b;
            alroVar.c(apdiVar10);
            if (((alaa) alroVar).n.l((alac) apdiVar10.a)) {
                alukVar.c.lock();
                try {
                    alukVar.k = true;
                } finally {
                    alukVar.c.unlock();
                }
            }
        } catch (java.lang.Throwable th13) {
            alukVar.c.unlock();
            throw th13;
        }
    }

    @Override // defpackage.alud
    public final void f(defpackage.aljk aljkVar) {
        defpackage.aljw aljwVar = this.e;
        akzz akzzVarM = defpackage.amal.a.m();
        akzzVarM.bV(defpackage.ambe.b, aljkVar);
        aljwVar.c((defpackage.amal) akzzVarM.p());
    }

    @Override // defpackage.alud
    public final void g(defpackage.aluc alucVar) {
        this.c = alucVar;
        this.g.r = alucVar;
    }

    @Override // defpackage.alud
    public final void h(j$.util.Optional optional) throws defpackage.alio {
        try {
            this.i.a(optional);
            defpackage.aluk alukVar = this.g;
            alukVar.c.lock();
            try {
                alukVar.h.clear();
                alukVar.t.c();
                alukVar.i = aike.a;
                alukVar.j = j$.util.Optional.empty();
                alukVar.w = 4;
                alukVar.x = 4;
                alukVar.k = false;
                alukVar.n = j$.util.Optional.empty();
                alukVar.o = false;
                alukVar.p = new java.util.ArrayList();
                alukVar.q = "";
                alukVar.l = true;
                alukVar.c.unlock();
                boolean zBooleanValue = this.h.booleanValue();
                aimz aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/CallAssistantResultHandler", "start", 183, "CallAssistantResultHandler.java").v("Disclaimer need to be kicked off manually from Client");
                    return;
                }
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/CallAssistantResultHandler", "start", 185, "CallAssistantResultHandler.java").v("Disclaimer has been kicked off automatically");
                akzz akzzVarM = defpackage.alro.a.m();
                akzzVarM.bV(defpackage.altb.b, defpackage.altb.a);
                e((defpackage.alro) akzzVarM.p());
            } catch (java.lang.Throwable th) {
                alukVar.c.unlock();
                throw th;
            }
        } catch (java.lang.Exception e) {
            throw new defpackage.alio("Starting bot conversation failed. ", defpackage.alti.CORE_INFRA_FATAL_FAILURE, e);
        }
    }

    @Override // defpackage.alud
    public final void i() {
        this.i.b();
    }

    @Override // defpackage.alud
    public final void c(defpackage.alub alubVar) {
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wzg implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ wzg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, yml] */
    /* JADX WARN: Type inference failed for: r0v84, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v116, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v123, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v128, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v55, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [acyv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v12, types: [aczw, java.lang.Object] */
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
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarZ;
        ajcq ajcqVarA;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i = 19;
        int i2 = 7;
        int i3 = 10;
        int i4 = 15;
        int i5 = 16;
        int i6 = 3;
        int i7 = 8;
        byte[] bArr = null;
        int i8 = 0;
        int i9 = 2;
        int i10 = 1;
        switch (this.$cid) {
            case 0:
                boolean zN = ((apjb) obj).n();
                java.lang.Object obj2 = this.a;
                if (zN) {
                    ((wzh) obj2).h.o(rmx.jo);
                    a.bI(wzh.a.d(), "exception uploading audio to Scotty", "com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsWorker", "handleUploadToScotty", 'y', "AtlasMetricsWorker.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.b;
                defpackage.wyw wywVar = ((wzh) obj2).i;
                return ahrv.g(((wzd) wywVar.b).f(((defpackage.wyz) obj3).a)).i(new defpackage.wyv(wywVar, i10), ajbm.a);
            case 1:
                akzx akzxVarM = idt.a.m();
                akzxVarM.u();
                idt idtVar = akzxVarM.b;
                java.lang.Object obj4 = this.a;
                j$.util.Objects.requireNonNull(obj4);
                idtVar.b |= 1;
                idtVar.e = (java.lang.String) obj4;
                akzx akzxVarM2 = idr.a.m();
                akzxVarM2.u();
                idr idrVar = akzxVarM2.b;
                idrVar.b |= 1;
                idrVar.e = 16000;
                akzxVarM2.u();
                idr idrVar2 = akzxVarM2.b;
                idrVar2.b |= 2;
                idrVar2.f = 1;
                akzxVarM2.u();
                idr idrVar3 = akzxVarM2.b;
                idrVar3.b |= 4;
                idrVar3.g = 2;
                akzxVarM2.u();
                idr idrVar4 = akzxVarM2.b;
                idrVar4.b |= 8;
                idrVar4.h = 16000;
                akzx akzxVarM3 = idq.a.m();
                akzxVarM3.u();
                idq idqVar = akzxVarM3.b;
                idqVar.b |= 1;
                idqVar.c = 8;
                akzxVarM2.u();
                idr idrVar5 = akzxVarM2.b;
                idq idqVarP = akzxVarM3.p();
                j$.util.Objects.requireNonNull(idqVarP);
                idrVar5.d = idqVarP;
                idrVar5.c = 5;
                akzxVarM.u();
                idt idtVar2 = akzxVarM.b;
                idr idrVarP = akzxVarM2.p();
                j$.util.Objects.requireNonNull(idrVarP);
                idtVar2.d = idrVarP;
                idtVar2.c = 2;
                return ((defpackage.wze) this.b).e.n(akzxVarM.p(), (akzc) obj);
            case 2:
                ahvr.bZ(((java.lang.Boolean) obj).booleanValue(), "failed to add file group");
                return ((defpackage.wzx) this.b).h.F((defpackage.acvj) this.a);
            case 3:
                ahrv ahrvVarG = ahrv.g((ajcq) this.a);
                defpackage.qgk qgkVar = new defpackage.qgk(i5);
                defpackage.xbk xbkVar = (defpackage.xbk) this.b;
                ajcu ajcuVar = xbkVar.j;
                return ahrvVarG.i(qgkVar, ajcuVar).j(((long) ((java.lang.Integer) obj).intValue()) + ((java.lang.Long) xbkVar.l.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue();
                java.lang.Object obj5 = this.a;
                ?? r0 = this.b;
                if (iIntValue == 0) {
                    defpackage.ymi ymiVar = new defpackage.ymi(1, 0, "Feature is unavailable.", null);
                    defpackage.ymr ymrVar = (defpackage.ymr) obj5;
                    ymrVar.e.execute(new opo(ymrVar, (defpackage.yml) r0, ymiVar, 17));
                    return aiql.y(ymiVar);
                }
                if (iIntValue == 1 || iIntValue == 2) {
                    defpackage.ymr ymrVar2 = (defpackage.ymr) obj5;
                    return ymrVar2.b.f(ymrVar2.c, r0);
                }
                if (iIntValue != 3) {
                    return aiql.y(new defpackage.ymi(1, 0, "Unexpected feature status: ".concat(java.lang.String.valueOf(num)), null));
                }
                defpackage.ymr ymrVar3 = (defpackage.ymr) obj5;
                defpackage.ymk ymkVar = ymrVar3.c;
                android.util.Log.i(defpackage.ymr.a, "Feature " + ymkVar.a + " is downloaded and ready.");
                ymrVar3.e.execute(new defpackage.wdm(obj5, r0, i7, bArr));
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.ymq ymqVar = (defpackage.ymq) obj;
                return ymqVar.b.d(dff.m(new defpackage.vus(this.b, ymqVar, this.a, i9)), new fed(4));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                if (zBooleanValue) {
                    zsk.a.b().m(aioa.a).l("com/google/android/dialershared/precall/impl/CallLauncherImpl", "launch", 60, "CallLauncherImpl.java").v("launching emergency precall");
                    zsk zskVar = (zsk) obj7;
                    zth zthVar = zskVar.f;
                    j$.util.Optional optional = (j$.util.Optional) zthVar.c;
                    return ahvr.H(optional.isEmpty() ? aiql.z(obj6) : ahvr.I(((zta) optional.orElseThrow()).b((defpackage.zrx) obj6), new defpackage.wzg(zthVar, obj6, i2), (java.util.concurrent.Executor) zthVar.d), new defpackage.zqi(obj7, i9), zskVar.e);
                }
                zsk.a.b().m(aioa.a).l("com/google/android/dialershared/precall/impl/CallLauncherImpl", "launch", 63, "CallLauncherImpl.java").v("launching precall");
                final zsk zskVar2 = (zsk) obj7;
                zsq zsqVar = zskVar2.b;
                if (zsqVar.b.isEmpty()) {
                    akzx akzxVarM4 = defpackage.zsx.a.m();
                    akzxVarM4.u();
                    defpackage.zsx zsxVar = (defpackage.zsx) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(obj6);
                    zsxVar.f = (defpackage.zrx) obj6;
                    zsxVar.b |= 8;
                    ajcqVarZ = aiql.z((defpackage.zsx) akzxVarM4.p());
                } else {
                    ajcqVarZ = zsqVar.b((defpackage.zrx) obj6, 0);
                }
                return ahvr.H(ajcqVarZ, new ahyc() { // from class: zsj
                    public final java.lang.Object apply(java.lang.Object obj8) {
                        defpackage.zsx zsxVar2 = (defpackage.zsx) obj8;
                        defpackage.xch xchVar = new defpackage.xch(zsxVar2, 15);
                        zsk zskVar3 = zskVar2;
                        j$.util.Optional optional2 = zskVar3.c;
                        optional2.isPresent();
                        java.lang.Object obj9 = xchVar.a;
                        java.lang.Object obj10 = optional2.get();
                        defpackage.zsx zsxVar3 = (defpackage.zsx) obj9;
                        if (zsxVar3.d) {
                            defpackage.zrx zrxVar = zsxVar3.f;
                            if (zrxVar == null) {
                                zrxVar = defpackage.zrx.a;
                            }
                            ((gou) obj10).o(zrxVar, 3);
                        } else if (zsxVar3.c) {
                            defpackage.zrx zrxVar2 = zsxVar3.f;
                            if (zrxVar2 == null) {
                                zrxVar2 = defpackage.zrx.a;
                            }
                            ((gou) obj10).o(zrxVar2, 2);
                        } else {
                            defpackage.zrx zrxVar3 = zsxVar3.f;
                            if (zrxVar3 == null) {
                                zrxVar3 = defpackage.zrx.a;
                            }
                            ((gou) obj10).o(zrxVar3, 1);
                        }
                        if (zsxVar2.d) {
                            zsk.a.b().l("com/google/android/dialershared/precall/impl/CallLauncherImpl", "launchCall", 97, "CallLauncherImpl.java").v("abort call");
                            return null;
                        }
                        defpackage.zrx zrxVar4 = zsxVar2.f;
                        if (zrxVar4 == null) {
                            zrxVar4 = defpackage.zrx.a;
                        }
                        if ((zsxVar2.b & 1) == 0 || !zsxVar2.c) {
                            zsk.a.b().l("com/google/android/dialershared/precall/impl/CallLauncherImpl", "launchCall", 111, "CallLauncherImpl.java").v("starting call");
                            zskVar3.b.c(zrxVar4);
                        } else {
                            zsk.a.b().l("com/google/android/dialershared/precall/impl/CallLauncherImpl", "launchCall", 103, "CallLauncherImpl.java").v("starting PrecallActivity");
                            android.content.Context context = zskVar3.d;
                            defpackage.zry zryVar = zrxVar4.f;
                            if (zryVar == null) {
                                zryVar = defpackage.zry.a;
                            }
                            if (zryVar.b == 1) {
                                akzx akzxVarP = zrxVar4.p();
                                defpackage.zry zryVar2 = zrxVar4.f;
                                if (zryVar2 == null) {
                                    zryVar2 = defpackage.zry.a;
                                }
                                akzx akzxVarP2 = zryVar2.p();
                                defpackage.zry zryVar3 = zrxVar4.f;
                                if (zryVar3 == null) {
                                    zryVar3 = defpackage.zry.a;
                                }
                                akzx akzxVarP3 = (zryVar3.b == 1 ? (defpackage.zsi) zryVar3.c : defpackage.zsi.a).p();
                                akzxVarP3.u();
                                defpackage.zsi zsiVar = (defpackage.zsi) akzxVarP3.b;
                                zsiVar.b |= 2;
                                zsiVar.c = -1L;
                                akzxVarP2.u();
                                defpackage.zry zryVar4 = (defpackage.zry) akzxVarP2.b;
                                defpackage.zsi zsiVar2 = (defpackage.zsi) akzxVarP3.p();
                                j$.util.Objects.requireNonNull(zsiVar2);
                                zryVar4.c = zsiVar2;
                                zryVar4.b = 1;
                                akzxVarP.u();
                                defpackage.zrx zrxVar5 = (defpackage.zrx) akzxVarP.b;
                                defpackage.zry zryVar5 = (defpackage.zry) akzxVarP2.p();
                                j$.util.Objects.requireNonNull(zryVar5);
                                zrxVar5.f = zryVar5;
                                zrxVar5.b |= 4;
                                zrxVar4 = (defpackage.zrx) akzxVarP.p();
                            }
                            int i11 = zsxVar2.e;
                            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.dialershared.precall.impl.PrecallActivity.class);
                            intent.putExtra("CALL_PARAMETER_EXTRA", (android.os.Parcelable) new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, zrxVar4));
                            intent.putExtra("REQUIRES_UI_AT_POSITION_EXTRA", i11);
                            intent.setFlags(268435456);
                            aooh.f(context, "context");
                            ahqx.l(context, intent);
                        }
                        return null;
                    }
                }, zskVar2.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iOrdinal = ((defpackage.zsz) obj).ordinal();
                java.lang.Object obj8 = this.b;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        throw new java.lang.IllegalStateException("DECISION_SHOW_UI is not supported for emergency calling.");
                    }
                    if (iOrdinal == 3) {
                        return ((zta) ((j$.util.Optional) ((zth) this.a).c).orElseThrow()).c((defpackage.zrx) obj8);
                    }
                    if (iOrdinal != 4) {
                        throw new java.lang.AssertionError("Unexpected precall decision.");
                    }
                }
                return aiql.z(obj8);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                adub adubVar = (adtz) obj;
                aooh.f(adubVar, "result");
                if ((adubVar instanceof adub) && ((abzt) adubVar.a).a()) {
                    return ajcm.a;
                }
                return ajan.f(((acgr) ((acea) this.b).z.o((java.lang.String) null)).e(defpackage.abxl.q((akhl) this.a)), new defpackage.zqi(new defpackage.abiy(16), i3), ajbm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                acln aclnVar = (acln) obj;
                int i11 = aclnVar.b;
                java.lang.Object obj9 = this.a;
                if (i11 != 1) {
                    defpackage.acly aclyVar = (defpackage.acly) obj9;
                    defpackage.aevx aevxVar = aclyVar.d;
                    if (aevxVar == null) {
                        synchronized (obj9) {
                            aevxVar = ((defpackage.acly) obj9).d;
                            if (aevxVar == null) {
                                aevxVar = new defpackage.aevx();
                                ((defpackage.acly) obj9).d = aevxVar;
                            }
                        }
                    }
                    ajcqVarA = aevxVar.a(aclyVar.a, ((java.lang.Boolean) aclyVar.c.a()).booleanValue(), true);
                    break;
                } else {
                    ajcqVarA = aiql.z(java.lang.Boolean.TRUE);
                }
                return ajan.g(ajcqVarA, new defpackage.zum(obj9, this.b, aclnVar, 6, (char[]) null), ((defpackage.acly) obj9).b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                yg ygVarB = acvh.b();
                ygVarB.b = this.b;
                ygVarB.d = this.a;
                ygVarB.c = (java.lang.Throwable) obj;
                return aiql.y(ygVarB.d());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.acyb acybVar = (defpackage.acyb) obj;
                int iB = acybVar.b() - 1;
                if (iB == 1) {
                    return acybVar.c();
                }
                if (iB == 2) {
                    return aiql.z(acybVar.a());
                }
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                akzx akzxVarM5 = defpackage.acwb.a.m();
                akzxVarM5.u();
                defpackage.acwb acwbVar = (defpackage.acwb) akzxVarM5.b;
                defpackage.acvj acvjVar = (defpackage.acvj) obj10;
                java.lang.String str = acvjVar.a;
                j$.util.Objects.requireNonNull(str);
                acwbVar.b |= 1;
                acwbVar.c = str;
                acwx acwxVar = (acwx) obj11;
                java.lang.String packageName = acwxVar.a.getPackageName();
                akzxVarM5.u();
                defpackage.acwb acwbVar2 = (defpackage.acwb) akzxVarM5.b;
                j$.util.Objects.requireNonNull(packageName);
                acwbVar2.b |= 2;
                acwbVar2.d = packageName;
                defpackage.acwb acwbVar3 = (defpackage.acwb) akzxVarM5.p();
                try {
                    ahyn ahynVar = ((defpackage.acvj) obj10).f;
                    ahyn ahynVarH = ahynVar.f() ? ahyn.h(afsq.ah((acuz) ahynVar.b())) : ahwt.a;
                    defpackage.acxu acxuVarA = defpackage.acxu.a(acvjVar.a);
                    ajcr ajcrVar = new ajcr(new defpackage.vnc(13));
                    defpackage.adcs adcsVarE = defpackage.adcs.e(ajcrVar);
                    defpackage.zum zumVar = new defpackage.zum(obj11, (alad) acwbVar3, (java.lang.Object) ahynVarH, 9);
                    java.util.concurrent.Executor executor = acwxVar.f;
                    defpackage.adcs adcsVarF = adcsVarE.g(zumVar, executor).g(new defpackage.zum(obj11, acwbVar3, obj10, 13, (char[]) null), executor).f(new defpackage.ymu(i), executor);
                    defpackage.adcs adcsVarG = defpackage.adcs.e(acwxVar.k.e(acxuVarA.a, adcsVarF)).g(new defpackage.wzg(ajcrVar, adcsVarF, 14), executor);
                    defpackage.adcs adcsVarG2 = adcsVarG.g(new defpackage.wzg(obj11, acxuVarA, i4, bArr), executor).g(new defpackage.acwk(adcsVarG, i8), executor);
                    ahvr.J(adcsVarG2, new kxp(acwxVar, acxuVarA, 10), executor);
                    return adcsVarG2;
                } catch (alaz e) {
                    return aiql.y(e);
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                acwx acwxVar2 = (acwx) this.a;
                return ahvr.H(acwxVar2.d.d((defpackage.acwb) this.b, true), new defpackage.zqi((defpackage.acvu) obj, i4), acwxVar2.f);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ajcr) this.a).run();
                return this.b;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((ajcr) this.a).run();
                return this.b;
            case 15:
                return ((acwx) this.b).k.h(((defpackage.acxu) this.a).a);
            case 16:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj12 = this.b;
                    if (!it.hasNext()) {
                        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = atomicInteger2;
                        adak adakVar = (adak) obj12;
                        if (adakVar.c.F()) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            ajcq ajcqVarC = adakVar.g.c();
                            wym wymVar = new wym(obj12, arrayList4, 7, (byte[]) null);
                            ?? r1 = adakVar.f;
                            arrayList3.add(ahvr.H(ahvr.H(ajcqVarC, wymVar, (java.util.concurrent.Executor) r1), new defpackage.zqi(arrayList, 20), (java.util.concurrent.Executor) r1));
                        } else {
                            arrayList.add(abrz.M((android.content.Context) adakVar.h, (ahyn) adakVar.k));
                        }
                        return abrz.ac(arrayList3).D(new joq(obj12, atomicInteger3, arrayList2, arrayList, 20, (char[]) null), adakVar.f);
                    }
                    ?? r7 = this.a;
                    defpackage.acwe acweVar = (defpackage.acwe) it.next();
                    if (r7.contains(acweVar)) {
                        atomicInteger = atomicInteger2;
                        adak adakVar2 = (adak) obj12;
                        arrayList3.add(ahvr.H(((adlt) adakVar2.d).i(acweVar), new defpackage.zqi(arrayList, i), (java.util.concurrent.Executor) adakVar2.f));
                    } else {
                        adak adakVar3 = (adak) obj12;
                        atomicInteger = atomicInteger2;
                        arrayList3.add(ahvr.I(adakVar3.i.e(acweVar), new jsc(obj12, arrayList2, acweVar, atomicInteger, 18, (byte[]) null), (java.util.concurrent.Executor) adakVar3.f));
                    }
                    atomicInteger2 = atomicInteger;
                }
                break;
            case 17:
                java.lang.Object obj13 = this.b;
                adak adakVar4 = (adak) obj13;
                return ahvr.I(adakVar4.g.m((java.util.List) this.a), new defpackage.acwk(obj13, 11), (java.util.concurrent.Executor) adakVar4.f);
            case 18:
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it2 = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj14 = this.b;
                    if (!it2.hasNext()) {
                        return abrz.ac(arrayList5).D(new defpackage.vnc(18), ((acyu) obj14).f);
                    }
                    defpackage.acwb acwbVar4 = (defpackage.acwb) it2.next();
                    if (!acwbVar4.e.isEmpty()) {
                        if (!((aihd) this.a).contains(acwbVar4.e)) {
                            acyu acyuVar = (acyu) obj14;
                            arrayList5.add(acyuVar.q(acyuVar.d.g(acwbVar4), new defpackage.acyg(obj14, (alad) acwbVar4, i6)));
                        }
                    }
                }
                break;
            case 19:
                adbe.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", ((defpackage.acvu) this.b).d);
                ((acyu) this.a).c.a();
                return aiql.z(defpackage.acwa.NONE);
            default:
                akzx akzxVarP = ((alad) this.b).p();
                akzxVarP.u();
                defpackage.acwb acwbVar5 = (defpackage.acwb) akzxVarP.b;
                acwbVar5.b |= 8;
                acwbVar5.f = false;
                return ((acyu) this.a).d.l((defpackage.acwb) akzxVarP.p(), (defpackage.acvu) obj);
        }
    }

    public /* synthetic */ wzg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

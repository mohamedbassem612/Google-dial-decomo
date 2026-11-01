package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtr {
    public static volatile defpackage.abtr a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public abtr(absq absqVar, aazc aazcVar, java.util.Random random) {
        this.b = new java.util.HashMap();
        this.e = aazcVar;
        this.d = random;
        if (!defpackage.anea.a.eZ().m()) {
            this.f = null;
            this.c = null;
            return;
        }
        android.content.Context context = absqVar.a;
        java.util.regex.Pattern pattern = afej.a;
        afei afeiVar = new afei(context);
        afeiVar.e("cbv_module");
        afeiVar.f("UploadLimiterRecord.pb");
        android.net.Uri uriA = afeiVar.a();
        afgo afgoVarA = afgp.a();
        afgoVarA.e(uriA);
        afgoVarA.d(defpackage.abtq.a);
        afgp afgpVarA = afgoVarA.a();
        if (abts.a == null) {
            synchronized (abts.class) {
                if (abts.a == null) {
                    aogc aogcVar = new aogc(java.util.Collections.singletonList(new afeh(new ajxw(absqVar.a))));
                    java.util.concurrent.Executor executorA = abts.a(absqVar);
                    afhj afhjVar = afhj.a;
                    java.util.HashMap map = new java.util.HashMap();
                    agab.ag(afha.a, map);
                    abts.a = new ahbz(executorA, aogcVar, afhjVar, map);
                }
            }
        }
        afhf afhfVarK = abts.a.k(afgpVarA);
        this.f = afhfVarK;
        this.c = new java.util.HashMap(j$.util.DesugarCollections.unmodifiableMap(F(afhfVarK).b));
    }

    public static final duw C(int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        return dux.e(androidx.core.graphics.drawable.IconCompat.h((android.content.res.Resources) null, "", i), dva.c(str), pendingIntent, new android.os.Bundle());
    }

    public static final java.lang.CharSequence D(defpackage.uku ukuVar) {
        defpackage.uje ujeVar = ukuVar.d;
        if (ujeVar == null) {
            ujeVar = defpackage.uje.a;
        }
        int iBE = wsc.bE(ujeVar.b);
        if (iBE == 0) {
            throw null;
        }
        int i = iBE - 1;
        if (i == 0) {
            defpackage.uje ujeVar2 = ukuVar.d;
            if (ujeVar2 == null) {
                ujeVar2 = defpackage.uje.a;
            }
            java.lang.CharSequence charSequenceCreateTtsSpannable = android.telephony.PhoneNumberUtils.createTtsSpannable(ujeVar2.b == 1 ? (java.lang.String) ujeVar2.c : "");
            aooh.e(charSequenceCreateTtsSpannable, "createTtsSpannable(...)");
            return charSequenceCreateTtsSpannable;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("Invalid value");
        }
        defpackage.uje ujeVar3 = ukuVar.d;
        if (ujeVar3 == null) {
            ujeVar3 = defpackage.uje.a;
        }
        java.lang.String str = ujeVar3.b == 2 ? (java.lang.String) ujeVar3.c : "";
        aooh.e(str, "getLabel(...)");
        return str;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static /* synthetic */ java.lang.Object E(defpackage.abtr abtrVar, defpackage.wor worVar, aoln aolnVar) {
        ajcq ajcqVarH = ((ahda) abtrVar.f).h(new vto(abtrVar, worVar, new defpackage.wol(null, 0), 3), (java.util.concurrent.Executor) abtrVar.b);
        aooh.e(ajcqVarH, "submitAsync(...)");
        return aosv.D(ajcqVarH, aolnVar);
    }

    private static defpackage.abtq F(afhf afhfVar) {
        defpackage.abtq abtqVar = defpackage.abtq.a;
        try {
            long epochMilli = j$.time.Instant.now().toEpochMilli() - abts.l();
            defpackage.abtq abtqVar2 = (defpackage.abtq) afhfVar.c().get();
            try {
                java.util.HashMap map = new java.util.HashMap();
                for (java.util.Map.Entry entry : j$.util.DesugarCollections.unmodifiableMap(abtqVar2.b).entrySet()) {
                    java.util.HashMap map2 = new java.util.HashMap();
                    for (java.util.Map.Entry entry2 : j$.util.DesugarCollections.unmodifiableMap(((defpackage.abtp) entry.getValue()).b).entrySet()) {
                        if (aldi.b((alcf) entry2.getValue()) > epochMilli) {
                            map2.put((java.lang.Long) entry2.getKey(), (alcf) entry2.getValue());
                        }
                    }
                    if (!map2.isEmpty()) {
                        java.lang.Long l = (java.lang.Long) entry.getKey();
                        akzx akzxVarM = defpackage.abtp.a.m();
                        akzxVarM.u();
                        ((defpackage.abtp) akzxVarM.b).b().putAll(map2);
                        map.put(l, (defpackage.abtp) akzxVarM.p());
                    }
                }
                akzx akzxVarM2 = abtqVar.m();
                akzxVarM2.ag(map);
                abtqVar = (defpackage.abtq) akzxVarM2.p();
                afhfVar.a(new defpackage.zqi(abtqVar, 8), ajbm.a).s();
                return abtqVar;
            } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
                return abtqVar2;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused2) {
            return abtqVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object A(defpackage.uku ukuVar, aoln aolnVar) {
        defpackage.umn umnVar;
        if (aolnVar instanceof defpackage.umn) {
            umnVar = (defpackage.umn) aolnVar;
            int i = umnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                umnVar.b = i - Integer.MIN_VALUE;
            } else {
                umnVar = new defpackage.umn(this, aolnVar);
            }
        } else {
            umnVar = new defpackage.umn(this, aolnVar);
        }
        java.lang.Object obj = umnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = umnVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r12 = this.b;
            defpackage.ufr ufrVar = new defpackage.ufr(this, ukuVar, (aoln) null, 13, (byte[]) null);
            umnVar.b = 1;
            if (aoov.aj((aolr) r12, ufrVar, umnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object B(defpackage.uku ukuVar, aoln aolnVar) {
        defpackage.umo umoVar;
        if (aolnVar instanceof defpackage.umo) {
            umoVar = (defpackage.umo) aolnVar;
            int i = umoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                umoVar.b = i - Integer.MIN_VALUE;
            } else {
                umoVar = new defpackage.umo(this, aolnVar);
            }
        } else {
            umoVar = new defpackage.umo(this, aolnVar);
        }
        java.lang.Object obj = umoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = umoVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r8 = this.c;
            defpackage.tgn tgnVar = new defpackage.tgn(this, ukuVar, (aoln) null, 4);
            umoVar.b = 1;
            if (aoov.aj((aolr) r8, tgnVar, umoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(defpackage.acxi acxiVar) {
        java.lang.String str = acxiVar.a;
        ahyn ahynVar = acxiVar.b;
        return ahvr.H(ahvr.G(new vto(this, str, ahynVar, 5, (char[]) null), (java.util.concurrent.Executor) this.d), new defpackage.zqi(ahynVar, 17), ajbm.a);
    }

    public final ajcq b(defpackage.acxo acxoVar) {
        android.net.Uri uri = acxoVar.a;
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        ahvr.ci(lastPathSegment);
        try {
            java.io.File parentFile = aehj.P(uri, new zzx(this.e, (byte[]) null)).getParentFile();
            ahvr.ci(parentFile);
            try {
                return dff.m(new defpackage.acxr(this, acxoVar, parentFile, lastPathSegment, (adtk) ((aogc) this.c).M(acxoVar.a, new defpackage.affm(1)), 0));
            } catch (java.io.IOException e) {
                adbe.g(e, "%s: Unable to create mobstore ResponseWriter for file %s", new java.lang.Object[]{"OffroadFileDownloader", acxoVar.a});
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                ygVarB.c = e;
                return aiql.y(ygVarB.d());
            }
        } catch (java.io.IOException e2) {
            adbe.d("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", acxoVar.a);
            yg ygVarB2 = acvh.b();
            ygVarB2.b = defpackage.acvg.MALFORMED_FILE_URI_ERROR;
            ygVarB2.c = e2;
            return aiql.y(ygVarB2.d());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((afip) this.d.eZ()).b(1L, new java.lang.Object[]{str, str2, str3, str4, str5});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final void d(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((afim) this.b.eZ()).b(d, new java.lang.Object[]{str, str2, str3, str4, str5});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final void e(java.lang.String str, defpackage.agrv agrvVar) {
        com.google.apps.tiktok.cache.ParcelableKeyValueStore parcelableKeyValueStore;
        aaha aahaVarAT = ((aw) this.f).aT();
        android.os.Bundle bundleC = aahaVarAT.c(str);
        if (bundleC != null) {
            android.os.Parcelable parcelable = bundleC.getParcelable("com.google.apps.tiktok.cache.InstanceStateStore");
            if (parcelable instanceof com.google.apps.tiktok.cache.ParcelableKeyValueStore) {
                parcelableKeyValueStore = (com.google.apps.tiktok.cache.ParcelableKeyValueStore) parcelable;
            } else {
                parcelableKeyValueStore = new com.google.apps.tiktok.cache.ParcelableKeyValueStore(new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[0]);
            }
        } else {
            parcelableKeyValueStore = new com.google.apps.tiktok.cache.ParcelableKeyValueStore(new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[0]);
        }
        aahaVarAT.e(str, new defpackage.agol(parcelableKeyValueStore, 2));
        parcelableKeyValueStore.c = agrvVar.a;
        agrvVar.b = parcelableKeyValueStore;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    public final ajcq f(defpackage.agns agnsVar, java.util.List list, com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(((aike) list).d);
        ailk ailkVarY = ((aify) list).y(0);
        while (ailkVarY.hasNext()) {
            java.lang.Class cls = (java.lang.Class) ailkVarY.next();
            if (defpackage.agnq.class.isAssignableFrom(cls)) {
                ahvr.cc(!defpackage.agnr.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                ?? r2 = this.d;
                ahvr.cc(r2.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = r2.get(cls);
            } else {
                if (!defpackage.agnr.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("No selector registered for key: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))));
                }
                ahvr.cc(!defpackage.agnq.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                ?? r3 = this.c;
                ahvr.cc(r3.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = r3.get(cls);
            }
            arrayList.add(new defpackage.adck((aoin) obj, agnsVar, 7));
        }
        evz evzVar = new evz(13);
        ajbm ajbmVar = ajbm.a;
        return ajan.g(defpackage.agwm.d(arrayList, evzVar, ajbmVar), ahqx.c(new defpackage.adot(this, accountOperationContext, 12, null)), ajbmVar);
    }

    public final aify g() {
        aoin aoinVar = ((defpackage.agno) this.f).b;
        return aike.a;
    }

    public final ajcq h(com.google.apps.tiktok.account.AccountId accountId, android.content.Intent intent, com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext) {
        java.lang.Object obj = this.f;
        aify aifyVarG = g();
        ahoq ahoqVarW = ahvr.W(1282, "Validate Requirements");
        try {
            ajcq ajcqVarG = ajan.g(((defpackage.agno) obj).e.v(accountId), ahqx.c(new defpackage.adot(aifyVarG, accountId, 11, null)), ajbm.a);
            ahoqVarW.a(ajcqVarG);
            ahoqVarW.close();
            return ajan.g(ajcqVarG, ahqx.c(new defpackage.aczq(this, accountId, accountOperationContext, 19)), ajbm.a);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [aoss, java.lang.Object] */
    public final java.lang.Object i(java.lang.String str, aoln aolnVar) {
        defpackage.zgd zgdVar;
        if (aolnVar instanceof defpackage.zgd) {
            zgdVar = (defpackage.zgd) aolnVar;
            int i = zgdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgdVar.b = i - Integer.MIN_VALUE;
            } else {
                zgdVar = new defpackage.zgd(this, aolnVar);
            }
        } else {
            zgdVar = new defpackage.zgd(this, aolnVar);
        }
        java.lang.Object obj = zgdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgdVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag((aoss) this.b, (ahda) this.c, new defpackage.tyf(this, str, (aoln) null, 13));
            zgdVar.b = 1;
            if (aosyVarAg.a(zgdVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:38:0x0129  */
    /* JADX WARN: Code duplicated, block: B:44:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x015a  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
    /* JADX WARN: Code duplicated, block: B:52:0x019b  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x01de  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x021e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0290  */
    /* JADX WARN: Code duplicated, block: B:75:0x0294  */
    /* JADX WARN: Code duplicated, block: B:77:0x0298  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aonj, java.lang.Object] */
    public final java.lang.Object j(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zdt zdtVar, boolean z, aoln aolnVar) throws aois {
        defpackage.zfv zfvVar;
        defpackage.zff zffVar2;
        boolean z2;
        defpackage.zfd zfdVar2;
        defpackage.zdt zdtVar2;
        boolean z3;
        defpackage.zfd zfdVar3;
        defpackage.zff zffVar3;
        int iOrdinal;
        defpackage.zdt zdtVar3;
        defpackage.zfd zfdVar4;
        defpackage.zdt zdtVar4;
        defpackage.zfd zfdVar5;
        defpackage.zff zffVar4;
        defpackage.zfd zfdVar6;
        defpackage.zfu zfuVar;
        java.lang.Object objA;
        defpackage.zfu zfuVar2;
        defpackage.zdz zdzVar;
        defpackage.zdt zdtVar5 = zdtVar;
        if (aolnVar instanceof defpackage.zfv) {
            zfvVar = (defpackage.zfv) aolnVar;
            int i = zfvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zfvVar.d = i - Integer.MIN_VALUE;
            } else {
                zfvVar = new defpackage.zfv(this, aolnVar);
            }
        } else {
            zfvVar = new defpackage.zfv(this, aolnVar);
        }
        java.lang.Object objV = zfvVar.c;
        aolu aoluVar = aolu.a;
        int i2 = zfvVar.d;
        int i3 = 12;
        int i4 = 7;
        int i5 = 11;
        int i6 = 10;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = zfvVar.b;
                defpackage.zdt zdtVar6 = zfvVar.f;
                defpackage.zff zffVar5 = zfvVar.e;
                zfdVar2 = (defpackage.zfd) zfvVar.a;
                aooc.af(objV);
                z2 = z4;
                zdtVar5 = zdtVar6;
                zffVar2 = zffVar5;
            } else if (i2 == 2) {
                z3 = zfvVar.b;
                zdtVar2 = zfvVar.f;
                zffVar3 = zfvVar.e;
                zfdVar3 = (defpackage.zfd) zfvVar.a;
                aooc.af(objV);
                iOrdinal = ((defpackage.zha) objV).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 && iOrdinal != 2) {
                        throw new aois();
                    }
                    java.lang.Object obj = this.b;
                    defpackage.zfp zfpVar = defpackage.zfp.a;
                    defpackage.xch xchVar = new defpackage.xch(new defpackage.xms(zfpVar, 15), 6);
                    j$.util.Optional optional = (j$.util.Optional) obj;
                    optional.isPresent();
                    xchVar.a.a(optional.get());
                    return new defpackage.zfo(zfpVar);
                }
                if (!z3) {
                    java.lang.Object obj2 = this.c;
                    zfvVar.a = zfdVar3;
                    zfvVar.e = zffVar3;
                    zfvVar.f = zdtVar2;
                    zfvVar.d = 3;
                    objV = ((defpackage.zee) obj2).g.k(zfdVar3, zfvVar);
                    if (objV != aoluVar) {
                        return aoluVar;
                    }
                    zdtVar4 = zdtVar2;
                    zfdVar5 = zfdVar3;
                    zffVar4 = zffVar3;
                    if (!((java.lang.Boolean) objV).booleanValue()) {
                        java.lang.Object obj3 = this.b;
                        defpackage.zfp zfpVar2 = defpackage.zfp.d;
                        defpackage.xch xchVar2 = new defpackage.xch(new defpackage.xms(zfpVar2, i5), i4);
                        j$.util.Optional optional2 = (j$.util.Optional) obj3;
                        optional2.isPresent();
                        xchVar2.a.a(optional2.get());
                        return new defpackage.zfo(zfpVar2);
                    }
                    java.lang.Object obj4 = this.c;
                    zfvVar.a = zfdVar5;
                    zfvVar.e = zffVar4;
                    zfvVar.f = zdtVar4;
                    zfvVar.d = 4;
                    objV = ((defpackage.zee) obj4).a(zffVar4, zfvVar);
                    if (objV == aoluVar) {
                        return aoluVar;
                    }
                    zfdVar6 = zfdVar5;
                    zdzVar = (defpackage.zdz) objV;
                    j$.util.Objects.checkIndex(0, 3);
                    if (zdzVar != null) {
                        if (zdzVar instanceof defpackage.zdx) {
                            java.lang.Object obj5 = this.b;
                            defpackage.zfp zfpVar3 = defpackage.zfp.e;
                            defpackage.xch xchVar3 = new defpackage.xch(new defpackage.xms(zfpVar3, i3), 8);
                            j$.util.Optional optional3 = (j$.util.Optional) obj5;
                            optional3.isPresent();
                            xchVar3.a.a(optional3.get());
                            return new defpackage.zfo(zfpVar3);
                        }
                        if (zdzVar instanceof defpackage.zdy) {
                            if (((defpackage.zdy) zdzVar).a.contains(zdtVar4.c)) {
                                java.lang.Object obj6 = this.b;
                                defpackage.zfp zfpVar4 = defpackage.zfp.e;
                                defpackage.xch xchVar4 = new defpackage.xch(new defpackage.xms(zfpVar4, 13), 9);
                                j$.util.Optional optional4 = (j$.util.Optional) obj6;
                                optional4.isPresent();
                                xchVar4.a.a(optional4.get());
                                return new defpackage.zfo(zfpVar4);
                            }
                            zdtVar3 = zdtVar4;
                            zffVar3 = zffVar4;
                            zfdVar4 = zfdVar6;
                        }
                    }
                    throw new aois();
                }
                zdtVar3 = zdtVar2;
                zfdVar4 = zfdVar3;
                java.lang.Object obj7 = this.d;
                zdtVar3.getClass();
                zfdVar4.getClass();
                zffVar3.getClass();
                defpackage.zlr zlrVar = (defpackage.zlr) obj7;
                aoss aossVar = (aoss) zlrVar.a.a();
                aossVar.getClass();
                defpackage.zgx zgxVar = (defpackage.zgx) zlrVar.b.a();
                zgxVar.getClass();
                defpackage.uyg uygVar = (defpackage.uyg) zlrVar.c.a();
                uygVar.getClass();
                defpackage.rdp rdpVar = (defpackage.rdp) zlrVar.d.a();
                rdpVar.getClass();
                zfuVar = new defpackage.zfu(zdtVar3, zfdVar4, zffVar3, aossVar, zgxVar, uygVar, rdpVar);
                zfvVar.a = zfuVar;
                zfvVar.e = null;
                zfvVar.f = null;
                zfvVar.d = 5;
                defpackage.zdt zdtVar7 = zfuVar.b;
                objA = ahvr.ag(zdtVar7.b, zdtVar7.e, new defpackage.tyf(new defpackage.zdr(zfuVar.d, zfuVar.c, zfuVar.h), zdtVar7, (aoln) null, 10)).a(zfvVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA != aoluVar) {
                    return aoluVar;
                }
                zfuVar2 = zfuVar;
            } else {
                if (i2 == 3) {
                    zdtVar4 = zfvVar.f;
                    zffVar4 = zfvVar.e;
                    zfdVar5 = (defpackage.zfd) zfvVar.a;
                    aooc.af(objV);
                    if (!((java.lang.Boolean) objV).booleanValue()) {
                        java.lang.Object obj8 = this.b;
                        defpackage.zfp zfpVar5 = defpackage.zfp.d;
                        defpackage.xch xchVar5 = new defpackage.xch(new defpackage.xms(zfpVar5, i5), i4);
                        j$.util.Optional optional5 = (j$.util.Optional) obj8;
                        optional5.isPresent();
                        xchVar5.a.a(optional5.get());
                        return new defpackage.zfo(zfpVar5);
                    }
                    java.lang.Object obj9 = this.c;
                    zfvVar.a = zfdVar5;
                    zfvVar.e = zffVar4;
                    zfvVar.f = zdtVar4;
                    zfvVar.d = 4;
                    objV = ((defpackage.zee) obj9).a(zffVar4, zfvVar);
                    if (objV == aoluVar) {
                        return aoluVar;
                    }
                    zfdVar6 = zfdVar5;
                    zdzVar = (defpackage.zdz) objV;
                    j$.util.Objects.checkIndex(0, 3);
                    if (zdzVar != null) {
                        if (zdzVar instanceof defpackage.zdx) {
                            java.lang.Object obj10 = this.b;
                            defpackage.zfp zfpVar6 = defpackage.zfp.e;
                            defpackage.xch xchVar6 = new defpackage.xch(new defpackage.xms(zfpVar6, i3), 8);
                            j$.util.Optional optional6 = (j$.util.Optional) obj10;
                            optional6.isPresent();
                            xchVar6.a.a(optional6.get());
                            return new defpackage.zfo(zfpVar6);
                        }
                        if (zdzVar instanceof defpackage.zdy) {
                            if (((defpackage.zdy) zdzVar).a.contains(zdtVar4.c)) {
                                java.lang.Object obj11 = this.b;
                                defpackage.zfp zfpVar7 = defpackage.zfp.e;
                                defpackage.xch xchVar7 = new defpackage.xch(new defpackage.xms(zfpVar7, 13), 9);
                                j$.util.Optional optional7 = (j$.util.Optional) obj11;
                                optional7.isPresent();
                                xchVar7.a.a(optional7.get());
                                return new defpackage.zfo(zfpVar7);
                            }
                            zdtVar3 = zdtVar4;
                            zffVar3 = zffVar4;
                            zfdVar4 = zfdVar6;
                            java.lang.Object obj12 = this.d;
                            zdtVar3.getClass();
                            zfdVar4.getClass();
                            zffVar3.getClass();
                            defpackage.zlr zlrVar2 = (defpackage.zlr) obj12;
                            aoss aossVar2 = (aoss) zlrVar2.a.a();
                            aossVar2.getClass();
                            defpackage.zgx zgxVar2 = (defpackage.zgx) zlrVar2.b.a();
                            zgxVar2.getClass();
                            defpackage.uyg uygVar2 = (defpackage.uyg) zlrVar2.c.a();
                            uygVar2.getClass();
                            defpackage.rdp rdpVar2 = (defpackage.rdp) zlrVar2.d.a();
                            rdpVar2.getClass();
                            zfuVar = new defpackage.zfu(zdtVar3, zfdVar4, zffVar3, aossVar2, zgxVar2, uygVar2, rdpVar2);
                            zfvVar.a = zfuVar;
                            zfvVar.e = null;
                            zfvVar.f = null;
                            zfvVar.d = 5;
                            defpackage.zdt zdtVar8 = zfuVar.b;
                            objA = ahvr.ag(zdtVar8.b, zdtVar8.e, new defpackage.tyf(new defpackage.zdr(zfuVar.d, zfuVar.c, zfuVar.h), zdtVar8, (aoln) null, 10)).a(zfvVar);
                            if (objA != aoluVar) {
                                objA = aojh.a;
                            }
                            if (objA != aoluVar) {
                                objA = aojh.a;
                            }
                            if (objA != aoluVar) {
                                return aoluVar;
                            }
                            zfuVar2 = zfuVar;
                        }
                    }
                    throw new aois();
                }
                if (i2 == 4) {
                    zdtVar4 = zfvVar.f;
                    zffVar4 = zfvVar.e;
                    zfdVar6 = (defpackage.zfd) zfvVar.a;
                    aooc.af(objV);
                    zdzVar = (defpackage.zdz) objV;
                    j$.util.Objects.checkIndex(0, 3);
                    if (zdzVar != null) {
                        if (zdzVar instanceof defpackage.zdx) {
                            java.lang.Object obj13 = this.b;
                            defpackage.zfp zfpVar8 = defpackage.zfp.e;
                            defpackage.xch xchVar8 = new defpackage.xch(new defpackage.xms(zfpVar8, i3), 8);
                            j$.util.Optional optional8 = (j$.util.Optional) obj13;
                            optional8.isPresent();
                            xchVar8.a.a(optional8.get());
                            return new defpackage.zfo(zfpVar8);
                        }
                        if (zdzVar instanceof defpackage.zdy) {
                            if (((defpackage.zdy) zdzVar).a.contains(zdtVar4.c)) {
                                java.lang.Object obj14 = this.b;
                                defpackage.zfp zfpVar9 = defpackage.zfp.e;
                                defpackage.xch xchVar9 = new defpackage.xch(new defpackage.xms(zfpVar9, 13), 9);
                                j$.util.Optional optional9 = (j$.util.Optional) obj14;
                                optional9.isPresent();
                                xchVar9.a.a(optional9.get());
                                return new defpackage.zfo(zfpVar9);
                            }
                            zdtVar3 = zdtVar4;
                            zffVar3 = zffVar4;
                            zfdVar4 = zfdVar6;
                            java.lang.Object obj15 = this.d;
                            zdtVar3.getClass();
                            zfdVar4.getClass();
                            zffVar3.getClass();
                            defpackage.zlr zlrVar3 = (defpackage.zlr) obj15;
                            aoss aossVar3 = (aoss) zlrVar3.a.a();
                            aossVar3.getClass();
                            defpackage.zgx zgxVar3 = (defpackage.zgx) zlrVar3.b.a();
                            zgxVar3.getClass();
                            defpackage.uyg uygVar3 = (defpackage.uyg) zlrVar3.c.a();
                            uygVar3.getClass();
                            defpackage.rdp rdpVar3 = (defpackage.rdp) zlrVar3.d.a();
                            rdpVar3.getClass();
                            zfuVar = new defpackage.zfu(zdtVar3, zfdVar4, zffVar3, aossVar3, zgxVar3, uygVar3, rdpVar3);
                            zfvVar.a = zfuVar;
                            zfvVar.e = null;
                            zfvVar.f = null;
                            zfvVar.d = 5;
                            defpackage.zdt zdtVar9 = zfuVar.b;
                            objA = ahvr.ag(zdtVar9.b, zdtVar9.e, new defpackage.tyf(new defpackage.zdr(zfuVar.d, zfuVar.c, zfuVar.h), zdtVar9, (aoln) null, 10)).a(zfvVar);
                            if (objA != aoluVar) {
                                objA = aojh.a;
                            }
                            if (objA != aoluVar) {
                                objA = aojh.a;
                            }
                            if (objA != aoluVar) {
                                return aoluVar;
                            }
                            zfuVar2 = zfuVar;
                        }
                    }
                    throw new aois();
                }
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zfuVar2 = (defpackage.zfu) zfvVar.a;
                aooc.af(objV);
            }
            java.lang.Object obj16 = this.b;
            defpackage.xch xchVar10 = new defpackage.xch(new defpackage.yrz(i4), i6);
            j$.util.Optional optional10 = (j$.util.Optional) obj16;
            optional10.isPresent();
            xchVar10.a.a(optional10.get());
            aooh.c(zfuVar2);
            return new defpackage.zfq(zfuVar2);
        }
        aooc.af(objV);
        if (!((zzx) this.e).k().containsKey(zdtVar5.c)) {
            java.lang.Object obj17 = this.b;
            defpackage.zfp zfpVar10 = defpackage.zfp.b;
            defpackage.xch xchVar11 = new defpackage.xch(new defpackage.xms(zfpVar10, i6), i5);
            j$.util.Optional optional11 = (j$.util.Optional) obj17;
            optional11.isPresent();
            xchVar11.a.a(optional11.get());
            return new defpackage.zfo(zfpVar10);
        }
        zfvVar.a = zfdVar;
        zffVar2 = zffVar;
        zfvVar.e = zffVar2;
        zfvVar.f = zdtVar5;
        z2 = z;
        zfvVar.b = z2;
        zfvVar.d = 1;
        java.lang.Object objC = zdtVar5.c(zfvVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        zfdVar2 = zfdVar;
        objV = objC;
        if (!((java.lang.Boolean) objV).booleanValue()) {
            java.lang.Object obj18 = this.b;
            defpackage.zfp zfpVar11 = defpackage.zfp.c;
            defpackage.xch xchVar12 = new defpackage.xch(new defpackage.xms(zfpVar11, 14), i3);
            j$.util.Optional optional12 = (j$.util.Optional) obj18;
            optional12.isPresent();
            xchVar12.a.a(optional12.get());
            return new defpackage.zfo(zfpVar11);
        }
        java.lang.Object obj19 = this.f;
        zfvVar.a = zfdVar2;
        zfvVar.e = zffVar2;
        zfvVar.f = zdtVar5;
        zfvVar.b = z2;
        zfvVar.d = 2;
        objV = ((defpackage.uyg) obj19).v(zfvVar);
        if (objV == aoluVar) {
            return aoluVar;
        }
        defpackage.zff zffVar6 = zffVar2;
        zdtVar2 = zdtVar5;
        z3 = z2;
        zfdVar3 = zfdVar2;
        zffVar3 = zffVar6;
        iOrdinal = ((defpackage.zha) objV).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
            }
            java.lang.Object obj20 = this.b;
            defpackage.zfp zfpVar12 = defpackage.zfp.a;
            defpackage.xch xchVar13 = new defpackage.xch(new defpackage.xms(zfpVar12, 15), 6);
            j$.util.Optional optional13 = (j$.util.Optional) obj20;
            optional13.isPresent();
            xchVar13.a.a(optional13.get());
            return new defpackage.zfo(zfpVar12);
        }
        if (!z3) {
            java.lang.Object obj21 = this.c;
            zfvVar.a = zfdVar3;
            zfvVar.e = zffVar3;
            zfvVar.f = zdtVar2;
            zfvVar.d = 3;
            objV = ((defpackage.zee) obj21).g.k(zfdVar3, zfvVar);
            if (objV != aoluVar) {
                return aoluVar;
            }
            zdtVar4 = zdtVar2;
            zfdVar5 = zfdVar3;
            zffVar4 = zffVar3;
            if (!((java.lang.Boolean) objV).booleanValue()) {
                java.lang.Object obj22 = this.b;
                defpackage.zfp zfpVar13 = defpackage.zfp.d;
                defpackage.xch xchVar14 = new defpackage.xch(new defpackage.xms(zfpVar13, i5), i4);
                j$.util.Optional optional14 = (j$.util.Optional) obj22;
                optional14.isPresent();
                xchVar14.a.a(optional14.get());
                return new defpackage.zfo(zfpVar13);
            }
            java.lang.Object obj23 = this.c;
            zfvVar.a = zfdVar5;
            zfvVar.e = zffVar4;
            zfvVar.f = zdtVar4;
            zfvVar.d = 4;
            objV = ((defpackage.zee) obj23).a(zffVar4, zfvVar);
            if (objV == aoluVar) {
                return aoluVar;
            }
            zfdVar6 = zfdVar5;
            zdzVar = (defpackage.zdz) objV;
            j$.util.Objects.checkIndex(0, 3);
            if (zdzVar != null) {
                if (zdzVar instanceof defpackage.zdx) {
                    java.lang.Object obj110 = this.b;
                    defpackage.zfp zfpVar14 = defpackage.zfp.e;
                    defpackage.xch xchVar15 = new defpackage.xch(new defpackage.xms(zfpVar14, i3), 8);
                    j$.util.Optional optional15 = (j$.util.Optional) obj110;
                    optional15.isPresent();
                    xchVar15.a.a(optional15.get());
                    return new defpackage.zfo(zfpVar14);
                }
                if (zdzVar instanceof defpackage.zdy) {
                    if (((defpackage.zdy) zdzVar).a.contains(zdtVar4.c)) {
                        java.lang.Object obj111 = this.b;
                        defpackage.zfp zfpVar15 = defpackage.zfp.e;
                        defpackage.xch xchVar16 = new defpackage.xch(new defpackage.xms(zfpVar15, 13), 9);
                        j$.util.Optional optional16 = (j$.util.Optional) obj111;
                        optional16.isPresent();
                        xchVar16.a.a(optional16.get());
                        return new defpackage.zfo(zfpVar15);
                    }
                    zdtVar3 = zdtVar4;
                    zffVar3 = zffVar4;
                    zfdVar4 = zfdVar6;
                }
            }
            throw new aois();
        }
        zdtVar3 = zdtVar2;
        zfdVar4 = zfdVar3;
        java.lang.Object obj112 = this.d;
        zdtVar3.getClass();
        zfdVar4.getClass();
        zffVar3.getClass();
        defpackage.zlr zlrVar4 = (defpackage.zlr) obj112;
        aoss aossVar4 = (aoss) zlrVar4.a.a();
        aossVar4.getClass();
        defpackage.zgx zgxVar4 = (defpackage.zgx) zlrVar4.b.a();
        zgxVar4.getClass();
        defpackage.uyg uygVar4 = (defpackage.uyg) zlrVar4.c.a();
        uygVar4.getClass();
        defpackage.rdp rdpVar4 = (defpackage.rdp) zlrVar4.d.a();
        rdpVar4.getClass();
        zfuVar = new defpackage.zfu(zdtVar3, zfdVar4, zffVar3, aossVar4, zgxVar4, uygVar4, rdpVar4);
        zfvVar.a = zfuVar;
        zfvVar.e = null;
        zfvVar.f = null;
        zfvVar.d = 5;
        defpackage.zdt zdtVar10 = zfuVar.b;
        objA = ahvr.ag(zdtVar10.b, zdtVar10.e, new defpackage.tyf(new defpackage.zdr(zfuVar.d, zfuVar.c, zfuVar.h), zdtVar10, (aoln) null, 10)).a(zfvVar);
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA != aoluVar) {
            return aoluVar;
        }
        zfuVar2 = zfuVar;
        java.lang.Object obj113 = this.b;
        defpackage.xch xchVar17 = new defpackage.xch(new defpackage.yrz(i4), i6);
        j$.util.Optional optional17 = (j$.util.Optional) obj113;
        optional17.isPresent();
        xchVar17.a.a(optional17.get());
        aooh.c(zfuVar2);
        return new defpackage.zfq(zfuVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object k(defpackage.zfd zfdVar, aoln aolnVar) {
        defpackage.zef zefVar;
        if (aolnVar instanceof defpackage.zef) {
            zefVar = (defpackage.zef) aolnVar;
            int i = zefVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zefVar.b = i - Integer.MIN_VALUE;
            } else {
                zefVar = new defpackage.zef(this, aolnVar);
            }
        } else {
            zefVar = new defpackage.zef(this, aolnVar);
        }
        java.lang.Object objAj = zefVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zefVar.b;
        if (i2 == 0) {
            aooc.af(objAj);
            ?? r8 = this.e;
            ytl ytlVar = new ytl(this, zfdVar, (aoln) null, 7);
            zefVar.b = 1;
            objAj = aoov.aj((aolr) r8, ytlVar, zefVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        defpackage.zfc zfcVar = (defpackage.zfc) objAj;
        return java.lang.Boolean.valueOf((zfcVar == null || m(zfcVar.b)) ? false : true);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object l(defpackage.zff zffVar, aoln aolnVar) {
        return aoov.aj((aolr) this.e, new ytl(this, zffVar, (aoln) null, 8, (byte[]) null), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    public final boolean m(long j) {
        ?? r4 = ((defpackage.rdp) this.c).b;
        j$.time.Instant instantNow = j$.time.Instant.now();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.lang.Object objA = r4.a();
        aooh.e(objA, "get(...)");
        j$.time.Instant instantMinusMillis = instantNow.minusMillis(timeUnit.toMillis(((java.lang.Number) objA).longValue()));
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        aooh.e(instant, "EPOCH");
        return aooc.z(instantMinusMillis, instant).toEpochMilli() > j;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    public final defpackage.wos n() {
        defpackage.wos wosVarE = wsc.P(defpackage.wos.a.m()).e();
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            wosVarE = ((defpackage.wot) it.next()).a(wosVarE);
        }
        return wosVarE;
    }

    public final ajcq o(defpackage.wor worVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        return p(worVar, new defpackage.wok(0));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq p(defpackage.wor worVar, ajas ajasVar) {
        aooh.f(worVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION);
        ajcq ajcqVarH = ((ahda) this.f).h(new vto(this, worVar, ajasVar, 2), (java.util.concurrent.Executor) this.b);
        aooh.e(ajcqVarH, "submitAsync(...)");
        return ajcqVarH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final java.lang.Object q(defpackage.wor worVar, aonj aonjVar, aoln aolnVar) {
        defpackage.wom womVar;
        defpackage.wor worVar2;
        ?? r8;
        if (aolnVar instanceof defpackage.wom) {
            womVar = (defpackage.wom) aolnVar;
            int i = womVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                womVar.c = i - Integer.MIN_VALUE;
            } else {
                womVar = new defpackage.wom(this, aolnVar);
            }
        } else {
            womVar = new defpackage.wom(this, aolnVar);
        }
        java.lang.Object obj = womVar.b;
        aolu aoluVar = aolu.a;
        int i2 = womVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r10 = this.d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : r10) {
                if (((defpackage.wot) obj2).c(worVar) == 2) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                womVar.d = worVar;
                womVar.a = arrayList;
                womVar.c = 1;
                if (aonjVar.a(womVar) == aoluVar) {
                    return aoluVar;
                }
                worVar2 = worVar;
                r8 = arrayList;
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj3 = womVar.a;
        worVar2 = womVar.d;
        aooc.af(obj);
        r8 = obj3;
        java.util.Iterator it = r8.iterator();
        while (it.hasNext()) {
            ((defpackage.wot) it.next()).b(worVar2);
        }
        if (!(r8 instanceof java.util.Collection) || !r8.isEmpty()) {
            java.util.Iterator it2 = r8.iterator();
            if (it2.hasNext()) {
                ((defpackage.wot) it2.next()).d(worVar2);
                ((zpz) this.c).a(ajcm.a);
            }
        }
        return aojh.a;
    }

    public final boolean r() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.f).get();
    }

    public final int s(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? ((java.util.concurrent.atomic.AtomicInteger) this.c).get() : ((java.util.concurrent.atomic.AtomicInteger) this.d).get();
        }
        return ((java.util.concurrent.atomic.AtomicInteger) this.b).get();
    }

    public final void t(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            ((java.util.concurrent.atomic.AtomicInteger) this.b).incrementAndGet();
        } else if (i2 != 2) {
            ((java.util.concurrent.atomic.AtomicInteger) this.c).incrementAndGet();
        } else {
            ((java.util.concurrent.atomic.AtomicInteger) this.d).incrementAndGet();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, rlv] */
    public final void u(int i, java.lang.String str, defpackage.usb usbVar) {
        akzx akzxVarM = defpackage.amra.a.m();
        if ((usbVar.b & 1) != 0) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            defpackage.urw urwVar = usbVar.c;
            if (urwVar == null) {
                urwVar = defpackage.urw.a;
            }
            defpackage.urv urvVar = urwVar.c;
            if (urvVar == null) {
                urvVar = defpackage.urv.a;
            }
            int i2 = (int) (((long) urvVar.d) / 60);
            akzxVarM.u();
            defpackage.amra amraVar = (defpackage.amra) akzxVarM.b;
            amraVar.b |= 1;
            amraVar.c = i2;
        }
        if ((usbVar.b & 2) != 0) {
            java.lang.String str2 = usbVar.d;
            akzxVarM.u();
            defpackage.amra amraVar2 = (defpackage.amra) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            amraVar2.b |= 2;
            amraVar2.d = str2;
        }
        if ((usbVar.b & 4) != 0) {
            int i3 = usbVar.e;
            akzxVarM.u();
            defpackage.amra amraVar3 = (defpackage.amra) akzxVarM.b;
            amraVar3.b |= 4;
            amraVar3.e = i3;
        }
        if ((usbVar.b & 8) != 0) {
            int i4 = usbVar.f;
            akzxVarM.u();
            defpackage.amra amraVar4 = (defpackage.amra) akzxVarM.b;
            amraVar4.b |= 8;
            amraVar4.f = i4;
        }
        if ((usbVar.b & 16) != 0) {
            int i5 = usbVar.g;
            akzxVarM.u();
            defpackage.amra amraVar5 = (defpackage.amra) akzxVarM.b;
            amraVar5.b |= 16;
            amraVar5.g = i5;
        }
        this.e.D(i, str, (defpackage.amra) akzxVarM.p());
    }

    public final android.app.PendingIntent v(defpackage.ulp ulpVar) {
        java.lang.Object obj = this.f;
        aooh.f(obj, "context");
        android.content.Context context = (android.content.Context) obj;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.spamnotification.impl.ui.SpamNotificationActivity.class);
        intent.setAction(ulpVar.a.f);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        defpackage.sns.u(intent, "notification_model", ulpVar.a());
        return defpackage.afap.b(context, 1, intent, 1140850688);
    }

    public final android.app.PendingIntent w(defpackage.umk umkVar) {
        java.lang.Object obj = this.f;
        aooh.f(obj, "context");
        android.content.Context context = (android.content.Context) obj;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.spamnotification.impl.ui.SpamNotificationReceiver_Receiver.class);
        intent.setAction(umkVar.a.e);
        defpackage.sns.u(intent, "notification_model", umkVar.a());
        return defpackage.afap.c(context, 1, intent, 201326592);
    }

    public final duw x(int i, int i2, android.app.PendingIntent pendingIntent) {
        java.lang.String string = ((android.content.Context) this.f).getString(i2);
        aooh.e(string, "getString(...)");
        return C(i, string, pendingIntent);
    }

    public final dva y(defpackage.ulp ulpVar) {
        android.content.Context context = (android.content.Context) this.f;
        dva dvaVar = new dva(context, "phone_default");
        dvaVar.g = v(ulpVar);
        dvaVar.r = "status";
        dvaVar.j = 0;
        dvaVar.t = urg.c(context, 2130969018);
        dvaVar.n(2131232016);
        dvaVar.o = "SpamCallGroup";
        return dvaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object z(defpackage.uku ukuVar, aoln aolnVar) {
        defpackage.umm ummVar;
        if (aolnVar instanceof defpackage.umm) {
            ummVar = (defpackage.umm) aolnVar;
            int i = ummVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ummVar.b = i - Integer.MIN_VALUE;
            } else {
                ummVar = new defpackage.umm(this, aolnVar);
            }
        } else {
            ummVar = new defpackage.umm(this, aolnVar);
        }
        java.lang.Object obj = ummVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ummVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r8 = this.c;
            defpackage.ufr ufrVar = new defpackage.ufr(this, ukuVar, (aoln) null, 12);
            ummVar.b = 1;
            if (aoov.aj((aolr) r8, ufrVar, ummVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public abtr(android.content.Context context, aolr aolrVar, aolr aolrVar2, rwi rwiVar, defpackage.uhp uhpVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(rwiVar, "notificationManager");
        this.f = context;
        this.c = aolrVar;
        this.b = aolrVar2;
        this.e = rwiVar;
        this.d = uhpVar;
    }

    public abtr(android.content.Context context, ucm ucmVar, ajct ajctVar, aoin aoinVar, apjb apjbVar) {
        this.e = context;
        this.f = ucmVar;
        this.d = ajctVar;
        this.c = aoinVar;
        this.b = apjbVar;
    }

    public abtr(aw awVar, rlv rlvVar, nwu nwuVar, gpd gpdVar, acxg acxgVar) {
        aooh.f(awVar, "fragment");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.f = awVar;
        this.b = rlvVar;
        this.d = nwuVar;
        this.e = gpdVar;
        this.c = acxgVar;
    }

    public abtr(vee veeVar, vew vewVar, vcg vcgVar, j$.util.Optional optional, vcc vccVar) {
        this.d = veeVar;
        this.f = vcgVar;
        this.b = optional;
        this.c = vewVar;
        this.e = vccVar;
    }

    public abtr(defpackage.zek zekVar, defpackage.zer zerVar, defpackage.zey zeyVar, aazc aazcVar, aolr aolrVar, defpackage.rdp rdpVar) {
        aooh.f(zekVar, "dialerCapabilityDao");
        aooh.f(zerVar, "dialerContactStatusDao");
        aooh.f(zeyVar, "dialerHasRcsDao");
        aooh.f(aazcVar, "clock");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(rdpVar, "flagValues");
        this.f = zekVar;
        this.b = zerVar;
        this.d = zeyVar;
        this.e = aolrVar;
        this.c = rdpVar;
    }

    public abtr(defpackage.zlr zlrVar, defpackage.zee zeeVar, defpackage.uyg uygVar, zzx zzxVar, defpackage.rdp rdpVar, j$.util.Optional optional) {
        aooh.f(rdpVar, "flagValues");
        aooh.f(optional, "sessionFlowLogger");
        this.d = zlrVar;
        this.c = zeeVar;
        this.f = uygVar;
        this.e = zzxVar;
        this.b = optional;
    }

    public abtr(adag adagVar, java.util.Map map, java.util.Map map2, java.util.Set set, defpackage.agno agnoVar) {
        this.e = adagVar;
        this.d = map;
        this.c = map2;
        this.b = set;
        this.f = agnoVar;
        java.lang.Boolean.FALSE.booleanValue();
    }

    public abtr(aolr aolrVar, aoss aossVar, apni apniVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        this.f = aolrVar;
        this.b = aossVar;
        this.e = apniVar;
        this.c = new ahda((byte[]) null);
        this.d = new java.util.LinkedHashMap();
    }

    public abtr(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, ajxw ajxwVar, android.app.Application application) {
        this.d = ahvr.bI(new aell(this, 18));
        this.b = ahvr.bI(new aell(this, 19));
        this.c = ahvr.bI(new aell(this, 20));
        afit afitVarD = afit.d("tiktok");
        this.f = afitVarD;
        afiv afivVar = afitVarD.c;
        if (afivVar == null) {
            this.e = afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.e = afivVar;
            afivVar.f = ajxwVar;
        }
    }

    public abtr(rlv rlvVar) {
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
        this.d = new java.util.concurrent.atomic.AtomicInteger(0);
        this.c = new java.util.concurrent.atomic.AtomicInteger(0);
        this.e = rlvVar;
    }

    public abtr(zpz zpzVar, java.util.Set set, aoss aossVar, ajcu ajcuVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(set, "updaters");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        this.c = zpzVar;
        this.d = set;
        this.e = aossVar;
        this.b = ajcuVar;
        this.f = new ahda();
    }

    public abtr(aazc aazcVar, aw awVar) {
        this.d = new java.lang.Object();
        this.c = new java.util.HashMap();
        this.b = new java.util.HashMap();
        this.e = aazcVar;
        this.f = awVar;
        awVar.P().c(new defpackage.agrw(this, awVar));
    }

    public abtr(android.content.Context context, adth adthVar, adti adtiVar, aogc aogcVar, java.util.concurrent.Executor executor) {
        this.e = context;
        this.f = adthVar;
        this.b = adtiVar;
        this.c = aogcVar;
        this.d = executor;
    }
}

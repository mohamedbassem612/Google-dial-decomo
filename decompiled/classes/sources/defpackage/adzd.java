package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzd implements defpackage.adym {
    public static final /* synthetic */ int h = 0;
    private static final long i;
    private static final long j;
    public final android.content.Context a;
    public final defpackage.aduu b;
    public final defpackage.aeey c;
    public final java.util.Map d;
    public final defpackage.apdp e;
    public final defpackage.apdp f;
    public final defpackage.abce g;
    private final defpackage.zwx k;
    private final defpackage.aoss l;
    private final defpackage.aolr m;
    private final defpackage.aabx n;
    private final java.util.Map o;

    static {
        defpackage.aiof.i("GnpSdk");
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        i = 300000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        j = 3600000L;
    }

    public adzd(android.content.Context context, defpackage.abce abceVar, defpackage.zwx zwxVar, defpackage.aazc aazcVar, defpackage.aduu aduuVar, defpackage.aeey aeeyVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aabx aabxVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (abceVar == null) {
            defpackage.aooh.i("proxyClient");
        }
        if (zwxVar == null) {
            defpackage.aooh.i("googleAuthClient");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aduuVar == null) {
            defpackage.aooh.i("gnpConfig");
        }
        if (aeeyVar == null) {
            defpackage.aooh.i("clientStreamz");
        }
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aabxVar == null) {
            defpackage.aooh.i("googleApiAvailability");
        }
        this.a = context;
        this.g = abceVar;
        this.k = zwxVar;
        this.b = aduuVar;
        this.c = aeeyVar;
        this.l = aossVar;
        this.m = aolrVar;
        this.n = aabxVar;
        this.o = new java.util.LinkedHashMap();
        this.e = new defpackage.apdp();
        this.d = new java.util.LinkedHashMap();
        this.f = new defpackage.apdp();
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static final boolean t(java.lang.Throwable r1) {
        /*
            boolean r0 = r1 instanceof defpackage.aacw
            if (r0 == 0) goto L16
            aacw r1 = (defpackage.aacw) r1
            int r1 = r1.a()
            r0 = 7
            if (r1 == r0) goto L14
            switch(r1) {
                case 14: goto L14;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L14;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 20: goto L14;
                case 21: goto L14;
                case 22: goto L14;
                default: goto L13;
            }
        L13:
            goto L16
        L14:
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adzd.t(java.lang.Throwable):boolean");
    }

    private static final boolean u(adyo adyoVar) {
        java.lang.Long l = adyoVar.c;
        if (l != null) {
            if (java.util.concurrent.TimeUnit.SECONDS.toMillis(l.longValue()) - j$.time.Instant.now().toEpochMilli() > i) {
                return true;
            }
        } else if (j$.time.Instant.now().toEpochMilli() - adyoVar.b < j - i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.adym
    public final java.lang.Object a(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l.c(), new acju(this, str, (defpackage.aoln) null, 20), aolnVar);
    }

    @Override // defpackage.adym
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l.c(), new sij(this, str, str2, (defpackage.aoln) null, 2), aolnVar);
    }

    @Override // defpackage.adym
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l.c(), new adzb(this, (defpackage.aoln) null, 0), aolnVar);
    }

    @Override // defpackage.adym
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l.c(), new xhb(this, str, (defpackage.aoln) null, 17), aolnVar);
    }

    @Override // defpackage.adym
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.l.c(), new afmq(this, (defpackage.aoln) null, 1), aolnVar);
    }

    @Override // defpackage.adym
    public final defpackage.adtz f() {
        return (defpackage.adtz) defpackage.aoov.ah(this.m, new adzb(this, (defpackage.aoln) null, 1, (byte[]) null));
    }

    public final defpackage.adtz g(defpackage.adtz adtzVar) {
        adyl adykVar;
        if (adtzVar instanceof defpackage.adub) {
            return adtzVar;
        }
        defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
        defpackage.adtv adtvVar = (defpackage.adtv) adtzVar;
        com.google.android.gms.auth.UserRecoverableAuthException userRecoverableAuthExceptionB = adtvVar.b();
        int iT = defpackage.aesg.t(userRecoverableAuthExceptionB);
        if (iT == 0) {
            adykVar = new adyk(userRecoverableAuthExceptionB, adtvVar.a());
        } else if (iT != 1) {
            adykVar = t(userRecoverableAuthExceptionB) ? new adyl(new java.io.IOException((java.lang.Throwable) userRecoverableAuthExceptionB), adtvVar.a()) : new adyj(userRecoverableAuthExceptionB, adtvVar.a());
        } else {
            adykVar = new adyl((java.io.IOException) userRecoverableAuthExceptionB, adtvVar.a());
        }
        return adykVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(adyo adyoVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        adyp adypVar;
        if (aolnVar instanceof adyp) {
            adypVar = (adyp) aolnVar;
            int i2 = adypVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adypVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adypVar = new adyp(this, aolnVar);
            }
        } else {
            adypVar = new adyp(this, aolnVar);
        }
        java.lang.Object objS = adypVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adypVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                adyoVar = adypVar.d;
                defpackage.aooc.af(objS);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objS);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objS);
        adypVar.d = adyoVar;
        adypVar.c = 1;
        objS = s(adypVar);
        if (objS == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objS).booleanValue()) {
            adypVar.d = null;
            adypVar.c = 2;
            if (i(adyoVar, adypVar) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        android.content.Context context = this.a;
        java.lang.String str = adyoVar.a;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(str, "token");
        java.lang.String str2 = defpackage.zwk.a;
        defpackage.zwq.e(context, str, 0L);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(adyo adyoVar, defpackage.aoln aolnVar) {
        adyq adyqVar;
        if (aolnVar instanceof adyq) {
            adyqVar = (adyq) aolnVar;
            int i2 = adyqVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyqVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adyqVar = new adyq(this, aolnVar);
            }
        } else {
            adyqVar = new adyq(this, aolnVar);
        }
        java.lang.Object obj = adyqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyqVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aaum aaumVarA = this.k.a(adyoVar.a);
            adyqVar.c = 1;
            if (defpackage.aooh.Y(aaumVarA, adyqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        adyr adyrVar;
        adyn adynVar;
        defpackage.aoot aootVar;
        defpackage.apdp apdpVar;
        defpackage.adtz adtzVarG;
        if (aolnVar instanceof adyr) {
            adyrVar = (adyr) aolnVar;
            int i2 = adyrVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyrVar.d = i2 - Integer.MIN_VALUE;
            } else {
                adyrVar = new adyr(this, aolnVar);
            }
        } else {
            adyrVar = new adyr(this, aolnVar);
        }
        java.lang.Object objA = adyrVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyrVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    apdpVar = adyrVar.f;
                    aootVar = adyrVar.e;
                    adynVar = (adyn) adyrVar.a;
                    defpackage.aooc.af(objA);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (defpackage.adzd) adyrVar.a;
                    defpackage.aooc.af(objA);
                }
                adtzVarG = this.g((defpackage.adtz) objA);
                if (adtzVarG instanceof defpackage.adub) {
                    return new defpackage.adub(((adyo) ((defpackage.adub) adtzVarG).a).a);
                }
                defpackage.aooh.d(adtzVarG, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                return (defpackage.adtv) adtzVarG;
            }
            defpackage.aooc.af(objA);
            adynVar = new adyn(new android.accounts.Account(str, "com.google"), str2);
            aootVar = new defpackage.aoot();
            apdpVar = this.f;
            adyrVar.a = adynVar;
            adyrVar.e = aootVar;
            adyrVar.f = apdpVar;
            adyrVar.d = 1;
            if (apdpVar.b(adyrVar) == aoluVar) {
                return aoluVar;
            }
            java.util.Map map = this.d;
            defpackage.aosy aosyVar = (defpackage.aosy) map.get(adynVar);
            if (aosyVar == null) {
                defpackage.aosy aosyVarAm = defpackage.aoov.am(this.l, 0, new adys(this, adynVar, (defpackage.aoln) null), 3);
                map.put(adynVar, aosyVarAm);
                aootVar.a = aosyVarAm;
            } else {
                aootVar.a = aosyVar;
            }
            apdpVar.d();
            defpackage.aosy aosyVar2 = (defpackage.aosy) aootVar.a;
            adyrVar.a = this;
            adyrVar.e = null;
            adyrVar.f = null;
            adyrVar.d = 2;
            objA = aosyVar2.a(adyrVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            adtzVarG = this.g((defpackage.adtz) objA);
            if (adtzVarG instanceof defpackage.adub) {
                return new defpackage.adub(((adyo) ((defpackage.adub) adtzVarG).a).a);
            }
            defpackage.aooh.d(adtzVarG, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
            return (defpackage.adtv) adtzVarG;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(java.lang.String str, defpackage.aoln aolnVar) {
        adyt adytVar;
        java.lang.Exception e;
        defpackage.adty adtyVar;
        defpackage.adub adtwVar;
        if (aolnVar instanceof adyt) {
            adytVar = (adyt) aolnVar;
            int i2 = adytVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adytVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adytVar = new adyt(this, aolnVar);
            }
        } else {
            adytVar = new adyt(this, aolnVar);
        }
        java.lang.Object obj = adytVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adytVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.adty adtyVar2 = defpackage.adty.aB;
            try {
                adytVar.d = adtyVar2;
                adytVar.e = this;
                adytVar.c = 1;
                java.lang.Object objR = r(str, "com.google", adytVar);
                if (objR == aoluVar) {
                    return aoluVar;
                }
                obj = objR;
                adtyVar = adtyVar2;
            } catch (java.lang.Exception e2) {
                e = e2;
                adtyVar = adtyVar2;
                defpackage.aooc.Y(adytVar.u());
                adtwVar = new adtw(e, adtyVar);
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = adytVar.e;
            adtyVar = adytVar.d;
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.Exception e3) {
                e = e3;
                defpackage.aooc.Y(adytVar.u());
                adtwVar = new adtw(e, adtyVar);
            }
        }
        adtwVar = new defpackage.adub(((com.google.android.gms.auth.aang.GoogleAccount) obj).a);
        return this.g(adtwVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(java.lang.String str, defpackage.aoln aolnVar) {
        adyu adyuVar;
        java.lang.Exception e;
        defpackage.adty adtyVar;
        defpackage.adub adtwVar;
        if (aolnVar instanceof adyu) {
            adyuVar = (adyu) aolnVar;
            int i2 = adyuVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyuVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adyuVar = new adyu(this, aolnVar);
            }
        } else {
            adyuVar = new adyu(this, aolnVar);
        }
        java.lang.Object obj = adyuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyuVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.adty adtyVar2 = defpackage.adty.aA;
            try {
                defpackage.zwx zwxVar = this.k;
                zwv zwvVarA = com.google.android.gms.auth.aang.GetAccountsRequest.a();
                zwvVarA.b(str);
                defpackage.aaum aaumVarB = zwxVar.b(zwvVarA.a());
                adyuVar.d = adtyVar2;
                adyuVar.e = this;
                adyuVar.c = 1;
                java.lang.Object objY = defpackage.aooh.Y(aaumVarB, adyuVar);
                if (objY == aoluVar) {
                    return aoluVar;
                }
                obj = objY;
                adtyVar = adtyVar2;
            } catch (java.lang.Exception e2) {
                e = e2;
                adtyVar = adtyVar2;
                defpackage.aooc.Y(adyuVar.u());
                adtwVar = new adtw(e, adtyVar);
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = adyuVar.e;
            adtyVar = adyuVar.d;
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.Exception e3) {
                e = e3;
                defpackage.aooc.Y(adyuVar.u());
                adtwVar = new adtw(e, adtyVar);
            }
        }
        java.util.List<com.google.android.gms.auth.aang.GoogleAccount> list = ((com.google.android.gms.auth.aang.GetAccountsResponse) obj).a;
        defpackage.aooh.c(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        for (com.google.android.gms.auth.aang.GoogleAccount googleAccount : list) {
            arrayList.add(new android.accounts.Account(googleAccount.c, googleAccount.b));
        }
        adtwVar = new defpackage.adub(arrayList);
        return this.g(adtwVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(adyn adynVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        adyv adyvVar;
        if (aolnVar instanceof adyv) {
            adyvVar = (adyv) aolnVar;
            int i2 = adyvVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyvVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adyvVar = new adyv(this, aolnVar);
            }
        } else {
            adyvVar = new adyv(this, aolnVar);
        }
        java.lang.Object objO = adyvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyvVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objO);
            android.accounts.Account account = adynVar.a;
            java.lang.String str = adynVar.b;
            adyvVar.d = adynVar;
            adyvVar.c = 1;
            objO = o(account, str, adyvVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adynVar = adyvVar.d;
            defpackage.aooc.af(objO);
        }
        this.o.put(adynVar, (adyo) objO);
        return objO;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0121 A[Catch: Exception -> 0x0127, TryCatch #2 {Exception -> 0x0127, blocks: (B:13:0x0033, B:40:0x00e1, B:42:0x0121, B:43:0x0123), top: B:65:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final java.lang.Object n(android.accounts.Account account, java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Exception {
        adyw adywVar;
        long j2;
        java.lang.String str2;
        long j3;
        java.lang.String str3;
        if (aolnVar instanceof adyw) {
            adywVar = (adyw) aolnVar;
            int i2 = adywVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adywVar.d = i2 - Integer.MIN_VALUE;
            } else {
                adywVar = new adyw(this, aolnVar);
            }
        } else {
            adywVar = new adyw(this, aolnVar);
        }
        java.lang.Object objR = adywVar.b;
        adyo adyoVar = defpackage.aolu.a;
        int i3 = adywVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objR);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                java.lang.String str4 = account.name;
                defpackage.aooh.e(str4, "name");
                java.lang.String str5 = account.type;
                defpackage.aooh.e(str5, "type");
                adywVar.e = str;
                adywVar.a = jElapsedRealtime;
                adywVar.d = 1;
                objR = r(str4, str5, adywVar);
                if (objR != adyoVar) {
                    str2 = str;
                    j3 = jElapsedRealtime;
                }
                return adyoVar;
            } catch (java.lang.Exception e) {
                e = e;
                j2 = jElapsedRealtime;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j2;
                if (e instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
                    str3 = "RECOVERABLE";
                } else if (!(e instanceof java.io.IOException) || t(e)) {
                    str3 = "NETWORK";
                } else {
                    str3 = "PERMANENT";
                }
                java.lang.String str6 = str3;
                defpackage.aeey aeeyVar = this.c;
                android.content.Context context = this.a;
                defpackage.aduu aduuVar = this.b;
                java.lang.String packageName = context.getPackageName();
                java.lang.String str7 = aduuVar.a;
                aeeyVar.l(jElapsedRealtime2, packageName, str7, "AANG", "FAILURE", str6);
                aeeyVar.a(context.getPackageName(), str7, "AANG", "FAILURE", str6);
                throw e;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = adywVar.a;
            try {
                defpackage.aooc.af(objR);
                com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse = (com.google.android.gms.auth.aang.GetTokenResponse) objR;
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - j2;
                defpackage.aeey aeeyVar2 = this.c;
                android.content.Context context2 = this.a;
                java.lang.String packageName2 = context2.getPackageName();
                java.lang.String str8 = this.b.a;
                aeeyVar2.l(jElapsedRealtime3, packageName2, str8, "AANG", "SUCCESS", "NONE");
                aeeyVar2.a(context2.getPackageName(), str8, "AANG", "SUCCESS", "NONE");
                java.lang.String str9 = getTokenResponse.a;
                defpackage.aooh.e(str9, "getToken(...)");
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata = getTokenResponse.b;
                adyoVar = new adyo(str9, epochMilli, oauth2TokenMetadata != null ? oauth2TokenMetadata.a : null);
                return adyoVar;
            } catch (java.lang.Exception e2) {
                e = e2;
                long jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - j2;
                if (e instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
                    str3 = "RECOVERABLE";
                } else if (e instanceof java.io.IOException) {
                    str3 = "NETWORK";
                } else {
                    str3 = "NETWORK";
                }
                java.lang.String str10 = str3;
                defpackage.aeey aeeyVar3 = this.c;
                android.content.Context context3 = this.a;
                defpackage.aduu aduuVar2 = this.b;
                java.lang.String packageName3 = context3.getPackageName();
                java.lang.String str11 = aduuVar2.a;
                aeeyVar3.l(jElapsedRealtime4, packageName3, str11, "AANG", "FAILURE", str10);
                aeeyVar3.a(context3.getPackageName(), str11, "AANG", "FAILURE", str10);
                throw e;
            }
        }
        j3 = adywVar.a;
        str2 = adywVar.e;
        try {
            defpackage.aooc.af(objR);
        } catch (java.lang.Exception e3) {
            e = e3;
            j2 = j3;
            long jElapsedRealtime5 = android.os.SystemClock.elapsedRealtime() - j2;
            if (e instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
                str3 = "RECOVERABLE";
            } else if (e instanceof java.io.IOException) {
                str3 = "NETWORK";
            } else {
                str3 = "NETWORK";
            }
            java.lang.String str12 = str3;
            defpackage.aeey aeeyVar4 = this.c;
            android.content.Context context4 = this.a;
            defpackage.aduu aduuVar3 = this.b;
            java.lang.String packageName4 = context4.getPackageName();
            java.lang.String str13 = aduuVar3.a;
            aeeyVar4.l(jElapsedRealtime5, packageName4, str13, "AANG", "FAILURE", str12);
            aeeyVar4.a(context4.getPackageName(), str13, "AANG", "FAILURE", str12);
            throw e;
        }
        zww zwwVarA = com.google.android.gms.auth.aang.GetTokenRequest.a();
        zwwVarA.a = (com.google.android.gms.auth.aang.GoogleAccount) objR;
        if (defpackage.aoov.ad(str2, "oauth2:")) {
            zwwVarA.c = defpackage.aoov.S(defpackage.aoov.z(str2, "oauth2:"), new java.lang.String[]{" "}, 0);
        } else if (defpackage.aoov.ad(str2, "weblogin:")) {
            zwwVarA.d = defpackage.aoov.S(defpackage.aoov.z(str2, "weblogin:"), new java.lang.String[]{" "}, 0);
        } else if (defpackage.aoov.ad(str2, "audience:server:client_id:")) {
            java.lang.String strSubstring = str2.substring(26);
            defpackage.aooh.e(strSubstring, "substring(...)");
            zwwVarA.f = defpackage.ajsz.aY(strSubstring);
        } else {
            zwwVarA.e = defpackage.aoov.S(str2, new java.lang.String[]{" "}, 0);
        }
        defpackage.aaum aaumVarC = this.k.c(zwwVarA.a());
        adywVar.e = null;
        adywVar.a = j3;
        adywVar.d = 2;
        objR = defpackage.aooh.Y(aaumVarC, adywVar);
        if (objR != adyoVar) {
            j2 = j3;
            com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse2 = (com.google.android.gms.auth.aang.GetTokenResponse) objR;
            long jElapsedRealtime6 = android.os.SystemClock.elapsedRealtime() - j2;
            defpackage.aeey aeeyVar5 = this.c;
            android.content.Context context5 = this.a;
            java.lang.String packageName5 = context5.getPackageName();
            java.lang.String str14 = this.b.a;
            aeeyVar5.l(jElapsedRealtime6, packageName5, str14, "AANG", "SUCCESS", "NONE");
            aeeyVar5.a(context5.getPackageName(), str14, "AANG", "SUCCESS", "NONE");
            java.lang.String str15 = getTokenResponse2.a;
            defpackage.aooh.e(str15, "getToken(...)");
            long epochMilli2 = j$.time.Instant.now().toEpochMilli();
            com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata2 = getTokenResponse2.b;
            adyoVar = new adyo(str15, epochMilli2, oauth2TokenMetadata2 != null ? oauth2TokenMetadata2.a : null);
        }
        return adyoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(android.accounts.Account account, java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Exception {
        adyx adyxVar;
        java.lang.Object obj;
        java.lang.String str2;
        if (aolnVar instanceof adyx) {
            adyxVar = (adyx) aolnVar;
            int i2 = adyxVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyxVar.d = i2 - Integer.MIN_VALUE;
            } else {
                adyxVar = new adyx(this, aolnVar);
            }
        } else {
            adyxVar = new adyx(this, aolnVar);
        }
        java.lang.Object objS = adyxVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyxVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objS);
            adyxVar.a = account;
            adyxVar.e = str;
            adyxVar.d = 1;
            objS = s(adyxVar);
            if (objS != aoluVar) {
            }
            obj = account;
            return aoluVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objS);
            return objS;
        }
        str = adyxVar.e;
        java.lang.Object obj2 = adyxVar.a;
        defpackage.aooc.af(objS);
        obj = obj2;
        obj = account;
        java.lang.String str3 = str;
        if (((java.lang.Boolean) objS).booleanValue()) {
            adyxVar.a = null;
            adyxVar.e = null;
            adyxVar.d = 2;
            java.lang.Object objN = n((android.accounts.Account) obj, str3, adyxVar);
            if (objN != aoluVar) {
                return objN;
            }
            obj = account;
            return aoluVar;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            android.content.Context context = this.a;
            android.os.Bundle bundle = android.os.Bundle.EMPTY;
            defpackage.aooh.e(bundle, "EMPTY");
            defpackage.aooh.f(context, "context");
            defpackage.aooh.f(obj, "account");
            defpackage.aooh.f(str3, "scope");
            defpackage.aooh.f(bundle, "extras");
            java.lang.String str4 = defpackage.zwk.a;
            com.google.android.gms.auth.TokenData tokenDataA = defpackage.zwq.a(context, (android.accounts.Account) obj, str3, bundle, 0L, null);
            defpackage.aooh.e(tokenDataA, "getTokenWithDetails(...)");
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
            defpackage.aeey aeeyVar = this.c;
            android.content.Context context2 = this.a;
            defpackage.aduu aduuVar = this.b;
            java.lang.String packageName = context2.getPackageName();
            java.lang.String str5 = aduuVar.a;
            aeeyVar.l(jElapsedRealtime2, packageName, str5, "LEGACY", "SUCCESS", "NONE");
            aeeyVar.a(context2.getPackageName(), str5, "LEGACY", "SUCCESS", "NONE");
            java.lang.String str6 = tokenDataA.b;
            defpackage.aooh.e(str6, "getToken(...)");
            return new adyo(str6, j$.time.Instant.now().toEpochMilli(), tokenDataA.c);
        } catch (java.lang.Exception e) {
            long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
            int iT = defpackage.aesg.t(e);
            if (iT != 0) {
                str2 = iT != 1 ? "PERMANENT" : "NETWORK";
            } else {
                str2 = "RECOVERABLE";
            }
            java.lang.String str7 = str2;
            defpackage.aeey aeeyVar2 = this.c;
            android.content.Context context3 = this.a;
            defpackage.aduu aduuVar2 = this.b;
            java.lang.String packageName2 = context3.getPackageName();
            java.lang.String str8 = aduuVar2.a;
            aeeyVar2.l(jElapsedRealtime3, packageName2, str8, "LEGACY", "FAILURE", str7);
            aeeyVar2.a(context3.getPackageName(), str8, "LEGACY", "FAILURE", str7);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [adzd] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [adzd] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [adzd] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [adty] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final java.lang.Object p(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        adyy adyyVar;
        defpackage.adub adtwVar;
        ?? r8;
        android.accounts.Account account;
        java.lang.String str3;
        ?? r10;
        java.lang.String str4;
        adyo adyoVar;
        ?? r9;
        ?? r11;
        if (aolnVar instanceof adyy) {
            adyyVar = (adyy) aolnVar;
            int i2 = adyyVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyyVar.e = i2 - Integer.MIN_VALUE;
            } else {
                adyyVar = new adyy((defpackage.adzd) this, aolnVar);
            }
        } else {
            adyyVar = new adyy((defpackage.adzd) this, aolnVar);
        }
        java.lang.Object objO = adyyVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyyVar.e;
        try {
            try {
                if (i3 != 0) {
                    try {
                        if (i3 == 1) {
                            defpackage.adzd adzdVar = adyyVar.g;
                            defpackage.adty adtyVar = (defpackage.adty) adyyVar.b;
                            account = (android.accounts.Account) adyyVar.a;
                            str3 = adyyVar.f;
                            defpackage.aooc.af(objO);
                            r10 = adzdVar;
                            str = adtyVar;
                        } else if (i3 == 2) {
                            defpackage.adzd adzdVar2 = adyyVar.g;
                            defpackage.adty adtyVar2 = (defpackage.adty) adyyVar.b;
                            account = (android.accounts.Account) adyyVar.a;
                            str4 = adyyVar.f;
                            defpackage.aooc.af(objO);
                            r10 = adzdVar2;
                            str = adtyVar2;
                            adyyVar.f = str4;
                            adyyVar.a = str;
                            adyyVar.b = r10;
                            adyyVar.g = null;
                            adyyVar.e = 3;
                            objO = o(account, str4, adyyVar);
                            if (objO != aoluVar) {
                                return aoluVar;
                            }
                            r11 = r10;
                            r9 = str;
                        } else {
                            if (i3 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            defpackage.adzd adzdVar3 = (defpackage.adzd) adyyVar.b;
                            defpackage.adty adtyVar3 = (defpackage.adty) adyyVar.a;
                            defpackage.aooc.af(objO);
                            r11 = adzdVar3;
                            r9 = adtyVar3;
                        }
                        adyoVar = (adyo) objO;
                        this = r11;
                        str = r9;
                        java.lang.Long l = adyoVar.c;
                        adtwVar = new defpackage.adub(adyoVar.a);
                        r8 = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        this = str;
                        str = str2;
                        defpackage.aooc.Y(adyyVar.u());
                        adtwVar = new adtw(e, (defpackage.adty) str);
                        r8 = this;
                    }
                    return r8.g(adtwVar);
                }
                defpackage.aooc.af(objO);
                android.accounts.Account account2 = new android.accounts.Account(str, "com.google");
                defpackage.adty adtyVar4 = defpackage.adty.aD;
                adyyVar.f = str2;
                adyyVar.a = account2;
                adyyVar.b = adtyVar4;
                adyyVar.g = this;
                adyyVar.e = 1;
                java.lang.Object objO2 = o(account2, str2, adyyVar);
                if (objO2 == aoluVar) {
                    return aoluVar;
                }
                account = account2;
                objO = objO2;
                str3 = str2;
                r10 = this;
                str = adtyVar4;
                adyoVar = (adyo) objO;
                if (u(adyoVar)) {
                    this = r10;
                    str = str;
                } else {
                    java.lang.Long l2 = adyoVar.c;
                    adyyVar.f = str3;
                    adyyVar.a = account;
                    adyyVar.b = str;
                    adyyVar.g = r10;
                    adyyVar.e = 2;
                    if (h(adyoVar, adyyVar) == aoluVar) {
                        return aoluVar;
                    }
                    str4 = str3;
                    str = str;
                    r10 = r10;
                    adyyVar.f = str4;
                    adyyVar.a = str;
                    adyyVar.b = r10;
                    adyyVar.g = null;
                    adyyVar.e = 3;
                    objO = o(account, str4, adyyVar);
                    if (objO != aoluVar) {
                        return aoluVar;
                    }
                    r11 = r10;
                    r9 = str;
                    adyoVar = (adyo) objO;
                    this = r11;
                    str = r9;
                }
                java.lang.Long l3 = adyoVar.c;
                adtwVar = new defpackage.adub(adyoVar.a);
                r8 = this;
            } catch (java.lang.Exception e2) {
                ?? r7 = r10;
                e = e2;
                this = r7;
                defpackage.aooc.Y(adyyVar.u());
                adtwVar = new adtw(e, (defpackage.adty) str);
                r8 = this;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
        return r8.g(adtwVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(adyn adynVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        adyz adyzVar;
        if (aolnVar instanceof adyz) {
            adyzVar = (adyz) aolnVar;
            int i2 = adyzVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adyzVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adyzVar = new adyz(this, aolnVar);
            }
        } else {
            adyzVar = new adyz(this, aolnVar);
        }
        java.lang.Object obj = adyzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adyzVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            adyo adyoVar = (adyo) this.o.get(adynVar);
            if (adyoVar != null) {
                if (u(adyoVar)) {
                    return adyoVar;
                }
                adyzVar.d = adynVar;
                adyzVar.c = 1;
                if (h(adyoVar, adyzVar) != aoluVar) {
                }
            }
            return aoluVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
            return obj;
        }
        adynVar = adyzVar.d;
        defpackage.aooc.af(obj);
        adyzVar.d = null;
        adyzVar.c = 2;
        java.lang.Object objM = m(adynVar, adyzVar);
        if (objM != aoluVar) {
            return objM;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.lang.Exception {
        adza adzaVar;
        java.lang.Object next;
        if (aolnVar instanceof adza) {
            adzaVar = (adza) aolnVar;
            int i2 = adzaVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adzaVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adzaVar = new adza(this, aolnVar);
            }
        } else {
            adzaVar = new adza(this, aolnVar);
        }
        java.lang.Object objY = adzaVar.a;
        com.google.android.gms.auth.aang.GoogleAccount googleAccount = defpackage.aolu.a;
        int i3 = adzaVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objY);
            defpackage.zwx zwxVar = this.k;
            zwv zwvVarA = com.google.android.gms.auth.aang.GetAccountsRequest.a();
            zwvVarA.b(str2);
            defpackage.aaum aaumVarB = zwxVar.b(zwvVarA.a());
            adzaVar.d = str;
            adzaVar.c = 1;
            objY = defpackage.aooh.Y(aaumVarB, adzaVar);
            if (objY != googleAccount) {
            }
            return googleAccount;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = adzaVar.d;
        defpackage.aooc.af(objY);
        java.util.List list = ((com.google.android.gms.auth.aang.GetAccountsResponse) objY).a;
        defpackage.aooh.c(list);
        java.util.Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!defpackage.aooh.n(((com.google.android.gms.auth.aang.GoogleAccount) next).c, str));
        googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) next;
        if (googleAccount == null) {
            throw new defpackage.zwj("Account not found: ".concat(java.lang.String.valueOf(str)));
        }
        return googleAccount;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(defpackage.aoln aolnVar) {
        adzc adzcVar;
        java.lang.Exception e;
        defpackage.adty adtyVar;
        defpackage.adub adtwVar;
        if (aolnVar instanceof adzc) {
            adzcVar = (adzc) aolnVar;
            int i2 = adzcVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adzcVar.c = i2 - Integer.MIN_VALUE;
            } else {
                adzcVar = new adzc(this, aolnVar);
            }
        } else {
            adzcVar = new adzc(this, aolnVar);
        }
        java.lang.Object obj = adzcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = adzcVar.c;
        boolean z = false;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            if (defpackage.anft.a.eZ().b()) {
                defpackage.adty adtyVar2 = defpackage.adty.b;
                try {
                    defpackage.aaum aaumVarC = this.n.c(defpackage.ajbm.INSTANCE, this.k, new defpackage.aadf[0]);
                    adzcVar.d = adtyVar2;
                    adzcVar.c = 1;
                    java.lang.Object objY = defpackage.aooh.Y(aaumVarC, adzcVar);
                    if (objY == aoluVar) {
                        return aoluVar;
                    }
                    obj = objY;
                    adtyVar = adtyVar2;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    adtyVar = adtyVar2;
                    defpackage.aooc.Y(adzcVar.u());
                    adtwVar = new adtw(e, adtyVar);
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        adtyVar = adzcVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Exception e3) {
            e = e3;
            defpackage.aooc.Y(adzcVar.u());
            adtwVar = new adtw(e, adtyVar);
        }
        adtwVar = new defpackage.adub(obj);
        if (adtwVar.i()) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}

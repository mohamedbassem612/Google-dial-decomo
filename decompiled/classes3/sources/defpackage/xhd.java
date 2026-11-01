package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhd implements defpackage.xhe {
    public static final aope a;
    private final defpackage.xpz b;
    private final aoss c;
    private final ecx d;
    private final java.lang.String e;
    private final android.content.Context f;
    private long g;
    private final j$.util.concurrent.ConcurrentHashMap h;
    private final xtq i;

    static {
        int i = defpackage.xgu.b;
        a = dpy.m("OnboardingDataStore", new efk(new defpackage.xgn(2)));
    }

    public xhd(android.content.Context context, xtq xtqVar, defpackage.xpz xpzVar, aoss aossVar, ecx ecxVar) {
        aooh.f(context, "context");
        aooh.f(ecxVar, "dataStore");
        this.i = xtqVar;
        this.b = xpzVar;
        this.c = aossVar;
        this.d = ecxVar;
        this.e = "OnboardingTaskInfra";
        this.f = context.getApplicationContext();
        this.h = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final java.lang.String h(java.lang.String str) {
        java.lang.String str2 = this.e;
        return !aoov.ad(str, str2) ? str2.concat(java.lang.String.valueOf(str)) : str;
    }

    private final void i(java.lang.String str, android.os.PersistableBundle persistableBundle) {
        if (this.b.e(474505888L)) {
            this.h.put(str, j$.util.Optional.ofNullable(persistableBundle));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.xgv xgvVar;
        if (aolnVar instanceof defpackage.xgv) {
            xgvVar = (defpackage.xgv) aolnVar;
            int i = xgvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgvVar.c = i - Integer.MIN_VALUE;
            } else {
                xgvVar = new defpackage.xgv(this, aolnVar);
            }
        } else {
            xgvVar = new defpackage.xgv(this, aolnVar);
        }
        java.lang.Object objAu = xgvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xgvVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objAu);
                long j = this.g;
                if (j != 0) {
                    return new java.lang.Long(j);
                }
                android.content.Context context = this.f;
                aooh.e(context, "context");
                aoxh aoxhVarB = defpackage.xgu.a(context).b();
                xgvVar.c = 1;
                objAu = aoov.au(aoxhVarB, xgvVar);
                if (objAu == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAu);
            }
            java.lang.Long l = (java.lang.Long) ((efx) objAu).a(dzk.s("last_accessed_suw_session_id"));
            if (l != null) {
                this.g = l.longValue();
            }
        } catch (java.lang.Exception e) {
            defpackage.xox.h("OnboardingDataStore", "Ignoring error", e);
        }
        return new java.lang.Long(this.g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, aoln aolnVar) {
        defpackage.xgw xgwVar;
        if (aolnVar instanceof defpackage.xgw) {
            xgwVar = (defpackage.xgw) aolnVar;
            int i = xgwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgwVar.c = i - Integer.MIN_VALUE;
            } else {
                xgwVar = new defpackage.xgw(this, aolnVar);
            }
        } else {
            xgwVar = new defpackage.xgw(this, aolnVar);
        }
        java.lang.Object obj = xgwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xgwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            this.g = j;
            android.content.Context context = this.f;
            aooh.e(context, "context");
            ecx ecxVarA = defpackage.xgu.a(context);
            mnx mnxVar = new mnx(j, (aoln) null, 3, (short[]) null);
            xgwVar.c = 1;
            if (dzk.r(ecxVarA, mnxVar, xgwVar) == aoluVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [xpb] */
    @Override // defpackage.xhe
    public final java.lang.Object c(java.lang.String str, defpackage.xpb xpbVar, aoln aolnVar) {
        defpackage.xgx xgxVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.xgx) {
            xgxVar = (defpackage.xgx) aolnVar;
            int i = xgxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgxVar.d = i - Integer.MIN_VALUE;
            } else {
                xgxVar = new defpackage.xgx(this, aolnVar);
            }
        } else {
            xgxVar = new defpackage.xgx(this, aolnVar);
        }
        java.lang.Object obj2 = xgxVar.b;
        aolu aoluVar = aolu.a;
        int i2 = xgxVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            if (this.b.e(409902959L)) {
                xgxVar.e = str;
                xgxVar.a = xpbVar;
                xgxVar.d = 1;
                if (e(xgxVar) != aoluVar) {
                }
                obj = xpbVar;
                return aoluVar;
            }
            defpackage.xox.e("OnboardingDataStore", "Feature disabled. Returning null for reading key: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj2);
            return obj2;
        }
        java.lang.Object obj3 = xgxVar.a;
        str = xgxVar.e;
        aooc.af(obj2);
        obj = obj3;
        obj = xpbVar;
        java.lang.String str2 = str;
        ?? r9 = obj;
        if (this.b.e(474505888L)) {
            aooh.f(str2, "key");
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.h;
            if (concurrentHashMap.containsKey(str2)) {
                j$.util.Optional optional = (j$.util.Optional) concurrentHashMap.get(str2);
                android.os.PersistableBundle persistableBundle = optional != null ? (android.os.PersistableBundle) optional.orElse((java.lang.Object) null) : null;
                if (persistableBundle != null) {
                    return r9.c(persistableBundle);
                }
                return null;
            }
        }
        apbj apbjVar = this.c;
        defpackage.xhb xhbVar = new defpackage.xhb(this, str2, (defpackage.xpb) r9, (aoln) null, 1);
        xgxVar.e = null;
        xgxVar.a = null;
        xgxVar.d = 2;
        java.lang.Object objAj = aoov.aj(apbjVar.a, xhbVar, xgxVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        obj = xpbVar;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        defpackage.xgy xgyVar;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.String str3;
        byte[] bArr;
        if (aolnVar instanceof defpackage.xgy) {
            xgyVar = (defpackage.xgy) aolnVar;
            int i = xgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgyVar.c = i - Integer.MIN_VALUE;
            } else {
                xgyVar = new defpackage.xgy(this, aolnVar);
            }
        } else {
            xgyVar = new defpackage.xgy(this, aolnVar);
        }
        java.lang.Object obj = xgyVar.a;
        android.os.PersistableBundle persistableBundleF = aolu.a;
        int i2 = xgyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.String strH = h(str);
            try {
                aoxh aoxhVarB = this.d.b();
                xgyVar.d = str;
                xgyVar.e = strH;
                xgyVar.c = 1;
                java.lang.Object objAw = aoov.aw(aoxhVarB, xgyVar);
                if (objAw != persistableBundleF) {
                    str2 = str;
                    str3 = strH;
                    obj = objAw;
                }
            } catch (java.lang.Exception e2) {
                str2 = str;
                e = e2;
                defpackage.xox.h("OnboardingDataStore", "Ignoring error", e);
            }
            return persistableBundleF;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str3 = xgyVar.e;
        str2 = xgyVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Exception e3) {
            e = e3;
            defpackage.xox.h("OnboardingDataStore", "Ignoring error", e);
        }
        efx efxVar = (efx) obj;
        persistableBundleF = (efxVar == null || (bArr = (byte[]) efxVar.a(dzk.s(str3))) == null) ? null : defpackage.xff.f(ajsz.aY(bArr));
        i(str2, persistableBundleF);
        return persistableBundleF;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9 A[Catch: Exception -> 0x0103, TRY_LEAVE, TryCatch #2 {Exception -> 0x0103, blocks: (B:15:0x0039, B:53:0x00f9, B:20:0x004a, B:48:0x00e9, B:23:0x0054, B:45:0x00d5, B:43:0x00ab), top: B:64:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.xgz xgzVar;
        long j;
        long jLongValue;
        ecx ecxVar;
        defpackage.uns unsVar;
        long j2;
        long j3;
        if (aolnVar instanceof defpackage.xgz) {
            xgzVar = (defpackage.xgz) aolnVar;
            int i = xgzVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgzVar.e = i - Integer.MIN_VALUE;
            } else {
                xgzVar = new defpackage.xgz(this, aolnVar);
            }
        } else {
            xgzVar = new defpackage.xgz(this, aolnVar);
        }
        java.lang.Object objA = xgzVar.c;
        aolu aoluVar = aolu.a;
        int i2 = xgzVar.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j = xgzVar.a;
                    aooc.af(objA);
                } else if (i2 == 2) {
                    jLongValue = xgzVar.b;
                    long j4 = xgzVar.a;
                    aooc.af(objA);
                    j = j4;
                    ecxVar = this.d;
                    unsVar = new defpackage.uns((aoln) null, 3, (short[]) null);
                    xgzVar.a = j;
                    xgzVar.b = jLongValue;
                    xgzVar.e = 3;
                    if (dzk.r(ecxVar, unsVar, xgzVar) != aoluVar) {
                        return aoluVar;
                    }
                    j2 = j;
                    xgzVar.a = jLongValue;
                    xgzVar.e = 4;
                    if (b(j2, xgzVar) == aoluVar) {
                        return aoluVar;
                    }
                    j3 = jLongValue;
                } else if (i2 == 3) {
                    long j5 = xgzVar.b;
                    j2 = xgzVar.a;
                    aooc.af(objA);
                    jLongValue = j5;
                    xgzVar.a = jLongValue;
                    xgzVar.e = 4;
                    if (b(j2, xgzVar) == aoluVar) {
                        return aoluVar;
                    }
                    j3 = jLongValue;
                } else {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = xgzVar.a;
                    aooc.af(objA);
                }
                if (j3 != 0) {
                    defpackage.xox.b("OnboardingDataStore", a.bz(j3, "Cleared DataStore for SUW session "));
                }
                return aojh.a;
            }
            aooc.af(objA);
            try {
                android.os.Bundle bundleH = defpackage.agfz.h((android.content.Context) this.i.a, "getSuwSessionId", "Failed to get SUW session ID; return 0.");
                j = bundleH != null ? bundleH.getLong("suwSessionIdInt64", 0L) : 0L;
                try {
                    defpackage.xox.d("SuwMetadataProvider", a.bz(j, "Got SUW session ID: "));
                } catch (java.lang.Exception unused) {
                    defpackage.xox.e("SuwMetadataProvider", "Failed to get SUW session id");
                }
            } catch (java.lang.Exception unused2) {
                j = 0;
            }
            if (j == 0) {
                defpackage.xox.e("OnboardingDataStore", "Failed to get SUW session id.");
                return aojh.a;
            }
            xgzVar.a = j;
            xgzVar.e = 1;
            objA = a(xgzVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            jLongValue = ((java.lang.Number) objA).longValue();
            if (j != jLongValue) {
                defpackage.xox.b("OnboardingDataStore", a.bz(j, "Preparing dataStore for new SUW session "));
                this.h.clear();
                android.content.Context context = this.f;
                aooh.e(context, "context");
                ecx ecxVarA = defpackage.xgu.a(context);
                defpackage.uns unsVar2 = new defpackage.uns((aoln) null, 2, (char[]) null);
                xgzVar.a = j;
                xgzVar.b = jLongValue;
                xgzVar.e = 2;
                if (dzk.r(ecxVarA, unsVar2, xgzVar) == aoluVar) {
                    return aoluVar;
                }
                ecxVar = this.d;
                unsVar = new defpackage.uns((aoln) null, 3, (short[]) null);
                xgzVar.a = j;
                xgzVar.b = jLongValue;
                xgzVar.e = 3;
                if (dzk.r(ecxVar, unsVar, xgzVar) != aoluVar) {
                    return aoluVar;
                }
                j2 = j;
                xgzVar.a = jLongValue;
                xgzVar.e = 4;
                if (b(j2, xgzVar) == aoluVar) {
                    return aoluVar;
                }
                j3 = jLongValue;
                if (j3 != 0) {
                    defpackage.xox.b("OnboardingDataStore", a.bz(j3, "Cleared DataStore for SUW session "));
                }
            }
        } catch (java.lang.Exception e) {
            defpackage.xox.h("OnboardingDataStore", "Ignoring error", e);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xhe
    public final java.lang.Object f(java.lang.String str, java.lang.Object obj, defpackage.xpn xpnVar, aoln aolnVar) {
        defpackage.xha xhaVar;
        if (aolnVar instanceof defpackage.xha) {
            xhaVar = (defpackage.xha) aolnVar;
            int i = xhaVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhaVar.e = i - Integer.MIN_VALUE;
            } else {
                xhaVar = new defpackage.xha(this, aolnVar);
            }
        } else {
            xhaVar = new defpackage.xha(this, aolnVar);
        }
        java.lang.Object obj2 = xhaVar.c;
        aolu aoluVar = aolu.a;
        int i2 = xhaVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                xpnVar = xhaVar.f;
                obj = xhaVar.b;
                str = (java.lang.String) xhaVar.a;
                aooc.af(obj2);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj2);
            }
            return aojh.a;
        }
        aooc.af(obj2);
        if (!this.b.e(409902959L)) {
            defpackage.xox.e("OnboardingDataStore", "Feature disabled. Ignore writing key: ".concat(java.lang.String.valueOf(str)));
            return aojh.a;
        }
        xhaVar.a = str;
        xhaVar.b = obj;
        xhaVar.f = (defpackage.xpj) xpnVar;
        xhaVar.e = 1;
        if (e(xhaVar) == aoluVar) {
            return aoluVar;
        }
        java.lang.String str2 = str;
        android.os.PersistableBundle persistableBundleEw = xpnVar.ew(obj);
        i(str2, persistableBundleEw);
        apbj apbjVar = this.c;
        defpackage.xhb xhbVar = new defpackage.xhb(this, str2, persistableBundleEw, (aoln) null, 0);
        xhaVar.a = persistableBundleEw;
        xhaVar.b = null;
        xhaVar.f = null;
        xhaVar.e = 2;
        if (aoov.aj(apbjVar.a, xhbVar, xhaVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.lang.String str, android.os.PersistableBundle persistableBundle, aoln aolnVar) {
        defpackage.xhc xhcVar;
        if (aolnVar instanceof defpackage.xhc) {
            xhcVar = (defpackage.xhc) aolnVar;
            int i = xhcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhcVar.c = i - Integer.MIN_VALUE;
            } else {
                xhcVar = new defpackage.xhc(this, aolnVar);
            }
        } else {
            xhcVar = new defpackage.xhc(this, aolnVar);
        }
        java.lang.Object obj = xhcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xhcVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                java.lang.String strH = h(str);
                ecx ecxVar = this.d;
                defpackage.rae raeVar = new defpackage.rae(strH, persistableBundle, (aoln) null, 3);
                xhcVar.c = 1;
                if (dzk.r(ecxVar, raeVar, xhcVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (java.lang.Exception e) {
            defpackage.xox.h("OnboardingDataStore", "Ignoring error", e);
        }
        return aojh.a;
    }
}

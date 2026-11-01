package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adao {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public adao(defpackage.amwu amwuVar, defpackage.aolr aolrVar) {
        if (amwuVar == null) {
            defpackage.aooh.i("registrationDataStore");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = amwuVar;
        this.a = aolrVar;
    }

    private static final defpackage.apfx s(final int i, boolean z, defpackage.ahyn ahynVar) {
        defpackage.ahyn ahynVarA;
        defpackage.ahyn ahynVar2;
        defpackage.akzx akzxVarM = defpackage.apfx.a.m();
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        akzxVarM.u();
        defpackage.apfx apfxVar = (defpackage.apfx) akzxVarM.b;
        apfxVar.b |= 1;
        apfxVar.c = elapsedCpuTime;
        akzxVarM.u();
        defpackage.apfx apfxVar2 = (defpackage.apfx) akzxVarM.b;
        apfxVar2.b |= 2;
        apfxVar2.d = z;
        int iActiveCount = java.lang.Thread.activeCount();
        akzxVarM.u();
        defpackage.apfx apfxVar3 = (defpackage.apfx) akzxVarM.b;
        apfxVar3.b |= 4;
        apfxVar3.e = iActiveCount;
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "/proc/%d/oom_score_adj", java.lang.Integer.valueOf(i));
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
                try {
                    ahynVarA = defpackage.ahyn.g(randomAccessFile.readLine()).a(new defpackage.adcu(16));
                    randomAccessFile.close();
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (ahynVarA.f()) {
                        int iIntValue = ((java.lang.Integer) ahynVarA.b()).intValue();
                        akzxVarM.u();
                        defpackage.apfx apfxVar4 = (defpackage.apfx) akzxVarM.b;
                        apfxVar4.b |= 16;
                        apfxVar4.g = iIntValue;
                    }
                    if (ahynVar.f()) {
                        defpackage.aepx aepxVar = (defpackage.aepx) ahynVar.b();
                        if (aepxVar.a) {
                            ahynVar2 = (defpackage.ahyn) defpackage.ahvr.aT(aepxVar.a().iterator(), new defpackage.ahyp() { // from class: aepv
                                @Override // defpackage.ahyp
                                public final boolean a(java.lang.Object obj) {
                                    return ((android.app.ActivityManager.RunningAppProcessInfo) obj).pid == i;
                                }
                            }).a(new defpackage.adcu(14)).d(defpackage.ahwt.a);
                        } else {
                            ahynVar2 = defpackage.ahwt.a;
                        }
                        if (ahynVar2.f()) {
                            java.lang.String strFlattenToString = ((android.content.ComponentName) ahynVar2.b()).flattenToString();
                            akzxVarM.u();
                            defpackage.apfx apfxVar5 = (defpackage.apfx) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strFlattenToString);
                            apfxVar5.b |= 32;
                            apfxVar5.h = strFlattenToString;
                        }
                    }
                    return (defpackage.apfx) akzxVarM.r();
                } catch (java.lang.Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException unused) {
                ahynVarA = defpackage.ahwt.a;
            }
        } catch (java.lang.Throwable th3) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq a(android.net.Uri uri) {
        return defpackage.ahvr.F(new wzc(this, uri, 18, (byte[]) null), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.aeap aeapVar;
        if (aolnVar instanceof defpackage.aeap) {
            aeapVar = (defpackage.aeap) aolnVar;
            int i = aeapVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeapVar.b = i - Integer.MIN_VALUE;
            } else {
                aeapVar = new defpackage.aeap(this, aolnVar);
            }
        } else {
            aeapVar = new defpackage.aeap(this, aolnVar);
        }
        java.lang.Object objJ = aeapVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aeapVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeapVar.b = 1;
            objJ = j(aeapVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        java.lang.String str = ((defpackage.aegw) objJ).j;
        defpackage.aooh.e(str, "getInternalTargetId(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        aeaq aeaqVar;
        if (aolnVar instanceof aeaq) {
            aeaqVar = (aeaq) aolnVar;
            int i = aeaqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeaqVar.b = i - Integer.MIN_VALUE;
            } else {
                aeaqVar = new aeaq(this, aolnVar);
            }
        } else {
            aeaqVar = new aeaq(this, aolnVar);
        }
        java.lang.Object objJ = aeaqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeaqVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeaqVar.b = 1;
            objJ = j(aeaqVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        return ((defpackage.aegw) objJ).h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.aear aearVar;
        defpackage.aegv aegvVar;
        if (aolnVar instanceof defpackage.aear) {
            aearVar = (defpackage.aear) aolnVar;
            int i = aearVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aearVar.b = i - Integer.MIN_VALUE;
            } else {
                aearVar = new defpackage.aear(this, aolnVar);
            }
        } else {
            aearVar = new defpackage.aear(this, aolnVar);
        }
        java.lang.Object objJ = aearVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aearVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aearVar.b = 1;
            objJ = j(aearVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        int i3 = ((defpackage.aegw) objJ).f;
        if (i3 == 0) {
            aegvVar = defpackage.aegv.UNKNOWN;
        } else if (i3 == 1) {
            aegvVar = defpackage.aegv.SIGNED_IN;
        } else if (i3 == 2) {
            aegvVar = defpackage.aegv.SIGNED_OUT_ZWIEBACK;
        } else if (i3 != 3) {
            aegvVar = i3 != 4 ? null : defpackage.aegv.SIGNED_IN_FITBIT;
        } else {
            aegvVar = defpackage.aegv.SIGNED_OUT_YOUTUBE_VISITOR;
        }
        if (aegvVar == null) {
            aegvVar = defpackage.aegv.UNRECOGNIZED;
        }
        defpackage.adzy adzyVar = defpackage.adzy.UNKNOWN;
        defpackage.adzu adzuVar = defpackage.adzu.CHIME;
        int iOrdinal = aegvVar.ordinal();
        if (iOrdinal == 1) {
            return defpackage.adzy.SIGNED_IN;
        }
        if (iOrdinal == 2) {
            return defpackage.adzy.SIGNED_OUT_ZWIEBACK;
        }
        if (iOrdinal == 3) {
            return defpackage.adzy.SIGNED_OUT_YOUTUBE_VISITOR;
        }
        if (iOrdinal == 4) {
            return defpackage.adzy.SIGNED_IN_FITBIT;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        defpackage.aeas aeasVar;
        if (aolnVar instanceof defpackage.aeas) {
            aeasVar = (defpackage.aeas) aolnVar;
            int i = aeasVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeasVar.b = i - Integer.MIN_VALUE;
            } else {
                aeasVar = new defpackage.aeas(this, aolnVar);
            }
        } else {
            aeasVar = new defpackage.aeas(this, aolnVar);
        }
        java.lang.Object objJ = aeasVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aeasVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeasVar.b = 1;
            objJ = j(aeasVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        java.lang.String str = ((defpackage.aegw) objJ).c;
        defpackage.aooh.e(str, "getLastSuccessfulRegistrationEnvironmentUrl(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        defpackage.aeat aeatVar;
        if (aolnVar instanceof defpackage.aeat) {
            aeatVar = (defpackage.aeat) aolnVar;
            int i = aeatVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeatVar.b = i - Integer.MIN_VALUE;
            } else {
                aeatVar = new defpackage.aeat(this, aolnVar);
            }
        } else {
            aeatVar = new defpackage.aeat(this, aolnVar);
        }
        java.lang.Object objJ = aeatVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aeatVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeatVar.b = 1;
            objJ = j(aeatVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        return new java.lang.Integer(((defpackage.aegw) objJ).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aoln aolnVar) {
        defpackage.aeau aeauVar;
        if (aolnVar instanceof defpackage.aeau) {
            aeauVar = (defpackage.aeau) aolnVar;
            int i = aeauVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeauVar.b = i - Integer.MIN_VALUE;
            } else {
                aeauVar = new defpackage.aeau(this, aolnVar);
            }
        } else {
            aeauVar = new defpackage.aeau(this, aolnVar);
        }
        java.lang.Object objJ = aeauVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aeauVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeauVar.b = 1;
            objJ = j(aeauVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        java.lang.String str = ((defpackage.aegw) objJ).g;
        defpackage.aooh.e(str, "getLastSuccessfulRegistr…onPseudonymousCookie(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        defpackage.aeav aeavVar;
        if (aolnVar instanceof defpackage.aeav) {
            aeavVar = (defpackage.aeav) aolnVar;
            int i = aeavVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeavVar.b = i - Integer.MIN_VALUE;
            } else {
                aeavVar = new defpackage.aeav(this, aolnVar);
            }
        } else {
            aeavVar = new defpackage.aeav(this, aolnVar);
        }
        java.lang.Object objJ = aeavVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = aeavVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeavVar.b = 1;
            objJ = j(aeavVar);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        return new java.lang.Long(((defpackage.aegw) objJ).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.aoln aolnVar) {
        aeaw aeawVar;
        if (aolnVar instanceof aeaw) {
            aeawVar = (aeaw) aolnVar;
            int i = aeawVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeawVar.b = i - Integer.MIN_VALUE;
            } else {
                aeawVar = new aeaw(this, aolnVar);
            }
        } else {
            aeawVar = new aeaw(this, aolnVar);
        }
        java.lang.Object objJ = aeawVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeawVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeawVar.b = 1;
            objJ = j(aeawVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        defpackage.aegu aeguVarB = defpackage.aegu.b(((defpackage.aegw) objJ).i);
        if (aeguVarB == null) {
            aeguVarB = defpackage.aegu.UNRECOGNIZED;
        }
        defpackage.adzy adzyVar = defpackage.adzy.UNKNOWN;
        defpackage.adzu adzuVar = defpackage.adzu.CHIME;
        int iOrdinal = aeguVarB.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? defpackage.adzu.NONE : defpackage.adzu.GNP;
        }
        return defpackage.adzu.CHIME;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [amwu, java.lang.Object] */
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(((defpackage.ecx) this.b.a()).b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.aoln aolnVar) {
        aeax aeaxVar;
        if (aolnVar instanceof aeax) {
            aeaxVar = (aeax) aolnVar;
            int i = aeaxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeaxVar.b = i - Integer.MIN_VALUE;
            } else {
                aeaxVar = new aeax(this, aolnVar);
            }
        } else {
            aeaxVar = new aeax(this, aolnVar);
        }
        java.lang.Object objJ = aeaxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeaxVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            aeaxVar.b = 1;
            objJ = j(aeaxVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objJ);
        }
        return java.lang.Boolean.valueOf(((defpackage.aegw) objJ).e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v2, types: [amwu, java.lang.Object] */
    public final java.lang.Object l(int i, java.lang.String str, defpackage.adzy adzyVar, java.lang.String str2, long j, java.lang.String str3, boolean z, defpackage.aoln aolnVar) {
        aeay aeayVar;
        if (aolnVar instanceof aeay) {
            aeayVar = (aeay) aolnVar;
            int i2 = aeayVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aeayVar.b = i2 - Integer.MIN_VALUE;
            } else {
                aeayVar = new aeay(this, aolnVar);
            }
        } else {
            aeayVar = new aeay(this, aolnVar);
        }
        aeay aeayVar2 = aeayVar;
        java.lang.Object obj = aeayVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = aeayVar2.b;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = (defpackage.ecx) this.b.a();
            aeaz aeazVar = new aeaz(i, str, j, z, adzyVar, this, str2, str3, (defpackage.aoln) null);
            aeayVar2.b = 1;
            if (ecxVar.a(aeazVar, aeayVar2) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [amwu, java.lang.Object] */
    public final java.lang.Object m(java.lang.String str, defpackage.aoln aolnVar) {
        aeba aebaVar;
        if (aolnVar instanceof aeba) {
            aebaVar = (aeba) aolnVar;
            int i = aebaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebaVar.b = i - Integer.MIN_VALUE;
            } else {
                aebaVar = new aeba(this, aolnVar);
            }
        } else {
            aebaVar = new aeba(this, aolnVar);
        }
        java.lang.Object obj = aebaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebaVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = (defpackage.ecx) this.b.a();
            ghv ghvVar = new ghv(str, (defpackage.aoln) null, 10, (boolean[]) null);
            aebaVar.b = 1;
            if (ecxVar.a(ghvVar, aebaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [amwu, java.lang.Object] */
    public final java.lang.Object n(defpackage.adzu adzuVar, defpackage.aoln aolnVar) {
        defpackage.aebb aebbVar;
        if (aolnVar instanceof defpackage.aebb) {
            aebbVar = (defpackage.aebb) aolnVar;
            int i = aebbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebbVar.b = i - Integer.MIN_VALUE;
            } else {
                aebbVar = new defpackage.aebb(this, aolnVar);
            }
        } else {
            aebbVar = new defpackage.aebb(this, aolnVar);
        }
        java.lang.Object obj = aebbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebbVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = (defpackage.ecx) this.b.a();
            defpackage.aebc aebcVar = new defpackage.aebc(this, adzuVar, null);
            aebbVar.b = 1;
            if (ecxVar.a(aebcVar, aebbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final synchronized java.lang.Object o(java.lang.String str) {
        return p(defpackage.agab.bx(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [adui, java.lang.Object] */
    public final synchronized java.lang.Object p(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        java.lang.Object objA;
        ?? r0 = this.a;
        objA = r0.get(accountRepresentation);
        if (objA == null) {
            objA = this.b.a(accountRepresentation);
            r0.put(accountRepresentation, objA);
        }
        return objA;
    }

    public final defpackage.apfx q() {
        java.lang.Object obj = this.b;
        int iMyPid = android.os.Process.myPid();
        defpackage.aepx aepxVarA = defpackage.aepw.a((android.content.Context) obj, "getAndroidProcessStats");
        return s(iMyPid, ((defpackage.aogc) this.a).V(new defpackage.aell(aepxVarA, 9)), defpackage.ahyn.g(aepxVarA));
    }

    public final defpackage.apfx r(int i, defpackage.ahzi ahziVar) {
        return s(i, ((defpackage.aogc) this.a).V(ahziVar), defpackage.ahyn.g((defpackage.aepx) ahziVar.eZ()));
    }

    public adao(defpackage.aogc aogcVar, android.content.Context context) {
        this.a = aogcVar;
        this.b = context;
    }

    public adao(defpackage.aogc aogcVar, java.util.concurrent.Executor executor) {
        this.a = aogcVar;
        this.b = executor;
    }

    public adao(defpackage.xtq xtqVar, defpackage.aoin aoinVar) {
        this.b = xtqVar;
        this.a = aoinVar;
    }

    public adao(defpackage.adui aduiVar) {
        this.a = new java.util.HashMap();
        this.b = aduiVar;
    }

    public adao(android.content.Context context) {
        this.a = new defpackage.aeqh();
        this.b = context;
    }

    public adao(defpackage.tvn tvnVar) {
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
        this.b = tvnVar;
    }

    public adao(defpackage.ajct ajctVar, defpackage.ahbz ahbzVar) {
        this.b = ajctVar;
        this.a = ahbzVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqj {
    public static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/aicore/SummarizationSessions");
    public final defpackage.kpu b;
    public final yuo c;
    private final aolr d;

    public kqj(yuo yuoVar, defpackage.kpu kpuVar, aolr aolrVar) {
        aooh.f(aolrVar, "backgroundContext");
        this.c = yuoVar;
        this.b = kpuVar;
        this.d = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(yse yseVar, aoln aolnVar) {
        defpackage.kqc kqcVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.kqc) {
            kqcVar = (defpackage.kqc) aolnVar;
            int i = kqcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqcVar.c = i - Integer.MIN_VALUE;
            } else {
                kqcVar = new defpackage.kqc(this, aolnVar);
            }
        } else {
            kqcVar = new defpackage.kqc(this, aolnVar);
        }
        java.lang.Object obj = kqcVar.a;
        ahdv ahdvVar = aolu.a;
        int i2 = kqcVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(kqcVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(213, "SummarizationSessions_createSession");
            try {
                aolr aolrVar = this.d;
                defpackage.kqd kqdVar = new defpackage.kqd(this, yseVar, (aoln) null, 0);
                kqcVar.d = ahoqVarZ;
                kqcVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, kqdVar, kqcVar);
                if (objAj != ahdvVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return ahdvVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = kqcVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        ahdvVar = (ahdv) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ahdvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, j$.time.ZonedDateTime zonedDateTime, aoln aolnVar) {
        defpackage.kqe kqeVar;
        defpackage.kqm kqmVar;
        if (aolnVar instanceof defpackage.kqe) {
            kqeVar = (defpackage.kqe) aolnVar;
            int i = kqeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqeVar.c = i - Integer.MIN_VALUE;
            } else {
                kqeVar = new defpackage.kqe(this, aolnVar);
            }
        } else {
            kqeVar = new defpackage.kqe(this, aolnVar);
        }
        java.lang.Object obj = kqeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kqeVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.kqm kqmVar2 = defpackage.kqm.a;
                yse yseVar = yse.k;
                kqeVar.d = zonedDateTime;
                kqeVar.e = kqmVar2;
                kqeVar.c = 1;
                java.lang.Object objC = c(yseVar, str, kqeVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                obj = objC;
                kqmVar = kqmVar2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kqmVar = kqeVar.e;
                zonedDateTime = kqeVar.d;
                aooc.af(obj);
            }
            return kqmVar.a((java.lang.String) obj, zonedDateTime);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            return aooc.ae(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(yse yseVar, java.lang.String str, aoln aolnVar) throws java.lang.Throwable {
        defpackage.kqf kqfVar;
        ahdv ahdvVar;
        yop yopVarA;
        java.lang.Throwable th;
        ahdv ahdvVar2;
        aour aourVar;
        defpackage.jlk jlkVar;
        java.lang.String str2;
        aour aourVar2;
        defpackage.jlk jlkVar2;
        if (aolnVar instanceof defpackage.kqf) {
            kqfVar = (defpackage.kqf) aolnVar;
            int i = kqfVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqfVar.d = i - Integer.MIN_VALUE;
            } else {
                kqfVar = new defpackage.kqf(this, aolnVar);
            }
        } else {
            kqfVar = new defpackage.kqf(this, aolnVar);
        }
        java.lang.Object objA = kqfVar.b;
        aolu aoluVar = aolu.a;
        int i2 = kqfVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                kqfVar.a = str;
                kqfVar.d = 1;
                objA = a(yseVar, kqfVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            java.lang.String str3 = (java.lang.String) kqfVar.a;
                            aooc.af(objA);
                            return str3;
                        }
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Throwable th2 = (java.lang.Throwable) kqfVar.a;
                        aooc.af(objA);
                        throw th2;
                    }
                    ahdvVar2 = (ahdv) kqfVar.a;
                    try {
                        aooc.af(objA);
                        str2 = (java.lang.String) objA;
                        aourVar2 = aour.a;
                        jlkVar2 = new defpackage.jlk(ahdvVar2, (aoln) null, 20, (byte[]) null);
                        kqfVar.a = str2;
                        kqfVar.d = 3;
                        if (aoov.aj(aourVar2, jlkVar2, kqfVar) != aoluVar) {
                            return str2;
                        }
                        return aoluVar;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        aourVar = aour.a;
                        jlkVar = new defpackage.jlk(ahdvVar2, (aoln) null, 20, (byte[]) null);
                        kqfVar.a = th;
                        kqfVar.d = 4;
                        if (aoov.aj(aourVar, jlkVar, kqfVar) != aoluVar) {
                            throw th;
                        }
                        return aoluVar;
                    }
                }
                str = (java.lang.String) kqfVar.a;
                aooc.af(objA);
            }
            kqfVar.a = ahdvVar;
            kqfVar.d = 2;
            objA = f(ahdvVar, yopVarA, kqfVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            ahdvVar2 = ahdvVar;
            str2 = (java.lang.String) objA;
            aourVar2 = aour.a;
            jlkVar2 = new defpackage.jlk(ahdvVar2, (aoln) null, 20, (byte[]) null);
            kqfVar.a = str2;
            kqfVar.d = 3;
            if (aoov.aj(aourVar2, jlkVar2, kqfVar) != aoluVar) {
                return str2;
            }
            return aoluVar;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahdvVar2 = ahdvVar;
            aourVar = aour.a;
            jlkVar = new defpackage.jlk(ahdvVar2, (aoln) null, 20, (byte[]) null);
            kqfVar.a = th;
            kqfVar.d = 4;
            if (aoov.aj(aourVar, jlkVar, kqfVar) != aoluVar) {
                throw th;
            }
            return aoluVar;
        }
        ahdvVar = (ahdv) objA;
        yopVarA = yop.a(ajsz.aY(new yon(str))).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        defpackage.kqg kqgVar;
        boolean zS;
        java.util.List listA;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.kqg) {
            kqgVar = (defpackage.kqg) aolnVar;
            int i = kqgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqgVar.c = i - Integer.MIN_VALUE;
            } else {
                kqgVar = new defpackage.kqg(this, aolnVar);
            }
        } else {
            kqgVar = new defpackage.kqg(this, aolnVar);
        }
        java.lang.Object objC = kqgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kqgVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objC);
                yse yseVar = yse.l;
                kqgVar.c = 1;
                objC = c(yseVar, str, kqgVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            java.lang.String str3 = (java.lang.String) objC;
            aorg aorgVar = defpackage.kpv.a;
            aooh.f(str3, "<this>");
            aora aoraVarG = defpackage.kpv.a.g(str3);
            if (aoraVarG != null) {
                zS = aoov.s((java.lang.String) aoraVarG.a().get(1), "SAFE", true);
            } else {
                zS = !aoov.G(str3, "UNSAFE", false);
            }
            aora aoraVarG2 = defpackage.kpv.b.g(str3);
            java.lang.String string = null;
            if (aoraVarG2 != null && (listA = aoraVarG2.a()) != null && (str2 = (java.lang.String) listA.get(1)) != null) {
                string = aoov.x(str2).toString();
            }
            if (string == null) {
                string = "";
            }
            akzx akzxVarM = defpackage.krc.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            defpackage.krc krcVar = (defpackage.krc) akzxVarM.b;
            krcVar.b |= 1;
            krcVar.c = zS;
            akzxVarM.u();
            defpackage.krc krcVar2 = (defpackage.krc) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            krcVar2.b |= 2;
            krcVar2.d = string;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            return (defpackage.krc) aladVarP;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            return aooc.ae(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.lang.String str, aoln aolnVar) {
        defpackage.kqh kqhVar;
        if (aolnVar instanceof defpackage.kqh) {
            kqhVar = (defpackage.kqh) aolnVar;
            int i = kqhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqhVar.c = i - Integer.MIN_VALUE;
            } else {
                kqhVar = new defpackage.kqh(this, aolnVar);
            }
        } else {
            kqhVar = new defpackage.kqh(this, aolnVar);
        }
        java.lang.Object objC = kqhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kqhVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objC);
                yse yseVar = yse.j;
                kqhVar.c = 1;
                objC = c(yseVar, str, kqhVar);
                if (objC == aoluVar) {
                    objC = aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return objC;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            return aooc.ae(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(ahdv ahdvVar, yop yopVar, aoln aolnVar) {
        defpackage.kqi kqiVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.kqi) {
            kqiVar = (defpackage.kqi) aolnVar;
            int i = kqiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqiVar.c = i - Integer.MIN_VALUE;
            } else {
                kqiVar = new defpackage.kqi(this, aolnVar);
            }
        } else {
            kqiVar = new defpackage.kqi(this, aolnVar);
        }
        java.lang.Object obj = kqiVar.a;
        java.lang.String str = aolu.a;
        int i2 = kqiVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(kqiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(214, "SummarizationSessions_runInference");
            try {
                aolr aolrVar = this.d;
                defpackage.fxp fxpVar = new defpackage.fxp(ahdvVar, yopVar, this, (aoln) null, 4);
                kqiVar.d = ahoqVarZ;
                kqiVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, fxpVar, kqiVar);
                if (objAj != str) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return str;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = kqiVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        str = (java.lang.String) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return str;
    }
}

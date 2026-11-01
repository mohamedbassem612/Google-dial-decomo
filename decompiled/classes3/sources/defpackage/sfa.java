package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfa {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/settings/data/CallingCardSettingsDataService");
    public static final agxj b = new agxj("PatrickContactsListDataSourceKey");
    public final agoo c;
    public final agpq d;
    private final ecx e;
    private final aolr f;
    private final aogc g;

    public sfa(agoo agooVar, ecx ecxVar, agpq agpqVar, aolr aolrVar, aogc aogcVar) {
        aooh.f(agooVar, "accountDataService");
        aooh.f(ecxVar, "dataStore");
        aooh.f(agpqVar, "gcoreAccountName");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aogcVar, "resultPropagator");
        this.c = agooVar;
        this.e = ecxVar;
        this.d = agpqVar;
        this.f = aolrVar;
        this.g = aogcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ses sesVar;
        if (aolnVar instanceof defpackage.ses) {
            sesVar = (defpackage.ses) aolnVar;
            int i = sesVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sesVar.c = i - Integer.MIN_VALUE;
            } else {
                sesVar = new defpackage.ses(this, aolnVar);
            }
        } else {
            sesVar = new defpackage.ses(this, aolnVar);
        }
        java.lang.Object obj = sesVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sesVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.e;
            bbf bbfVar = new bbf((aoln) null, 12, (float[][]) null);
            sesVar.c = 1;
            if (ecxVar.a(bbfVar, sesVar) == aoluVar) {
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

    public final java.lang.Object b(java.lang.String str, aoln aolnVar) {
        return aoov.aj(this.f, new kem(this, str, (aoln) null, 5), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, aoln aolnVar) {
        defpackage.set setVar;
        if (aolnVar instanceof defpackage.set) {
            setVar = (defpackage.set) aolnVar;
            int i = setVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                setVar.c = i - Integer.MIN_VALUE;
            } else {
                setVar = new defpackage.set(this, aolnVar);
            }
        } else {
            setVar = new defpackage.set(this, aolnVar);
        }
        java.lang.Object objB = setVar.a;
        aolu aoluVar = aolu.a;
        int i2 = setVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return ((defpackage.agon) objB).b;
        }
        aooc.af(objB);
        setVar.c = 1;
        objB = b(str, setVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.ser serVar = (defpackage.ser) objB;
        if (serVar != null) {
            if (serVar.c != 2) {
                ajcq ajcqVarB = this.c.b(serVar.b);
                setVar.c = 2;
                objB = aosv.D(ajcqVarB, setVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                return ((defpackage.agon) objB).b;
            }
            a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardSettingsDataService", "getCallingCardAccountInfo", 110, "CallingCardSettingsDataService.kt").v("My Calling Card account is disabled");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.seu seuVar;
        if (aolnVar instanceof defpackage.seu) {
            seuVar = (defpackage.seu) aolnVar;
            int i = seuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                seuVar.c = i - Integer.MIN_VALUE;
            } else {
                seuVar = new defpackage.seu(this, aolnVar);
            }
        } else {
            seuVar = new defpackage.seu(this, aolnVar);
        }
        java.lang.Object objF = seuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = seuVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            seuVar.c = 1;
            objF = f(seuVar);
            if (objF != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
            return objF;
        }
        aooc.af(objF);
        java.lang.String str = (java.lang.String) objF;
        if (str == null) {
            return null;
        }
        seuVar.c = 2;
        java.lang.Object objB = b(str, seuVar);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.sev sevVar;
        if (aolnVar instanceof defpackage.sev) {
            sevVar = (defpackage.sev) aolnVar;
            int i = sevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sevVar.c = i - Integer.MIN_VALUE;
            } else {
                sevVar = new defpackage.sev(this, aolnVar);
            }
        } else {
            sevVar = new defpackage.sev(this, aolnVar);
        }
        java.lang.Object objF = sevVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sevVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            sevVar.c = 1;
            objF = f(sevVar);
            if (objF != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
            return objF;
        }
        aooc.af(objF);
        java.lang.String str = (java.lang.String) objF;
        if (str == null) {
            return null;
        }
        sevVar.c = 2;
        java.lang.Object objC = c(str, sevVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.sew sewVar;
        if (aolnVar instanceof defpackage.sew) {
            sewVar = (defpackage.sew) aolnVar;
            int i = sewVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sewVar.c = i - Integer.MIN_VALUE;
            } else {
                sewVar = new defpackage.sew(this, aolnVar);
            }
        } else {
            sewVar = new defpackage.sew(this, aolnVar);
        }
        java.lang.Object objAu = sewVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sewVar.c;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.e.b();
            sewVar.c = 1;
            objAu = aoov.au(aoxhVarB, sewVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        sfd sfdVar = (sfd) objAu;
        if ((sfdVar.b & 1) != 0) {
            return sfdVar.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.sex sexVar;
        int i;
        if (aolnVar instanceof defpackage.sex) {
            sexVar = (defpackage.sex) aolnVar;
            int i2 = sexVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sexVar.c = i2 - Integer.MIN_VALUE;
            } else {
                sexVar = new defpackage.sex(this, aolnVar);
            }
        } else {
            sexVar = new defpackage.sex(this, aolnVar);
        }
        java.lang.Object objAu = sexVar.a;
        aolu aoluVar = aolu.a;
        int i3 = sexVar.c;
        if (i3 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.e.b();
            sexVar.c = 1;
            objAu = aoov.au(aoxhVarB, sexVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        int i4 = ((sfd) objAu).d;
        if (i4 == 0) {
            i = 2;
        } else if (i4 == 1) {
            i = 3;
        } else if (i4 != 2) {
            i = i4 != 3 ? 0 : 5;
        } else {
            i = 4;
        }
        if (i == 0) {
            i = 1;
        }
        int i5 = i - 2;
        if (i5 == 1) {
            return defpackage.sfb.a;
        }
        if (i5 == 2) {
            return defpackage.sfb.b;
        }
        if (i5 != 3) {
            return null;
        }
        return defpackage.sfb.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(java.lang.String str, aoln aolnVar) {
        defpackage.sey seyVar;
        if (aolnVar instanceof defpackage.sey) {
            seyVar = (defpackage.sey) aolnVar;
            int i = seyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                seyVar.c = i - Integer.MIN_VALUE;
            } else {
                seyVar = new defpackage.sey(this, aolnVar);
            }
        } else {
            seyVar = new defpackage.sey(this, aolnVar);
        }
        java.lang.Object obj = seyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = seyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.e;
            ghv ghvVar = new ghv(str, (aoln) null, 5, (char[]) null);
            seyVar.c = 1;
            if (ecxVar.a(ghvVar, seyVar) == aoluVar) {
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
    public final java.lang.Object i(defpackage.sfb sfbVar, aoln aolnVar) {
        defpackage.sez sezVar;
        if (aolnVar instanceof defpackage.sez) {
            sezVar = (defpackage.sez) aolnVar;
            int i = sezVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sezVar.c = i - Integer.MIN_VALUE;
            } else {
                sezVar = new defpackage.sez(this, aolnVar);
            }
        } else {
            sezVar = new defpackage.sez(this, aolnVar);
        }
        java.lang.Object obj = sezVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sezVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ecx ecxVar = this.e;
            lnb lnbVar = new lnb(this, sfbVar, (aoln) null, 12);
            sezVar.c = 1;
            if (ecxVar.a(lnbVar, sezVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.g.t(ajcm.a, b);
        return aojh.a;
    }
}

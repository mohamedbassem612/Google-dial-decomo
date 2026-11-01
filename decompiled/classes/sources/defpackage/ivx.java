package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ivx implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorWorker");
    public static final j$.time.Duration b;
    public final kpe c;
    public final defpackage.iqm d;
    public final defpackage.aoin e;
    public final defpackage.kgl f;
    private final defpackage.aoss g;
    private final defpackage.aolr h;
    private final defpackage.rlv i;

    static {
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(7L);
        defpackage.aooh.e(durationOfDays, "ofDays(...)");
        b = durationOfDays;
    }

    public ivx(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.kgl kglVar, kpe kpeVar, defpackage.rlv rlvVar, defpackage.iqm iqmVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(kglVar, "beeslySot");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(aazcVar, "clock");
        this.g = aossVar;
        this.h = aolrVar;
        this.f = kglVar;
        this.c = kpeVar;
        this.i = rlvVar;
        this.d = iqmVar;
        this.e = aoinVar;
    }

    private static final void k(defpackage.rlv rlvVar, kqx kqxVar) {
        int iX = defpackage.a.X(kqxVar.b);
        if (iX == 0) {
            throw null;
        }
        int i = iX - 1;
        if (i == 0) {
            rlvVar.o(defpackage.rmx.BEESLY_REMINDER_CALL_ACTION_GENERATED);
            return;
        }
        if (i == 1) {
            rlvVar.o(defpackage.rmx.BEESLY_CALENDAR_CALL_ACTION_GENERATED);
        } else if (i == 2) {
            rlvVar.o(defpackage.rmx.BEESLY_ADD_CONTACT_CALL_ACTION_GENERATED);
            rlvVar.o(defpackage.rmx.BEESLY_CALL_PERSON_CALL_ACTION_GENERATED);
        }
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.g, 0, new ivv(this, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, defpackage.aoln aolnVar) {
        ivr ivrVar;
        if (aolnVar instanceof ivr) {
            ivrVar = (ivr) aolnVar;
            int i = ivrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivrVar.c = i - Integer.MIN_VALUE;
            } else {
                ivrVar = new ivr(this, aolnVar);
            }
        } else {
            ivrVar = new ivr(this, aolnVar);
        }
        java.lang.Object objAj = ivrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ivrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.aolr aolrVar = this.h;
            icr icrVar = new icr(str, (defpackage.aoln) null, 12);
            ivrVar.c = 1;
            objAj = defpackage.aoov.aj(aolrVar, icrVar, ivrVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        defpackage.aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(boolean z, itc itcVar, defpackage.aoln aolnVar) {
        ivs ivsVar;
        java.lang.Integer num;
        itc itcVar2;
        java.lang.Integer num2;
        kqy kqyVar;
        itc itcVar3;
        int i;
        defpackage.akzx akzxVarM;
        java.lang.String str;
        java.lang.Long l;
        itu ituVar;
        itu ituVar2;
        itq itqVar;
        if (aolnVar instanceof ivs) {
            ivsVar = (ivs) aolnVar;
            int i2 = ivsVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ivsVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ivsVar = new ivs(this, aolnVar);
            }
        } else {
            ivsVar = new ivs(this, aolnVar);
        }
        java.lang.Object objP = ivsVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = ivsVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                z = ivsVar.a;
                itcVar = ivsVar.e;
                defpackage.aooc.af(objP);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = ivsVar.a;
                num2 = ivsVar.f;
                itcVar2 = ivsVar.e;
                defpackage.aooc.af(objP);
            }
            itcVar3 = (itc) objP;
            if (itcVar3 != null) {
                ituVar = itcVar3.b;
                if (ituVar instanceof itu) {
                    ituVar2 = ituVar;
                } else {
                    ituVar2 = null;
                }
                itqVar = ituVar2 != null ? ituVar2.a : null;
                if (itqVar != null) {
                    switch (itqVar.ordinal()) {
                        case 1:
                            i = 4;
                            break;
                        case 2:
                            i = 5;
                            break;
                        case 3:
                            i = 6;
                            break;
                        case 4:
                            i = 7;
                            break;
                        case 5:
                            i = 8;
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            i = 9;
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            i = 10;
                            break;
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                            i = 11;
                            break;
                        case 9:
                            i = 12;
                            break;
                        case 10:
                            i = 13;
                            break;
                        case 11:
                            i = 14;
                            break;
                        case 12:
                            i = 15;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            akzxVarM = defpackage.amon.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            if (z) {
                akky.m(3, akzxVarM);
            } else if (i != 0) {
                akky.m(i, akzxVarM);
            } else {
                akky.m(2, akzxVarM);
            }
            int iIntValue = num2 != null ? num2.intValue() : 0;
            akzxVarM.u();
            defpackage.amon amonVar = (defpackage.amon) akzxVarM.b;
            amonVar.b |= 2;
            amonVar.d = iIntValue;
            str = itcVar2.h;
            if (str != null) {
                akzxVarM.u();
                defpackage.amon amonVar2 = (defpackage.amon) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                amonVar2.b |= 8;
                amonVar2.f = str;
            }
            l = itcVar2.i;
            if (l != null) {
                long epochMilli = j$.time.Instant.now().toEpochMilli() - l.longValue();
                akzxVarM.u();
                defpackage.amon amonVar3 = (defpackage.amon) akzxVarM.b;
                amonVar3.b |= 4;
                amonVar3.e = epochMilli;
            }
            defpackage.alad aladVarR = akzxVarM.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            this.i.f((defpackage.amon) aladVarR);
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objP);
        defpackage.kgl kglVar = this.f;
        ity ityVar = itcVar.a;
        ivsVar.e = itcVar;
        ivsVar.a = z;
        ivsVar.d = 1;
        objP = kglVar.p(ityVar, ivsVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        itc itcVar4 = (itc) objP;
        if (itcVar4 != null) {
            itp itpVar = itcVar4.b;
            itp itpVar2 = itpVar instanceof itp ? itpVar : null;
            num = new java.lang.Integer((itpVar2 == null || (kqyVar = itpVar2.a) == null) ? 0 : kqyVar.c.size());
        } else {
            num = null;
        }
        defpackage.kgl kglVar2 = this.f;
        ity ityVar2 = itcVar.a;
        ivsVar.e = itcVar;
        ivsVar.f = num;
        ivsVar.a = z;
        ivsVar.d = 2;
        objP = kglVar2.p(ityVar2, ivsVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        itcVar2 = itcVar;
        num2 = num;
        itcVar3 = (itc) objP;
        if (itcVar3 != null) {
            ituVar = itcVar3.b;
            if (ituVar instanceof itu) {
                ituVar2 = ituVar;
            } else {
                ituVar2 = null;
            }
            if (ituVar2 != null) {
            }
            if (itqVar != null) {
                switch (itqVar.ordinal()) {
                    case 1:
                        i = 4;
                        break;
                    case 2:
                        i = 5;
                        break;
                    case 3:
                        i = 6;
                        break;
                    case 4:
                        i = 7;
                        break;
                    case 5:
                        i = 8;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = 9;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = 10;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        i = 11;
                        break;
                    case 9:
                        i = 12;
                        break;
                    case 10:
                        i = 13;
                        break;
                    case 11:
                        i = 14;
                        break;
                    case 12:
                        i = 15;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        akzxVarM = defpackage.amon.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        if (z) {
            akky.m(3, akzxVarM);
        } else if (i != 0) {
            akky.m(i, akzxVarM);
        } else {
            akky.m(2, akzxVarM);
        }
        if (num2 != null) {
        }
        akzxVarM.u();
        defpackage.amon amonVar4 = (defpackage.amon) akzxVarM.b;
        amonVar4.b |= 2;
        amonVar4.d = iIntValue;
        str = itcVar2.h;
        if (str != null) {
            akzxVarM.u();
            defpackage.amon amonVar5 = (defpackage.amon) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            amonVar5.b |= 8;
            amonVar5.f = str;
        }
        l = itcVar2.i;
        if (l != null) {
            long epochMilli2 = j$.time.Instant.now().toEpochMilli() - l.longValue();
            akzxVarM.u();
            defpackage.amon amonVar6 = (defpackage.amon) akzxVarM.b;
            amonVar6.b |= 4;
            amonVar6.e = epochMilli2;
        }
        defpackage.alad aladVarR2 = akzxVarM.r();
        defpackage.aooh.e(aladVarR2, "build(...)");
        this.i.f((defpackage.amon) aladVarR2);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(ity ityVar, kqy kqyVar, defpackage.aoln aolnVar) {
        ivt ivtVar;
        itq itqVar;
        if (aolnVar instanceof ivt) {
            ivtVar = (ivt) aolnVar;
            int i = ivtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivtVar.c = i - Integer.MIN_VALUE;
            } else {
                ivtVar = new ivt(this, aolnVar);
            }
        } else {
            ivtVar = new ivt(this, aolnVar);
        }
        java.lang.Object obj = ivtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ivtVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (kqyVar == null) {
                ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorWorker", "maybePutCallActions", 152, "BeeslyDuplexGeneratorWorker.kt")).v("enable_call_actions flag is disabled.");
                return defpackage.aojh.a;
            }
            int i3 = kqyVar.b & 1;
            defpackage.aimz aimzVar = a;
            if (i3 != 0) {
                defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorWorker", "maybePutCallActions", 159, "BeeslyDuplexGeneratorWorker.kt");
                kqz kqzVarB = kqz.b(kqyVar.d);
                if (kqzVarB == null) {
                    kqzVarB = kqz.a;
                }
                aimwVar.y("Error generating call actions with error code: %s", kqzVarB);
                defpackage.kgl kglVar = this.f;
                kqz kqzVarB2 = kqz.b(kqyVar.d);
                if (kqzVarB2 == null) {
                    kqzVarB2 = kqz.a;
                }
                int iOrdinal = kqzVarB2.ordinal();
                if (iOrdinal == 4) {
                    itqVar = itq.d;
                } else if (iOrdinal == 5) {
                    itqVar = itq.c;
                } else if (iOrdinal == 8) {
                    itqVar = itq.b;
                } else if (iOrdinal != 14) {
                    itqVar = itq.a;
                } else {
                    itqVar = itq.c;
                }
                ivtVar.c = 1;
                if (kglVar.u(ityVar, itqVar, ivtVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorWorker", "maybePutCallActions", 164, "BeeslyDuplexGeneratorWorker.kt")).w("%s call actions received.", kqyVar.c.size());
                defpackage.alat<kqx> alatVar = kqyVar.c;
                defpackage.aooh.e(alatVar, "getCallActionsList(...)");
                for (kqx kqxVar : alatVar) {
                    defpackage.rlv rlvVar = this.i;
                    defpackage.aooh.c(kqxVar);
                    k(rlvVar, kqxVar);
                }
                defpackage.kgl kglVar2 = this.f;
                ivtVar.c = 2;
                if (kglVar2.t(ityVar, kqyVar, ivtVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(ity ityVar, java.util.List list, defpackage.aoln aolnVar) {
        ivu ivuVar;
        if (aolnVar instanceof ivu) {
            ivuVar = (ivu) aolnVar;
            int i = ivuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivuVar.c = i - Integer.MIN_VALUE;
            } else {
                ivuVar = new ivu(this, aolnVar);
            }
        } else {
            ivuVar = new ivu(this, aolnVar);
        }
        java.lang.Object obj = ivuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ivuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorWorker", "putCallActions", 170, "BeeslyDuplexGeneratorWorker.kt")).w("%s call actions received.", list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                k(this.i, (kqx) it.next());
            }
            defpackage.kgl kglVar = this.f;
            oq oqVarY = hgz.Y(kqy.a.m());
            oqVarY.A();
            oqVarY.z(list);
            kqy kqyVarY = oqVarY.y();
            ivuVar.c = 1;
            if (kglVar.t(ityVar, kqyVarY, ivuVar) == aoluVar) {
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
    public final java.lang.Object g(itc itcVar, defpackage.aoln aolnVar) {
        ivw ivwVar;
        java.lang.Object obj;
        long j;
        if (aolnVar instanceof ivw) {
            ivwVar = (ivw) aolnVar;
            int i = ivwVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivwVar.e = i - Integer.MIN_VALUE;
            } else {
                ivwVar = new ivw(this, aolnVar);
            }
        } else {
            ivwVar = new ivw(this, aolnVar);
        }
        java.lang.Object obj2 = ivwVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ivwVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            long j2 = itcVar.a.a;
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            defpackage.aooh.e(timeZone, "getDefault(...)");
            java.lang.String str = itcVar.c;
            if (str == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            ivwVar.b = timeZone;
            ivwVar.a = j2;
            ivwVar.e = 1;
            java.lang.Object objC = c(str, ivwVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            obj = timeZone;
            obj2 = objC;
            j = j2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ivwVar.a;
            obj = ivwVar.b;
            defpackage.aooc.af(obj2);
        }
        return new kpd(j, (java.util.TimeZone) obj, (koy) obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [aolu] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList, java.util.Collection] */
    public final java.lang.Object j(defpackage.kgl kglVar, defpackage.aoln aolnVar) {
        ivq ivqVar;
        if (aolnVar instanceof ivq) {
            ivqVar = (ivq) aolnVar;
            int i = ivqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivqVar.c = i - Integer.MIN_VALUE;
            } else {
                ivqVar = new ivq(this, aolnVar);
            }
        } else {
            ivqVar = new ivq(this, aolnVar);
        }
        java.lang.Object objO = ivqVar.a;
        java.lang.Object arrayList = defpackage.aolu.a;
        int i2 = ivqVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objO);
            ivqVar.c = 1;
            objO = kglVar.o(ivqVar);
            if (objO != arrayList) {
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objO);
        java.util.Collection collectionValues = ((java.util.Map) objO).values();
        arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (((itc) obj).b instanceof itx) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}

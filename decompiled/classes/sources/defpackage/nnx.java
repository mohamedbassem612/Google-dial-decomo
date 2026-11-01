package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nnx {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/settings/service/DobbySettings");
    public final defpackage.uhs a;
    private final defpackage.ajct c;
    private final defpackage.ecx d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.rlv g;
    private final defpackage.zjm h;

    public nnx(defpackage.ajct ajctVar, defpackage.ecx ecxVar, defpackage.uhs uhsVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.rlv rlvVar, defpackage.aazc aazcVar, defpackage.zjm zjmVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (uhsVar == null) {
            defpackage.aooh.i("spamSettings");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("callMetricsRetentionPeriodDaysProvider");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("settingsDeleteOldRecordingsAndTranscriptsDaysProvider");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.c = ajctVar;
        this.d = ecxVar;
        this.a = uhsVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = rlvVar;
        this.h = zjmVar;
    }

    public final long a() {
        java.lang.Long l = (java.lang.Long) this.f.a();
        java.lang.Long l2 = (java.lang.Long) this.e.a();
        if (l.longValue() >= l2.longValue()) {
            defpackage.aooh.c(l);
            return l.longValue();
        }
        defpackage.aimw aimwVar = (defpackage.aimw) b.d().l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getDeleteOldRecordingsAndTranscriptsTimeInDays", 139, "DobbySettings.kt");
        defpackage.aooh.c(l);
        long jLongValue = l.longValue();
        defpackage.aooh.c(l2);
        aimwVar.D("days to delete (%d) should not be smaller than retention period days (%d)", jLongValue, l2.longValue());
        return l2.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nnn nnnVar;
        if (aolnVar instanceof nnn) {
            nnnVar = (nnn) aolnVar;
            int i = nnnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnnVar.c = i - Integer.MIN_VALUE;
            } else {
                nnnVar = new nnn(this, aolnVar);
            }
        } else {
            nnnVar = new nnn(this, aolnVar);
        }
        java.lang.Object objAu = nnnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aoxh aoxhVarB = this.d.b();
            nnnVar.c = 1;
            objAu = defpackage.aoov.au(aoxhVarB, nnnVar);
            if (objAu != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
            return objAu;
        }
        defpackage.aooc.af(objAu);
        defpackage.nok nokVar = (defpackage.nok) objAu;
        if (!this.a.e()) {
            return nokVar;
        }
        nnnVar.c = 2;
        java.lang.Object objC = c(nokVar, nnnVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.nok nokVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nno nnoVar;
        boolean z;
        boolean zBooleanValue;
        defpackage.nok nokVar2;
        defpackage.nok nokVar3;
        boolean z2;
        boolean z3;
        defpackage.kaw kawVarAO;
        defpackage.aimz aimzVar;
        if (aolnVar instanceof nno) {
            nnoVar = (nno) aolnVar;
            int i = nnoVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnoVar.e = i - Integer.MIN_VALUE;
            } else {
                nnoVar = new nno(this, aolnVar);
            }
        } else {
            nnoVar = new nno(this, aolnVar);
        }
        java.lang.Object obj = nnoVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnoVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = nnoVar.a;
                defpackage.nok nokVar4 = nnoVar.f;
                defpackage.aooc.af(obj);
                z = z4;
                nokVar = nokVar4;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = nnoVar.b;
                z3 = nnoVar.a;
                nokVar3 = nnoVar.f;
                defpackage.aooc.af(obj);
            }
            if (z2 && z3) {
                this.c.execute(new lye(this, 3));
                this.g.o(defpackage.rmx.DOBBY_ENROLLMENT_IS_MIGRATED_TO_FI);
                return nokVar3;
            }
            zBooleanValue = z2;
            z = z3;
            nokVar2 = nokVar3;
            if (!z) {
                if (!zBooleanValue) {
                    return nokVar2;
                }
                defpackage.kaw kawVarAO2 = defpackage.gus.aO(nokVar2.L());
                ((defpackage.aimw) ((defpackage.aimw) b.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 221, "DobbySettings.kt")).v("The enrollmentStatus is overridden to OPTED_OUT_BY_GOOGLE_FI by the CarrierConfig.");
                kawVarAO2.F(noh.g);
                return kawVarAO2.D();
            }
            if (zBooleanValue) {
                return nokVar2;
            }
            kawVarAO = defpackage.gus.aO(nokVar2.L());
            aimzVar = b;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 204, "DobbySettings.kt")).v("The enrollmentStatus is overridden to OPTED_IN_BY_GOOGLE_FI by the CarrierConfig.");
            kawVarAO.F(noh.f);
            if (kawVarAO.C() != noi.a || kawVarAO.C() == noi.e) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 210, "DobbySettings.kt")).v("The protectionLevel is overridden to BASIC by the CarrierConfig.");
                kawVarAO.G(noi.b);
            }
            return kawVarAO.D();
        }
        defpackage.aooc.af(obj);
        noh nohVarB = noh.b(nokVar.c);
        if (nohVarB == null) {
            nohVarB = noh.k;
        }
        boolean zD = defpackage.mni.D(nohVarB);
        nnoVar.f = nokVar;
        nnoVar.a = zD;
        nnoVar.e = 1;
        java.lang.Object objJ = j(nnoVar);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        z = zD;
        obj = objJ;
        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (nokVar.h) {
            nokVar2 = nokVar;
        } else {
            defpackage.ecx ecxVar = this.d;
            defpackage.ipv ipvVar = new defpackage.ipv((defpackage.aoln) null, 18, (float[][][]) null);
            nnoVar.f = nokVar;
            nnoVar.a = z;
            nnoVar.b = zBooleanValue;
            nnoVar.e = 2;
            if (ecxVar.a(ipvVar, nnoVar) == aoluVar) {
                return aoluVar;
            }
            nokVar3 = nokVar;
            z2 = zBooleanValue;
            z3 = z;
            if (z2) {
            }
            zBooleanValue = z2;
            z = z3;
            nokVar2 = nokVar3;
        }
        if (!z) {
            if (!zBooleanValue) {
                return nokVar2;
            }
            defpackage.kaw kawVarAO3 = defpackage.gus.aO(nokVar2.L());
            ((defpackage.aimw) ((defpackage.aimw) b.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 221, "DobbySettings.kt")).v("The enrollmentStatus is overridden to OPTED_OUT_BY_GOOGLE_FI by the CarrierConfig.");
            kawVarAO3.F(noh.g);
            return kawVarAO3.D();
        }
        if (zBooleanValue) {
            return nokVar2;
        }
        kawVarAO = defpackage.gus.aO(nokVar2.L());
        aimzVar = b;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 204, "DobbySettings.kt")).v("The enrollmentStatus is overridden to OPTED_IN_BY_GOOGLE_FI by the CarrierConfig.");
        kawVarAO.F(noh.f);
        if (kawVarAO.C() != noi.a) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 210, "DobbySettings.kt")).v("The protectionLevel is overridden to BASIC by the CarrierConfig.");
            kawVarAO.G(noi.b);
        } else {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettings", "getOverrideSpamSettingByFiCarrierConfig$<anonymous>", 210, "DobbySettings.kt")).v("The protectionLevel is overridden to BASIC by the CarrierConfig.");
            kawVarAO.G(noi.b);
        }
        return kawVarAO.D();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(nof nofVar, defpackage.aoln aolnVar) {
        nnp nnpVar;
        if (aolnVar instanceof nnp) {
            nnpVar = (nnp) aolnVar;
            int i = nnpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnpVar.c = i - Integer.MIN_VALUE;
            } else {
                nnpVar = new nnp(this, aolnVar);
            }
        } else {
            nnpVar = new nnp(this, aolnVar);
        }
        java.lang.Object obj = nnpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.d;
            defpackage.bpj bpjVar = new defpackage.bpj(nofVar, (defpackage.aoln) null, 20);
            nnpVar.c = 1;
            if (ecxVar.a(bpjVar, nnpVar) == aoluVar) {
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
    public final java.lang.Object e(defpackage.nog nogVar, defpackage.aoln aolnVar) {
        nnq nnqVar;
        if (aolnVar instanceof nnq) {
            nnqVar = (nnq) aolnVar;
            int i = nnqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnqVar.c = i - Integer.MIN_VALUE;
            } else {
                nnqVar = new nnq(this, aolnVar);
            }
        } else {
            nnqVar = new nnq(this, aolnVar);
        }
        java.lang.Object obj = nnqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnqVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.d;
            nut nutVar = new nut(nogVar, (defpackage.aoln) null, 1);
            nnqVar.c = 1;
            if (ecxVar.a(nutVar, nnqVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(noh nohVar, defpackage.aoln aolnVar) {
        nnr nnrVar;
        defpackage.ipc ipcVar;
        rim rimVar;
        if (aolnVar instanceof nnr) {
            nnrVar = (nnr) aolnVar;
            int i = nnrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnrVar.c = i - Integer.MIN_VALUE;
            } else {
                nnrVar = new nnr(this, aolnVar);
            }
        } else {
            nnrVar = new nnr(this, aolnVar);
        }
        java.lang.Object obj = nnrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnrVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                nohVar = nnrVar.d;
                defpackage.aooc.af(obj);
            } else if (i2 == 2) {
                defpackage.aooc.af(obj);
                j$.util.Optional optionalG = this.h.g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                ipcVar = (defpackage.ipc) defpackage.aooh.q(optionalG);
                if (ipcVar != null) {
                    rimVar = rim.b;
                    nnrVar.c = 3;
                    if (ipcVar.bg(rimVar, nnrVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        if (this.a.e()) {
            boolean zD = defpackage.mni.D(nohVar);
            nnrVar.d = nohVar;
            nnrVar.c = 1;
            if (k(zD, nnrVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.ecx ecxVar = this.d;
        lnb lnbVar = new lnb(nohVar, this, (defpackage.aoln) null, 3);
        nnrVar.d = null;
        nnrVar.c = 2;
        if (ecxVar.a(lnbVar, nnrVar) == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optionalG2 = this.h.g();
        defpackage.aooh.e(optionalG2, "getFeature(...)");
        ipcVar = (defpackage.ipc) defpackage.aooh.q(optionalG2);
        if (ipcVar != null) {
            rimVar = rim.b;
            nnrVar.c = 3;
            if (ipcVar.bg(rimVar, nnrVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(noi noiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nns nnsVar;
        noi noiVar2;
        if (aolnVar instanceof nns) {
            nnsVar = (nns) aolnVar;
            int i = nnsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnsVar.c = i - Integer.MIN_VALUE;
            } else {
                nnsVar = new nns(this, aolnVar);
            }
        } else {
            nnsVar = new nns(this, aolnVar);
        }
        java.lang.Object objB = nnsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnsVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                noiVar = nnsVar.d;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objB);
        nnsVar.d = noiVar;
        nnsVar.c = 1;
        objB = b(nnsVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        noi noiVarB = noi.b(((defpackage.nok) objB).d);
        if (noiVarB == null) {
            noiVarB = noi.e;
        }
        noi noiVar3 = noi.b;
        if (noiVarB != noiVar3) {
            noiVar2 = noi.c;
            if (noiVarB != noiVar2) {
                if (noiVarB == noi.d) {
                    if (noiVar == noiVar3) {
                        this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_BASIC);
                    } else if (noiVar == noiVar2) {
                        this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_MEDIUM);
                    }
                }
            } else if (noiVar == noiVar3) {
                this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MEDIUM_TO_BASIC);
            } else if (noiVar == noi.d) {
                this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MEDIUM_TO_MAXIMUM);
            } else if (noiVarB == noi.d) {
                if (noiVar == noiVar3) {
                    this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_BASIC);
                } else if (noiVar == noiVar2) {
                    this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_MEDIUM);
                }
            }
        } else if (noiVar == noi.c) {
            this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_BASIC_TO_MEDIUM);
        } else if (noiVar == noi.d) {
            this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_BASIC_TO_MAXIMUM);
        } else {
            noiVar2 = noi.c;
            if (noiVarB != noiVar2) {
                if (noiVarB == noi.d) {
                    if (noiVar == noiVar3) {
                        this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_BASIC);
                    } else if (noiVar == noiVar2) {
                        this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_MEDIUM);
                    }
                }
            } else if (noiVar == noiVar3) {
                this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MEDIUM_TO_BASIC);
            } else if (noiVar == noi.d) {
                this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MEDIUM_TO_MAXIMUM);
            } else if (noiVarB == noi.d) {
                if (noiVar == noiVar3) {
                    this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_BASIC);
                } else if (noiVar == noiVar2) {
                    this.g.o(defpackage.rmx.DOBBY_PROTECTION_LEVEL_MAXIMUM_TO_MEDIUM);
                }
            }
        }
        defpackage.ecx ecxVar = this.d;
        lnb lnbVar = new lnb(noiVar, this, (defpackage.aoln) null, 4);
        nnsVar.d = null;
        nnsVar.c = 2;
        if (ecxVar.a(lnbVar, nnsVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(boolean z, defpackage.aoln aolnVar) {
        nnt nntVar;
        if (aolnVar instanceof nnt) {
            nntVar = (nnt) aolnVar;
            int i = nntVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nntVar.c = i - Integer.MIN_VALUE;
            } else {
                nntVar = new nnt(this, aolnVar);
            }
        } else {
            nntVar = new nnt(this, aolnVar);
        }
        java.lang.Object obj = nntVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nntVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.d;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 3, (short[]) null);
            nntVar.c = 1;
            if (ecxVar.a(jblVar, nntVar) == aoluVar) {
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
    public final java.lang.Object i(boolean z, defpackage.aoln aolnVar) {
        nnu nnuVar;
        if (aolnVar instanceof nnu) {
            nnuVar = (nnu) aolnVar;
            int i = nnuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnuVar.c = i - Integer.MIN_VALUE;
            } else {
                nnuVar = new nnu(this, aolnVar);
            }
        } else {
            nnuVar = new nnu(this, aolnVar);
        }
        java.lang.Object obj = nnuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.d;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 4, (int[]) null);
            nnuVar.c = 1;
            if (ecxVar.a(jblVar, nnuVar) == aoluVar) {
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
    public final java.lang.Object j(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nnv nnvVar;
        if (aolnVar instanceof nnv) {
            nnvVar = (nnv) aolnVar;
            int i = nnvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnvVar.c = i - Integer.MIN_VALUE;
            } else {
                nnvVar = new nnv(this, aolnVar);
            }
        } else {
            nnvVar = new nnv(this, aolnVar);
        }
        java.lang.Object objD = nnvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnvVar.c;
        boolean z = false;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.uhs uhsVar = this.a;
            if (uhsVar.e()) {
                defpackage.ajcq ajcqVarB = uhsVar.b();
                defpackage.aooh.e(ajcqVarB, "isSpamBlockingEnabledByUser(...)");
                nnvVar.c = 1;
                objD = defpackage.aosv.D(ajcqVarB, nnvVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objD);
        if (((java.lang.Boolean) objD).booleanValue()) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        nnw nnwVar;
        if (aolnVar instanceof nnw) {
            nnwVar = (nnw) aolnVar;
            int i = nnwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnwVar.d = i - Integer.MIN_VALUE;
            } else {
                nnwVar = new nnw(this, aolnVar);
            }
        } else {
            nnwVar = new nnw(this, aolnVar);
        }
        java.lang.Object objJ = nnwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnwVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objJ);
            nnwVar.a = z;
            nnwVar.d = 1;
            objJ = j(nnwVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = nnwVar.a;
            defpackage.aooc.af(objJ);
        }
        if (((java.lang.Boolean) objJ).booleanValue() != z) {
            this.c.execute(new gql(this, z, 4));
        }
        return defpackage.aojh.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ixt {
    public static final defpackage.agxj a = new defpackage.agxj("beesly_greetings_data_key");
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService");
    public final defpackage.ixx c;
    public final defpackage.aoss d;
    public final android.content.Context e;
    private final defpackage.ecx f;
    private final defpackage.aogc g;

    public ixt(defpackage.ecx ecxVar, defpackage.ixx ixxVar, defpackage.aogc aogcVar, defpackage.aoss aossVar, android.content.Context context) {
        defpackage.aooh.f(ecxVar, "dataStore");
        defpackage.aooh.f(aogcVar, "resultPropagator");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(context, "appContext");
        this.f = ecxVar;
        this.c = ixxVar;
        this.g = aogcVar;
        this.d = aossVar;
        this.e = context;
    }

    private static final long l(defpackage.ixh ixhVar) {
        ixe ixeVar;
        java.lang.Object next;
        defpackage.alat alatVar = ixhVar.e;
        defpackage.aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        java.util.Iterator<E> it = alatVar.iterator();
        do {
            ixeVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ixd) next).b != 1);
        ixd ixdVar = (ixd) next;
        if (ixdVar != null) {
            ixeVar = ixdVar.b == 1 ? (ixe) ixdVar.c : ixe.a;
        }
        if (ixeVar != null) {
            return ixeVar.e;
        }
        ((defpackage.aimw) b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getBotGreetingDuration", 362, "BeeslyGreetingsDataService.kt")).v("No BotGreeting found, possible for users who enabled BeeslyV1.");
        return 4L;
    }

    private static final long m(defpackage.ixh ixhVar) {
        ixf ixfVar;
        java.lang.Object next;
        if ((ixhVar.b & 1) != 0) {
            java.lang.String str = ixhVar.d;
            defpackage.aooh.e(str, "getSelectedCustomGreetingId(...)");
            if (str.length() != 0) {
                java.lang.String str2 = ixhVar.d;
                defpackage.aooh.e(str2, "getSelectedCustomGreetingId(...)");
                defpackage.alat alatVar = ixhVar.e;
                defpackage.aooh.e(alatVar, "getBeeslyGreetingsList(...)");
                java.util.Iterator<E> it = alatVar.iterator();
                while (true) {
                    ixfVar = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ixd ixdVar = (ixd) next;
                    int i = ixdVar.b;
                    if (i == 2) {
                        if (defpackage.aooh.n((i == 2 ? (ixf) ixdVar.c : ixf.a).b, str2)) {
                            break;
                        }
                    }
                }
                ixd ixdVar2 = (ixd) next;
                if (ixdVar2 != null) {
                    ixfVar = ixdVar2.b == 2 ? (ixf) ixdVar2.c : ixf.a;
                }
                if (ixfVar == null) {
                    ((defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getSelectedCustomGreetingDuration", 337, "BeeslyGreetingsDataService.kt")).y("Selected custom greeting ID '%s' not found. Falling back to bot duration.", str2);
                    return l(ixhVar);
                }
                long j = ixfVar.d;
                if (j > 0) {
                    return j;
                }
                ((defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getSelectedCustomGreetingDuration", 347, "BeeslyGreetingsDataService.kt")).y("Selected custom greeting '%s' has no valid duration. Falling back to bot duration.", str2);
                return l(ixhVar);
            }
        }
        ((defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getSelectedCustomGreetingDuration", 321, "BeeslyGreetingsDataService.kt")).v("CUSTOM type selected but no selected_custom_greeting_id is set. Code is likely incorrect somewhere.");
        return 0L;
    }

    private static final void n(defpackage.aogc aogcVar) {
        aogcVar.s(defpackage.ajcm.a, a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.ecx ecxVar, ixf ixfVar, defpackage.aoln aolnVar) {
        ixi ixiVar;
        if (aolnVar instanceof ixi) {
            ixiVar = (ixi) aolnVar;
            int i = ixiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixiVar.c = i - Integer.MIN_VALUE;
            } else {
                ixiVar = new ixi(this, aolnVar);
            }
        } else {
            ixiVar = new ixi(this, aolnVar);
        }
        java.lang.Object obj = ixiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.bpj bpjVar = new defpackage.bpj(ixfVar, (defpackage.aoln) null, 10);
            ixiVar.c = 1;
            if (ecxVar.a(bpjVar, ixiVar) == aoluVar) {
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
    public final java.lang.Object b(ixd ixdVar, defpackage.aoln aolnVar) {
        ixj ixjVar;
        if (aolnVar instanceof ixj) {
            ixjVar = (ixj) aolnVar;
            int i = ixjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixjVar.c = i - Integer.MIN_VALUE;
            } else {
                ixjVar = new ixj(this, aolnVar);
            }
        } else {
            ixjVar = new ixj(this, aolnVar);
        }
        java.lang.Object obj = ixjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.String language = java.util.Locale.forLanguageTag((ixdVar.b == 1 ? (ixe) ixdVar.c : ixe.a).c).getLanguage();
            defpackage.aooh.e(language, "getLanguage(...)");
            defpackage.ecx ecxVar = this.f;
            rae raeVar = new rae(language, ixdVar, (defpackage.aoln) null, 1);
            ixjVar.c = 1;
            if (ecxVar.a(raeVar, ixjVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        n(this.g);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(ixf ixfVar, defpackage.aoln aolnVar) {
        ixk ixkVar;
        if (aolnVar instanceof ixk) {
            ixkVar = (ixk) aolnVar;
            int i = ixkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixkVar.c = i - Integer.MIN_VALUE;
            } else {
                ixkVar = new ixk(this, aolnVar);
            }
        } else {
            ixkVar = new ixk(this, aolnVar);
        }
        java.lang.Object objK = ixkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixkVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ixfVar = ixkVar.d;
                defpackage.aooc.af(objK);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ixfVar = ixkVar.d;
                defpackage.aooc.af(objK);
            }
            ((defpackage.aimw) b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "addCustomGreeting", 83, "BeeslyGreetingsDataService.kt")).v("Set the new custom greeting as default");
            n(this.g);
            java.lang.String str = ixfVar.b;
            defpackage.aooh.e(str, "getId(...)");
            return str;
        }
        defpackage.aooc.af(objK);
        defpackage.ecx ecxVar = this.f;
        ixkVar.d = ixfVar;
        ixkVar.c = 1;
        if (a(ecxVar, ixfVar, ixkVar) == aoluVar) {
            return aoluVar;
        }
        java.lang.String str2 = ixfVar.b;
        defpackage.aooh.e(str2, "getId(...)");
        ixkVar.d = ixfVar;
        ixkVar.c = 2;
        objK = k(str2, ixkVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        ((defpackage.aimw) b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "addCustomGreeting", 83, "BeeslyGreetingsDataService.kt")).v("Set the new custom greeting as default");
        n(this.g);
        java.lang.String str3 = ixfVar.b;
        defpackage.aooh.e(str3, "getId(...)");
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        ixl ixlVar;
        if (aolnVar instanceof ixl) {
            ixlVar = (ixl) aolnVar;
            int i = ixlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixlVar.c = i - Integer.MIN_VALUE;
            } else {
                ixlVar = new ixl(this, aolnVar);
            }
        } else {
            ixlVar = new ixl(this, aolnVar);
        }
        java.lang.Object obj = ixlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixlVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.f;
            ghv ghvVar = new ghv(str, (defpackage.aoln) null, 3);
            ixlVar.c = 1;
            if (ecxVar.a(ghvVar, ixlVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        n(this.g);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        ixm ixmVar;
        if (aolnVar instanceof ixm) {
            ixmVar = (ixm) aolnVar;
            int i = ixmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixmVar.c = i - Integer.MIN_VALUE;
            } else {
                ixmVar = new ixm(this, aolnVar);
            }
        } else {
            ixmVar = new ixm(this, aolnVar);
        }
        java.lang.Object objG = ixmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objG);
            ixmVar.c = 1;
            objG = g(ixmVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objG);
        }
        defpackage.ixh ixhVar = (defpackage.ixh) objG;
        ixg ixgVarB = ixg.b(ixhVar.c);
        if (ixgVarB == null) {
            ixgVarB = ixg.d;
        }
        return ixgVarB == ixg.c ? new java.lang.Long(m(ixhVar)) : new java.lang.Long(0L);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        ixn ixnVar;
        ixg ixgVarB;
        long jL;
        if (aolnVar instanceof ixn) {
            ixnVar = (ixn) aolnVar;
            int i = ixnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixnVar.c = i - Integer.MIN_VALUE;
            } else {
                ixnVar = new ixn(this, aolnVar);
            }
        } else {
            ixnVar = new ixn(this, aolnVar);
        }
        java.lang.Object objG = ixnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objG);
            ixnVar.c = 1;
            objG = g(ixnVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objG);
        }
        defpackage.ixh ixhVar = (defpackage.ixh) objG;
        ixg ixgVarB2 = ixg.b(ixhVar.c);
        if (ixgVarB2 == null) {
            ixgVarB2 = ixg.d;
        }
        int iOrdinal = ixgVarB2.ordinal();
        if (iOrdinal == 0) {
            defpackage.aimw aimwVar = (defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getActiveGreetingDurationSeconds", 305, "BeeslyGreetingsDataService.kt");
            ixgVarB = ixg.b(ixhVar.c);
            if (ixgVarB == null) {
                ixgVarB = ixg.d;
            }
            aimwVar.y("Selected greeting type is %s, defaulting to bot greeting duration.", ixgVarB.name());
            jL = l(ixhVar);
        } else if (iOrdinal == 1) {
            jL = l(ixhVar);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new defpackage.aois();
            }
            defpackage.aimw aimwVar2 = (defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getActiveGreetingDurationSeconds", 305, "BeeslyGreetingsDataService.kt");
            ixgVarB = ixg.b(ixhVar.c);
            if (ixgVarB == null) {
                ixgVarB = ixg.d;
            }
            aimwVar2.y("Selected greeting type is %s, defaulting to bot greeting duration.", ixgVarB.name());
            jL = l(ixhVar);
        } else {
            jL = m(ixhVar);
        }
        return new java.lang.Long(jL);
    }

    public final java.lang.Object g(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.f.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        ixo ixoVar;
        java.lang.Object next;
        if (aolnVar instanceof ixo) {
            ixoVar = (ixo) aolnVar;
            int i = ixoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixoVar.c = i - Integer.MIN_VALUE;
            } else {
                ixoVar = new ixo(this, aolnVar);
            }
        } else {
            ixoVar = new ixo(this, aolnVar);
        }
        java.lang.Object objAu = ixoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aoxh aoxhVarB = this.f.b();
            ixoVar.c = 1;
            objAu = defpackage.aoov.au(aoxhVarB, ixoVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        defpackage.ixh ixhVar = (defpackage.ixh) objAu;
        ixg ixgVarB = ixg.b(ixhVar.c);
        if (ixgVarB == null) {
            ixgVarB = ixg.d;
        }
        if (ixgVarB.ordinal() != 2) {
            return null;
        }
        java.lang.String str = ixhVar.d;
        defpackage.aooh.e(str, "getSelectedCustomGreetingId(...)");
        defpackage.alat alatVar = ixhVar.e;
        defpackage.aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        java.util.Iterator<E> it = alatVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ixd ixdVar = (ixd) next;
            int i3 = ixdVar.b;
            if (ixc.a(i3) == ixc.b) {
                if (defpackage.aooh.n((i3 == 2 ? (ixf) ixdVar.c : ixf.a).b, str)) {
                    break;
                }
            }
        }
        ixd ixdVar2 = (ixd) next;
        if (ixdVar2 != null) {
            return (ixdVar2.b == 2 ? (ixf) ixdVar2.c : ixf.a).c;
        }
        ((defpackage.aimw) b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "getDefaultGreetingLocalAudioUri", 268, "BeeslyGreetingsDataService.kt")).v("No custom greeting found.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        ixp ixpVar;
        if (aolnVar instanceof ixp) {
            ixpVar = (ixp) aolnVar;
            int i = ixpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixpVar.c = i - Integer.MIN_VALUE;
            } else {
                ixpVar = new ixp(this, aolnVar);
            }
        } else {
            ixpVar = new ixp(this, aolnVar);
        }
        java.lang.Object obj = ixpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.f;
            ixq ixqVar = new ixq(str, str2, (defpackage.aoln) null);
            ixpVar.c = 1;
            if (ecxVar.a(ixqVar, ixpVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        n(this.g);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.ecx ecxVar, java.lang.String str, defpackage.aoln aolnVar) {
        ixr ixrVar;
        if (aolnVar instanceof ixr) {
            ixrVar = (ixr) aolnVar;
            int i = ixrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixrVar.c = i - Integer.MIN_VALUE;
            } else {
                ixrVar = new ixr(this, aolnVar);
            }
        } else {
            ixrVar = new ixr(this, aolnVar);
        }
        java.lang.Object obj = ixrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ghv ghvVar = new ghv(str, (defpackage.aoln) null, 4, (byte[]) null);
            ixrVar.c = 1;
            if (ecxVar.a(ghvVar, ixrVar) == aoluVar) {
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
    public final java.lang.Object k(java.lang.String str, defpackage.aoln aolnVar) {
        ixs ixsVar;
        defpackage.ixt ixtVar;
        java.lang.String str2;
        defpackage.aoot aootVar;
        if (aolnVar instanceof ixs) {
            ixsVar = (ixs) aolnVar;
            int i = ixsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ixsVar.d = i - Integer.MIN_VALUE;
            } else {
                ixsVar = new ixs(this, aolnVar);
            }
        } else {
            ixsVar = new ixs(this, aolnVar);
        }
        java.lang.Object obj = ixsVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ixsVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aootVar = ixsVar.e;
                str2 = (java.lang.String) ixsVar.a;
                defpackage.aooc.af(obj);
                ixtVar = this;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar = (defpackage.aoot) ixsVar.a;
                defpackage.aooc.af(obj);
                ixtVar = this;
            }
            n(ixtVar.g);
            return aootVar.a;
        }
        defpackage.aooc.af(obj);
        defpackage.aoot aootVar2 = new defpackage.aoot();
        aootVar2.a = "";
        defpackage.ecx ecxVar = this.f;
        ixtVar = this;
        agts agtsVar = new agts(str, aootVar2, ixtVar, (defpackage.aoln) null, 1);
        ixsVar.a = str;
        ixsVar.e = aootVar2;
        ixsVar.d = 1;
        if (ecxVar.a(agtsVar, ixsVar) == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        aootVar = aootVar2;
        defpackage.ecx ecxVar2 = ixtVar.f;
        ixsVar.a = aootVar;
        ixsVar.e = null;
        ixsVar.d = 2;
        if (ixtVar.j(ecxVar2, str2, ixsVar) == aoluVar) {
            return aoluVar;
        }
        n(ixtVar.g);
        return aootVar.a;
    }
}

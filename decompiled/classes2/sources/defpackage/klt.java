package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klt {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public klt(ajcu ajcuVar, aolr aolrVar, aljf aljfVar, kpa kpaVar, defpackage.jyn jynVar) {
        aooh.f(ajcuVar, "blockingExecutor");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aljfVar, "duplexService");
        aooh.f(kpaVar, "callNotesConfiguration");
        this.d = ajcuVar;
        this.a = aolrVar;
        this.c = aljfVar;
        this.e = kpaVar;
        this.b = jynVar;
        this.f = new aiuo(new defpackage.kqu(this, (aoln) null, 0));
    }

    public final defpackage.kul a(defpackage.kun kunVar) {
        java.lang.Object obj = ((zzx) this.f).k().get(kunVar);
        if (obj != null) {
            return (defpackage.kul) ((aoin) obj).a();
        }
        java.util.Objects.toString(kunVar);
        throw new java.lang.IllegalStateException("Disclosure not found for type: ".concat(java.lang.String.valueOf(kunVar)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.kum kumVar;
        if (aolnVar instanceof defpackage.kum) {
            kumVar = (defpackage.kum) aolnVar;
            int i = kumVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kumVar.b = i - Integer.MIN_VALUE;
            } else {
                kumVar = new defpackage.kum(this, aolnVar);
            }
        } else {
            kumVar = new defpackage.kum(this, aolnVar);
        }
        java.lang.Object objD = kumVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kumVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarAX = ((aogc) this.e).aX();
            kumVar.b = 1;
            objD = aosv.D(ajcqVarAX, kumVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        zzx zzxVar = (zzx) this.f;
        if (true != zzxVar.k().containsKey((defpackage.kun) objD)) {
            objD = null;
        }
        defpackage.kun kunVar = (defpackage.kun) objD;
        if (kunVar != null) {
            return kunVar;
        }
        java.util.Set setKeySet = zzxVar.k().keySet();
        aooh.e(setKeySet, "<get-keys>(...)");
        java.util.Iterator it = setKeySet.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            int i3 = ((defpackage.kun) next).e;
            do {
                java.lang.Object next2 = it.next();
                int i4 = ((defpackage.kun) next2).e;
                if (i3 < i4) {
                    next = next2;
                    i3 = i4;
                }
            } while (it.hasNext());
        }
        return (defpackage.kun) next;
    }

    public final java.lang.Object c(defpackage.hxw hxwVar, aoln aolnVar) {
        return ((defpackage.hxv) this.b).f(hxwVar, hxwVar, aolnVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, rlv] */
    public final void d(defpackage.kun kunVar) {
        int iOrdinal = kunVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                this.d.o(rmx.na);
            } else if (iOrdinal == 2) {
                this.d.o(rmx.mX);
            } else {
                if (iOrdinal != 3) {
                    throw new aois();
                }
                this.d.o(rmx.mU);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, rlv] */
    public final void e(android.content.Intent intent) {
        aooh.f(intent, "intent");
        ahoq ahoqVarW = ahvr.W(19, "CarIntentController_handleIntent");
        try {
            java.lang.String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1986533159:
                        if (action.equals("com.google.android.gearhead.telecom.OPEN_CONTACTS")) {
                            this.c.o(rmx.qI);
                            ((defpackage.hql) this.a).e(defpackage.hqh.TAB_ID_CONTACTS);
                        }
                        break;
                    case -1173745501:
                        if (action.equals("android.intent.action.CALL")) {
                            ((gpd) this.d).i((java.lang.String) null).b(mce.gA);
                            ahoq ahoqVarW2 = ahvr.W(17, "CarIntentController_handleCallAction");
                            try {
                                this.c.o(rmx.qH);
                                java.lang.Object obj = this.b;
                                java.lang.String numberFromIntent = android.telephony.PhoneNumberUtils.getNumberFromIntent(intent, (android.content.Context) obj);
                                if (numberFromIntent != null) {
                                    java.lang.Object obj2 = this.e;
                                    com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
                                    callIntent$BuilderA.y(numberFromIntent);
                                    callIntent$BuilderA.z(13);
                                    ((defpackage.hqe) obj2).a((defpackage.tt) obj, callIntent$BuilderA);
                                }
                                ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                                break;
                            } catch (java.lang.Throwable th) {
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    ajsz.ak(ahoqVarW2, th);
                                    throw th2;
                                }
                            }
                        }
                        break;
                    case -1173708363:
                        if (action.equals("android.intent.action.DIAL")) {
                            ahoq ahoqVarW3 = ahvr.W(18, "CarIntentController_handleDialAction");
                            try {
                                this.c.o(rmx.qG);
                                java.lang.String numberFromIntent2 = android.telephony.PhoneNumberUtils.getNumberFromIntent(intent, (android.content.Context) this.b);
                                if (numberFromIntent2 != null) {
                                    ((defpackage.hmv) this.f).c(numberFromIntent2);
                                }
                                ((defpackage.hql) this.a).e(defpackage.hqh.TAB_ID_DIALPAD);
                                ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                                break;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    ajsz.ak(ahoqVarW3, th3);
                                    throw th4;
                                }
                            }
                        }
                        break;
                    case -531846456:
                        if (action.equals("com.google.android.gearhead.telecom.SELECT_PHONE_ACCOUNT")) {
                            this.c.o(rmx.qJ);
                        }
                        break;
                    default:
                        break;
                }
            }
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th5) {
            try {
                throw th5;
            } catch (java.lang.Throwable th6) {
                ajsz.ak(ahoqVarW, th5);
                throw th6;
            }
        }
    }

    public klt(aoss aossVar, aolr aolrVar, aogc aogcVar, zzx zzxVar, defpackage.hxv hxvVar, rlv rlvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(hxvVar, "audioInjector");
        aooh.f(rlvVar, "loggingBindings");
        this.a = aossVar;
        this.c = aolrVar;
        this.e = aogcVar;
        this.f = zzxVar;
        this.b = hxvVar;
        this.d = rlvVar;
    }

    public klt(defpackage.fee feeVar, android.media.MediaFormat mediaFormat, defpackage.eqg eqgVar, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, defpackage.hjx hjxVar) {
        this.c = feeVar;
        this.e = mediaFormat;
        this.f = eqgVar;
        this.d = surface;
        this.b = mediaCrypto;
        this.a = hjxVar;
    }

    public klt(defpackage.tt ttVar, defpackage.hqe hqeVar, defpackage.hql hqlVar, defpackage.hmv hmvVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(ttVar, "carContext");
        aooh.f(hqlVar, "tabModel");
        aooh.f(hmvVar, "dialpadModel");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.b = ttVar;
        this.e = hqeVar;
        this.a = hqlVar;
        this.f = hmvVar;
        this.c = rlvVar;
        this.d = gpdVar;
    }

    public klt(ucm ucmVar, az azVar, rlv rlvVar, defpackage.kmc kmcVar, defpackage.jyb jybVar, aoin aoinVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(azVar, "activity");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableCallLogInCompose");
        this.a = ucmVar;
        this.b = azVar;
        this.c = rlvVar;
        this.d = kmcVar;
        this.e = jybVar;
        this.f = aoinVar;
    }

    public klt(android.view.View view, java.lang.String str, gkz gkzVar, android.view.WindowId windowId, defpackage.gli gliVar, android.animation.Animator animator) {
        this.f = view;
        this.c = str;
        this.d = gliVar;
        this.e = windowId;
        this.a = gkzVar;
        this.b = animator;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aesg {
    private static volatile float a;
    public static volatile long e;

    public aesg(defpackage.adym adymVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(adymVar, "delegate");
        defpackage.aooh.f(aossVar, "futureScope");
    }

    public static defpackage.ahyn a(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.ahwt.a;
        }
        float f = a;
        if (f == 0.0f) {
            synchronized (defpackage.aesg.class) {
                f = a;
                if (f == 0.0f) {
                    float refreshRate = ((android.view.WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    a = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return defpackage.ahyn.h(java.lang.Float.valueOf(f));
    }

    public static defpackage.apfi b(defpackage.apfi apfiVar, long j) {
        defpackage.akzx akzxVarL = apfiVar.L();
        defpackage.apfi apfiVar2 = (defpackage.apfi) akzxVarL.b;
        if ((apfiVar2.b & 2) != 0) {
            long j2 = apfiVar2.d - j;
            akzxVarL.u();
            defpackage.apfi apfiVar3 = (defpackage.apfi) akzxVarL.b;
            apfiVar3.b |= 2;
            apfiVar3.d = j2;
        }
        defpackage.apfi apfiVar4 = (defpackage.apfi) akzxVarL.b;
        if ((apfiVar4.b & 4) != 0) {
            long j3 = apfiVar4.e - j;
            akzxVarL.u();
            defpackage.apfi apfiVar5 = (defpackage.apfi) akzxVarL.b;
            apfiVar5.b |= 4;
            apfiVar5.e = j3;
        }
        defpackage.apfi apfiVar6 = (defpackage.apfi) akzxVarL.b;
        if ((apfiVar6.b & 8) != 0) {
            long j4 = apfiVar6.f - j;
            akzxVarL.u();
            defpackage.apfi apfiVar7 = (defpackage.apfi) akzxVarL.b;
            apfiVar7.b |= 8;
            apfiVar7.f = j4;
        }
        return (defpackage.apfi) akzxVarL.r();
    }

    public static defpackage.ajcq c(defpackage.aadh aadhVar, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        aadhVar.g(new aemz(ajddVar, executor, ahycVar), java.util.concurrent.TimeUnit.SECONDS);
        ajddVar.c(defpackage.ahqx.h(new aena(ajddVar, aadhVar)), defpackage.ajbm.INSTANCE);
        return ajddVar;
    }

    public static void d(defpackage.aadl aadlVar) {
        if (aadlVar instanceof defpackage.aadj) {
            ((defpackage.aadj) aadlVar).a();
        }
    }

    public static void e(java.lang.String str, java.util.List list, java.util.Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        defpackage.aemc aemcVarA = defpackage.aeme.a();
        aemcVarA.b(str);
        map.put(str, aemcVarA);
    }

    public static int f(int i) {
        if (i == 0) {
            throw null;
        }
        if (i == 32) {
            return 0;
        }
        if (i == 48) {
            return 1;
        }
        if (i != 120) {
            return i != 240 ? 2 : 5;
        }
        return 3;
    }

    public static defpackage.ahyn g(android.widget.ImageView imageView) {
        java.lang.Object tag = imageView.getTag(2131428603);
        return tag instanceof java.lang.Integer ? defpackage.ahyn.h((java.lang.Integer) tag) : defpackage.ahwt.a;
    }

    public static void h(aejq aejqVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(aonnVar, "topContent");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1724227555);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(aejqVar) : cavVarB.D(aejqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmw cmwVarC = defpackage.azm.c(defpackage.cmw.c, 1.0f);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && cavVarB.D(aejqVar));
            boolean z2 = (i2 & 112) == 32;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2) || objR == defpackage.cau.a) {
                objR = new abdu(aejqVar, aonnVar, 14, (byte[]) null);
                cbtVar.ab(objR);
            }
            dqi.a((defpackage.aonj) objR, cmwVarC, (defpackage.aonj) null, cavVarB, 48, 4);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abmg(aejqVar, aonnVar, i, 9);
        }
    }

    public static void i(java.lang.Runnable runnable) {
        if (defpackage.afec.g()) {
            runnable.run();
        } else {
            defpackage.afec.e(runnable);
        }
    }

    public static com.google.android.libraries.notifications.platform.registration.AccountRepresentation j(aegt aegtVar) {
        int i;
        defpackage.aooh.f(aegtVar, "<this>");
        int i2 = aegtVar.b;
        if (i2 == 0) {
            i = 6;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 != 4) {
            i = i2 != 5 ? 0 : 5;
        } else {
            i = 4;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            java.lang.String str = (i2 == 1 ? (aegq) aegtVar.c : aegq.a).b;
            defpackage.aooh.e(str, "getId(...)");
            return new com.google.android.libraries.notifications.platform.registration.Gaia(str);
        }
        if (i3 == 1) {
            return com.google.android.libraries.notifications.platform.registration.Zwieback.a;
        }
        if (i3 == 2) {
            return com.google.android.libraries.notifications.platform.registration.YouTubeVisitor.a;
        }
        if (i3 == 3) {
            java.lang.String str2 = (i2 == 4 ? (aego) aegtVar.c : aego.a).b;
            defpackage.aooh.e(str2, "getObfuscatedGaiaId(...)");
            return new com.google.android.libraries.notifications.platform.registration.DelegatedGaia(str2);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new defpackage.aois();
            }
            throw new java.lang.IllegalStateException("Account not set in account representation proto");
        }
        java.lang.String str3 = (i2 == 5 ? (aegp) aegtVar.c : aegp.a).b;
        defpackage.aooh.e(str3, "getFitbitEncodedId(...)");
        return new com.google.android.libraries.notifications.platform.registration.Fitbit(str3, (aegtVar.b == 5 ? (aegp) aegtVar.c : aegp.a).c);
    }

    public static boolean k(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static int l(android.util.DisplayMetrics displayMetrics, int i) {
        return (int) (((double) (i * displayMetrics.density)) + 0.5d);
    }

    public static int m(amml ammlVar) {
        float f;
        if ((ammlVar.b & 1) != 0) {
            akzv akzvVar = ammlVar.f;
            if (akzvVar == null) {
                akzvVar = akzv.a;
            }
            f = akzvVar.b;
        } else {
            f = 1.0f;
        }
        return android.graphics.Color.argb(((int) (f * 255.0f)) & 255, ((int) (ammlVar.c * 255.0f)) & 255, ((int) (ammlVar.d * 255.0f)) & 255, ((int) (ammlVar.e * 255.0f)) & 255);
    }

    public static android.view.View n(android.app.Activity activity) {
        android.view.Window window;
        for (al alVar : ((defpackage.az) activity).a().k()) {
            if (alVar instanceof al) {
                android.view.View view = alVar.Q;
                return (view != null || (window = alVar.d.getWindow()) == null) ? view : window.getDecorView();
            }
        }
        return null;
    }

    public static void o(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static java.lang.String p(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj != null) {
            if (obj instanceof java.lang.Iterable) {
                return q((java.lang.Iterable) obj);
            }
            if (obj instanceof java.lang.Object[]) {
                return q(defpackage.ajsz.cN((java.lang.Object[]) obj));
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        return (obj == null || strValueOf.length() == 0 || anfz.a.b().a()) ? strValueOf : java.lang.String.valueOf(strValueOf.hashCode());
    }

    public static java.lang.String q(java.lang.Iterable iterable) {
        return defpackage.ajsz.cr(iterable, null, "[", "]", new acsb(17), 25);
    }

    public static aegt r(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        defpackage.aooh.f(accountRepresentation, "<this>");
        defpackage.akzx akzxVarM = aegt.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        j$.util.Objects.checkIndex(0, 6);
        if (accountRepresentation != null) {
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                defpackage.akzx akzxVarM2 = aegq.a.m();
                defpackage.aooh.f(akzxVarM2, "builder");
                java.lang.String str = ((com.google.android.libraries.notifications.platform.registration.Gaia) accountRepresentation).a;
                defpackage.aooh.f(str, "value");
                akzxVarM2.u();
                aegq aegqVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                aegqVar.b = str;
                aegq aegqVarR = akzxVarM2.r();
                defpackage.aooh.e(aegqVarR, "build(...)");
                aegq aegqVar2 = aegqVarR;
                defpackage.aooh.f(aegqVar2, "value");
                akzxVarM.u();
                aegt aegtVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(aegqVar2);
                aegtVar.c = aegqVar2;
                aegtVar.b = 1;
            } else if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
                defpackage.akzx akzxVarM3 = aego.a.m();
                defpackage.aooh.f(akzxVarM3, "builder");
                java.lang.String str2 = ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) accountRepresentation).a;
                defpackage.aooh.f(str2, "value");
                akzxVarM3.u();
                aego aegoVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                aegoVar.b = str2;
                aego aegoVarR = akzxVarM3.r();
                defpackage.aooh.e(aegoVarR, "build(...)");
                aego aegoVar2 = aegoVarR;
                defpackage.aooh.f(aegoVar2, "value");
                akzxVarM.u();
                aegt aegtVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(aegoVar2);
                aegtVar2.c = aegoVar2;
                aegtVar2.b = 4;
            } else if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
                defpackage.akzx akzxVarM4 = aegp.a.m();
                defpackage.aooh.f(akzxVarM4, "builder");
                com.google.android.libraries.notifications.platform.registration.Fitbit fitbit = (com.google.android.libraries.notifications.platform.registration.Fitbit) accountRepresentation;
                java.lang.String str3 = fitbit.a;
                defpackage.aooh.f(str3, "value");
                akzxVarM4.u();
                aegp aegpVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(str3);
                aegpVar.b = str3;
                long j = fitbit.b;
                akzxVarM4.u();
                akzxVarM4.b.c = j;
                aegp aegpVarR = akzxVarM4.r();
                defpackage.aooh.e(aegpVarR, "build(...)");
                aegp aegpVar2 = aegpVarR;
                defpackage.aooh.f(aegpVar2, "value");
                akzxVarM.u();
                aegt aegtVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(aegpVar2);
                aegtVar3.c = aegpVar2;
                aegtVar3.b = 5;
            } else if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                defpackage.akzx akzxVarM5 = aegs.a.m();
                defpackage.aooh.f(akzxVarM5, "builder");
                aegs aegsVarR = akzxVarM5.r();
                defpackage.aooh.e(aegsVarR, "build(...)");
                aegs aegsVar = aegsVarR;
                defpackage.aooh.f(aegsVar, "value");
                akzxVarM.u();
                aegt aegtVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(aegsVar);
                aegtVar4.c = aegsVar;
                aegtVar4.b = 2;
            } else if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor) {
                defpackage.akzx akzxVarM6 = aegr.a.m();
                defpackage.aooh.f(akzxVarM6, "builder");
                aegr aegrVarR = akzxVarM6.r();
                defpackage.aooh.e(aegrVarR, "build(...)");
                aegr aegrVar = aegrVarR;
                defpackage.aooh.f(aegrVar, "value");
                akzxVarM.u();
                aegt aegtVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(aegrVar);
                aegtVar5.c = aegrVar;
                aegtVar5.b = 3;
            }
            aegt aegtVarR = akzxVarM.r();
            defpackage.aooh.e(aegtVarR, "build(...)");
            return aegtVarR;
        }
        throw new defpackage.aois();
    }

    public static /* synthetic */ java.lang.Object s(defpackage.adzh adzhVar, defpackage.adzf adzfVar, defpackage.aduy aduyVar, android.os.Bundle bundle, java.lang.Long l, defpackage.aoln aolnVar, int i) {
        if ((i & 4) != 0) {
            bundle = new android.os.Bundle();
        }
        if ((i & 2) != 0) {
            aduyVar = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        return adzhVar.b(adzfVar, aduyVar, bundle, l, aolnVar);
    }

    public static /* synthetic */ int t(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
            return 0;
        }
        return obj instanceof java.io.IOException ? 1 : -2;
    }

    public static /* synthetic */ java.lang.String u(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "API_CALL";
        }
        return "UNKNOWN";
    }

    public static int v(int i) {
        if (i != 1) {
            return i == 2 ? 2 : 1;
        }
        return 3;
    }

    public static /* synthetic */ java.lang.String w(int i) {
        if (i == 1) {
            return "PRIORITY_UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "PRIORITY_HIGH";
        }
        return "PRIORITY_NORMAL";
    }

    public static java.lang.String x(defpackage.albh albhVar) {
        defpackage.aooh.f(albhVar, "<this>");
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(albhVar.i(), 10);
        defpackage.aooh.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [adpf, java.lang.Object] */
    public static adrl y(adrn adrnVar) {
        j$.util.Optional optional = adrnVar.l;
        if (optional.isEmpty()) {
            throw new java.lang.IllegalArgumentException("DownlinkAudioRecordFactory was not provided in config");
        }
        adsc adscVar = new adsc(adrnVar.b, (adpf) optional.get());
        ((adrl) adscVar).b = adrnVar.k;
        return adscVar;
    }

    private aesg() {
    }

    public aesg(byte[] bArr, short[] sArr) {
    }

    public aesg(aekj aekjVar) {
        j$.util.Objects.requireNonNull(aekjVar);
    }

    public aesg(char[] cArr) {
        new j$.util.concurrent.ConcurrentHashMap();
    }
}

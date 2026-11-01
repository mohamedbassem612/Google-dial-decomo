package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zoe {
    public final java.lang.Object a;

    public zoe(android.content.Context context) {
        acxg acxgVar = zyx.l;
        zyw zywVar = new zyw(context, "FCM_CLIENT_EVENT_LOGGING");
        zywVar.a(zzv.b);
        zyx zyxVar = new zyx(zywVar.a, zywVar.b, zywVar.e, zywVar.d, 0, zywVar.c, (zzq) null, zywVar.f);
        try {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", "FCM_CLIENT_EVENT_LOGGING", java.lang.Integer.valueOf(java.lang.Integer.parseInt("FCM_CLIENT_EVENT_LOGGING"))));
        } catch (java.lang.NumberFormatException unused) {
            this.a = zyxVar;
        }
    }

    public static final void B(java.lang.StringBuilder sb, java.lang.Throwable th) {
        sb.append(th.getClass().getName());
        sb.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
    }

    public static boolean C(java.lang.Throwable th) {
        return (th instanceof com.google.android.gms.auth.UserRecoverableAuthException) || (th instanceof defpackage.zwt);
    }

    public static defpackage.zoe M(ajcq ajcqVar) {
        return new defpackage.zoe((java.lang.Object) ajan.f(ajcqVar, new defpackage.agqd(4), ajbm.a));
    }

    public static defpackage.zoe N(ajcq ajcqVar) {
        return new defpackage.zoe((java.lang.Object) ajan.f(ajcqVar, new ahye((java.lang.Object) null), ajbm.a));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.util.concurrent.Executor A(defpackage.ahau ahauVar) {
        return ahauVar.a() ? ajbm.a : this.a;
    }

    public final int D(java.lang.Throwable th) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ((defpackage.zoe) this.a).a;
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return C(th) ? 2 : 1;
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aolr, java.lang.Object] */
    public final java.lang.Object E(aonn aonnVar, aoln aolnVar) {
        defpackage.afpl afplVar = (defpackage.afpl) this.a;
        return aoov.aj((aolr) afplVar.b, new defpackage.afmq(afplVar, aonnVar, (aoln) null, 0), aolnVar);
    }

    public final afjq F(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new afjq(context, str, str2, str3, new defpackage.aprf(this.a));
    }

    public final java.lang.String G() {
        try {
            java.lang.Object obj = this.a;
            acxg acxgVar = aatj.a;
            return a.bx(((com.google.android.gms.pseudonymous.PseudonymousIdToken) aazc.u(new abce((android.content.Context) obj, (byte[]) null).e(), true != afjz.m((android.content.Context) obj) ? 1000L : 3000L, java.util.concurrent.TimeUnit.MILLISECONDS)).a, "NID=");
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return "";
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return "";
        } catch (java.util.concurrent.TimeoutException e3) {
            android.util.Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return "";
        }
    }

    public final /* synthetic */ defpackage.afcm H() {
        defpackage.afcm afcmVarP = ((akzx) this.a).p();
        aooh.e(afcmVarP, "build(...)");
        return afcmVarP;
    }

    public final void I(defpackage.afby afbyVar) {
        aooh.f(afbyVar, "value");
        java.lang.Object obj = this.a;
        ((akzx) obj).u();
        defpackage.afcm afcmVar = ((akzz) obj).b;
        defpackage.afcm afcmVar2 = defpackage.afcm.a;
        j$.util.Objects.requireNonNull(afbyVar);
        afcmVar.e = afbyVar;
        afcmVar.b |= 1;
    }

    public final /* synthetic */ defpackage.afcb J() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.afcb) aladVarP;
    }

    public final void K(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.afcb afcbVar = (defpackage.afcb) akzxVar.b;
        defpackage.afcb afcbVar2 = defpackage.afcb.a;
        afcbVar.b |= 1;
        afcbVar.c = z;
    }

    public final void L(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.afcb afcbVar = (defpackage.afcb) akzxVar.b;
        defpackage.afcb afcbVar2 = defpackage.afcb.a;
        afcbVar.d = i - 1;
        afcbVar.b |= 2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final defpackage.amwp O(int i) {
        ahzh ahzhVar = (ahzh) this.a.a();
        ahzhVar.getClass();
        return new defpackage.amwp(i, ahzhVar, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean P() {
        return ((apnt) this.a.a()).b("com.google.android.dialer.directboot", "45841643").e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean Q() {
        return ((apnt) this.a.a()).b("com.google.android.dialer.directboot", "45833921").e();
    }

    public final defpackage.amld R() {
        defpackage.amld amldVar = ((akzz) this.a).b.c;
        if (amldVar == null) {
            amldVar = defpackage.amld.a;
        }
        aooh.e(amldVar, "getRecognitionEvent(...)");
        return amldVar;
    }

    public final /* synthetic */ amle S() {
        amle amleVarP = ((akzx) this.a).p();
        aooh.e(amleVarP, "build(...)");
        return amleVarP;
    }

    public final void T(defpackage.amld amldVar) {
        aooh.f(amldVar, "value");
        java.lang.Object obj = this.a;
        ((akzx) obj).u();
        amle amleVar = ((akzz) obj).b;
        amle amleVar2 = amle.a;
        j$.util.Objects.requireNonNull(amldVar);
        amleVar.c = amldVar;
        amleVar.b |= 2;
    }

    public final /* synthetic */ defpackage.amld U() {
        defpackage.amld amldVarP = ((akzx) this.a).p();
        aooh.e(amldVarP, "build(...)");
        return amldVarP;
    }

    public final /* synthetic */ defpackage.amjp V() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amjp) aladVarP;
    }

    public final void W(amjn amjnVar) {
        aooh.f(amjnVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjp amjpVar = (defpackage.amjp) akzxVar.b;
        defpackage.amjp amjpVar2 = defpackage.amjp.a;
        j$.util.Objects.requireNonNull(amjnVar);
        amjpVar.c = amjnVar;
        amjpVar.b |= 1;
    }

    public final void X(amjr amjrVar) {
        aooh.f(amjrVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjp amjpVar = (defpackage.amjp) akzxVar.b;
        defpackage.amjp amjpVar2 = defpackage.amjp.a;
        j$.util.Objects.requireNonNull(amjrVar);
        amjpVar.d = amjrVar;
        amjpVar.b |= 2;
    }

    public final /* synthetic */ amgz Y() {
        amgz amgzVarP = ((akzx) this.a).p();
        aooh.e(amgzVarP, "build(...)");
        return amgzVarP;
    }

    public final void Z(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        j$.util.Objects.requireNonNull(str);
        amgzVar.b |= 4;
        amgzVar.d = str;
    }

    public final /* synthetic */ defpackage.zrx a() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zrx) aladVarP;
    }

    public final void aA(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqu alquVar = (defpackage.alqu) akzxVar.b;
        defpackage.alqu alquVar2 = defpackage.alqu.a;
        alquVar.b |= 1;
        alquVar.e = j;
    }

    public final /* synthetic */ alqv aB() {
        alqv alqvVarP = ((akzx) this.a).p();
        aooh.e(alqvVarP, "build(...)");
        return alqvVarP;
    }

    public final void aC(defpackage.alqu alquVar) {
        aooh.f(alquVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqv alqvVar = akzxVar.b;
        alqv alqvVar2 = alqv.a;
        j$.util.Objects.requireNonNull(alquVar);
        alqvVar.c = alquVar;
        alqvVar.b |= 1;
    }

    public final void aD(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqv alqvVar = akzxVar.b;
        alqv alqvVar2 = alqv.a;
        alqvVar.e = i - 1;
        alqvVar.b |= 4;
    }

    public final /* synthetic */ void aE(apdi apdiVar, java.lang.Object obj) {
        aooh.f(apdiVar, "extension");
        aooh.f(obj, "value");
        ((akzz) this.a).bV(apdiVar, obj);
    }

    public final void aa(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        j$.util.Objects.requireNonNull(str);
        amgzVar.b |= 1;
        amgzVar.c = str;
    }

    public final void ab(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        amgzVar.b |= 1024;
        amgzVar.k = z;
    }

    public final /* synthetic */ void ac(amgy amgyVar) {
        aooh.f(amgyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        j$.util.Objects.requireNonNull(amgyVar);
        alat alatVar = amgzVar.j;
        if (!alatVar.c()) {
            amgzVar.j = alad.J(alatVar);
        }
        amgzVar.j.add(amgyVar);
    }

    public final void ad() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        amgzVar.b |= 8;
        amgzVar.e = true;
    }

    public final void ae(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amgz amgzVar = akzxVar.b;
        amgz amgzVar2 = amgz.a;
        amgzVar.h = i - 1;
        amgzVar.b |= 16;
    }

    public final /* synthetic */ void af() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.j);
        aooh.e(listUnmodifiableList, "getNonSnippetArgsProtoList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ alxj ag() {
        alxj alxjVarP = ((akzx) this.a).p();
        aooh.e(alxjVarP, "build(...)");
        return alxjVarP;
    }

    public final /* synthetic */ alxe ah() {
        alxe alxeVarP = ((akzx) this.a).p();
        aooh.e(alxeVarP, "build(...)");
        return alxeVarP;
    }

    public final void ai(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alxe alxeVar = akzxVar.b;
        alxe alxeVar2 = alxe.a;
        alxeVar.b |= 4;
        alxeVar.e = j;
    }

    public final void aj(akzm akzmVar) {
        aooh.f(akzmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alxe alxeVar = akzxVar.b;
        alxe alxeVar2 = alxe.a;
        j$.util.Objects.requireNonNull(akzmVar);
        alxeVar.d = akzmVar;
        alxeVar.b |= 2;
    }

    public final void ak(akzm akzmVar) {
        aooh.f(akzmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alxe alxeVar = akzxVar.b;
        alxe alxeVar2 = alxe.a;
        j$.util.Objects.requireNonNull(akzmVar);
        alxeVar.c = akzmVar;
        alxeVar.b |= 1;
    }

    public final /* synthetic */ alsi al() {
        alsi alsiVarP = ((akzx) this.a).p();
        aooh.e(alsiVarP, "build(...)");
        return alsiVarP;
    }

    public final /* synthetic */ alsc am() {
        alsc alscVarP = ((akzx) this.a).p();
        aooh.e(alscVarP, "build(...)");
        return alscVarP;
    }

    public final /* synthetic */ alqq an() {
        alqq alqqVarP = ((akzx) this.a).p();
        aooh.e(alqqVarP, "build(...)");
        return alqqVarP;
    }

    public final void ao(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqq alqqVar = akzxVar.b;
        alqq alqqVar2 = alqq.a;
        j$.util.Objects.requireNonNull(str);
        alqqVar.b |= 1;
        alqqVar.c = str;
    }

    public final void ap(alqp alqpVar) {
        aooh.f(alqpVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqq alqqVar = akzxVar.b;
        alqq alqqVar2 = alqq.a;
        j$.util.Objects.requireNonNull(alqpVar);
        alqqVar.e = alqpVar;
        alqqVar.b |= 4;
    }

    public final /* synthetic */ void aq(defpackage.alqn alqnVar) {
        aooh.f(alqnVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqq alqqVar = akzxVar.b;
        alqq alqqVar2 = alqq.a;
        j$.util.Objects.requireNonNull(alqnVar);
        alat alatVar = alqqVar.d;
        if (!alatVar.c()) {
            alqqVar.d = alad.J(alatVar);
        }
        alqqVar.d.add(alqnVar);
    }

    public final /* synthetic */ void ar() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.d);
        aooh.e(listUnmodifiableList, "getPartList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ alqm as() {
        alqm alqmVarP = ((akzx) this.a).p();
        aooh.e(alqmVarP, "build(...)");
        return alqmVarP;
    }

    public final /* synthetic */ void at(alqq alqqVar) {
        aooh.f(alqqVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqm alqmVar = akzxVar.b;
        alqm alqmVar2 = alqm.a;
        j$.util.Objects.requireNonNull(alqqVar);
        alqmVar.b();
        alqmVar.b.add(alqqVar);
    }

    public final /* synthetic */ void au() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.b);
        aooh.e(listUnmodifiableList, "getHypothesisList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.alqu av() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alqu) aladVarP;
    }

    public final void aw(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqu alquVar = (defpackage.alqu) akzxVar.b;
        defpackage.alqu alquVar2 = defpackage.alqu.a;
        alquVar.b |= 2;
        alquVar.f = j;
    }

    public final void ax(alqm alqmVar) {
        aooh.f(alqmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqu alquVar = (defpackage.alqu) akzxVar.b;
        defpackage.alqu alquVar2 = defpackage.alqu.a;
        j$.util.Objects.requireNonNull(alqmVar);
        alquVar.d = alqmVar;
        alquVar.c = 1;
    }

    public final void ay(alqr alqrVar) {
        aooh.f(alqrVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqu alquVar = (defpackage.alqu) akzxVar.b;
        defpackage.alqu alquVar2 = defpackage.alqu.a;
        j$.util.Objects.requireNonNull(alqrVar);
        alquVar.d = alqrVar;
        alquVar.c = 2;
    }

    public final void az(defpackage.alqt alqtVar) {
        aooh.f(alqtVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alqu alquVar = (defpackage.alqu) akzxVar.b;
        defpackage.alqu alquVar2 = defpackage.alqu.a;
        j$.util.Objects.requireNonNull(alqtVar);
        alquVar.g = alqtVar;
        alquVar.b |= 4;
    }

    public final defpackage.zsf b() {
        defpackage.zrx zrxVar = (defpackage.zrx) ((akzx) this.a).b;
        defpackage.zsf zsfVar = zrxVar.c == 2 ? (defpackage.zsf) zrxVar.d : defpackage.zsf.a;
        aooh.e(zsfVar, "getPhoneCallParameter(...)");
        return zsfVar;
    }

    public final void c(defpackage.zrz zrzVar) {
        aooh.f(zrzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zrx zrxVar = (defpackage.zrx) akzxVar.b;
        defpackage.zrx zrxVar2 = defpackage.zrx.a;
        j$.util.Objects.requireNonNull(zrzVar);
        zrxVar.g = zrzVar;
        zrxVar.b |= 8;
    }

    public final void d(defpackage.zsf zsfVar) {
        aooh.f(zsfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zrx zrxVar = (defpackage.zrx) akzxVar.b;
        defpackage.zrx zrxVar2 = defpackage.zrx.a;
        j$.util.Objects.requireNonNull(zsfVar);
        zrxVar.d = zsfVar;
        zrxVar.c = 2;
    }

    public final void e(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zrx zrxVar = (defpackage.zrx) akzxVar.b;
        defpackage.zrx zrxVar2 = defpackage.zrx.a;
        j$.util.Objects.requireNonNull(str);
        zrxVar.b |= 1;
        zrxVar.e = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.zki zkiVar, aoln aolnVar) throws aois {
        defpackage.zly zlyVar;
        if (aolnVar instanceof defpackage.zly) {
            zlyVar = (defpackage.zly) aolnVar;
            int i = zlyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlyVar.b = i - Integer.MIN_VALUE;
            } else {
                zlyVar = new defpackage.zly(this, aolnVar);
            }
        } else {
            zlyVar = new defpackage.zly(this, aolnVar);
        }
        java.lang.Object objD = zlyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zlyVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarA = ((defpackage.zoe) this.a).l().a(defpackage.ztu.c, zkiVar);
            zlyVar.b = 1;
            objD = aosv.D(ajcqVarA, zlyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        defpackage.zul zulVar = (defpackage.zul) objD;
        aooh.c(zulVar);
        aooh.f(zulVar, "<this>");
        int iOrdinal = zulVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.zke.SUCCESS;
        }
        if (iOrdinal == 1) {
            return defpackage.zke.NODE_OFFLINE;
        }
        if (iOrdinal == 2) {
            return defpackage.zke.EXCEEDED_MAX_RETRIES;
        }
        if (iOrdinal == 3) {
            return defpackage.zke.ERROR;
        }
        if (iOrdinal == 4) {
            return defpackage.zke.CLIENT_API_UNAVAILABLE;
        }
        throw new aois();
    }

    public final /* synthetic */ defpackage.zkq g() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zkq) aladVarP;
    }

    public final /* synthetic */ defpackage.zkh h() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zkh) aladVarP;
    }

    public final /* synthetic */ defpackage.zki i() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zki) aladVarP;
    }

    public final /* synthetic */ void j(defpackage.zkh zkhVar) {
        aooh.f(zkhVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zki zkiVar = (defpackage.zki) akzxVar.b;
        defpackage.zki zkiVar2 = defpackage.zki.a;
        j$.util.Objects.requireNonNull(zkhVar);
        alat alatVar = zkiVar.d;
        if (!alatVar.c()) {
            zkiVar.d = alad.J(alatVar);
        }
        zkiVar.d.add(zkhVar);
    }

    public final /* synthetic */ void k() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.zki) ((akzx) this.a).b).d);
        aooh.e(listUnmodifiableList, "getSharedIncallFeatureDataList(...)");
        new alct(listUnmodifiableList);
    }

    public final defpackage.zur l() {
        return ((aogc) this.a).am("dialer_wear");
    }

    public final /* synthetic */ defpackage.zjd m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zjd) aladVarP;
    }

    public final void n(defpackage.zjb zjbVar) {
        aooh.f(zjbVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zjd zjdVar = (defpackage.zjd) akzxVar.b;
        defpackage.zjd zjdVar2 = defpackage.zjd.a;
        j$.util.Objects.requireNonNull(zjbVar);
        zjdVar.c = zjbVar;
        zjdVar.b |= 1;
    }

    public final void o(defpackage.zjc zjcVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zjd zjdVar = (defpackage.zjd) akzxVar.b;
        defpackage.zjd zjdVar2 = defpackage.zjd.a;
        zjdVar.d = zjcVar.a();
        zjdVar.b |= 2;
    }

    public final /* synthetic */ defpackage.zjb p() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zjb) aladVarP;
    }

    public final void q(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zjb zjbVar = (defpackage.zjb) akzxVar.b;
        defpackage.zjb zjbVar2 = defpackage.zjb.a;
        zjbVar.b |= 2;
        zjbVar.d = z;
    }

    public final void r(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zjb zjbVar = (defpackage.zjb) akzxVar.b;
        defpackage.zjb zjbVar2 = defpackage.zjb.a;
        zjbVar.b |= 1;
        zjbVar.c = j;
    }

    public final /* synthetic */ defpackage.zgf s() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zgf) aladVarP;
    }

    public final void t(akzc akzcVar) {
        aooh.f(akzcVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zgf zgfVar = (defpackage.zgf) akzxVar.b;
        defpackage.zgf zgfVar2 = defpackage.zgf.a;
        j$.util.Objects.requireNonNull(akzcVar);
        zgfVar.c = akzcVar;
    }

    public final void u(defpackage.zdv zdvVar) {
        aooh.f(zdvVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zgf zgfVar = (defpackage.zgf) akzxVar.b;
        defpackage.zgf zgfVar2 = defpackage.zgf.a;
        zgfVar.b = zdvVar.a();
    }

    public final /* synthetic */ defpackage.zge v() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zge) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(aoln aolnVar) {
        defpackage.zcz zczVar;
        if (aolnVar instanceof defpackage.zcz) {
            zczVar = (defpackage.zcz) aolnVar;
            int i = zczVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zczVar.b = i - Integer.MIN_VALUE;
            } else {
                zczVar = new defpackage.zcz(this, aolnVar);
            }
        } else {
            zczVar = new defpackage.zcz(this, aolnVar);
        }
        java.lang.Object objX = zczVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zczVar.b;
        if (i2 == 0) {
            aooc.af(objX);
            zczVar.b = 1;
            objX = x(zczVar);
            if (objX == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objX);
        }
        java.lang.String country = (java.lang.String) objX;
        if (country == null) {
            country = "";
        }
        if (android.text.TextUtils.isEmpty(country)) {
            country = java.util.Locale.getDefault().getCountry();
            aooh.e(country, "getCountry(...)");
        }
        if (true == android.text.TextUtils.isEmpty(country)) {
            country = "US";
        }
        java.lang.String upperCase = country.toUpperCase(java.util.Locale.ROOT);
        aooh.e(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v9, types: [aolr, java.lang.Object] */
    public final java.lang.Object x(aoln aolnVar) {
        defpackage.zda zdaVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.zda) {
            zdaVar = (defpackage.zda) aolnVar;
            int i = zdaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdaVar.b = i - Integer.MIN_VALUE;
            } else {
                zdaVar = new defpackage.zda(this, aolnVar);
            }
        } else {
            zdaVar = new defpackage.zda(this, aolnVar);
        }
        java.lang.Object objY = zdaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zdaVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objY);
            } else {
                if (i2 == 2) {
                    aooc.af(objY);
                    str = (java.lang.String) objY;
                    if (android.text.TextUtils.isEmpty(str)) {
                        java.lang.Object obj = this.a;
                        zdaVar.b = 3;
                        objY = ((defpackage.uyg) obj).u(zdaVar);
                        if (objY == aoluVar) {
                            return aoluVar;
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str) || str == null) {
                        return null;
                    }
                    java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                    aooh.e(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objY);
            }
            str = (java.lang.String) objY;
            if (android.text.TextUtils.isEmpty(str)) {
            }
            return null;
        }
        aooc.af(objY);
        zdaVar.b = 1;
        objY = y(zdaVar);
        if (objY == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objY).booleanValue()) {
            java.lang.Object obj2 = this.a;
            zdaVar.b = 2;
            defpackage.uyg uygVar = (defpackage.uyg) obj2;
            objY = aoov.aj((aolr) uygVar.b, new zhb(uygVar, (aoln) null, 5), zdaVar);
            if (objY == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objY;
        } else {
            str = null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object obj3 = this.a;
            zdaVar.b = 3;
            objY = ((defpackage.uyg) obj3).u(zdaVar);
            if (objY == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objY;
        }
        if (android.text.TextUtils.isEmpty(str)) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [aolr, java.lang.Object] */
    public final java.lang.Object y(aoln aolnVar) {
        defpackage.zdb zdbVar;
        if (aolnVar instanceof defpackage.zdb) {
            zdbVar = (defpackage.zdb) aolnVar;
            int i = zdbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdbVar.b = i - Integer.MIN_VALUE;
            } else {
                zdbVar = new defpackage.zdb(this, aolnVar);
            }
        } else {
            zdbVar = new defpackage.zdb(this, aolnVar);
        }
        java.lang.Object objAj = zdbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zdbVar.b;
        if (i2 == 0) {
            aooc.af(objAj);
            java.lang.Object obj = this.a;
            zdbVar.b = 1;
            defpackage.uyg uygVar = (defpackage.uyg) obj;
            objAj = aoov.aj((aolr) uygVar.b, new zhb(uygVar, (aoln) null, 6, (byte[]) null), zdbVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) objAj).intValue() == 1);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    public final ajcq z(defpackage.ahau ahauVar, java.lang.String str, ajcq ajcqVar) {
        ajcq ajcqVarF = aizu.f(ajan.f(ajcqVar, new defpackage.agnw(ahauVar, 15), A(ahauVar)), java.lang.Throwable.class, new defpackage.agnw(ahauVar, 14), A(ahauVar));
        long j = ahauVar.c;
        if (j > 0) {
            ?? r2 = this.a;
            ajcqVarF = aizu.f(aiql.G(ajcqVarF, j, java.util.concurrent.TimeUnit.MILLISECONDS, (java.util.concurrent.ScheduledExecutorService) r2), java.util.concurrent.TimeoutException.class, new defpackage.agqd(5), (java.util.concurrent.Executor) r2);
        } else if (j == 0 && !ajcqVarF.isDone()) {
            ajcqVarF.cancel(true);
            ajcqVarF = aiql.z(defpackage.ahas.d);
        }
        return ajan.f(ajcqVarF, new defpackage.agnx(str, ahauVar, 7, null), A(ahauVar));
    }

    public zoe(aoss aossVar, defpackage.uyg uygVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = uygVar;
    }

    public zoe(ccp ccpVar) {
        this();
        this.a = ccpVar;
    }

    public zoe(cer cerVar) {
        this();
        this.a = cerVar;
    }

    public zoe(java.lang.Object obj) {
        this.a = obj;
    }

    public zoe(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    @java.lang.Deprecated
    public zoe(org.chromium.net.CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    public zoe() {
    }

    public zoe(android.content.Context context, byte[] bArr) {
        this.a = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public zoe(ajcq ajcqVar) {
        afec.c();
        ahvr.ci(ajcqVar);
        this.a = ajcqVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhj implements amyv {
    public static qia b(defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new defpackage.mwe(mwjVar, 0);
    }

    public static qia c(defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new defpackage.mwe(mwjVar, 2);
    }

    public static qjb d(defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new defpackage.mwf(mwjVar, 0);
    }

    public static qjc e(defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new defpackage.mwg(mwjVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mwh] */
    public static defpackage.mwh f(final defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new aood() { // from class: mwh
            public final void a() {
                mwjVar.i.b(mce.da);
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof defpackage.mwh) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            }

            public final aoio ex() {
                return new aoof(0, mwjVar, defpackage.mwj.class, "onScreenCallButtonAddedToNotification", "onScreenCallButtonAddedToNotification()V", 0);
            }

            public final int hashCode() {
                return ex().hashCode();
            }
        };
    }

    public static qia g(defpackage.mwj mwjVar) {
        aooh.f(mwjVar, "notificationController");
        return new defpackage.mwe(mwjVar, 3);
    }

    public static ahkm h() {
        return zja.b("ExpressoSettings", pez.aO(defpackage.oit.a.m()).T(), (java.lang.Iterable) null, (aonj) null, 12);
    }

    public static zjm i(lbw lbwVar, aoin aoinVar) {
        j$.util.Objects.requireNonNull(lbwVar);
        return new zjm(aoinVar, new defpackage.len(lbwVar, 2));
    }

    public static zjm j(meo meoVar, aoin aoinVar) {
        aooh.f(aoinVar, "impl");
        return new zjm(aoinVar, new defpackage.meu(meoVar, 1));
    }

    public static zjm k(aoin aoinVar, aoin aoinVar2) {
        aooh.f(aoinVar, "enableDobbyGemini");
        aooh.f(aoinVar2, "impl");
        return new zjm(aoinVar2, new defpackage.mzr(aoinVar, 3));
    }

    public static zjm l(aoin aoinVar, aoin aoinVar2) {
        aooh.f(aoinVar, "enableAgenticCallScreen");
        aooh.f(aoinVar2, "impl");
        return new zjm(aoinVar2, new defpackage.mzr(aoinVar, 5));
    }

    public static void m(defpackage.maj majVar) {
        aooh.f(majVar, "impl");
        aooc.ap(majVar);
    }

    public static defpackage.ifb n(defpackage.lgi lgiVar, defpackage.lgg lggVar, java.lang.Object obj, ajct ajctVar, qbe qbeVar) {
        return new defpackage.ifb(lgiVar, lggVar, (defpackage.lem) obj, ajctVar, qbeVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoin, java.lang.Object] */
    public static zdt o(defpackage.luh luhVar, uyg uygVar, aowi aowiVar) {
        zdv zdvVar = zdv.e;
        aoss aossVar = (aoss) uygVar.a.a();
        aossVar.getClass();
        apni apniVar = (apni) uygVar.b.a();
        apniVar.getClass();
        return new zdt(aossVar, apniVar, zdvVar, luhVar, aowiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoin, java.lang.Object] */
    public static zdt p(defpackage.ogv ogvVar, uyg uygVar) {
        ?? r0 = uygVar.a;
        zdv zdvVar = zdv.d;
        aoss aossVar = (aoss) r0.a();
        aossVar.getClass();
        apni apniVar = (apni) uygVar.b.a();
        apniVar.getClass();
        return new zdt(aossVar, apniVar, zdvVar, ogvVar, (aowv) null);
    }

    public static agva q(aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        return new agvg(new defpackage.lwt(aoinVar, 11), aogcVar);
    }

    public static agva r(aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        return new agvg(new defpackage.lwt(aoinVar, 12), aogcVar);
    }

    public static agva s(aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        return new agvg(new defpackage.mzq(aoinVar, 15), aogcVar);
    }

    public static agva t(aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        return new agvg(new defpackage.mzq(aoinVar, 16), aogcVar);
    }

    public static agva u(aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        return new agvg(new defpackage.nzq(aoinVar, 1), aogcVar);
    }

    public static mgu v(defpackage.mfz mfzVar, rsr rsrVar) {
        return rsrVar.P(mfzVar, j$.util.function.Function.-CC.identity());
    }

    public final /* synthetic */ java.lang.Object a() {
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vfz implements defpackage.amyv {
    public static defpackage.gta b(java.util.Set set) {
        defpackage.grs grsVar = new defpackage.grs();
        defpackage.ailj it = ((defpackage.aile) set).iterator();
        while (it.hasNext()) {
            defpackage.gta gtaVar = (defpackage.gta) it.next();
            if (gtaVar == null) {
                defpackage.aooh.i("workerFactory");
            }
            grsVar.a.add(gtaVar);
        }
        return grsVar;
    }

    public static java.lang.String c(android.content.Context context) {
        int i = defpackage.abzx.a;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        java.lang.String packageName = context.getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        if (packageName != null) {
            return packageName;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static defpackage.zjm d(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 12), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm e(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 6), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm f(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 13), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm g(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 20), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm h(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(obj, 16), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm i(java.lang.Object obj) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.vfy(obj, 0), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm j(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 15), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm k(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 8), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm l(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 9), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm m(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 4), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm n(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 10), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm o(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.vfy(vfrVar, 3), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm p(defpackage.vfr vfrVar) {
        return new defpackage.zjm((defpackage.aoin) new defpackage.uoe(vfrVar, 7), (defpackage.zcs) new defpackage.vkc(2));
    }

    public static defpackage.zjm q(defpackage.vlh vlhVar, defpackage.vli vliVar) {
        j$.util.Objects.requireNonNull(vlhVar);
        return new defpackage.zjm((defpackage.aoin) new defpackage.vfy(vliVar, 7), (defpackage.zcs) new defpackage.sxz(vlhVar, 15));
    }

    public static defpackage.zjm r(defpackage.vlh vlhVar, defpackage.vlm vlmVar) {
        j$.util.Objects.requireNonNull(vlhVar);
        return new defpackage.zjm((defpackage.aoin) new defpackage.vfy(vlmVar, 8), (defpackage.zcs) new defpackage.sxz(vlhVar, 15));
    }

    public static defpackage.zjm s(defpackage.vlh vlhVar, defpackage.vln vlnVar) {
        j$.util.Objects.requireNonNull(vlhVar);
        return new defpackage.zjm((defpackage.aoin) new defpackage.vfy(vlnVar, 6), (defpackage.zcs) new defpackage.sxz(vlhVar, 15));
    }

    public static defpackage.adao t(defpackage.tvn tvnVar) {
        if (tvnVar == null) {
            defpackage.aooh.i("clearcutLoggerFactory");
        }
        return new defpackage.adao(new defpackage.achm(tvnVar, 1));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public static defpackage.ahjz u(defpackage.aogc aogcVar) {
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        ajniVar.e(defpackage.aknt.j);
        defpackage.zcq zcqVar = (defpackage.zcq) ((j$.util.Optional) aogcVar.c).orElse((java.lang.Object) null);
        if (zcqVar == null) {
            zcqVar = defpackage.zcq.SERVER_ENV_UNSPECIFIED;
        }
        defpackage.aify aifyVar = (defpackage.aify) aogcVar.b.get(zcqVar);
        defpackage.ttj ttjVar = (defpackage.ttj) aogcVar.a.get(zcqVar);
        if (aifyVar == null || ttjVar == null) {
            return ajniVar.d();
        }
        j$.util.Optional optionalEmpty = aifyVar.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of((java.lang.String) aifyVar.get(0));
        if (optionalEmpty.isPresent()) {
            ajniVar.a = 443;
            ajniVar.c = (java.lang.String) optionalEmpty.orElseThrow();
        }
        return ajniVar.d();
    }

    public static defpackage.adye v(rai raiVar) {
        int i = defpackage.abzx.a;
        defpackage.aooh.f(raiVar, "factory");
        him himVar = ((hil) raiVar.a).a;
        defpackage.aeco aecoVar = defpackage.aeco.IN_APP;
        defpackage.aeeg aeegVarEF = himVar.eF();
        android.content.Context context = (android.content.Context) himVar.s.a();
        defpackage.aooh.f(context, "context");
        defpackage.acxg acxgVar = defpackage.aasr.a;
        return new defpackage.adyg(aeegVarEF, new defpackage.aata(context), new defpackage.aile((java.lang.String) himVar.rN.a()), new defpackage.aile((java.lang.String) himVar.rO.a()), (defpackage.aazc) himVar.l.a(), aecoVar, (defpackage.aoss) himVar.fh.a(), himVar.qK, (android.content.Context) himVar.s.a(), (defpackage.aduu) himVar.qJ.a());
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        throw null;
    }
}

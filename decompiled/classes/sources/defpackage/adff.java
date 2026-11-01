package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adff implements defpackage.adfm, defpackage.adfn {
    public final java.util.Map a = new java.util.LinkedHashMap();
    public final java.lang.Object b = new java.lang.Object();
    public final android.content.Context c;
    public final defpackage.adag d;
    public final defpackage.adqg e;
    public final defpackage.tvn f;
    private final defpackage.adai g;

    public adff(defpackage.adai adaiVar, android.content.Context context, defpackage.adag adagVar, defpackage.tvn tvnVar, defpackage.adqg adqgVar) {
        this.g = adaiVar;
        this.c = context;
        this.d = adagVar;
        this.f = tvnVar;
        this.e = adqgVar;
    }

    public static boolean h(defpackage.adfl adflVar) {
        defpackage.adfk adfkVar = adflVar.c;
        if (adfkVar == null) {
            adfkVar = defpackage.adfk.a;
        }
        return !adfkVar.equals(defpackage.adfk.a);
    }

    public static boolean i(defpackage.adfl adflVar) {
        return !defpackage.adfl.a.equals(adflVar);
    }

    public static boolean j(defpackage.adfl adflVar) {
        defpackage.akof akofVar = adflVar.b;
        if (akofVar == null) {
            akofVar = defpackage.akof.a;
        }
        return defpackage.abrz.C(akofVar) != null;
    }

    public final defpackage.ahyn a() {
        this.g.c();
        return defpackage.ahwt.a;
    }

    public final defpackage.ajcq b() {
        return defpackage.ahvr.I(this.g.c(), new defpackage.adfd(this, 0), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq c() {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(d());
        defpackage.vmn vmnVar = new defpackage.vmn(this, 15);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        int i = 4;
        return defpackage.ahrv.g(ahrvVarG.i(vmnVar, ajbmVar).h(new defpackage.adcu(i), ajbmVar)).f(java.lang.Exception.class, new defpackage.uqd(i), ajbmVar).h(new defpackage.adcu(5), ajbmVar);
    }

    public final defpackage.ajcq d() {
        return defpackage.ahrv.g(this.f.ad()).f(java.io.IOException.class, new defpackage.vmn(this, 14), defpackage.ajbm.INSTANCE);
    }

    public final void e(defpackage.adfa adfaVar, java.util.concurrent.Executor executor) {
        synchronized (this.b) {
            this.a.put(adfaVar, executor);
        }
    }

    @Override // defpackage.adfm
    public final void f() {
        defpackage.aigf aigfVarI;
        synchronized (this.b) {
            aigfVarI = defpackage.aigf.i(this.a);
        }
        defpackage.ailj it = aigfVarI.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.concurrent.Executor executor = (java.util.concurrent.Executor) entry.getValue();
            defpackage.adfa adfaVar = (defpackage.adfa) entry.getKey();
            j$.util.Objects.requireNonNull(adfaVar);
            executor.execute(defpackage.ahqx.h(new absj(adfaVar, 9)));
        }
    }

    @Override // defpackage.adfn
    public final void g() {
        defpackage.aigf aigfVarI;
        synchronized (this.b) {
            aigfVarI = defpackage.aigf.i(this.a);
        }
        defpackage.ailj it = aigfVarI.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.concurrent.Executor executor = (java.util.concurrent.Executor) entry.getValue();
            defpackage.adfa adfaVar = (defpackage.adfa) entry.getKey();
            j$.util.Objects.requireNonNull(adfaVar);
            executor.execute(defpackage.ahqx.h(new absj(adfaVar, 8)));
        }
    }

    public final defpackage.ajcq k(int i) {
        return defpackage.ahvr.I(b(), new lhb(this, i, 10), defpackage.ajbm.INSTANCE);
    }
}

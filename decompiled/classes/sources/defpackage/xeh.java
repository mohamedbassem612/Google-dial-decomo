package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xeh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/callscreen/impl/actions/ActionTextDownloader");
    public final android.content.Context b;
    public final defpackage.aoin d;
    public final defpackage.adqn h;
    private final defpackage.ajct i;
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference();

    public xeh(android.content.Context context, defpackage.adqn adqnVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.h = adqnVar;
        this.i = ajctVar;
        this.d = aoinVar;
    }

    public final defpackage.ajcq a(java.lang.String str, defpackage.aihd aihdVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        int size = aihdVar.size();
        defpackage.ahvr.bC(size, "expectedSize");
        int i = 1;
        defpackage.aihb aihbVar = new defpackage.aihb(size, true);
        defpackage.ailj it = aihdVar.iterator();
        while (true) {
            defpackage.adqn adqnVar = this.h;
            if (!it.hasNext()) {
                defpackage.ajcq ajcqVarB = adqnVar.b(aihbVar.g());
                defpackage.low lowVar = new defpackage.low("ActionTextDownloader.prepareAllTexts$audioMessageFileManager.areAllTextsAvailable");
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                long j = defpackage.ahqx.a;
                ajcqVarB.c(new defpackage.ajcc(ajcqVarB, new defpackage.sqh(defpackage.ahns.c(false), lowVar, 2)), ajbmVar);
                defpackage.ahrv ahrvVarI = defpackage.ahrv.g(ajcqVarB).i(new defpackage.accg(this, str, aihdVar, i), this.i);
                ahrvVarI.c(new defpackage.ajcc(ahrvVarI, new defpackage.sqh(defpackage.ahns.c(false), new defpackage.sqh(defpackage.ahns.c(false), new defpackage.xeg(atomicBoolean, str), 2), 2)), ajbmVar);
                return ahrvVarI;
            }
            aihbVar.c(new defpackage.adnv(adqnVar.h(), (java.lang.String) it.next()));
        }
    }
}

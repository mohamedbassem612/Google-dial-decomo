package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkd {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EventRouterImpl");
    public final aiga b;
    public final aizr c;
    public final java.util.concurrent.locks.Lock d = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.concurrent.Semaphore e = new java.util.concurrent.Semaphore(1);
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(true);
    public final aihd g;
    public final defpackage.apjb h;

    public alkd(aihd aihdVar, defpackage.apjb apjbVar, aizr aizrVar) {
        this.g = aihdVar;
        aifz aifzVar = new aifz();
        j$.util.Map.-EL.forEach((aigf) j$.util.Collection.-EL.stream(aihdVar).collect(aido.b(new defpackage.ailg(15), new defpackage.ailg(16))), new jwx(aifzVar, 12));
        aiga aigaVarA = aifzVar.a();
        aiga aigaVarA2 = aigaVarA.b;
        if (aigaVarA2 == null) {
            aifz aifzVar2 = new aifz();
            ailj ailjVarK = aigaVarA.d().k();
            while (ailjVarK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                aifzVar2.b(entry.getValue(), entry.getKey());
            }
            aigaVarA2 = aifzVar2.a();
            aigaVarA2.b = aigaVarA;
            aigaVarA.b = aigaVarA2;
        }
        this.b = aigaVarA2;
        this.h = apjbVar;
        this.c = aizrVar;
    }

    public final void a(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        ailj ailjVarK = this.g.k();
        while (ailjVarK.hasNext()) {
            ((defpackage.allg) ailjVarK.next()).f(alqdVar, alqhVar, alqkVar, almbVar, almlVar, alkfVar);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akag extends akar {
    private final aigf b;
    private final defpackage.akaf c;

    public akag(defpackage.akaf akafVar) {
        this.c = akafVar;
        aigb aigbVar = new aigb(4);
        ailj ailjVarK = akafVar.b.k();
        while (ailjVarK.hasNext()) {
            defpackage.ulw ulwVar = (defpackage.ulw) ailjVarK.next();
            ailj ailjVarK2 = ((aihd) ulwVar.c).k();
            while (ailjVarK2.hasNext()) {
                aigbVar.i((java.lang.String) ailjVarK2.next(), ulwVar);
            }
        }
        this.b = aigbVar.e(true);
    }

    public final defpackage.akbp a() {
        return new defpackage.akaa(this.c.a, this.b);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amyt implements defpackage.amyv {
    private defpackage.amyz a;

    public static void b(defpackage.amyt amytVar, defpackage.amyz amyzVar) {
        if (amytVar.a != null) {
            throw new java.lang.IllegalStateException();
        }
        amytVar.a = amyzVar;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        defpackage.amyz amyzVar = this.a;
        if (amyzVar != null) {
            return amyzVar.a();
        }
        throw new java.lang.IllegalStateException();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zpz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/incall/core/dataservice/impl/InCallUpdatePropagatorImpl");
    public final defpackage.zpy b;
    public final java.util.concurrent.Executor c;
    public boolean d = false;

    public zpz(defpackage.zpy zpyVar, defpackage.ajct ajctVar) {
        this.b = zpyVar;
        this.c = new defpackage.ajdc(ajctVar);
    }

    public final void a(defpackage.ajcq ajcqVar) {
        defpackage.ahvr.T();
        defpackage.ahvr.J(ajcqVar, new pgr(this, 8), this.c);
    }
}

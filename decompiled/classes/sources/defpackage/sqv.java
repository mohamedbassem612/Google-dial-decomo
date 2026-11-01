package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/cp2/MissingPermissionsOperations");
    public final defpackage.ojo b;
    private final defpackage.ajct c;
    private final defpackage.ajct d;

    public sqv(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ojo ojoVar) {
        this.c = ajctVar;
        this.d = ajctVar2;
        this.b = ojoVar;
    }

    final defpackage.ajcq a(defpackage.aigf aigfVar) {
        return this.d.submit(defpackage.ahqx.i(new defpackage.raj(aigfVar, 16)));
    }

    final defpackage.ajcq b(defpackage.aihd aihdVar, java.util.function.Predicate predicate) {
        return this.c.submit(defpackage.ahqx.i(new squ(this, aihdVar, predicate)));
    }
}

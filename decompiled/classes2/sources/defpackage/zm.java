package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zm {
    boolean a;
    boolean b;
    int c;
    int d;
    boolean e;
    defpackage.zk f;

    public zm(defpackage.zn znVar) {
        this.a = true;
        this.b = true;
        this.c = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = defpackage.zk.a;
        j$.util.Objects.requireNonNull(znVar);
        this.a = znVar.j;
        this.c = znVar.f;
        this.d = znVar.g;
        this.b = znVar.i;
        this.e = znVar.h;
        this.f = znVar.k;
    }

    public zm() {
        this.a = true;
        this.b = true;
        this.c = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = defpackage.zk.a;
    }
}

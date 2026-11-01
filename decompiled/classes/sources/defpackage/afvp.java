package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afvp {
    public int a;
    public int b;
    public int c;
    public int d;

    public afvp(defpackage.afvp afvpVar) {
        this.a = afvpVar.a;
        this.b = afvpVar.b;
        this.c = afvpVar.c;
        this.d = afvpVar.d;
    }

    public final void a(android.view.View view) {
        view.setPaddingRelative(this.a, this.b, this.c, this.d);
    }

    public afvp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}

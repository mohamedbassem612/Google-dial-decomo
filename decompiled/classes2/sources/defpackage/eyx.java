package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eyx implements defpackage.eyt {
    public final defpackage.ffp a;
    public int d;
    public boolean e;
    public final java.util.List c = new java.util.ArrayList();
    public final java.lang.Object b = new java.lang.Object();

    public eyx(defpackage.ffw ffwVar, boolean z) {
        this.a = new defpackage.ffp(ffwVar, z);
    }

    @Override // defpackage.eyt
    public final defpackage.erm a() {
        return this.a.e;
    }

    @Override // defpackage.eyt
    public final java.lang.Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}

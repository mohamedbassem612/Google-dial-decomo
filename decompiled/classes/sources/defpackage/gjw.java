package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjw extends defpackage.gkc {
    public final defpackage.gkb a;
    public final defpackage.aonj b;
    public defpackage.gjx c;

    public gjw(defpackage.gkb gkbVar, defpackage.aonj aonjVar) {
        defpackage.gjx gjxVar;
        this.a = gkbVar;
        this.b = aonjVar;
        if (gkbVar.g) {
            gjxVar = defpackage.gju.b;
        } else {
            android.os.Process.myPid();
            ft$.ExternalSyntheticApiModelOutline0.m();
            synchronized (gkbVar.f) {
                if (!gkbVar.g) {
                    defpackage.gju.b = new defpackage.gjx(gkbVar);
                    gkbVar.g = true;
                }
            }
            gjxVar = defpackage.gju.b;
        }
        this.c = gjxVar;
    }

    @Override // defpackage.gkc
    public final void a(java.lang.String str) {
        ((java.lang.Boolean) this.b.a(str)).booleanValue();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmd extends amzm {
    private final amzg b;

    public wmd(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmd.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        defpackage.wpg wpgVar = ((defpackage.abtr) obj).n().c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        defpackage.woy woyVar = wpgVar.c;
        if (woyVar == null) {
            woyVar = defpackage.woy.a;
        }
        defpackage.wpc wpcVar = woyVar.d;
        if (wpcVar == null) {
            wpcVar = defpackage.wpc.a;
        }
        int i = wpcVar.b;
        if (a.X(i) == 3) {
            z = (i == 3 ? (defpackage.wpa) wpcVar.c : defpackage.wpa.a).b;
        } else {
            z = false;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}

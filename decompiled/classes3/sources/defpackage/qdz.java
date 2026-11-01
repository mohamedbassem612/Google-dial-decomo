package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qdz extends amzm {
    private final amzg b;
    private final amzg c;

    public qdz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qdz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zAnyMatch = false;
        tkl tklVar = (tkl) list.get(0);
        if (((gpd) list.get(1)).e()) {
            android.view.Display[] displays = ((android.hardware.display.DisplayManager) tklVar.a).getDisplays();
            aooh.e(displays, "getDisplays(...)");
            zAnyMatch = j$.util.Collection.-EL.stream(ajsz.cU(displays)).anyMatch(new jty(tklVar, 18));
        } else if (tklVar.j(0) != 1) {
            zAnyMatch = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(zAnyMatch));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

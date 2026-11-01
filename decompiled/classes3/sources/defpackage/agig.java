package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agig {
    private static final xtq a = new xtq(defpackage.agig.class);

    private agig() {
    }

    public static void a(android.content.Context context, android.view.View view) {
        if (context == null || !defpackage.agfz.B(context)) {
            return;
        }
        a.x("Adding focus ring drawable with shape: CIRCLE");
        defpackage.aggp aggpVar = new defpackage.aggp(context);
        aggpVar.a = -1;
        aggpVar.b = -1;
        aggpVar.b(999);
        view.setForeground(aggpVar.a());
    }
}

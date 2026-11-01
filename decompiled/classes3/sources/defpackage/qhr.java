package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhr {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public qhr(android.view.View view) {
        this.b = (android.widget.TextView) view.findViewById(2131428823);
        this.a = view.findViewById(2131428824);
    }

    public static final android.widget.CheckBox a(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(2131428780);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.CheckBox) viewFindViewById;
    }

    public qhr(aoss aossVar, rtg rtgVar) {
        aooh.f(aossVar, "lightweightScope");
        this.b = aossVar;
        this.a = rtgVar;
    }

    public qhr(defpackage.qho qhoVar, ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.a = qhoVar;
        this.b = ucmVar;
    }

    public qhr(android.content.Context context, rst rstVar) {
        aooh.f(context, "appContext");
        this.a = context;
        this.b = rstVar;
    }
}

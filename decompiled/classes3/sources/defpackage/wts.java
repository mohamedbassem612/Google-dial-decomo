package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wts {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public wts(defpackage.voc vocVar, ajwr ajwrVar, com.android.dialer.xatu.impl.ui.XatuInCallToolbar xatuInCallToolbar) {
        this.e = j$.util.Optional.empty();
        this.a = vocVar;
        this.c = ajwrVar;
        android.view.View viewInflate = com.android.dialer.xatu.impl.ui.XatuInCallToolbar.inflate(xatuInCallToolbar.getContext(), 2131624721, xatuInCallToolbar);
        this.b = (android.widget.ImageButton) viewInflate.findViewById(2131427603);
        this.d = viewInflate.findViewById(2131428364);
    }

    public wts(android.content.Context context, defpackage.tzb tzbVar, aogc aogcVar, aoss aossVar) {
        aooh.f(context, "appContext");
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(aossVar, "backgroundScope");
        this.b = context;
        this.d = tzbVar;
        this.a = aogcVar;
        this.c = aossVar;
    }
}

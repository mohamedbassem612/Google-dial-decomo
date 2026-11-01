package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wgh extends android.widget.PopupWindow {
    private final android.content.Context a;
    private final android.view.View b;

    private wgh(android.content.Context context, aify aifyVar, java.lang.CharSequence charSequence) {
        super(context);
        this.a = context;
        int i = 0;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(2131624367, (android.view.ViewGroup) null, false);
        this.b = viewInflate;
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131428707);
        textView.setText(pez.aq(context, charSequence));
        textView.setVisibility(0);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(2131428704);
        int i2 = ((aike) aifyVar).d;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.uxn uxnVar = (defpackage.uxn) aifyVar.get(i3);
            defpackage.uxo uxoVarA = uxnVar.a();
            j$.util.Optional optionalB = uxnVar.b();
            android.view.View viewInflate2 = android.view.LayoutInflater.from(this.a).inflate(2131624368, (android.view.ViewGroup) linearLayout, false);
            ((android.widget.ImageView) viewInflate2.findViewById(2131428705)).setImageResource(uxoVarA.c);
            ((android.widget.TextView) viewInflate2.findViewById(2131428706)).setText(uxoVarA.d);
            viewInflate2.setOnClickListener(new defpackage.wgf(this, optionalB, i));
            optionalB.isPresent();
            viewInflate2.setEnabled(true);
            linearLayout.addView(viewInflate2);
        }
        setContentView(this.b);
        setBackgroundDrawable(context.getDrawable(2131231132));
        setElevation(context.getResources().getDimensionPixelSize(2131167303));
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public static void a(android.view.View view, defpackage.wgg wggVar, aify aifyVar, java.lang.CharSequence charSequence) {
        new defpackage.wgh(view.getContext(), aifyVar, charSequence).showAtLocation(view, 0, wggVar.a, wggVar.b);
    }
}

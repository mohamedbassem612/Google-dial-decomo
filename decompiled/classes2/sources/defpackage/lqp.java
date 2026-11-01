package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lqp extends ahao {
    private static final aimz a = aimz.i("com/android/dialer/conference/impl/ui/ChildCallViewBinder");
    private final android.content.Context b;
    private final ops c;
    private final zpm d;
    private final ipc e;

    public lqp(android.content.Context context, ops opsVar, ipc ipcVar, zpm zpmVar) {
        this.b = context;
        this.c = opsVar;
        this.e = ipcVar;
        this.d = zpmVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624093, viewGroup, false);
    }

    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.lqi lqiVar = (defpackage.lqi) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427717);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427797);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427794);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(2131427795);
        android.view.View viewFindViewById = view.findViewById(2131427793);
        android.view.View viewFindViewById2 = view.findViewById(2131427796);
        abwd abwdVar = lqiVar.k;
        if (abwdVar == null) {
            abwdVar = abwd.a;
        }
        this.c.f(imageView, abwdVar, false);
        if (lqiVar.d) {
            android.content.Context context = this.b;
            textView.setText(android.text.TextUtils.concat(context.getText(2132017738).toString(), " • "));
            textView.setVisibility(0);
            textView2.setEnabled(false);
            textView3.setEnabled(false);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getResources().getValue(2131165504, typedValue, true);
            imageView.setAlpha(typedValue.getFloat());
        } else {
            textView.setVisibility(8);
            textView2.setEnabled(true);
            textView3.setEnabled(true);
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            this.b.getResources().getValue(2131165503, typedValue2, true);
            imageView.setAlpha(typedValue2.getFloat());
        }
        if (lqiVar.e) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new defpackage.jjg(this, lqiVar, 5));
        } else {
            viewFindViewById.setVisibility(8);
        }
        if (lqiVar.f) {
            viewFindViewById2.setVisibility(0);
            viewFindViewById2.setOnClickListener(new defpackage.jjg(this, lqiVar, 6));
        } else {
            viewFindViewById2.setVisibility(8);
        }
        if ((lqiVar.b & 32) != 0) {
            java.lang.String str = lqiVar.h;
            textView2.setVisibility(0);
            textView2.setText(str);
            viewFindViewById.setContentDescription(this.b.getString(2132018083, str));
        } else {
            textView2.setVisibility(8);
        }
        if ((lqiVar.b & 128) == 0 || lqiVar.i || lqiVar.g) {
            textView3.setVisibility(8);
            return;
        }
        java.lang.CharSequence charSequenceAp = this.e.ap(defpackage.dxt.a().d(lqiVar.j, defpackage.dxv.a));
        textView3.setVisibility(0);
        textView3.setText(charSequenceAp);
        if ((lqiVar.b & 32) == 0) {
            viewFindViewById.setContentDescription(this.b.getString(2132018083, charSequenceAp));
        }
    }

    public final j$.util.Optional d(java.lang.String str) {
        j$.util.Optional optionalE = this.d.e(str);
        return !optionalE.isPresent() ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.lqo) ((apqr) optionalE.orElseThrow()).a(defpackage.lqo.class)).cq());
    }

    public final void e(java.lang.String str, qbc qbcVar) {
        j$.util.Optional optionalE = this.d.e(str);
        if (optionalE.isPresent()) {
            ((defpackage.lqo) ((apqr) optionalE.orElseThrow()).a(defpackage.lqo.class)).cp().c(qbcVar);
        } else {
            a.bI(a.c().m(aioa.b), "Operation attempted on call scope that no longer exists", "com/android/dialer/conference/impl/ui/ChildCallViewBinder", "logImpressionOnceOnChildCall", (char) 187, "ChildCallViewBinder.java", zct.b);
        }
    }
}

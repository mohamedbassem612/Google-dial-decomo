package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mai implements defpackage.abyf {
    public final defpackage.mab a;
    private final ahpz b;

    public mai(defpackage.mab mabVar, ahpz ahpzVar) {
        aooh.f(mabVar, "integration");
        aooh.f(ahpzVar, "traceCreation");
        this.a = mabVar;
        this.b = ahpzVar;
    }

    private static final void c(android.widget.TextView textView, defpackage.mae maeVar) {
        if (maeVar == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(maeVar.a);
        textView.setTextAppearance(maeVar.b);
    }

    @Override // defpackage.abyf
    public final /* synthetic */ abya a(java.lang.Object obj) {
        defpackage.maf mafVar = (defpackage.maf) obj;
        defpackage.mac macVarA = this.a.a(mafVar);
        if (macVarA != null) {
            return new defpackage.mah(macVarA, mafVar);
        }
        return null;
    }

    @Override // defpackage.abyf
    public final /* synthetic */ void b(android.view.View view, abya abyaVar) {
        defpackage.mah mahVar = (defpackage.mah) abyaVar;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427650);
        aooh.c(textView);
        c(textView, mahVar != null ? mahVar.a.a : null);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427649);
        defpackage.mae maeVar = mahVar != null ? mahVar.a.b : null;
        aooh.c(textView2);
        c(textView2, maeVar);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427648);
        aooh.c(imageView);
        defpackage.maa maaVar = mahVar != null ? mahVar.a.c : null;
        if (maaVar != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(maaVar.a);
            java.lang.Integer num = maaVar.b;
            if (num != null) {
                imageView.setImageTintList(android.content.res.ColorStateList.valueOf(num.intValue()));
            }
        } else {
            imageView.setImageTintList(null);
            imageView.setVisibility(8);
        }
        da$.ExternalSyntheticApiModelOutline1.m(view, 1);
        if (mahVar == null || !mahVar.a.d) {
            view.setOnClickListener(null);
            view.setClickable(false);
        } else {
            this.a.c();
            view.setOnClickListener(new ahpp(this.b, 332, "call_details_feature_integration_clicked", new defpackage.knj(this, view, mahVar, 2, (byte[]) null), 0));
            view.setClickable(true);
        }
    }
}

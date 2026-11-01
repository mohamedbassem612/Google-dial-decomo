package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wuc extends defpackage.ahao {
    private static final android.widget.TextView d(android.view.View view) {
        int i = dzs.a;
        return (android.widget.TextView) dzo.b(view, 2131428800);
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624723, viewGroup, false);
        aooh.c(viewInflate);
        d(viewInflate).setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return viewInflate;
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        aooh.f(view, "view");
        aooh.f(wlfVar, "data");
        defpackage.wmx wmxVar = wlfVar.c == 4 ? (defpackage.wmx) wlfVar.d : defpackage.wmx.a;
        aooh.e(wmxVar, "getRibbon(...)");
        android.widget.TextView textViewD = d(view);
        aooh.c(textViewD);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(textViewD.getContext().getText(wmxVar.c));
        if ((wmxVar.b & 4) != 0) {
            defpackage.wmw wmwVar = wmxVar.e;
            if (wmwVar == null) {
                wmwVar = defpackage.wmw.a;
            }
            if ((wmwVar.b & 1) == 0) {
                throw new java.lang.IllegalArgumentException("Follow up `textRes` missing");
            }
            defpackage.wmw wmwVar2 = wmxVar.e;
            if (wmwVar2 == null) {
                wmwVar2 = defpackage.wmw.a;
            }
            if ((wmwVar2.b & 2) == 0) {
                throw new java.lang.IllegalArgumentException("Follow up `action` missing");
            }
            android.content.Context context = textViewD.getContext();
            defpackage.wmw wmwVar3 = wmxVar.e;
            if (wmwVar3 == null) {
                wmwVar3 = defpackage.wmw.a;
            }
            java.lang.CharSequence text = context.getText(wmwVar3.c);
            aooh.e(text, "getText(...)");
            if (aoov.H(text)) {
                throw new java.lang.IllegalArgumentException("Follow up text is blank");
            }
            spannableStringBuilder.append(' ');
            defpackage.wmw wmwVar4 = wmxVar.e;
            if (wmwVar4 == null) {
                wmwVar4 = defpackage.wmw.a;
            }
            defpackage.wmv wmvVarB = defpackage.wmv.b(wmwVar4.d);
            if (wmvVarB == null) {
                wmvVarB = defpackage.wmv.UNSPECIFIED;
            }
            defpackage.wub wubVar = new defpackage.wub(wmvVarB);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(text);
            spannableStringBuilder.setSpan(wubVar, length, spannableStringBuilder.length(), 17);
        }
        textViewD.setText(new android.text.SpannedString(spannableStringBuilder));
        int i = dzs.a;
        android.widget.ImageView imageView = (android.widget.ImageView) dzo.b(view, 2131428799);
        if ((wmxVar.b & 2) == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(wmxVar.d);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsa extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624712, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        int i = 3;
        defpackage.whc whcVar = wlfVar.c == 3 ? (defpackage.whc) wlfVar.d : defpackage.whc.a;
        ((android.widget.ImageView) view.findViewById(2131427542)).setImageResource(whcVar.g);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427545);
        int i2 = whcVar.c;
        if (i2 != 0) {
            if (i2 != 4) {
                i = i2 != 5 ? 0 : 2;
            } else {
                i = 1;
            }
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            textView.setText(i2 == 4 ? ((java.lang.Integer) whcVar.d).intValue() : 0);
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("invalid text banner type");
            }
            defpackage.whb whbVar = i2 == 5 ? (defpackage.whb) whcVar.d : defpackage.whb.a;
            textView.setText(android.text.TextUtils.expandTemplate(textView.getContext().getText(whbVar.c), (java.lang.CharSequence[]) whbVar.d.toArray(new java.lang.CharSequence[0])));
        }
        int iAQ = a.aQ(whcVar.f);
        if (iAQ == 0) {
            iAQ = 1;
        }
        if (iAQ - 1 != 1) {
            view.setActivated(false);
        } else {
            view.setActivated(true);
        }
    }
}

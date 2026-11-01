package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghm extends dye {
    final /* synthetic */ com.google.android.setupdesign.items.RadioButtonItem a;

    public aghm(com.google.android.setupdesign.items.RadioButtonItem radioButtonItem) {
        j$.util.Objects.requireNonNull(radioButtonItem);
        this.a = radioButtonItem;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.s("android.widget.RadioButton");
        ebdVar.q(true);
        com.google.android.setupdesign.items.RadioButtonItem radioButtonItem = this.a;
        ebdVar.r(radioButtonItem.b);
        java.lang.CharSequence charSequence = radioButtonItem.e;
        java.lang.CharSequence charSequence2 = radioButtonItem.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
        }
        if (!android.text.TextUtils.isEmpty(charSequence2)) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(charSequence2);
        }
        if (sb.length() > 0) {
            ebdVar.R(sb.toString());
        }
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 16) {
            if (!this.a.b) {
                view.performClick();
                return true;
            }
            i = 16;
        }
        return super.i(view, i, bundle);
    }
}

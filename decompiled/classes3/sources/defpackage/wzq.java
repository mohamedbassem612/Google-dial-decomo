package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzq extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624286, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        ahvr.bM(((defpackage.uva) obj).c == 3);
        android.text.SpannableString spannableString = new android.text.SpannableString(view.getContext().getString(2132017401));
        spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
        ((android.widget.TextView) view.findViewById(2131428559)).setText(android.text.TextUtils.expandTemplate(view.getContext().getResources().getText(2132017400), spannableString));
    }
}

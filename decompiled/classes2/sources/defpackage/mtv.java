package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtv extends ahao {
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624165, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        uva uvaVar = (uva) obj;
        aooh.f(view, "view");
        aooh.f(uvaVar, "data");
        int i = uvaVar.c;
        if (i != 13) {
            throw new java.lang.IllegalArgumentException("wrong type of TranscriptData");
        }
        uui uuiVar = i == 13 ? (uui) uvaVar.d : uui.a;
        aooh.e(uuiVar, "getDobbyBotMessage(...)");
        ((android.widget.TextView) view.findViewById(2131428033)).setText(uuiVar.c);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428034);
        android.content.Context context = view.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView.setText(android.text.format.DateUtils.formatDateTime(context, alcfVar.b * 1000, 1));
    }
}

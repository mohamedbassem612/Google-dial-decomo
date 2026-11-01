package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mub extends ahao {
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624171, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        uva uvaVar = (uva) obj;
        aooh.f(view, "view");
        aooh.f(uvaVar, "data");
        if (uvaVar.c != 14) {
            throw new java.lang.IllegalArgumentException("wrong type of TranscriptData");
        }
        ((android.widget.TextView) view.findViewById(2131428048)).setText((uvaVar.c == 14 ? (uuk) uvaVar.d : uuk.a).c);
    }
}

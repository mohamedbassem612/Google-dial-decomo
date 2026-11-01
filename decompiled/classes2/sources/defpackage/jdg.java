package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdg extends ahao {
    private final ops a;

    public jdg(ops opsVar) {
        aooh.f(opsVar, "glidePhotoManager");
        this.a = opsVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624032, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        uva uvaVar = (uva) obj;
        aooh.f(view, "view");
        aooh.f(uvaVar, "data");
        if (uvaVar.c != 22) {
            throw new java.lang.IllegalArgumentException("wrong type of TranscriptData");
        }
        android.view.View viewFindViewById = view.findViewById(2131427554);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
        uud uudVar = uvaVar.c == 22 ? (uud) uvaVar.d : uud.a;
        aooh.e(uudVar, "getBeeslyTranscript(...)");
        if ((uudVar.b & 2) != 0) {
            ops opsVar = this.a;
            abwd abwdVar = uudVar.d;
            if (abwdVar == null) {
                abwdVar = abwd.a;
            }
            opsVar.f(imageView, abwdVar, false);
        }
        ((android.widget.TextView) view.findViewById(2131427555)).setText(uudVar.c);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427556);
        android.content.Context context = view.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView.setText(android.text.format.DateUtils.formatDateTime(context, aldi.b(alcfVar), 1));
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtw extends ahao {
    private final ops a;
    private final kaw b;

    public mtw(ops opsVar, kaw kawVar) {
        aooh.f(opsVar, "glidePhotoManager");
        this.a = opsVar;
        this.b = kawVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624167, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        java.lang.CharSequence charSequenceB;
        uva uvaVar = (uva) obj;
        aooh.f(view, "view");
        aooh.f(uvaVar, "data");
        if (uvaVar.c != 12) {
            throw new java.lang.IllegalArgumentException("wrong type of TranscriptData");
        }
        android.view.View viewFindViewById = view.findViewById(2131428039);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
        uuj uujVar = uvaVar.c == 12 ? (uuj) uvaVar.d : uuj.a;
        aooh.e(uujVar, "getDobbyCallerTranscript(...)");
        if ((uujVar.b & 2) != 0) {
            ops opsVar = this.a;
            abwd abwdVar = uujVar.d;
            if (abwdVar == null) {
                abwdVar = abwd.a;
            }
            opsVar.f(imageView, abwdVar, false);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428040);
        if (uujVar.e) {
            kaw kawVar = this.b;
            java.lang.String str = uujVar.c;
            aooh.e(str, "getText(...)");
            charSequenceB = kawVar.B(str);
        } else {
            charSequenceB = uujVar.c;
        }
        textView.setText(charSequenceB);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131428041);
        android.content.Context context = view.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView2.setText(android.text.format.DateUtils.formatDateTime(context, alcfVar.b * 1000, 1));
    }
}

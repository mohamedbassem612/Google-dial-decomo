package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtu extends ahao {
    public final rlv a;
    private final android.content.Context b;
    private final defpackage.ksg c;
    private final aoin d;

    public mtu(android.content.Context context, defpackage.ksg ksgVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.b = context;
        this.c = ksgVar;
        this.a = rlvVar;
        this.d = aoinVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624027, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.kqy kqyVar;
        uva uvaVar = (uva) obj;
        aooh.f(view, "view");
        aooh.f(uvaVar, "data");
        uuc uucVar = uvaVar.c == 21 ? (uuc) uvaVar.d : uuc.a;
        if (uucVar == null) {
            kqyVar = null;
        } else {
            defpackage.kor korVar = uucVar.c;
            if (korVar == null) {
                korVar = defpackage.kor.a;
            }
            if (korVar != null) {
                kqyVar = korVar.b == 1 ? (defpackage.kqy) korVar.c : defpackage.kqy.a;
            } else {
                kqyVar = null;
            }
        }
        if (kqyVar == null || kqyVar.c.size() == 0) {
            return;
        }
        defpackage.ksg ksgVar = this.c;
        defpackage.kor korVar2 = (uvaVar.c == 21 ? (uuc) uvaVar.d : uuc.a).c;
        if (korVar2 == null) {
            korVar2 = defpackage.kor.a;
        }
        aooh.e(korVar2, "getCallActionsState(...)");
        defpackage.krp krpVarA = ksgVar.a(korVar2);
        java.lang.String string = this.b.getString(2132017529);
        aooh.e(string, "getString(...)");
        defpackage.krx krxVar = new defpackage.krx(new defpackage.ksj(string, 2132017528), new defpackage.ksm("", null), krpVarA, null);
        androidx.compose.ui.platform.ComposeView composeViewFindViewById = view.findViewById(2131427640);
        if (!((java.lang.Boolean) this.d.a()).booleanValue()) {
            composeViewFindViewById.k(dgi.a);
        }
        composeViewFindViewById.a(new cja(1108795111, true, new defpackage.ata((java.lang.Object) krxVar, (java.lang.Object) view, (java.lang.Object) this, 11, (byte[]) null)));
    }
}

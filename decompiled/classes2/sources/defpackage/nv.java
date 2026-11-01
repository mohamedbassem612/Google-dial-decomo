package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nv {
    public static final /* synthetic */ int a = 0;
    private static final cbd b = new cbn(cdu.c, new nu(0));

    public static final nh a(cav cavVar) {
        cbt cbtVar;
        cbt cbtVar2;
        nh nhVar = (nh) cavVar.e(b);
        android.content.Context context = null;
        if (nhVar == null) {
            cavVar.u(1208426157);
            android.view.View view = (android.view.View) cavVar.e(dep.f);
            aooh.f(view, "<this>");
            while (true) {
                if (view == null) {
                    nhVar = null;
                    break;
                }
                java.lang.Object tag = view.getTag(2131429436);
                nh nhVar2 = tag instanceof nh ? (nh) tag : null;
                if (nhVar2 != null) {
                    nhVar = nhVar2;
                    break;
                }
                java.lang.Object objD = dzp.d(view);
                view = objD instanceof android.view.View ? (android.view.View) objD : null;
            }
            cbtVar = (cbt) cavVar;
        } else {
            cavVar.u(1208423708);
            cbtVar = (cbt) cavVar;
        }
        cbtVar.W(false);
        if (nhVar == null) {
            cavVar.u(1208428160);
            for (android.content.Context baseContext = (android.content.Context) cavVar.e(dep.b); baseContext instanceof android.content.ContextWrapper; baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof nh) {
                    context = baseContext;
                    break;
                }
            }
            nhVar = (nh) context;
            cbtVar2 = (cbt) cavVar;
        } else {
            cavVar.u(1208423789);
            cbtVar2 = (cbt) cavVar;
        }
        cbtVar2.W(false);
        return nhVar;
    }
}

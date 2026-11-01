package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjm implements defpackage.abyf {
    private final android.content.Context a;
    private final aoin b;

    public kjm(android.content.Context context, aazc aazcVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "enableCallLogInCompose");
        this.a = context;
        this.b = aoinVar;
    }

    @Override // defpackage.abyf
    public final /* synthetic */ abya a(java.lang.Object obj) {
        kiu kiuVar = ((defpackage.klb) obj).a;
        defpackage.kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        int size = kisVar.b.size();
        if (size == 1) {
            return null;
        }
        aopq aopqVar = new aopq(1, java.lang.Math.min(size - 1, 5));
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aopqVar, 10));
        aopp aoppVarA = aopqVar.a();
        while (aoppVarA.a) {
            int iA = aoppVarA.a();
            defpackage.kis kisVar2 = kiuVar.u;
            if (kisVar2 == null) {
                kisVar2 = defpackage.kis.a;
            }
            arrayList.add(new defpackage.kjn(kisVar2.d.a(iA)));
        }
        return new defpackage.kjj(arrayList, kiuVar.q);
    }

    @Override // defpackage.abyf
    public final /* bridge */ /* synthetic */ void b(android.view.View view, abya abyaVar) {
        defpackage.kjj kjjVar = (defpackage.kjj) abyaVar;
        android.view.View viewFindViewById = view.findViewById(2131427949);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            frameLayout.removeAllViews();
            android.content.Context context = view.getContext();
            aooh.e(context, "getContext(...)");
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
            frameLayout.addView(composeView);
            if (kjjVar != null) {
                composeView.a(new cja(-654099350, true, new defpackage.dqv(kjjVar, this, 12, null)));
                return;
            } else {
                composeView.a(defpackage.kjh.a);
                return;
            }
        }
        androidx.compose.ui.platform.ComposeView childAt = frameLayout.getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView2 = childAt instanceof androidx.compose.ui.platform.ComposeView ? childAt : null;
        if (kjjVar == null) {
            if (composeView2 != null) {
                composeView2.g();
                frameLayout.removeAllViews();
                return;
            }
            return;
        }
        if (composeView2 == null) {
            frameLayout.removeAllViews();
            android.content.Context context2 = view.getContext();
            aooh.e(context2, "getContext(...)");
            androidx.compose.ui.platform.ComposeView composeView3 = new androidx.compose.ui.platform.ComposeView(context2, (android.util.AttributeSet) null, 0, 6, (aooc) null);
            frameLayout.addView(composeView3);
            composeView2 = composeView3;
        }
        composeView2.a(new cja(-1918000173, true, new defpackage.dqv(kjjVar, this, 11, null)));
    }

    public final defpackage.kjk c(long j) {
        return new defpackage.kjk(defpackage.hgu.r(this.a, j$.time.Instant.now().toEpochMilli(), j, true).toString());
    }
}

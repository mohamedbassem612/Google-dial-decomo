package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyk extends defpackage.ahao {
    private final ahbv a;

    public vyk(ahbv ahbvVar) {
        this.a = ahbvVar;
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624708, viewGroup, false);
        aooh.d(viewInflate, "null cannot be cast to non-null type com.android.dialer.voicemail.tab.impl.ui.VoicemailTwoColumnEntryView");
        return (com.android.dialer.voicemail.tab.impl.ui.VoicemailTwoColumnEntryView) viewInflate;
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        com.android.dialer.voicemail.tab.impl.ui.VoicemailTwoColumnEntryView voicemailTwoColumnEntryView = (com.android.dialer.voicemail.tab.impl.ui.VoicemailTwoColumnEntryView) view;
        defpackage.vyj vyjVar = (defpackage.vyj) obj;
        aooh.f(voicemailTwoColumnEntryView, "view");
        aooh.f(vyjVar, "model");
        defpackage.aglm aglmVarY = voicemailTwoColumnEntryView.y();
        aooh.f(vyjVar, "model");
        defpackage.uzo uzoVar = vyjVar.a;
        kiu kiuVar = uzoVar.d;
        if (kiuVar == null) {
            kiuVar = kiu.a;
        }
        aooh.e(kiuVar, "getCoalescedRow(...)");
        java.lang.Object obj2 = aglmVarY.k;
        java.lang.Object obj3 = aglmVarY.i;
        ((ops) obj2).h((android.widget.QuickContactBadge) obj3, (defpackage.abwd) ((gpd) aglmVarY.j).a(kiuVar, 1).p(), false);
        ((android.view.View) obj3).setVisibility(true != defpackage.aglm.a(vyjVar) ? 0 : 8);
        ((android.view.View) aglmVarY.h).setVisibility(true != defpackage.aglm.a(vyjVar) ? 8 : 0);
        android.widget.TextView textView = (android.widget.TextView) aglmVarY.g;
        textView.setText(((aeqx) aglmVarY.e).d(kiuVar, true));
        java.lang.Object obj4 = aglmVarY.f;
        java.lang.Object obj5 = aglmVarY.l;
        kiu kiuVar2 = uzoVar.d;
        if (kiuVar2 == null) {
            kiuVar2 = kiu.a;
        }
        long j = kiuVar2.e;
        defpackage.uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = defpackage.uzn.a;
        }
        defpackage.vxz vxzVar = (defpackage.vxz) obj5;
        android.widget.TextView textView2 = (android.widget.TextView) obj4;
        textView2.setText(vxzVar.a(j, uznVar.g));
        java.lang.Object obj6 = aglmVarY.b;
        defpackage.uzn uznVar2 = uzoVar.c;
        if (uznVar2 == null) {
            uznVar2 = defpackage.uzn.a;
        }
        java.lang.String str = uznVar2.d;
        aooh.e(str, "getTranscription(...)");
        ((android.widget.TextView) obj6).setText(aoov.x(str).toString());
        java.lang.Object obj7 = aglmVarY.c;
        kiu kiuVar3 = uzoVar.d;
        if (kiuVar3 == null) {
            kiuVar3 = kiu.a;
        }
        kit kitVarB = kit.b(kiuVar3.v);
        if (kitVarB == null) {
            kitVarB = kit.a;
        }
        vxzVar.d((android.widget.TextView) obj7, kitVarB);
        kiu kiuVar4 = uzoVar.d;
        if (kiuVar4 == null) {
            kiuVar4 = kiu.a;
        }
        vxzVar.c(textView, textView2, kiuVar4.j);
        java.lang.Object obj8 = aglmVarY.a;
        android.view.View view2 = (android.view.View) aglmVarY.d;
        ((androidx.cardview.widget.CardView) obj8).c(urg.c(view2.getContext(), 2130969011));
        ((com.google.android.material.card.MaterialCardView) obj8).setActivated(vyjVar.c != defpackage.vyi.a);
        ((ajwr) aglmVarY.m).g(view2, new defpackage.vxv(kiuVar.d));
        view2.setOnLongClickListener(new lmf(kiuVar, 8));
        com.google.android.material.card.MaterialCardView materialCardView = (com.google.android.material.card.MaterialCardView) voicemailTwoColumnEntryView.findViewById(2131429500);
        ahbv ahbvVar = this.a;
        aooh.c(materialCardView);
        defpackage.vxy vxyVar = vyjVar.f;
        ahbvVar.C(materialCardView, new inx(vxyVar.a, vxyVar.b));
        if (materialCardView.isActivated()) {
            materialCardView.c(dwm.h(urg.c(voicemailTwoColumnEntryView.getContext(), 2130969114), 40));
        }
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void f(android.view.View view) {
        aooh.f((com.android.dialer.voicemail.tab.impl.ui.VoicemailTwoColumnEntryView) view, "view");
    }
}

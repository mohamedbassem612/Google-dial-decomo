package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxf implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.vxq a;

    public /* synthetic */ vxf(defpackage.vxq vxqVar) {
        this.a = vxqVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.vxq vxqVar = this.a;
        defpackage.vtx vtxVar = (defpackage.vtx) obj;
        vxqVar.u(j$.util.Optional.empty());
        if (vxqVar.y()) {
            android.widget.ImageView imageView = (android.widget.ImageView) vxqVar.d.N().findViewById(2131428141);
            imageView.setImageResource(2131231152);
            imageView.setVisibility(0);
            j$.util.Optional optionalE = vxqVar.e();
            if (optionalE.isPresent()) {
                ((com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView) optionalE.orElseThrow()).y().a(null);
                return;
            }
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) vxqVar.d.N().findViewById(2131428304);
        frameLayout.setVisibility(0);
        com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView = (com.android.dialer.widget.errorcontentview.ErrorContentView) frameLayout.findViewById(2131428139);
        if (errorContentView != null) {
            akzx akzxVarM = defpackage.wei.a.m();
            java.lang.String str = vtxVar.d;
            akzxVarM.u();
            defpackage.wei weiVar = (defpackage.wei) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            weiVar.b |= 1;
            weiVar.d = str;
            java.lang.String str2 = vtxVar.e;
            akzxVarM.u();
            defpackage.wei weiVar2 = (defpackage.wei) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            weiVar2.c = str2;
            java.lang.String str3 = vtxVar.j;
            akzxVarM.u();
            defpackage.wei weiVar3 = (defpackage.wei) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            weiVar3.g = str3;
            defpackage.weh wehVar = defpackage.weh.a;
            akzx akzxVarM2 = wehVar.m();
            defpackage.vtw vtwVar = vtxVar.f;
            if (vtwVar == null) {
                vtwVar = defpackage.vtw.a;
            }
            java.lang.String str4 = vtwVar.d;
            akzxVarM2.u();
            defpackage.weh wehVar2 = (defpackage.weh) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str4);
            wehVar2.b = str4;
            akzxVarM.u();
            defpackage.wei weiVar4 = (defpackage.wei) akzxVarM.b;
            defpackage.weh wehVar3 = (defpackage.weh) akzxVarM2.p();
            j$.util.Objects.requireNonNull(wehVar3);
            weiVar4.e = wehVar3;
            weiVar4.b |= 2;
            akzx akzxVarM3 = wehVar.m();
            defpackage.vtw vtwVar2 = vtxVar.g;
            if (vtwVar2 == null) {
                vtwVar2 = defpackage.vtw.a;
            }
            java.lang.String str5 = vtwVar2.d;
            akzxVarM3.u();
            defpackage.weh wehVar4 = (defpackage.weh) akzxVarM3.b;
            j$.util.Objects.requireNonNull(str5);
            wehVar4.b = str5;
            akzxVarM.u();
            defpackage.wei weiVar5 = (defpackage.wei) akzxVarM.b;
            defpackage.weh wehVar5 = (defpackage.weh) akzxVarM3.p();
            j$.util.Objects.requireNonNull(wehVar5);
            weiVar5.f = wehVar5;
            weiVar5.b |= 4;
            errorContentView.y().a((defpackage.wei) akzxVarM.p());
            return;
        }
        defpackage.ahey aheyVar = vxqVar.c;
        akzx akzxVarM4 = defpackage.wei.a.m();
        java.lang.String str6 = vtxVar.d;
        akzxVarM4.u();
        defpackage.wei weiVar6 = (defpackage.wei) akzxVarM4.b;
        j$.util.Objects.requireNonNull(str6);
        weiVar6.b |= 1;
        weiVar6.d = str6;
        java.lang.String str7 = vtxVar.e;
        akzxVarM4.u();
        defpackage.wei weiVar7 = (defpackage.wei) akzxVarM4.b;
        j$.util.Objects.requireNonNull(str7);
        weiVar7.c = str7;
        java.lang.String str8 = vtxVar.j;
        akzxVarM4.u();
        defpackage.wei weiVar8 = (defpackage.wei) akzxVarM4.b;
        j$.util.Objects.requireNonNull(str8);
        weiVar8.g = str8;
        defpackage.weh wehVar6 = defpackage.weh.a;
        akzx akzxVarM5 = wehVar6.m();
        defpackage.vtw vtwVar3 = vtxVar.f;
        if (vtwVar3 == null) {
            vtwVar3 = defpackage.vtw.a;
        }
        java.lang.String str9 = vtwVar3.d;
        akzxVarM5.u();
        defpackage.weh wehVar7 = (defpackage.weh) akzxVarM5.b;
        j$.util.Objects.requireNonNull(str9);
        wehVar7.b = str9;
        akzxVarM4.u();
        defpackage.wei weiVar9 = (defpackage.wei) akzxVarM4.b;
        defpackage.weh wehVar8 = (defpackage.weh) akzxVarM5.p();
        j$.util.Objects.requireNonNull(wehVar8);
        weiVar9.e = wehVar8;
        weiVar9.b |= 2;
        akzx akzxVarM6 = wehVar6.m();
        defpackage.vtw vtwVar4 = vtxVar.g;
        if (vtwVar4 == null) {
            vtwVar4 = defpackage.vtw.a;
        }
        java.lang.String str10 = vtwVar4.d;
        akzxVarM6.u();
        defpackage.weh wehVar9 = (defpackage.weh) akzxVarM6.b;
        j$.util.Objects.requireNonNull(str10);
        wehVar9.b = str10;
        akzxVarM4.u();
        defpackage.wei weiVar10 = (defpackage.wei) akzxVarM4.b;
        defpackage.weh wehVar10 = (defpackage.weh) akzxVarM6.p();
        j$.util.Objects.requireNonNull(wehVar10);
        weiVar10.f = wehVar10;
        weiVar10.b |= 4;
        defpackage.wei weiVar11 = (defpackage.wei) akzxVarM4.p();
        aooh.f(weiVar11, "initialModel");
        com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView2 = new com.android.dialer.widget.errorcontentview.ErrorContentView(aheyVar);
        errorContentView2.y().a(weiVar11);
        errorContentView2.setId(2131428139);
        frameLayout.addView(errorContentView2);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

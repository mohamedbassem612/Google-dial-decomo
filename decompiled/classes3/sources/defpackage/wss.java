package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wss {
    private static final aimz a = aimz.i("com/android/dialer/xatu/impl/ui/XatuDtmfOptionViewPeer");
    private final com.android.dialer.xatu.impl.ui.XatuDtmfOptionView b;
    private final aoin c;
    private final aoir d;
    private final aoir e;
    private final ajwr f;
    private final defpackage.zlr g;

    public wss(defpackage.ahey aheyVar, com.android.dialer.xatu.impl.ui.XatuDtmfOptionView xatuDtmfOptionView, ajwr ajwrVar, defpackage.zlr zlrVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableLowConfidenceLabel");
        this.b = xatuDtmfOptionView;
        this.f = ajwrVar;
        this.g = zlrVar;
        this.c = aoinVar;
        this.d = aooc.ag(new defpackage.wsn(aheyVar, 0));
        this.e = aooc.ag(new defpackage.wsn(aheyVar, 2));
        xatuDtmfOptionView.setOrientation(1);
        android.view.LayoutInflater.from(aheyVar).inflate(2131624718, (android.view.ViewGroup) xatuDtmfOptionView, true);
    }

    private final android.view.View b() {
        int i = dzs.a;
        return (android.view.View) dzo.b(this.b, 2131427853);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(wsc wscVar) throws aois {
        defpackage.wnb wnbVar;
        boolean z;
        ahth wsrVar;
        int iC = wsc.c(wscVar);
        if (iC == 0) {
            wnbVar = ((defpackage.wsp) wscVar).a;
        } else {
            if (iC != 1) {
                throw new aois();
            }
            wnbVar = ((defpackage.wso) wscVar).a;
        }
        android.text.Spannable spannableF = this.g.f(wnbVar.c, wnbVar.g, true);
        boolean zAnyMatch = j$.util.Collection.-EL.stream(wnbVar.g).anyMatch(new vpl(new ukw(17), 14));
        com.android.dialer.xatu.impl.ui.XatuDtmfOptionView xatuDtmfOptionView = this.b;
        int i = dzs.a;
        ((android.widget.TextView) dzo.b(xatuDtmfOptionView, 2131429350)).setText(spannableF);
        java.lang.Object objB = dzo.b(xatuDtmfOptionView, 2131429349);
        aooh.c(objB);
        ((android.view.View) objB).setVisibility((wnbVar.d && ((java.lang.Boolean) this.c.a()).booleanValue()) ? 0 : 8);
        android.widget.TextView textView = (android.widget.TextView) dzo.b(xatuDtmfOptionView, 2131429344);
        textView.setText(wnbVar.f);
        int iIntValue = wnbVar.f.length() > 1 ? ((java.lang.Number) this.d.a()).intValue() : 0;
        int iIntValue2 = wnbVar.f.length() > 1 ? ((java.lang.Number) this.e.a()).intValue() : 0;
        textView.setPadding(iIntValue, iIntValue2, iIntValue, iIntValue2);
        aooh.c(textView);
        int iAN = a.aN(wnbVar.e);
        textView.setVisibility((iAN == 0 || iAN != 4) ? 0 : 4);
        textView.setTypeface(textView.getTypeface(), zAnyMatch ? 1 : 0);
        android.widget.ImageView imageView = (android.widget.ImageView) dzo.b(xatuDtmfOptionView, 2131428366);
        aooh.c(imageView);
        int iAN2 = a.aN(wnbVar.e);
        imageView.setVisibility((iAN2 == 0 || iAN2 != 4) ? 8 : 0);
        android.view.View viewB = b();
        int iAN3 = a.aN(wnbVar.e);
        viewB.setSelected(iAN3 != 0 && iAN3 == 4);
        int iAN4 = a.aN(wnbVar.e);
        viewB.setEnabled(iAN4 == 0 || iAN4 != 3);
        int iAN5 = a.aN(wnbVar.e);
        if (iAN5 == 0 || iAN5 != 2) {
            viewB.setClickable(false);
        } else {
            ajwr ajwrVar = this.f;
            int iC2 = wsc.c(wscVar);
            if (iC2 == 0) {
                defpackage.wsp wspVar = (defpackage.wsp) wscVar;
                defpackage.wnb wnbVar2 = wspVar.a;
                java.lang.String str = wnbVar2.f;
                aooh.e(str, "getDtmfTones(...)");
                long j = wspVar.b;
                alat alatVar = wnbVar2.g;
                aooh.e(alatVar, "getAnnotationsList(...)");
                if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                    java.util.Iterator it = alatVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        int iO = wsc.O(((defpackage.wke) it.next()).e);
                        if (iO == 0) {
                            iO = 1;
                        }
                        if (iO == 5) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                wsrVar = new defpackage.wsr(str, j, z);
            } else {
                if (iC2 != 1) {
                    throw new aois();
                }
                wsrVar = defpackage.wsq.a;
            }
            ajwrVar.g(viewB, wsrVar);
        }
        android.widget.TextView textView2 = (android.widget.TextView) dzo.b(xatuDtmfOptionView, 2131429345);
        aooh.c(textView2);
        defpackage.wna wnaVar = wnbVar.h;
        if (wnaVar == null) {
            wnaVar = defpackage.wna.a;
        }
        textView2.setVisibility(true == wnaVar.c ? 0 : 8);
        int iAN6 = a.aN(wnbVar.e);
        textView2.setEnabled(iAN6 == 0 || iAN6 != 3);
        defpackage.wna wnaVar2 = wnbVar.h;
        boolean z2 = (wnaVar2 == null ? defpackage.wna.a : wnaVar2).d;
        int i2 = true != z2 ? 2131232261 : 2131232259;
        int i3 = true != z2 ? 2131232260 : 2131232262;
        if (wnaVar2 == null) {
            wnaVar2 = defpackage.wna.a;
        }
        if (true == wnaVar2.e) {
            i2 = i3;
        }
        b().setBackgroundResource(i2);
        int iAN7 = a.aN(wnbVar.e);
        if (iAN7 == 0 || iAN7 == 1) {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/xatu/impl/ui/XatuDtmfOptionViewPeer", "bind", 141, "XatuDtmfOptionViewPeer.kt").v("XatuDtmfOptionState must be specified");
        }
    }
}

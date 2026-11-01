package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tys {
    private static final aimz b = aimz.i("com/android/dialer/sodatranscription/statusbanner/SodaStatusBannerViewPeer");
    public defpackage.tyw a;
    private final androidx.constraintlayout.widget.ConstraintLayout c;
    private final android.widget.ImageView d;
    private final android.widget.ImageView e;
    private final android.widget.ProgressBar f;
    private final android.widget.TextView g;
    private final android.widget.TextView h;
    private final defpackage.tyx i;

    public tys(defpackage.tyx tyxVar) {
        this.i = tyxVar;
        defpackage.tyx.inflate(tyxVar.getContext(), 2131624455, tyxVar);
        this.c = tyxVar.findViewById(2131428976);
        this.d = (android.widget.ImageView) tyxVar.findViewById(2131429030);
        this.e = (android.widget.ImageView) tyxVar.findViewById(2131429029);
        this.f = (android.widget.ProgressBar) tyxVar.findViewById(2131429032);
        this.g = (android.widget.TextView) tyxVar.findViewById(2131429033);
        this.h = (android.widget.TextView) tyxVar.findViewById(2131429028);
    }

    public static defpackage.tyx b(defpackage.ahey aheyVar, defpackage.tyw tywVar) {
        defpackage.tyx tyxVar = new defpackage.tyx(aheyVar);
        tyxVar.y().a(tywVar);
        return tyxVar;
    }

    private final void c(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            android.widget.TextView textView = this.h;
            textView.setText(2132020178);
            textView.setVisibility(0);
        } else {
            android.widget.TextView textView2 = this.h;
            if (i2 != 1) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(2132020176);
                textView2.setVisibility(0);
            }
        }
    }

    private final void d(int i) {
        this.d.setVisibility(i != 2 ? 8 : 0);
        this.e.setVisibility(i != 3 ? 8 : 0);
        this.f.setVisibility(i == 4 ? 0 : 8);
    }

    public final void a(defpackage.tyw tywVar) {
        ahvr.bM(!tywVar.e.isEmpty());
        ahvr.bM(!tywVar.c.isEmpty());
        this.a = tywVar;
        b.b().l("com/android/dialer/sodatranscription/statusbanner/SodaStatusBannerViewPeer", "setModel", 84, "SodaStatusBannerViewPeer.java").y("updating banner model to: %s", tywVar);
        defpackage.tyv tyvVarB = defpackage.tyv.b(tywVar.d);
        if (tyvVarB == null) {
            tyvVarB = defpackage.tyv.UNRECOGNIZED;
        }
        switch (tyvVarB.ordinal()) {
            case 0:
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                throw new java.lang.IllegalStateException("unrecognized statusbanner type");
            case 1:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.c;
                defpackage.tyx tyxVar = this.i;
                constraintLayout.setBackgroundColor(urg.c(tyxVar.getContext(), 2130968954));
                d(2);
                c(1);
                this.g.setText(tyxVar.getContext().getString(2132020181));
                return;
            case 2:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.c;
                defpackage.tyx tyxVar2 = this.i;
                constraintLayout2.setBackgroundColor(urg.c(tyxVar2.getContext(), 2130969107));
                d(4);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar2.getContext().getString(2132018678), tywVar.e));
                return;
            case 3:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.c;
                defpackage.tyx tyxVar3 = this.i;
                constraintLayout3.setBackgroundColor(urg.c(tyxVar3.getContext(), 2130969107));
                d(4);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar3.getContext().getString(2132020182), tywVar.c));
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.c;
                defpackage.tyx tyxVar4 = this.i;
                constraintLayout4.setBackgroundColor(urg.c(tyxVar4.getContext(), 2130969107));
                d(3);
                c(3);
                boolean z = tywVar.f;
                android.widget.TextView textView = this.g;
                if (z) {
                    textView.setText(android.text.TextUtils.expandTemplate(tyxVar4.getContext().getString(2132020180), tywVar.e));
                    return;
                } else {
                    textView.setText(tyxVar4.getContext().getString(2132020179));
                    return;
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.c;
                defpackage.tyx tyxVar5 = this.i;
                constraintLayout5.setBackgroundColor(urg.c(tyxVar5.getContext(), 2130968954));
                d(2);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar5.getContext().getString(2132020175), tywVar.e));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.c;
                defpackage.tyx tyxVar6 = this.i;
                constraintLayout6.setBackgroundColor(urg.c(tyxVar6.getContext(), 2130968954));
                d(2);
                c(2);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar6.getContext().getString(2132020177), tywVar.e));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout7 = this.c;
                defpackage.tyx tyxVar7 = this.i;
                constraintLayout7.setBackgroundColor(urg.c(tyxVar7.getContext(), 2130969107));
                d(4);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar7.getContext().getString(2132018679), tywVar.e));
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout8 = this.c;
                defpackage.tyx tyxVar8 = this.i;
                constraintLayout8.setBackgroundColor(urg.c(tyxVar8.getContext(), 2130969107));
                d(4);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar8.getContext().getString(2132017554), tywVar.e));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout9 = this.c;
                defpackage.tyx tyxVar9 = this.i;
                constraintLayout9.setBackgroundColor(urg.c(tyxVar9.getContext(), 2130969107));
                d(3);
                c(3);
                this.g.setText(tyxVar9.getContext().getString(2132020179));
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout10 = this.c;
                defpackage.tyx tyxVar10 = this.i;
                constraintLayout10.setBackgroundColor(urg.c(tyxVar10.getContext(), 2130969107));
                d(4);
                c(3);
                this.g.setText(android.text.TextUtils.expandTemplate(tyxVar10.getContext().getString(2132020830), tywVar.e));
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout11 = this.c;
                defpackage.tyx tyxVar11 = this.i;
                constraintLayout11.setBackgroundColor(urg.c(tyxVar11.getContext(), 2130969107));
                d(3);
                c(3);
                this.g.setText(tyxVar11.getContext().getString(2132020829));
                return;
            default:
                return;
        }
    }
}

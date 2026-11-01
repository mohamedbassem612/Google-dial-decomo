package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lis {
    private static final aimz b = aimz.i("com/android/dialer/callscreen/impl/settings/statusbanner/StatusBannerViewPeer");
    public defpackage.liq a;
    private final androidx.constraintlayout.widget.ConstraintLayout c;
    private final android.widget.ImageView d;
    private final android.widget.ImageView e;
    private final android.widget.ProgressBar f;
    private final android.widget.TextView g;
    private final android.widget.TextView h;
    private final defpackage.liv i;

    public lis(defpackage.liv livVar) {
        this.i = livVar;
        defpackage.liv.inflate(livVar.getContext(), 2131624464, livVar);
        this.c = livVar.findViewById(2131429031);
        this.d = (android.widget.ImageView) livVar.findViewById(2131429030);
        this.e = (android.widget.ImageView) livVar.findViewById(2131429029);
        this.f = (android.widget.ProgressBar) livVar.findViewById(2131429032);
        this.g = (android.widget.TextView) livVar.findViewById(2131429033);
        this.h = (android.widget.TextView) livVar.findViewById(2131429028);
    }

    private final int b(int i) {
        return this.i.getContext().getColor(i);
    }

    public final void a(defpackage.liq liqVar) {
        java.lang.String str;
        this.a = liqVar;
        b.b().l("com/android/dialer/callscreen/impl/settings/statusbanner/StatusBannerViewPeer", "setModel", 66, "StatusBannerViewPeer.java").y("updating banner model to: %s", liqVar);
        int iW = a.W(liqVar.d);
        if (iW == 0) {
            iW = 1;
        }
        this.d.setVisibility(iW != 4 ? 8 : 0);
        this.e.setVisibility(iW != 3 ? 8 : 0);
        this.f.setVisibility(iW != 5 ? 8 : 0);
        int iW2 = a.W(liqVar.c);
        if (iW2 == 0) {
            iW2 = 1;
        }
        int i = iW2 - 2;
        if (i == 0) {
            this.c.setBackgroundColor(b(2131099724));
            this.g.setTextColor(android.content.res.ColorStateList.valueOf(b(2131099725)));
        } else if (i == 1) {
            this.c.setBackgroundColor(b(2131099726));
            this.g.setTextColor(android.content.res.ColorStateList.valueOf(b(2131099727)));
        } else if (i == 2) {
            this.c.setBackgroundColor(b(2131099728));
            this.g.setTextColor(android.content.res.ColorStateList.valueOf(b(2131099729)));
        } else {
            if (i != 3) {
                if (iW2 == 2) {
                    str = "GREY";
                } else if (iW2 == 3) {
                    str = "GREEN";
                } else if (iW2 != 4) {
                    str = iW2 != 5 ? "UNRECOGNIZED" : "RED";
                } else {
                    str = "YELLOW";
                }
                throw new java.lang.IllegalStateException(java.lang.String.format("unrecognized color: %s", str));
            }
            this.c.setBackgroundColor(b(2131099722));
            this.g.setTextColor(android.content.res.ColorStateList.valueOf(b(2131099723)));
        }
        int iAb = a.ab(liqVar.e);
        if (iAb == 0) {
            iAb = 1;
        }
        int i2 = iAb - 2;
        if (i2 == 0) {
            this.h.setVisibility(8);
        } else if (i2 == 1) {
            android.widget.TextView textView = this.h;
            textView.setText(2132019895);
            textView.setVisibility(0);
        } else if (i2 == 2) {
            android.widget.TextView textView2 = this.h;
            textView2.setText(2132018855);
            textView2.setVisibility(0);
        } else if (i2 != 3) {
            if (i2 != 4) {
                throw new java.lang.IllegalStateException(java.lang.String.format("unrecognized button: %s", defpackage.hhe.D(iAb)));
            }
            android.widget.TextView textView3 = this.h;
            textView3.setText(2132019895);
            textView3.setVisibility(0);
        } else {
            android.widget.TextView textView4 = this.h;
            textView4.setText(2132020605);
            textView4.setVisibility(0);
        }
        this.g.setText(liqVar.f);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wel {
    public final android.widget.TextView a;
    public com.google.android.material.chip.Chip b;
    public com.google.android.material.chip.Chip c;
    private final android.widget.TextView d;
    private final android.view.ViewStub e;
    private final android.view.ViewStub f;

    public wel(com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView) {
        com.android.dialer.widget.errorcontentview.ErrorContentView.inflate(errorContentView.getContext(), 2131624196, errorContentView);
        errorContentView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View viewFindViewById = errorContentView.findViewById(2131428143);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.d = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = errorContentView.findViewById(2131428142);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.a = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = errorContentView.findViewById(2131428724);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.e = (android.view.ViewStub) viewFindViewById3;
        android.view.View viewFindViewById4 = errorContentView.findViewById(2131428905);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.f = (android.view.ViewStub) viewFindViewById4;
    }

    public final void a(defpackage.wei weiVar) {
        aooh.f(weiVar, "model");
        java.lang.String str = weiVar.c;
        aooh.e(str, "getMessage(...)");
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        android.widget.TextView textView = this.a;
        textView.setText(weiVar.c);
        java.lang.String str2 = weiVar.d;
        aooh.e(str2, "getTitle(...)");
        int length = str2.length();
        android.widget.TextView textView2 = this.d;
        if (length > 0) {
            textView2.setText(weiVar.d);
        } else {
            textView2.setVisibility(8);
        }
        java.lang.String str3 = weiVar.g;
        aooh.e(str3, "getPrimaryClickableMessage(...)");
        if (str3.length() > 0) {
            textView.setText(new defpackage.akwb(textView.getContext(), false).c(weiVar.c, weiVar.g, new hww(8)));
            textView.setOnClickListener(new defpackage.vxa(this, 11));
        } else {
            textView.setText(weiVar.c);
        }
        defpackage.weh wehVar = weiVar.e;
        if (wehVar == null) {
            wehVar = defpackage.weh.a;
        }
        java.lang.String str4 = wehVar.b;
        aooh.e(str4, "getText(...)");
        int length2 = str4.length();
        com.google.android.material.chip.Chip chip = this.b;
        if (length2 > 0) {
            if (chip == null) {
                chip = (com.google.android.material.chip.Chip) this.e.inflate();
                this.b = chip;
            }
            if (chip != null) {
                defpackage.weh wehVar2 = weiVar.e;
                if (wehVar2 == null) {
                    wehVar2 = defpackage.weh.a;
                }
                chip.setText(wehVar2.b);
            }
            com.google.android.material.chip.Chip chip2 = this.b;
            if (chip2 != null) {
                chip2.setOnClickListener(new defpackage.vxa(this, 12));
            }
        } else if (chip != null) {
            chip.setVisibility(8);
        }
        defpackage.weh wehVar3 = weiVar.f;
        if (wehVar3 == null) {
            wehVar3 = defpackage.weh.a;
        }
        java.lang.String str5 = wehVar3.b;
        aooh.e(str5, "getText(...)");
        int length3 = str5.length();
        com.google.android.material.chip.Chip chip3 = this.c;
        if (length3 <= 0) {
            if (chip3 != null) {
                chip3.setVisibility(8);
                return;
            }
            return;
        }
        if (chip3 == null) {
            chip3 = (com.google.android.material.chip.Chip) this.f.inflate();
            this.c = chip3;
        }
        if (chip3 != null) {
            defpackage.weh wehVar4 = weiVar.f;
            if (wehVar4 == null) {
                wehVar4 = defpackage.weh.a;
            }
            chip3.setText(wehVar4.b);
        }
        com.google.android.material.chip.Chip chip4 = this.c;
        if (chip4 != null) {
            chip4.setOnClickListener(new defpackage.vxa(this, 13));
        }
    }
}

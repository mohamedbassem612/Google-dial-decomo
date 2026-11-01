package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyd {
    public final defpackage.ahey a;
    public final com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView b;
    public final ahpz c;
    public final android.view.ViewStub d;
    public final com.google.android.material.card.MaterialCardView e;
    public final android.support.v7.widget.AppCompatTextView f;
    public final android.widget.TextView g;
    public final android.widget.QuickContactBadge h;
    public final android.widget.TextView i;
    public final android.widget.ImageView j;
    public final android.widget.ImageView k;
    public final hsh l;
    public final ahzi m;
    public final defpackage.vxz n;
    public j$.util.Optional o = j$.util.Optional.empty();
    public final ops p;
    public final gpd q;
    public final aeqx r;
    public final gpd s;
    public final defpackage.zlr t;

    public vyd(defpackage.ahey aheyVar, com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView, aeqx aeqxVar, ops opsVar, gpd gpdVar, defpackage.zlr zlrVar, ajwr ajwrVar, ahpz ahpzVar, defpackage.vxz vxzVar, gpd gpdVar2) {
        this.a = aheyVar;
        this.b = voicemailEntryView;
        this.t = zlrVar;
        this.r = aeqxVar;
        this.p = opsVar;
        this.q = gpdVar;
        this.c = ahpzVar;
        this.i = (android.widget.TextView) voicemailEntryView.findViewById(2131427919);
        this.h = (android.widget.QuickContactBadge) voicemailEntryView.findViewById(2131428670);
        this.j = (android.widget.ImageView) voicemailEntryView.findViewById(2131427755);
        android.support.v7.widget.AppCompatTextView appCompatTextViewFindViewById = voicemailEntryView.findViewById(2131428560);
        this.f = appCompatTextViewFindViewById;
        appCompatTextViewFindViewById.setTextAlignment(5);
        android.widget.TextView textView = (android.widget.TextView) voicemailEntryView.findViewById(2131427656);
        this.g = textView;
        textView.setTextAlignment(5);
        this.k = (android.widget.ImageView) voicemailEntryView.findViewById(2131428685);
        this.d = (android.view.ViewStub) voicemailEntryView.findViewById(2131428211);
        this.l = hsh.c();
        this.e = (com.google.android.material.card.MaterialCardView) voicemailEntryView.findViewById(2131427671);
        this.m = ahvr.bI(new exm(this, 19));
        ajwrVar.a = voicemailEntryView;
        this.n = vxzVar;
        this.s = gpdVar2;
    }

    public static boolean c(defpackage.vyj vyjVar) {
        return vyjVar.c != defpackage.vyi.a;
    }

    public final void a(defpackage.uzo uzoVar) {
        defpackage.vyc vycVar = (defpackage.vyc) this.m.eZ();
        defpackage.uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = defpackage.uzn.a;
        }
        java.lang.String strTrim = !uznVar.d.trim().isEmpty() ? uznVar.d.trim() : "";
        android.widget.TextView textView = vycVar.g;
        textView.setText(strTrim);
        defpackage.vxz vxzVar = this.n;
        defpackage.uzm uzmVarB = defpackage.uzm.b(uznVar.e);
        if (uzmVarB == null) {
            uzmVarB = defpackage.uzm.UNKNOWN;
        }
        java.lang.String strB = vxzVar.b(uzmVarB);
        android.widget.TextView textView2 = vycVar.h;
        textView2.setText(strB);
        textView.setVisibility(true != strTrim.isEmpty() ? 0 : 8);
        textView2.setVisibility(true != strB.isEmpty() ? 0 : 8);
        if (!strTrim.isEmpty()) {
            defpackage.uzm uzmVarB2 = defpackage.uzm.b(uznVar.e);
            if (uzmVarB2 == null) {
                uzmVarB2 = defpackage.uzm.UNKNOWN;
            }
            if (uzmVarB2 == defpackage.uzm.TRANSCRIPTION_AVAILABLE) {
                vycVar.d.setVisibility(0);
                android.widget.ImageView imageView = vycVar.e;
                ahpz ahpzVar = this.c;
                byte[] bArr = null;
                imageView.setOnClickListener(new defpackage.ahpp(ahpzVar, 1043, "Clicked thumbs up on transcription", new defpackage.qgq(vycVar, uzoVar, 19, bArr), 0));
                vycVar.f.setOnClickListener(new defpackage.ahpp(ahpzVar, 1044, "Clicked thumbs down on transcription", new defpackage.qgq(vycVar, uzoVar, 20, bArr), 0));
                return;
            }
        }
        vycVar.d.setVisibility(8);
    }

    public final boolean b() {
        return this.b.findViewById(2131427674) != null;
    }

    public final boolean d(defpackage.vyj vyjVar) {
        j$.util.Optional optionalOfNullable = this.o;
        defpackage.vmu vmuVar = new defpackage.vmu(vyjVar, 18);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(c((defpackage.vyj) optionalOfNullable.get()) != c((defpackage.vyj) vmuVar.a)));
        }
        return ((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue();
    }
}

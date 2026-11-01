package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdn extends defpackage.ahao {
    final /* synthetic */ defpackage.rdp a;

    public rdn(defpackage.rdp rdpVar) {
        this.a = rdpVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        java.lang.Object obj = this.a.a;
        android.view.View viewInflate = android.view.LayoutInflater.from(((com.android.dialer.incall.voice.ui.VoiceScreenChipView) obj).getContext()).inflate(2131624690, (android.view.ViewGroup) obj, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.google.android.material.chip.Chip] */
    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.qur qurVar;
        defpackage.qus qusVar = (defpackage.qus) obj;
        aooh.f(view, "view");
        aooh.f(qusVar, "voiceScreenChip");
        ?? r3 = (com.google.android.material.chip.Chip) view.findViewById(2131428902);
        r3.l(android.content.res.ColorStateList.valueOf(urg.c(r3.getContext(), 2130969072)));
        int i = qusVar.d;
        if (i != 0) {
            r3.l(android.content.res.ColorStateList.valueOf(i));
        }
        r3.k(qusVar.c);
        r3.setEnabled(!qusVar.f);
        r3.setAlpha(true != qusVar.f ? 1.0f : 0.38f);
        r3.setText(qusVar.e);
        defpackage.rdp rdpVar = this.a;
        int i2 = qusVar.b;
        if (i2 == 0) {
            qurVar = defpackage.qur.UNKNOWN;
        } else if (i2 == 1) {
            qurVar = defpackage.qur.DUO;
        } else if (i2 == 2) {
            qurVar = defpackage.qur.SONIC;
        } else if (i2 != 10000) {
            qurVar = i2 != 10001 ? null : defpackage.qur.SECOND_CHIP_CLICK_TEST;
        } else {
            qurVar = defpackage.qur.CHIP_CLICK_TEST;
        }
        if (qurVar == null) {
            qurVar = defpackage.qur.UNRECOGNIZED;
        }
        ((ajwr) rdpVar.b).g((android.view.View) r3, new defpackage.rdm(qurVar));
    }
}

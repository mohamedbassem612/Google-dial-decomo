package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tae extends amzm {
    private final amzg b;
    private final amzg c;

    public tae(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.tae.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        if (optional.isPresent()) {
            int iAN = a.aN(((defpackage.tan) optional.orElseThrow()).c);
            if (iAN == 0 || iAN != 4) {
                int iAN2 = a.aN(((defpackage.tan) optional.orElseThrow()).c);
                if (iAN2 == 0 || iAN2 != 3) {
                    optionalOf = j$.util.Optional.of(pez.aq(context, ((defpackage.tan) optional.orElseThrow()).d));
                } else {
                    android.text.SpannableString spannableString = new android.text.SpannableString(((defpackage.tan) optional.orElseThrow()).d);
                    spannableString.setSpan(new android.text.style.TextAppearanceSpan(context, 2132083556), 0, spannableString.length(), 33);
                    optionalOf = j$.util.Optional.of(pez.aq(context, spannableString));
                }
            } else {
                java.lang.String string = context.getString(2132019186);
                android.text.SpannableString spannableString2 = new android.text.SpannableString(java.lang.String.valueOf(string).concat(java.lang.String.valueOf(((defpackage.tan) optional.orElseThrow()).d)));
                spannableString2.setSpan(new android.text.style.TextAppearanceSpan(context, 2132083556), 0, string.length(), 33);
                optionalOf = j$.util.Optional.of(pez.aq(context, spannableString2));
            }
        } else {
            defpackage.szu.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioProducerModule", "produceSummaryText", 140, "RevelioProducerModule.java").v("Revelio summary is not present.");
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}

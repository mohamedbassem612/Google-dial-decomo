package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acka {
    static {
        aiof.i("GnpSdk");
    }

    public static final int a(akjh akjhVar, android.content.Context context) {
        aooh.f(akjhVar, "generalPromptUi");
        aooh.f(context, "context");
        int iAQ = a.aQ(akjhVar.k);
        if (iAQ == 0 || iAQ != 2) {
            return -1;
        }
        return (int) context.getResources().getDimension(2131166154);
    }

    public static final int b(akjh akjhVar, android.content.Context context) {
        aooh.f(akjhVar, "generalPromptUi");
        aooh.f(context, "context");
        int iAQ = a.aQ(akjhVar.k);
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i = iAQ - 1;
        if (i == 1) {
            return (int) context.getResources().getDimension(2131166154);
        }
        if (i == 2) {
            return context.getResources().getDimensionPixelOffset(2131166150);
        }
        return -1;
    }
}

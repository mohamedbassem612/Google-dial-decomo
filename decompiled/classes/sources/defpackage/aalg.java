package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aalg implements defpackage.aall {
    private final /* synthetic */ int $cid;

    public aalg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aall
    public final defpackage.aalk a(android.content.Context context, java.lang.String str, defpackage.aalj aaljVar) {
        defpackage.aalk aalkVar;
        int iB;
        int i = -1;
        if (this.$cid != 0) {
            aalkVar = new defpackage.aalk();
            int iB2 = aaljVar.b(context, str, true);
            aalkVar.b = iB2;
            if (iB2 != 0) {
                aalkVar.c = 1;
            } else {
                int iA = aaljVar.a(context, str);
                aalkVar.a = iA;
                if (iA != 0) {
                    aalkVar.c = -1;
                }
            }
        } else {
            aalkVar = new defpackage.aalk();
            int iA2 = aaljVar.a(context, str);
            aalkVar.a = iA2;
            int i2 = 0;
            if (iA2 != 0) {
                iB = aaljVar.b(context, str, false);
                aalkVar.b = iB;
            } else {
                iB = aaljVar.b(context, str, true);
                aalkVar.b = iB;
            }
            int i3 = aalkVar.a;
            if (i3 == 0) {
                if (iB == 0) {
                    i = 0;
                }
                aalkVar.c = i;
            } else {
                i2 = i3;
            }
            if (i2 < iB) {
                i = 1;
            }
            aalkVar.c = i;
        }
        return aalkVar;
    }
}

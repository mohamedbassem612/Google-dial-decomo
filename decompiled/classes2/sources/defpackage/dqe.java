package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqe {
    public static final defpackage.dqd a = new defpackage.dqd();

    public static final float a(int i) {
        return -i;
    }

    public static final void b(android.view.View view, dbk dbkVar) {
        long jK = dbkVar.o().k(0L);
        int iRound = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jK >> 32)));
        int iRound2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jK & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}

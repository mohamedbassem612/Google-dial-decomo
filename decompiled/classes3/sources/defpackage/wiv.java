package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wiv {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/logger/XatuItemAppearanceCounter");
    public final aoin b;

    public wiv(aoin aoinVar) {
        aooh.f(aoinVar, "menuSimilarityMaxEditDistancePercentage");
        this.b = aoinVar;
    }

    public static final java.lang.String a(defpackage.wmz wmzVar) {
        int i = wmzVar.c;
        int I = wsc.I(i);
        if (I == 0) {
            throw null;
        }
        int i2 = I - 1;
        if (i2 == 0) {
            java.lang.String str = (i == 2 ? (defpackage.wnc) wmzVar.d : defpackage.wnc.a).c;
            aooh.e(str, "getText(...)");
            return str;
        }
        if (i2 == 1) {
            java.lang.String str2 = (i == 3 ? (defpackage.wnb) wmzVar.d : defpackage.wnb.a).c;
            aooh.e(str2, "getText(...)");
            return str2;
        }
        if (i2 != 3) {
            throw new java.lang.IllegalArgumentException("item with no text");
        }
        java.lang.String str3 = (i == 5 ? (defpackage.wng) wmzVar.d : defpackage.wng.a).c;
        aooh.e(str3, "getText(...)");
        return str3;
    }
}

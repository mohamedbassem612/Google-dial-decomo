package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnj {
    public static final defpackage.amnj a = new defpackage.amnj();

    public static final defpackage.amni a(defpackage.amnk amnkVar) {
        if (amnkVar == defpackage.amnk.a) {
            return defpackage.amnd.a;
        }
        if (amnkVar == defpackage.amnk.b) {
            return defpackage.amnf.a;
        }
        if (amnkVar == defpackage.amnk.c) {
            return defpackage.amnh.a;
        }
        throw new java.lang.UnsupportedOperationException(a.bg(amnkVar, "Version ", " is not implemented yet."));
    }

    public static final int[] b(int i, int i2, int i3, int i4, int i5, boolean z, int i6, defpackage.amnk amnkVar) {
        aooh.f(amnkVar, "version");
        defpackage.amnm amnmVar = new defpackage.amnm(i);
        defpackage.amnm amnmVar2 = new defpackage.amnm(i2);
        new defpackage.amnm(i3);
        java.util.List listC = c(amnmVar, amnmVar2, new defpackage.amnm(i4), new defpackage.amnm(i5), z, i6, amnkVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listC, 10));
        java.util.Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((defpackage.amnm) it.next()).d));
        }
        return ajsz.cm(arrayList);
    }

    public static final java.util.List c(defpackage.amnm amnmVar, defpackage.amnm amnmVar2, defpackage.amnm amnmVar3, defpackage.amnm amnmVar4, boolean z, int i, defpackage.amnk amnkVar) {
        aooh.f(amnkVar, "version");
        return a(amnkVar).b(amnmVar, amnmVar2, amnmVar3, amnmVar4, z, i);
    }
}

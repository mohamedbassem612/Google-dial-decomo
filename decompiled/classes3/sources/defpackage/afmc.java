package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmc extends bs {
    public final java.util.List b;
    public final defpackage.afiz c;
    private final java.lang.Integer d;
    private aigf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmc(bo boVar, defpackage.amip amipVar, java.lang.Integer num, boolean z, boolean z2, defpackage.afiz afizVar, int i) {
        super(boVar, 0);
        int i2 = 0;
        java.util.ArrayList<defpackage.aflx> arrayList = new java.util.ArrayList(amipVar.g.size());
        for (defpackage.amiv amivVar : amipVar.g) {
            int iAb = a.ab(amivVar.i);
            int i3 = (iAb == 0 ? 1 : iAb) - 2;
            if (i3 == 1) {
                arrayList.add(new defpackage.aflk(amivVar));
            } else if (i3 == 2) {
                arrayList.add(new defpackage.afkg(amivVar));
            } else if (i3 == 3) {
                arrayList.add(new defpackage.afkz(amivVar));
            } else if (i3 == 4) {
                arrayList.add(new defpackage.afkn(amivVar));
            }
        }
        aehj aehjVar = afjy.c;
        if (!afjy.c(defpackage.anlf.c(afjy.b))) {
            defpackage.amhw amhwVar = amipVar.d;
            arrayList.add(new defpackage.afmf(amhwVar == null ? defpackage.amhw.b : amhwVar));
        } else if (afizVar == defpackage.afiz.a) {
            defpackage.amhw amhwVar2 = amipVar.d;
            arrayList.add(new defpackage.afmf(amhwVar2 == null ? defpackage.amhw.b : amhwVar2));
        }
        this.b = arrayList;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (afjy.a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        aigb aigbVar = new aigb(4);
        for (defpackage.aflx aflxVar : arrayList) {
            int i4 = aflxVar.b;
            if (i4 == 0) {
                throw null;
            }
            if (i4 != 5) {
                aigbVar.i(java.lang.Integer.valueOf(aflxVar.a.e - 1), java.lang.Integer.valueOf(i2));
                i2++;
            }
        }
        this.e = aigbVar.e(true);
        if (this.b.isEmpty()) {
            throw new java.lang.NullPointerException("Questions were missing!");
        }
        this.d = num;
        this.c = afizVar;
    }

    public static int k(aw awVar) {
        android.os.Bundle bundle = awVar.m;
        if (bundle != null) {
            return bundle.getInt("QuestionIndex", -1);
        }
        return -1;
    }

    public final aw a(int i) {
        aw awVarA = ((defpackage.aflx) this.b.get(i)).a(this.d, i);
        awVarA.m.putInt("QuestionIndex", i);
        return awVarA;
    }

    public final int i() {
        return this.b.size();
    }

    public final int l(int i) {
        return ((java.lang.Integer) this.e.get(java.lang.Integer.valueOf(i))).intValue();
    }

    public final defpackage.amiv m(int i) {
        return ((defpackage.aflx) this.b.get(i)).a;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class abth implements defpackage.abta {
    private final defpackage.abtb a;
    private final defpackage.aldm b;
    private final absq c;

    public abth(defpackage.abtb abtbVar, defpackage.aldm aldmVar, absq absqVar) {
        this.a = abtbVar;
        this.b = aldmVar;
        this.c = absqVar;
    }

    private final boolean b(defpackage.aldk aldkVar) {
        int i = 0;
        while (true) {
            if (i >= aldkVar.b.size()) {
                java.util.Iterator it = aldkVar.c.iterator();
                while (it.hasNext()) {
                    if (!c((defpackage.aldl) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            int iA = defpackage.aldj.a(aldkVar.b.e(i));
            if (!this.a.a(iA != 0 ? iA : 1, this.c).a()) {
                return false;
            }
            i++;
        }
    }

    private final boolean c(defpackage.aldl aldlVar) {
        for (int i = 0; i < aldlVar.b.size(); i++) {
            int iA = defpackage.aldj.a(aldlVar.b.e(i));
            if (iA == 0) {
                iA = 1;
            }
            if (this.a.a(iA, this.c).a()) {
                return true;
            }
        }
        java.util.Iterator it = aldlVar.c.iterator();
        while (it.hasNext()) {
            if (b((defpackage.aldk) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abta
    public final boolean a() {
        java.lang.Boolean boolValueOf;
        int iA;
        defpackage.aldm aldmVar = this.b;
        int i = aldmVar.b;
        if (i == 2) {
            boolValueOf = java.lang.Boolean.valueOf(b((defpackage.aldk) aldmVar.c));
        } else if (i == 3) {
            boolValueOf = java.lang.Boolean.valueOf(c((defpackage.aldl) aldmVar.c));
        } else {
            defpackage.abtb abtbVar = this.a;
            int i2 = 1;
            if (i == 1 && (iA = defpackage.aldj.a(((java.lang.Integer) aldmVar.c).intValue())) != 0) {
                i2 = iA;
            }
            boolValueOf = java.lang.Boolean.valueOf(abtbVar.a(i2, this.c).a());
        }
        return boolValueOf.booleanValue();
    }
}

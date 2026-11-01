package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfn {
    public final defpackage.tfk a;
    public final java.util.List b;
    public final java.util.List c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public tfn(defpackage.tfk tfkVar, java.util.List list) throws aois {
        defpackage.tfi tfiVar;
        aooh.f(tfkVar, "searchCollapsedUiModel");
        aooh.f(list, "actions");
        this.a = tfkVar;
        this.b = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.tfh tfhVar = (defpackage.tfh) it.next();
            defpackage.tfk tfkVar2 = this.a;
            java.util.List list2 = defpackage.tfo.a;
            j$.util.Objects.checkIndex(0, 8);
            if (tfhVar != null) {
                if (tfhVar instanceof defpackage.tff) {
                    tfiVar = new defpackage.tfi(2132019992, 2132019992, 2131232047, new defpackage.tfu(tfkVar2.f, tfkVar2.e), true);
                } else if (tfhVar instanceof defpackage.tfb) {
                    defpackage.tfb tfbVar = (defpackage.tfb) tfhVar;
                    tfiVar = tfbVar.a ? new defpackage.tfi(2132020792, 2132020793, 2131231081, new defpackage.tfw(tfkVar2.f, true), tfbVar.b) : new defpackage.tfi(2132020792, 2132018278, 2131231080, new defpackage.tfw(tfkVar2.f, false), tfbVar.b);
                } else if (tfhVar instanceof defpackage.tfc) {
                    tfiVar = new defpackage.tfi(2132020792, 2132018278, 2131231080, new defpackage.tfx(tfkVar2.f), true);
                } else if (tfhVar instanceof defpackage.tfa) {
                    tfiVar = new defpackage.tfi(2132017295, 2132017295, 2131231981, new defpackage.tfp(tfkVar2.f), true);
                } else if (tfhVar instanceof defpackage.tfg) {
                    tfiVar = new defpackage.tfi(2132020554, 2132020554, 2131231435, new defpackage.tfv(tfkVar2.f), true);
                } else if (tfhVar instanceof defpackage.tfd) {
                    tfiVar = new defpackage.tfi(2132019685, 2132019685, 2131231960, new defpackage.tft(tfkVar2.f), ((defpackage.tfd) tfhVar).a);
                } else if (tfhVar instanceof defpackage.tfe) {
                    tfiVar = new defpackage.tfi(2132019764, 2132019764, 2131231435, new defpackage.tfv(tfkVar2.f), false);
                }
                arrayList.add(tfiVar);
            }
            throw new aois();
        }
        this.c = arrayList;
    }

    public static /* synthetic */ defpackage.tfn a(defpackage.tfn tfnVar, defpackage.tfk tfkVar, java.util.List list, int i) {
        if ((i & 1) != 0) {
            tfkVar = tfnVar.a;
        }
        if ((i & 2) != 0) {
            list = tfnVar.b;
        }
        aooh.f(tfkVar, "searchCollapsedUiModel");
        aooh.f(list, "actions");
        return new defpackage.tfn(tfkVar, list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfn) {
            defpackage.tfn tfnVar = (defpackage.tfn) obj;
            if (aooh.n(this.a, tfnVar.a) && aooh.n(this.b, tfnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SearchResultData(searchCollapsedUiModel=" + this.a + ", actions=" + this.b + ')';
    }
}

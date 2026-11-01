package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pq extends defpackage.rm {
    public final java.lang.String a;
    final java.util.List b;
    private final java.util.List c;
    private final java.lang.String d;

    public pq(java.lang.String str, java.util.List list, java.util.List list2) {
        this.a = str;
        dzk.x(list);
        this.b = list;
        this.c = list2;
        this.d = "";
    }

    public final java.util.List a() {
        return j$.util.DesugarCollections.unmodifiableList(this.c);
    }

    public final java.util.List b() {
        java.lang.Object ppVar;
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return java.util.Collections.EMPTY_LIST;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            defpackage.sj sjVar = (defpackage.sj) list.get(i);
            dzk.x(sjVar);
            switch (sjVar.b) {
                case 1:
                    ppVar = new defpackage.pp(sjVar);
                    break;
                case 2:
                    ppVar = new defpackage.pm(sjVar);
                    break;
                case 3:
                    ppVar = new defpackage.pn(sjVar);
                    break;
                case 4:
                    ppVar = new defpackage.pn(sjVar);
                    break;
                case 5:
                    ppVar = new defpackage.pn(sjVar);
                    break;
                case 6:
                    ppVar = new defpackage.pj(sjVar);
                    break;
                case 7:
                    ppVar = new defpackage.pk(sjVar);
                    break;
                default:
                    ppVar = new defpackage.ph(sjVar);
                    break;
            }
            arrayList.add(ppVar);
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pq) {
            defpackage.pq pqVar = (defpackage.pq) obj;
            if (this.a.equals(pqVar.a) && this.d.equals(pqVar.d) && a().equals(pqVar.a())) {
                return b().equals(pqVar.b());
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.sm smVar = new defpackage.sm();
        smVar.a("{\n");
        smVar.d();
        smVar.a("schemaType: \"");
        smVar.a(this.a);
        smVar.a("\",\n");
        smVar.a("description: \"");
        smVar.a(this.d);
        smVar.a("\",\n");
        smVar.a("properties: [\n");
        int i = 0;
        defpackage.pn[] pnVarArr = (defpackage.pn[]) b().toArray(new defpackage.pn[0]);
        java.util.Arrays.sort(pnVarArr, new defpackage.djh(1));
        while (true) {
            int length = pnVarArr.length;
            if (i >= length) {
                smVar.a("\n");
                smVar.a("]\n");
                smVar.c();
                smVar.a("}");
                return smVar.toString();
            }
            defpackage.pn pnVar = pnVarArr[i];
            smVar.d();
            pnVar.b(smVar);
            if (i != length - 1) {
                smVar.a(",\n");
            }
            smVar.c();
            i++;
        }
    }
}

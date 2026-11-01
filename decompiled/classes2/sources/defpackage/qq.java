package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qq extends defpackage.rm {
    final androidx.appsearch.safeparcel.GenericDocumentParcel a;
    final java.util.List b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final double e;
    public final java.util.List f;
    public final java.util.List g;
    final android.os.Bundle h;
    private defpackage.pw i;
    private java.util.List j;

    public qq(androidx.appsearch.safeparcel.GenericDocumentParcel genericDocumentParcel, java.util.List list, java.lang.String str, java.lang.String str2, double d, java.util.List list2, java.util.List list3, android.os.Bundle bundle) {
        dzk.x(genericDocumentParcel);
        this.a = genericDocumentParcel;
        dzk.x(list);
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = d;
        dzk.x(list2);
        this.f = j$.util.DesugarCollections.unmodifiableList(list2);
        if (list3 != null) {
            this.g = j$.util.DesugarCollections.unmodifiableList(list3);
        } else {
            this.g = java.util.Collections.EMPTY_LIST;
        }
        if (bundle != null) {
            this.h = bundle;
        } else {
            this.h = android.os.Bundle.EMPTY;
        }
    }

    public final defpackage.pw a() {
        defpackage.pw pwVar = this.i;
        if (pwVar != null) {
            return pwVar;
        }
        defpackage.pw pwVar2 = new defpackage.pw(this.a);
        this.i = pwVar2;
        return pwVar2;
    }

    public final java.util.List b() {
        java.util.List listUnmodifiableList = this.j;
        if (listUnmodifiableList == null) {
            java.util.List list = this.b;
            this.j = new java.util.ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                defpackage.qn qnVar = (defpackage.qn) list.get(i);
                defpackage.pw pwVarA = a();
                dzk.x(pwVarA);
                qnVar.e = pwVarA;
                defpackage.qp qpVar = qnVar.d;
                dzk.x(pwVarA);
                qpVar.d = pwVarA;
                qpVar.c = qnVar.a;
                java.util.List list2 = this.j;
                if (list2 != null) {
                    list2.add(qnVar);
                }
            }
            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(this.j);
            this.j = listUnmodifiableList;
        }
        dzk.x(listUnmodifiableList);
        return listUnmodifiableList;
    }
}

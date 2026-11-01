package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gca extends defpackage.dzn {
    public final defpackage.gcr a;
    public final defpackage.gcr b;

    public gca(defpackage.gcr gcrVar, defpackage.gcr gcrVar2) {
        if (gcrVar2 == null) {
            defpackage.aooh.i("previousList");
        }
        this.a = gcrVar;
        this.b = gcrVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gca) {
            defpackage.gcr gcrVar = this.a;
            defpackage.gbo gboVar = (defpackage.gbo) gcrVar;
            int i = gboVar.c;
            defpackage.gca gcaVar = (defpackage.gca) obj;
            defpackage.gcr gcrVar2 = gcaVar.a;
            defpackage.gbo gboVar2 = (defpackage.gbo) gcrVar2;
            if (i == gboVar2.c && gboVar.d == gboVar2.d && gcrVar.e() == gcrVar2.e() && gboVar.b == gboVar2.b) {
                defpackage.gcr gcrVar3 = this.b;
                defpackage.gbo gboVar3 = (defpackage.gbo) gcrVar3;
                int i2 = gboVar3.c;
                defpackage.gcr gcrVar4 = gcaVar.b;
                defpackage.gbo gboVar4 = (defpackage.gbo) gcrVar4;
                if (i2 == gboVar4.c && gboVar3.d == gboVar4.d && gcrVar3.e() == gcrVar4.e() && gboVar3.b == gboVar4.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.gcr gcrVar = this.a;
        defpackage.gbo gboVar = (defpackage.gbo) gcrVar;
        int i = gboVar.c;
        int i2 = gboVar.d;
        int iE = gcrVar.e();
        int i3 = gboVar.b;
        defpackage.gcr gcrVar2 = this.b;
        defpackage.gbo gboVar2 = (defpackage.gbo) gcrVar2;
        return defpackage.aoov.n("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + i + "\n                    |       placeholdersAfter: " + i2 + "\n                    |       size: " + iE + "\n                    |       dataCount: " + i3 + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + gboVar2.c + "\n                    |       placeholdersAfter: " + gboVar2.d + "\n                    |       size: " + gcrVar2.e() + "\n                    |       dataCount: " + gboVar2.b + "\n                    |   )\n                    |");
    }
}

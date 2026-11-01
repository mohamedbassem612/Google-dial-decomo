package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aozv implements defpackage.apaj {
    public final defpackage.aolr a;
    public final int b;
    public final int c;

    public aozv(defpackage.aolr aolrVar, int i, int i2) {
        this.a = aolrVar;
        this.b = i;
        this.c = i2;
        boolean z = defpackage.aosu.a;
    }

    public static /* synthetic */ java.lang.Object h(defpackage.aozv aozvVar, defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objM = defpackage.aosv.m(new defpackage.fzn(aoxiVar, aozvVar, (defpackage.aoln) null, 5), aolnVar);
        return objM != defpackage.aolu.a ? defpackage.aojh.a : objM;
    }

    public abstract java.lang.Object b(defpackage.aows aowsVar, defpackage.aoln aolnVar);

    protected abstract defpackage.aozv c(defpackage.aolr aolrVar, int i, int i2);

    protected java.lang.String d() {
        return null;
    }

    public defpackage.aowu e(defpackage.aoss aossVar) {
        defpackage.efu efuVar = new defpackage.efu(this, (defpackage.aoln) null, 7);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        return defpackage.aooh.E(aossVar, this.a, i, i2, 3, efuVar);
    }

    public defpackage.aoxh f() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f A[PHI: r5
      0x001f: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:6:0x0010, B:9:0x0015, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.apaj
    public final defpackage.aoxh fL(defpackage.aolr aolrVar, int i, int i2) {
        boolean z = defpackage.aosu.a;
        defpackage.aolr aolrVar2 = this.a;
        defpackage.aolr aolrVarPlus = aolrVar.plus(aolrVar2);
        if (i2 == 1) {
            int i3 = this.b;
            if (i3 != -3) {
                if (i == -3) {
                    i = i3;
                } else if (i3 != -2) {
                    if (i != -2 && (i3 = i3 + i) < 0) {
                        i = Integer.MAX_VALUE;
                    } else {
                        i = i3;
                    }
                }
            }
            i2 = this.c;
        }
        return (defpackage.aooh.n(aolrVarPlus, aolrVar2) && i == this.b && i2 == this.c) ? this : c(aolrVarPlus, i, i2);
    }

    @Override // defpackage.aoxh
    public java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        return h(this, aoxiVar, aolnVar);
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        defpackage.aolr aolrVar = this.a;
        if (aolrVar != defpackage.aols.a) {
            java.util.Objects.toString(aolrVar);
            arrayList.add("context=".concat(java.lang.String.valueOf(aolrVar)));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(defpackage.a.bj(i, "capacity="));
        }
        int i2 = this.c;
        if (i2 != 1) {
            defpackage.aooh.I(i2);
            arrayList.add("onBufferOverflow=".concat(defpackage.aooh.I(i2)));
        }
        return defpackage.aosv.a(this) + '[' + defpackage.ajsz.cr(arrayList, ", ", null, null, null, 62) + ']';
    }
}
